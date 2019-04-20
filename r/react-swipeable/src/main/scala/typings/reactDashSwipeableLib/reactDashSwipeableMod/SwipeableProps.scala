package typings
package reactDashSwipeableLib.reactDashSwipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableProps[T /* <: stdLib.Element */]
  extends reactLib.reactMod.HTMLAttributes[T]
     with reactLib.reactMod.ClassAttributes[ReactSwipeable[T]] {
  var delta: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var flickThreshold: js.UndefOr[scala.Double] = js.undefined
  var innerRef: js.UndefOr[reactLib.reactMod.Ref[T]] = js.undefined
  var nodeName: js.UndefOr[java.lang.String] = js.undefined
  var onSwiped: js.UndefOr[OnSwipedCallback[T]] = js.undefined
  var onSwipedDown: js.UndefOr[OnSwipedDirectionCallback[T]] = js.undefined
  var onSwipedLeft: js.UndefOr[OnSwipedDirectionCallback[T]] = js.undefined
  var onSwipedRight: js.UndefOr[OnSwipedDirectionCallback[T]] = js.undefined
  var onSwipedUp: js.UndefOr[OnSwipedDirectionCallback[T]] = js.undefined
  var onSwiping: js.UndefOr[OnSwipingCallback[T]] = js.undefined
  var onSwipingDown: js.UndefOr[OnSwipingDirectionCallback[T]] = js.undefined
  var onSwipingLeft: js.UndefOr[OnSwipingDirectionCallback[T]] = js.undefined
  var onSwipingRight: js.UndefOr[OnSwipingDirectionCallback[T]] = js.undefined
  var onSwipingUp: js.UndefOr[OnSwipingDirectionCallback[T]] = js.undefined
  var onTap: js.UndefOr[OnTapCallback[T]] = js.undefined
  var preventDefaultTouchmoveEvent: js.UndefOr[scala.Boolean] = js.undefined
  var rotationAngle: js.UndefOr[scala.Double] = js.undefined
  var stopPropagation: js.UndefOr[scala.Boolean] = js.undefined
  var trackMouse: js.UndefOr[scala.Boolean] = js.undefined
}

object SwipeableProps {
  @scala.inline
  def apply[T /* <: stdLib.Element */](
    ClassAttributes: reactLib.reactMod.ClassAttributes[ReactSwipeable[T]] = null,
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[T] = null,
    children: reactLib.reactMod.ReactNode = null,
    delta: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    flickThreshold: scala.Int | scala.Double = null,
    innerRef: reactLib.reactMod.Ref[T] = null,
    nodeName: java.lang.String = null,
    onSwiped: OnSwipedCallback[T] = null,
    onSwipedDown: OnSwipedDirectionCallback[T] = null,
    onSwipedLeft: OnSwipedDirectionCallback[T] = null,
    onSwipedRight: OnSwipedDirectionCallback[T] = null,
    onSwipedUp: OnSwipedDirectionCallback[T] = null,
    onSwiping: OnSwipingCallback[T] = null,
    onSwipingDown: OnSwipingDirectionCallback[T] = null,
    onSwipingLeft: OnSwipingDirectionCallback[T] = null,
    onSwipingRight: OnSwipingDirectionCallback[T] = null,
    onSwipingUp: OnSwipingDirectionCallback[T] = null,
    onTap: OnTapCallback[T] = null,
    preventDefaultTouchmoveEvent: js.UndefOr[scala.Boolean] = js.undefined,
    rotationAngle: scala.Int | scala.Double = null,
    stopPropagation: js.UndefOr[scala.Boolean] = js.undefined,
    trackMouse: js.UndefOr[scala.Boolean] = js.undefined
  ): SwipeableProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (flickThreshold != null) __obj.updateDynamic("flickThreshold")(flickThreshold.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (nodeName != null) __obj.updateDynamic("nodeName")(nodeName)
    if (onSwiped != null) __obj.updateDynamic("onSwiped")(onSwiped)
    if (onSwipedDown != null) __obj.updateDynamic("onSwipedDown")(onSwipedDown)
    if (onSwipedLeft != null) __obj.updateDynamic("onSwipedLeft")(onSwipedLeft)
    if (onSwipedRight != null) __obj.updateDynamic("onSwipedRight")(onSwipedRight)
    if (onSwipedUp != null) __obj.updateDynamic("onSwipedUp")(onSwipedUp)
    if (onSwiping != null) __obj.updateDynamic("onSwiping")(onSwiping)
    if (onSwipingDown != null) __obj.updateDynamic("onSwipingDown")(onSwipingDown)
    if (onSwipingLeft != null) __obj.updateDynamic("onSwipingLeft")(onSwipingLeft)
    if (onSwipingRight != null) __obj.updateDynamic("onSwipingRight")(onSwipingRight)
    if (onSwipingUp != null) __obj.updateDynamic("onSwipingUp")(onSwipingUp)
    if (onTap != null) __obj.updateDynamic("onTap")(onTap)
    if (!js.isUndefined(preventDefaultTouchmoveEvent)) __obj.updateDynamic("preventDefaultTouchmoveEvent")(preventDefaultTouchmoveEvent)
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation)
    if (!js.isUndefined(trackMouse)) __obj.updateDynamic("trackMouse")(trackMouse)
    __obj.asInstanceOf[SwipeableProps[T]]
  }
}

