package typings.reactNativePercentageCircle.mod

import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PercentageCircleProps extends js.Object {
  var bgcolor: js.UndefOr[String] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var color: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var innerColor: js.UndefOr[String] = js.native
  var percent: js.UndefOr[Double] = js.native
  var radius: js.UndefOr[Double] = js.native
  var textStyle: js.UndefOr[js.Array[TextStyle]] = js.native
}

object PercentageCircleProps {
  @scala.inline
  def apply(): PercentageCircleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PercentageCircleProps]
  }
  @scala.inline
  implicit class PercentageCirclePropsOps[Self <: PercentageCircleProps] (val x: Self) extends AnyVal {
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
    def setBgcolor(value: String): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgcolor: Self = this.set("bgcolor", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInnerColor(value: String): Self = this.set("innerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerColor: Self = this.set("innerColor", js.undefined)
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setTextStyleVarargs(value: TextStyle*): Self = this.set("textStyle", js.Array(value :_*))
    @scala.inline
    def setTextStyle(value: js.Array[TextStyle]): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}

