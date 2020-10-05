package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerEventInit extends MouseEventInit {
  var height: js.UndefOr[Double] = js.native
  var isPrimary: js.UndefOr[scala.Boolean] = js.native
  var pointerId: js.UndefOr[Double] = js.native
  var pointerType: js.UndefOr[java.lang.String] = js.native
  var pressure: js.UndefOr[Double] = js.native
  var tangentialPressure: js.UndefOr[Double] = js.native
  var tiltX: js.UndefOr[Double] = js.native
  var tiltY: js.UndefOr[Double] = js.native
  var twist: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PointerEventInit {
  @scala.inline
  def apply(): PointerEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointerEventInit]
  }
  @scala.inline
  implicit class PointerEventInitOps[Self <: PointerEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIsPrimary(value: scala.Boolean): Self = this.set("isPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPrimary: Self = this.set("isPrimary", js.undefined)
    @scala.inline
    def setPointerId(value: Double): Self = this.set("pointerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerId: Self = this.set("pointerId", js.undefined)
    @scala.inline
    def setPointerType(value: java.lang.String): Self = this.set("pointerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerType: Self = this.set("pointerType", js.undefined)
    @scala.inline
    def setPressure(value: Double): Self = this.set("pressure", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressure: Self = this.set("pressure", js.undefined)
    @scala.inline
    def setTangentialPressure(value: Double): Self = this.set("tangentialPressure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTangentialPressure: Self = this.set("tangentialPressure", js.undefined)
    @scala.inline
    def setTiltX(value: Double): Self = this.set("tiltX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiltX: Self = this.set("tiltX", js.undefined)
    @scala.inline
    def setTiltY(value: Double): Self = this.set("tiltY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiltY: Self = this.set("tiltY", js.undefined)
    @scala.inline
    def setTwist(value: Double): Self = this.set("twist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwist: Self = this.set("twist", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

