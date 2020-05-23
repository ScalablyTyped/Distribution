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
    altitudeAngle: js.UndefOr[Double] = js.undefined,
    azimuthAngle: js.UndefOr[Double] = js.undefined,
    clientX: js.UndefOr[Double] = js.undefined,
    clientY: js.UndefOr[Double] = js.undefined,
    force: js.UndefOr[Double] = js.undefined,
    pageX: js.UndefOr[Double] = js.undefined,
    pageY: js.UndefOr[Double] = js.undefined,
    radiusX: js.UndefOr[Double] = js.undefined,
    radiusY: js.UndefOr[Double] = js.undefined,
    rotationAngle: js.UndefOr[Double] = js.undefined,
    screenX: js.UndefOr[Double] = js.undefined,
    screenY: js.UndefOr[Double] = js.undefined,
    touchType: TouchType = null
  ): TouchInit = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(altitudeAngle)) __obj.updateDynamic("altitudeAngle")(altitudeAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(azimuthAngle)) __obj.updateDynamic("azimuthAngle")(azimuthAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientX)) __obj.updateDynamic("clientX")(clientX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientY)) __obj.updateDynamic("clientY")(clientY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageX)) __obj.updateDynamic("pageX")(pageX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageY)) __obj.updateDynamic("pageY")(pageY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusX)) __obj.updateDynamic("radiusX")(radiusX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusY)) __obj.updateDynamic("radiusY")(radiusY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationAngle)) __obj.updateDynamic("rotationAngle")(rotationAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenX)) __obj.updateDynamic("screenX")(screenX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenY)) __obj.updateDynamic("screenY")(screenY.get.asInstanceOf[js.Any])
    if (touchType != null) __obj.updateDynamic("touchType")(touchType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchInit]
  }
}

