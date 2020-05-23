package typings.rcGesture.anon

import typings.rcGesture.mod.Finger
import typings.rcGesture.mod.MultiFingerStatus
import typings.rcGesture.mod.SingeFingerMoveStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailablePan extends js.Object {
  var availablePan: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[Double] = js.undefined
  var moveStatus: js.UndefOr[SingeFingerMoveStatus] = js.undefined
  var mutliFingerStatus: js.UndefOr[js.Array[MultiFingerStatus]] = js.undefined
  var pan: js.UndefOr[Boolean] = js.undefined
  var pinch: js.UndefOr[Boolean] = js.undefined
  var preTouches: js.Array[Finger]
  var press: js.UndefOr[Boolean] = js.undefined
  var rotate: js.UndefOr[Boolean] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var srcEvent: js.Any
  var startMutliFingerStatus: js.UndefOr[js.Array[MultiFingerStatus]] = js.undefined
  var startTime: Double
  var startTouches: js.Array[Finger]
  var swipe: js.UndefOr[Boolean] = js.undefined
  var time: Double
  var touches: js.Array[Finger]
}

object AvailablePan {
  @scala.inline
  def apply(
    preTouches: js.Array[Finger],
    srcEvent: js.Any,
    startTime: Double,
    startTouches: js.Array[Finger],
    time: Double,
    touches: js.Array[Finger],
    availablePan: js.UndefOr[Boolean] = js.undefined,
    direction: js.UndefOr[Double] = js.undefined,
    moveStatus: SingeFingerMoveStatus = null,
    mutliFingerStatus: js.Array[MultiFingerStatus] = null,
    pan: js.UndefOr[Boolean] = js.undefined,
    pinch: js.UndefOr[Boolean] = js.undefined,
    press: js.UndefOr[Boolean] = js.undefined,
    rotate: js.UndefOr[Boolean] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    startMutliFingerStatus: js.Array[MultiFingerStatus] = null,
    swipe: js.UndefOr[Boolean] = js.undefined
  ): AvailablePan = {
    val __obj = js.Dynamic.literal(preTouches = preTouches.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startTouches = startTouches.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    if (!js.isUndefined(availablePan)) __obj.updateDynamic("availablePan")(availablePan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.get.asInstanceOf[js.Any])
    if (moveStatus != null) __obj.updateDynamic("moveStatus")(moveStatus.asInstanceOf[js.Any])
    if (mutliFingerStatus != null) __obj.updateDynamic("mutliFingerStatus")(mutliFingerStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(pan)) __obj.updateDynamic("pan")(pan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pinch)) __obj.updateDynamic("pinch")(pinch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(press)) __obj.updateDynamic("press")(press.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (startMutliFingerStatus != null) __obj.updateDynamic("startMutliFingerStatus")(startMutliFingerStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(swipe)) __obj.updateDynamic("swipe")(swipe.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailablePan]
  }
}

