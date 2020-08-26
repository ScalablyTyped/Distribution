package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearGradientProps extends js.Object {
  var gradientTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.native
  var gradientUnits: js.UndefOr[Units] = js.native
  var id: js.UndefOr[String] = js.native
  var x1: js.UndefOr[NumberProp] = js.native
  var x2: js.UndefOr[NumberProp] = js.native
  var y1: js.UndefOr[NumberProp] = js.native
  var y2: js.UndefOr[NumberProp] = js.native
}

object LinearGradientProps {
  @scala.inline
  def apply(): LinearGradientProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGradientProps]
  }
  @scala.inline
  implicit class LinearGradientPropsOps[Self <: LinearGradientProps] (val x: Self) extends AnyVal {
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
    def setGradientTransform(value: ColumnMajorTransformMatrix | String): Self = this.set("gradientTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientTransform: Self = this.set("gradientTransform", js.undefined)
    @scala.inline
    def setGradientUnits(value: Units): Self = this.set("gradientUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientUnits: Self = this.set("gradientUnits", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setX1(value: NumberProp): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX1: Self = this.set("x1", js.undefined)
    @scala.inline
    def setX2(value: NumberProp): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX2: Self = this.set("x2", js.undefined)
    @scala.inline
    def setY1(value: NumberProp): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
    @scala.inline
    def setY2(value: NumberProp): Self = this.set("y2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
  }
  
}

