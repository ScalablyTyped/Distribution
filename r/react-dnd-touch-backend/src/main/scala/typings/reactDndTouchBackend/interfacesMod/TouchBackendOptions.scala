package typings.reactDndTouchBackend.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBackendOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var delayMouseStart: js.UndefOr[Double] = js.undefined
  var delayTouchStart: js.UndefOr[Double] = js.undefined
  var enableHoverOutsideTarget: js.UndefOr[Boolean] = js.undefined
  var enableKeyboardEvents: js.UndefOr[Boolean] = js.undefined
  var enableMouseEvents: js.UndefOr[Boolean] = js.undefined
  var enableTouchEvents: js.UndefOr[Boolean] = js.undefined
  var getDropTargetElementsAtPoint: js.UndefOr[js.Function] = js.undefined
  var ignoreContextMenu: js.UndefOr[Boolean] = js.undefined
  var scrollAngleRanges: js.UndefOr[js.Array[AngleRange]] = js.undefined
  var touchSlop: js.UndefOr[Double] = js.undefined
}

object TouchBackendOptions {
  @scala.inline
  def apply(
    delay: js.UndefOr[Double] = js.undefined,
    delayMouseStart: js.UndefOr[Double] = js.undefined,
    delayTouchStart: js.UndefOr[Double] = js.undefined,
    enableHoverOutsideTarget: js.UndefOr[Boolean] = js.undefined,
    enableKeyboardEvents: js.UndefOr[Boolean] = js.undefined,
    enableMouseEvents: js.UndefOr[Boolean] = js.undefined,
    enableTouchEvents: js.UndefOr[Boolean] = js.undefined,
    getDropTargetElementsAtPoint: js.Function = null,
    ignoreContextMenu: js.UndefOr[Boolean] = js.undefined,
    scrollAngleRanges: js.Array[AngleRange] = null,
    touchSlop: js.UndefOr[Double] = js.undefined
  ): TouchBackendOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayMouseStart)) __obj.updateDynamic("delayMouseStart")(delayMouseStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayTouchStart)) __obj.updateDynamic("delayTouchStart")(delayTouchStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHoverOutsideTarget)) __obj.updateDynamic("enableHoverOutsideTarget")(enableHoverOutsideTarget.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableKeyboardEvents)) __obj.updateDynamic("enableKeyboardEvents")(enableKeyboardEvents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseEvents)) __obj.updateDynamic("enableMouseEvents")(enableMouseEvents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTouchEvents)) __obj.updateDynamic("enableTouchEvents")(enableTouchEvents.get.asInstanceOf[js.Any])
    if (getDropTargetElementsAtPoint != null) __obj.updateDynamic("getDropTargetElementsAtPoint")(getDropTargetElementsAtPoint.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreContextMenu)) __obj.updateDynamic("ignoreContextMenu")(ignoreContextMenu.get.asInstanceOf[js.Any])
    if (scrollAngleRanges != null) __obj.updateDynamic("scrollAngleRanges")(scrollAngleRanges.asInstanceOf[js.Any])
    if (!js.isUndefined(touchSlop)) __obj.updateDynamic("touchSlop")(touchSlop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBackendOptions]
  }
}

