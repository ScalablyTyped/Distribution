package typings.storybookComponents.typesetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypesetProps extends js.Object {
  var fontFamily: js.UndefOr[String] = js.native
  var fontSizes: js.Array[String] = js.native
  var fontWeight: js.UndefOr[Double] = js.native
  var sampleText: js.UndefOr[String] = js.native
}

object TypesetProps {
  @scala.inline
  def apply(fontSizes: js.Array[String]): TypesetProps = {
    val __obj = js.Dynamic.literal(fontSizes = fontSizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypesetProps]
  }
  @scala.inline
  implicit class TypesetPropsOps[Self <: TypesetProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFontSizesVarargs(value: String*): Self = this.set("fontSizes", js.Array(value :_*))
    @scala.inline
    def setFontSizes(value: js.Array[String]): Self = this.set("fontSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontWeight(value: Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setSampleText(value: String): Self = this.set("sampleText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleText: Self = this.set("sampleText", js.undefined)
  }
  
}

