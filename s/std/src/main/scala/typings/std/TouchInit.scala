package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchInit extends js.Object {
  var altitudeAngle: js.UndefOr[Double] = js.undefined
  var azimuthAngle: js.UndefOr[Double] = js.undefined
  var clientX: js.UndefOr[Double] = js.undefined
  var clientY: js.UndefOr[Double] = js.undefined
  var force: js.UndefOr[Double] = js.undefined
  var identifier: Double
  var pageX: js.UndefOr[Double] = js.undefined
  var pageY: js.UndefOr[Double] = js.undefined
  var radiusX: js.UndefOr[Double] = js.undefined
  var radiusY: js.UndefOr[Double] = js.undefined
  var rotationAngle: js.UndefOr[Double] = js.undefined
  var screenX: js.UndefOr[Double] = js.undefined
  var screenY: js.UndefOr[Double] = js.undefined
  var target: EventTarget
  var touchType: js.UndefOr[TouchType] = js.undefined
}

object TouchInit {
  @scala.inline
  def apply(
    identifier: Double,
    target: EventTarget,
    altitudeAngle: Int | Double = null,
    azimuthAngle: Int | Double = null,
    clientX: Int | Double = null,
    clientY: Int | Double = null,
    force: Int | Double = null,
    pageX: Int | Double = null,
    pageY: Int | Double = null,
    radiusX: Int | Double = null,
    radiusY: Int | Double = null,
    rotationAngle: Int | Double = null,
    screenX: Int | Double = null,
    screenY: Int | Double = null,
    touchType: TouchType = null
  ): TouchInit = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (altitudeAngle != null) __obj.updateDynamic("altitudeAngle")(altitudeAngle.asInstanceOf[js.Any])
    if (azimuthAngle != null) __obj.updateDynamic("azimuthAngle")(azimuthAngle.asInstanceOf[js.Any])
    if (clientX != null) __obj.updateDynamic("clientX")(clientX.asInstanceOf[js.Any])
    if (clientY != null) __obj.updateDynamic("clientY")(clientY.asInstanceOf[js.Any])
    if (force != null) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    if (radiusX != null) __obj.updateDynamic("radiusX")(radiusX.asInstanceOf[js.Any])
    if (radiusY != null) __obj.updateDynamic("radiusY")(radiusY.asInstanceOf[js.Any])
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (screenX != null) __obj.updateDynamic("screenX")(screenX.asInstanceOf[js.Any])
    if (screenY != null) __obj.updateDynamic("screenY")(screenY.asInstanceOf[js.Any])
    if (touchType != null) __obj.updateDynamic("touchType")(touchType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchInit]
  }
}

