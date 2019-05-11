package typings
package rcDashGestureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AvailablePan extends js.Object {
  var availablePan: js.UndefOr[scala.Boolean] = js.undefined
  var direction: js.UndefOr[scala.Double] = js.undefined
  var moveStatus: js.UndefOr[rcDashGestureLib.esMod.SingeFingerMoveStatus] = js.undefined
  var mutliFingerStatus: js.UndefOr[js.Array[rcDashGestureLib.esMod.MultiFingerStatus]] = js.undefined
  var pan: js.UndefOr[scala.Boolean] = js.undefined
  var pinch: js.UndefOr[scala.Boolean] = js.undefined
  var preTouches: js.Array[rcDashGestureLib.esMod.Finger]
  var press: js.UndefOr[scala.Boolean] = js.undefined
  var rotate: js.UndefOr[scala.Boolean] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var srcEvent: js.Any
  var startMutliFingerStatus: js.UndefOr[js.Array[rcDashGestureLib.esMod.MultiFingerStatus]] = js.undefined
  var startTime: scala.Double
  var startTouches: js.Array[rcDashGestureLib.esMod.Finger]
  var swipe: js.UndefOr[scala.Boolean] = js.undefined
  var time: scala.Double
  var touches: js.Array[rcDashGestureLib.esMod.Finger]
}

object Anon_AvailablePan {
  @scala.inline
  def apply(
    preTouches: js.Array[rcDashGestureLib.esMod.Finger],
    srcEvent: js.Any,
    startTime: scala.Double,
    startTouches: js.Array[rcDashGestureLib.esMod.Finger],
    time: scala.Double,
    touches: js.Array[rcDashGestureLib.esMod.Finger],
    availablePan: js.UndefOr[scala.Boolean] = js.undefined,
    direction: scala.Int | scala.Double = null,
    moveStatus: rcDashGestureLib.esMod.SingeFingerMoveStatus = null,
    mutliFingerStatus: js.Array[rcDashGestureLib.esMod.MultiFingerStatus] = null,
    pan: js.UndefOr[scala.Boolean] = js.undefined,
    pinch: js.UndefOr[scala.Boolean] = js.undefined,
    press: js.UndefOr[scala.Boolean] = js.undefined,
    rotate: js.UndefOr[scala.Boolean] = js.undefined,
    rotation: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    startMutliFingerStatus: js.Array[rcDashGestureLib.esMod.MultiFingerStatus] = null,
    swipe: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AvailablePan = {
    val __obj = js.Dynamic.literal(preTouches = preTouches, srcEvent = srcEvent, startTime = startTime, startTouches = startTouches, time = time, touches = touches)
    if (!js.isUndefined(availablePan)) __obj.updateDynamic("availablePan")(availablePan)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (moveStatus != null) __obj.updateDynamic("moveStatus")(moveStatus)
    if (mutliFingerStatus != null) __obj.updateDynamic("mutliFingerStatus")(mutliFingerStatus)
    if (!js.isUndefined(pan)) __obj.updateDynamic("pan")(pan)
    if (!js.isUndefined(pinch)) __obj.updateDynamic("pinch")(pinch)
    if (!js.isUndefined(press)) __obj.updateDynamic("press")(press)
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (startMutliFingerStatus != null) __obj.updateDynamic("startMutliFingerStatus")(startMutliFingerStatus)
    if (!js.isUndefined(swipe)) __obj.updateDynamic("swipe")(swipe)
    __obj.asInstanceOf[Anon_AvailablePan]
  }
}

