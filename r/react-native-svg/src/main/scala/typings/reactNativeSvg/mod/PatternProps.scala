package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatternProps extends js.Object {
  var height: js.UndefOr[NumberProp] = js.native
  var id: js.UndefOr[String] = js.native
  var patternContentUnits: js.UndefOr[Units] = js.native
  var patternTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.native
  var patternUnits: js.UndefOr[Units] = js.native
  var preserveAspectRatio: js.UndefOr[String] = js.native
  var viewBox: js.UndefOr[String] = js.native
  var width: js.UndefOr[NumberProp] = js.native
  var x: js.UndefOr[NumberProp] = js.native
  var y: js.UndefOr[NumberProp] = js.native
}

object PatternProps {
  @scala.inline
  def apply(): PatternProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatternProps]
  }
  @scala.inline
  implicit class PatternPropsOps[Self <: PatternProps] (val x: Self) extends AnyVal {
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
    def setHeight(value: NumberProp): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPatternContentUnits(value: Units): Self = this.set("patternContentUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternContentUnits: Self = this.set("patternContentUnits", js.undefined)
    @scala.inline
    def setPatternTransform(value: ColumnMajorTransformMatrix | String): Self = this.set("patternTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternTransform: Self = this.set("patternTransform", js.undefined)
    @scala.inline
    def setPatternUnits(value: Units): Self = this.set("patternUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternUnits: Self = this.set("patternUnits", js.undefined)
    @scala.inline
    def setPreserveAspectRatio(value: String): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveAspectRatio: Self = this.set("preserveAspectRatio", js.undefined)
    @scala.inline
    def setViewBox(value: String): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", js.undefined)
    @scala.inline
    def setWidth(value: NumberProp): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: NumberProp): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: NumberProp): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

