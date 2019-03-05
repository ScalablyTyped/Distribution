package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchInit extends js.Object {
  var altitudeAngle: js.UndefOr[scala.Double] = js.undefined
  var azimuthAngle: js.UndefOr[scala.Double] = js.undefined
  var clientX: js.UndefOr[scala.Double] = js.undefined
  var clientY: js.UndefOr[scala.Double] = js.undefined
  var force: js.UndefOr[scala.Double] = js.undefined
  var identifier: scala.Double
  var pageX: js.UndefOr[scala.Double] = js.undefined
  var pageY: js.UndefOr[scala.Double] = js.undefined
  var radiusX: js.UndefOr[scala.Double] = js.undefined
  var radiusY: js.UndefOr[scala.Double] = js.undefined
  var rotationAngle: js.UndefOr[scala.Double] = js.undefined
  var screenX: js.UndefOr[scala.Double] = js.undefined
  var screenY: js.UndefOr[scala.Double] = js.undefined
  var target: EventTarget
  var touchType: js.UndefOr[TouchType] = js.undefined
}

object TouchInit {
  @scala.inline
  def apply(
    identifier: scala.Double,
    target: EventTarget,
    altitudeAngle: scala.Int | scala.Double = null,
    azimuthAngle: scala.Int | scala.Double = null,
    clientX: scala.Int | scala.Double = null,
    clientY: scala.Int | scala.Double = null,
    force: scala.Int | scala.Double = null,
    pageX: scala.Int | scala.Double = null,
    pageY: scala.Int | scala.Double = null,
    radiusX: scala.Int | scala.Double = null,
    radiusY: scala.Int | scala.Double = null,
    rotationAngle: scala.Int | scala.Double = null,
    screenX: scala.Int | scala.Double = null,
    screenY: scala.Int | scala.Double = null,
    touchType: TouchType = null
  ): TouchInit = {
    val __obj = js.Dynamic.literal(identifier = identifier, target = target)
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
    if (touchType != null) __obj.updateDynamic("touchType")(touchType)
    __obj.asInstanceOf[TouchInit]
  }
}

