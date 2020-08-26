package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadialGradientProps extends js.Object {
  var cx: js.UndefOr[NumberProp] = js.native
  var cy: js.UndefOr[NumberProp] = js.native
  var fx: js.UndefOr[NumberProp] = js.native
  var fy: js.UndefOr[NumberProp] = js.native
  var gradientTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.native
  var gradientUnits: js.UndefOr[Units] = js.native
  var id: js.UndefOr[String] = js.native
  var r: js.UndefOr[NumberProp] = js.native
  var rx: js.UndefOr[NumberProp] = js.native
  var ry: js.UndefOr[NumberProp] = js.native
}

object RadialGradientProps {
  @scala.inline
  def apply(): RadialGradientProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGradientProps]
  }
  @scala.inline
  implicit class RadialGradientPropsOps[Self <: RadialGradientProps] (val x: Self) extends AnyVal {
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
    def setCx(value: NumberProp): Self = this.set("cx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    @scala.inline
    def setCy(value: NumberProp): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    @scala.inline
    def setFx(value: NumberProp): Self = this.set("fx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFx: Self = this.set("fx", js.undefined)
    @scala.inline
    def setFy(value: NumberProp): Self = this.set("fy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFy: Self = this.set("fy", js.undefined)
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
    def setR(value: NumberProp): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setRx(value: NumberProp): Self = this.set("rx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    @scala.inline
    def setRy(value: NumberProp): Self = this.set("ry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
  }
  
}

