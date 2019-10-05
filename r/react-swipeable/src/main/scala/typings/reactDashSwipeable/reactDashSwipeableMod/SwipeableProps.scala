package typings.reactDashSwipeable.reactDashSwipeableMod

import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.react.reactMod.TouchEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableProps[T /* <: Element */]
  extends HTMLAttributes[T]
     with ClassAttributes[ReactSwipeable[T]] {
  var delta: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var flickThreshold: js.UndefOr[Double] = js.undefined
  var innerRef: js.UndefOr[Ref[T]] = js.undefined
  var nodeName: js.UndefOr[String] = js.undefined
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
  var preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined
  var rotationAngle: js.UndefOr[Double] = js.undefined
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
  var trackMouse: js.UndefOr[Boolean] = js.undefined
}

object SwipeableProps {
  @scala.inline
  def apply[T /* <: Element */](
    ClassAttributes: ClassAttributes[ReactSwipeable[T]] = null,
    HTMLAttributes: HTMLAttributes[T] = null,
    children: ReactNode = null,
    delta: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    flickThreshold: Int | Double = null,
    innerRef: Ref[T] = null,
    nodeName: String = null,
    onSwiped: (/* event */ TouchEvent[T], /* deltaX */ Double, /* deltaY */ Double, /* isFlick */ Boolean, /* velocity */ Double) => Unit = null,
    onSwipedDown: (/* event */ TouchEvent[T], /* delta */ Double, /* isFlick */ Boolean) => Unit = null,
    onSwipedLeft: (/* event */ TouchEvent[T], /* delta */ Double, /* isFlick */ Boolean) => Unit = null,
    onSwipedRight: (/* event */ TouchEvent[T], /* delta */ Double, /* isFlick */ Boolean) => Unit = null,
    onSwipedUp: (/* event */ TouchEvent[T], /* delta */ Double, /* isFlick */ Boolean) => Unit = null,
    onSwiping: (/* event */ TouchEvent[T], /* deltaX */ Double, /* deltaY */ Double, /* absX */ Double, /* absY */ Double, /* velocity */ Double) => Unit = null,
    onSwipingDown: (/* event */ TouchEvent[T], /* delta */ Double) => Unit = null,
    onSwipingLeft: (/* event */ TouchEvent[T], /* delta */ Double) => Unit = null,
    onSwipingRight: (/* event */ TouchEvent[T], /* delta */ Double) => Unit = null,
    onSwipingUp: (/* event */ TouchEvent[T], /* delta */ Double) => Unit = null,
    onTap: /* event */ TouchEvent[T] => Unit = null,
    preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined,
    rotationAngle: Int | Double = null,
    stopPropagation: js.UndefOr[Boolean] = js.undefined,
    trackMouse: js.UndefOr[Boolean] = js.undefined
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
    if (onSwiped != null) __obj.updateDynamic("onSwiped")(js.Any.fromFunction5(onSwiped))
    if (onSwipedDown != null) __obj.updateDynamic("onSwipedDown")(js.Any.fromFunction3(onSwipedDown))
    if (onSwipedLeft != null) __obj.updateDynamic("onSwipedLeft")(js.Any.fromFunction3(onSwipedLeft))
    if (onSwipedRight != null) __obj.updateDynamic("onSwipedRight")(js.Any.fromFunction3(onSwipedRight))
    if (onSwipedUp != null) __obj.updateDynamic("onSwipedUp")(js.Any.fromFunction3(onSwipedUp))
    if (onSwiping != null) __obj.updateDynamic("onSwiping")(js.Any.fromFunction6(onSwiping))
    if (onSwipingDown != null) __obj.updateDynamic("onSwipingDown")(js.Any.fromFunction2(onSwipingDown))
    if (onSwipingLeft != null) __obj.updateDynamic("onSwipingLeft")(js.Any.fromFunction2(onSwipingLeft))
    if (onSwipingRight != null) __obj.updateDynamic("onSwipingRight")(js.Any.fromFunction2(onSwipingRight))
    if (onSwipingUp != null) __obj.updateDynamic("onSwipingUp")(js.Any.fromFunction2(onSwipingUp))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1(onTap))
    if (!js.isUndefined(preventDefaultTouchmoveEvent)) __obj.updateDynamic("preventDefaultTouchmoveEvent")(preventDefaultTouchmoveEvent)
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation)
    if (!js.isUndefined(trackMouse)) __obj.updateDynamic("trackMouse")(trackMouse)
    __obj.asInstanceOf[SwipeableProps[T]]
  }
}

