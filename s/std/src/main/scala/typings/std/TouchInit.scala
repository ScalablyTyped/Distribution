package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchInit extends js.Object {
  var altitudeAngle: js.UndefOr[Double] = js.native
  var azimuthAngle: js.UndefOr[Double] = js.native
  var clientX: js.UndefOr[Double] = js.native
  var clientY: js.UndefOr[Double] = js.native
  var force: js.UndefOr[Double] = js.native
  var identifier: Double = js.native
  var pageX: js.UndefOr[Double] = js.native
  var pageY: js.UndefOr[Double] = js.native
  var radiusX: js.UndefOr[Double] = js.native
  var radiusY: js.UndefOr[Double] = js.native
  var rotationAngle: js.UndefOr[Double] = js.native
  var screenX: js.UndefOr[Double] = js.native
  var screenY: js.UndefOr[Double] = js.native
  var target: EventTarget = js.native
  var touchType: js.UndefOr[TouchType] = js.native
}

object TouchInit {
  @scala.inline
  def apply(identifier: Double, target: EventTarget): TouchInit = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchInit]
  }
  @scala.inline
  implicit class TouchInitOps[Self <: TouchInit] (val x: Self) extends AnyVal {
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
    def setIdentifier(value: Double): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: EventTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltitudeAngle(value: Double): Self = this.set("altitudeAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitudeAngle: Self = this.set("altitudeAngle", js.undefined)
    @scala.inline
    def setAzimuthAngle(value: Double): Self = this.set("azimuthAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAzimuthAngle: Self = this.set("azimuthAngle", js.undefined)
    @scala.inline
    def setClientX(value: Double): Self = this.set("clientX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientX: Self = this.set("clientX", js.undefined)
    @scala.inline
    def setClientY(value: Double): Self = this.set("clientY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientY: Self = this.set("clientY", js.undefined)
    @scala.inline
    def setForce(value: Double): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageX: Self = this.set("pageX", js.undefined)
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageY: Self = this.set("pageY", js.undefined)
    @scala.inline
    def setRadiusX(value: Double): Self = this.set("radiusX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusX: Self = this.set("radiusX", js.undefined)
    @scala.inline
    def setRadiusY(value: Double): Self = this.set("radiusY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusY: Self = this.set("radiusY", js.undefined)
    @scala.inline
    def setRotationAngle(value: Double): Self = this.set("rotationAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationAngle: Self = this.set("rotationAngle", js.undefined)
    @scala.inline
    def setScreenX(value: Double): Self = this.set("screenX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenX: Self = this.set("screenX", js.undefined)
    @scala.inline
    def setScreenY(value: Double): Self = this.set("screenY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenY: Self = this.set("screenY", js.undefined)
    @scala.inline
    def setTouchType(value: TouchType): Self = this.set("touchType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchType: Self = this.set("touchType", js.undefined)
  }
  
}

