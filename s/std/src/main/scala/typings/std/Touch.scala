package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single contact point on a touch-sensitive device. The contact point is commonly a finger or stylus and the device may be a touchscreen or trackpad. */
@js.native
trait Touch extends js.Object {
  val altitudeAngle: Double = js.native
  val azimuthAngle: Double = js.native
  val clientX: Double = js.native
  val clientY: Double = js.native
  val force: Double = js.native
  val identifier: Double = js.native
  val pageX: Double = js.native
  val pageY: Double = js.native
  val radiusX: Double = js.native
  val radiusY: Double = js.native
  val rotationAngle: Double = js.native
  val screenX: Double = js.native
  val screenY: Double = js.native
  val target: EventTarget = js.native
  val touchType: TouchType = js.native
}

object Touch {
  @scala.inline
  def apply(
    altitudeAngle: Double,
    azimuthAngle: Double,
    clientX: Double,
    clientY: Double,
    force: Double,
    identifier: Double,
    pageX: Double,
    pageY: Double,
    radiusX: Double,
    radiusY: Double,
    rotationAngle: Double,
    screenX: Double,
    screenY: Double,
    target: EventTarget,
    touchType: TouchType
  ): Touch = {
    val __obj = js.Dynamic.literal(altitudeAngle = altitudeAngle.asInstanceOf[js.Any], azimuthAngle = azimuthAngle.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], radiusX = radiusX.asInstanceOf[js.Any], radiusY = radiusY.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], touchType = touchType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Touch]
  }
  @scala.inline
  implicit class TouchOps[Self <: Touch] (val x: Self) extends AnyVal {
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
    def setAltitudeAngle(value: Double): Self = this.set("altitudeAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setAzimuthAngle(value: Double): Self = this.set("azimuthAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientX(value: Double): Self = this.set("clientX", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientY(value: Double): Self = this.set("clientY", value.asInstanceOf[js.Any])
    @scala.inline
    def setForce(value: Double): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: Double): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadiusX(value: Double): Self = this.set("radiusX", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadiusY(value: Double): Self = this.set("radiusY", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotationAngle(value: Double): Self = this.set("rotationAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenX(value: Double): Self = this.set("screenX", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenY(value: Double): Self = this.set("screenY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: EventTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchType(value: TouchType): Self = this.set("touchType", value.asInstanceOf[js.Any])
  }
  
}

