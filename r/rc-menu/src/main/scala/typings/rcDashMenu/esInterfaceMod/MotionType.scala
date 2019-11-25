package typings.rcDashMenu.esInterfaceMod

import typings.rcDashMenu.rcDashMenuNumbers.`false`
import typings.react.reactMod.AnimationEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.TransitionEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotionType extends js.Object {
  var leavedClassName: js.UndefOr[String] = js.undefined
  var motionAppear: js.UndefOr[Boolean] = js.undefined
  var motionEnter: js.UndefOr[Boolean] = js.undefined
  var motionLeave: js.UndefOr[Boolean] = js.undefined
  var motionLeaveImmediately: js.UndefOr[Boolean] = js.undefined
  var motionName: js.UndefOr[String | MotionNameObject] = js.undefined
  var onAppearActive: js.UndefOr[MotionEventHandler] = js.undefined
  var onAppearEnd: js.UndefOr[MotionEventHandler] = js.undefined
  var onAppearStart: js.UndefOr[MotionEventHandler] = js.undefined
  var onEnterActive: js.UndefOr[MotionEventHandler] = js.undefined
  var onEnterEnd: js.UndefOr[MotionEventHandler] = js.undefined
  var onEnterStart: js.UndefOr[MotionEventHandler] = js.undefined
  var onLeaveActive: js.UndefOr[MotionEventHandler] = js.undefined
  var onLeaveEnd: js.UndefOr[MotionEventHandler] = js.undefined
  var onLeaveStart: js.UndefOr[MotionEventHandler] = js.undefined
  var removeOnLeave: js.UndefOr[Boolean] = js.undefined
}

object MotionType {
  @scala.inline
  def apply(
    leavedClassName: String = null,
    motionAppear: js.UndefOr[Boolean] = js.undefined,
    motionEnter: js.UndefOr[Boolean] = js.undefined,
    motionLeave: js.UndefOr[Boolean] = js.undefined,
    motionLeaveImmediately: js.UndefOr[Boolean] = js.undefined,
    motionName: String | MotionNameObject = null,
    onAppearActive: (/* element */ HTMLElement, /* event */ js.UndefOr[TransitionEvent[HTMLElement] | AnimationEvent[HTMLElement]]) => js.UndefOr[CSSProperties | `false` | Null | Unit] = null,
    onAppearEnd: (/* element */ HTMLElement, /* event */ js.UndefOr[TransitionEvent[HTMLElement] | AnimationEvent[HTMLElement]]) => js.UndefOr[CSSProperties | `false` | Null | Unit] = null,
    onAppearStart: (/* element */ HTMLElement, /* event */ js.UndefOr[TransitionEvent[HTMLElement] | AnimationEvent[HTMLElement]]) => js.UndefOr[CSSProperties | `false` | Null | Unit] = null,
    onEnterActive: (/* element */ HTMLElement, /* event */ js.UndefOr[TransitionEvent[HTMLElement] | AnimationEvent[HTMLElement]]) => js.UndefOr[CSSProperties | `false` | Null | Unit] = null,
    onEnterEnd: (/* element */ HTMLElement, /* event */ js.UndefOr[TransitionEvent[HTMLElement] | AnimationEvent[HTMLElement]]) => js.UndefOr[CSSProperties | `false` | Null | Unit] = null,
    onEnterStart: (/* element */ HTMLElement, /* event */ js.UndefOr[TransitionEvent[HTMLElement] | AnimationEvent[HTMLElement]]) => js.UndefOr[CSSProperties | `false` | Null | Unit] = null,
    onLeaveActive: (/* element */ HTMLElement, /* event */ js.UndefOr[TransitionEvent[HTMLElement] | AnimationEvent[HTMLElement]]) => js.UndefOr[CSSProperties | `false` | Null | Unit] = null,
    onLeaveEnd: (/* element */ HTMLElement, /* event */ js.UndefOr[TransitionEvent[HTMLElement] | AnimationEvent[HTMLElement]]) => js.UndefOr[CSSProperties | `false` | Null | Unit] = null,
    onLeaveStart: (/* element */ HTMLElement, /* event */ js.UndefOr[TransitionEvent[HTMLElement] | AnimationEvent[HTMLElement]]) => js.UndefOr[CSSProperties | `false` | Null | Unit] = null,
    removeOnLeave: js.UndefOr[Boolean] = js.undefined
  ): MotionType = {
    val __obj = js.Dynamic.literal()
    if (leavedClassName != null) __obj.updateDynamic("leavedClassName")(leavedClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(motionAppear)) __obj.updateDynamic("motionAppear")(motionAppear.asInstanceOf[js.Any])
    if (!js.isUndefined(motionEnter)) __obj.updateDynamic("motionEnter")(motionEnter.asInstanceOf[js.Any])
    if (!js.isUndefined(motionLeave)) __obj.updateDynamic("motionLeave")(motionLeave.asInstanceOf[js.Any])
    if (!js.isUndefined(motionLeaveImmediately)) __obj.updateDynamic("motionLeaveImmediately")(motionLeaveImmediately.asInstanceOf[js.Any])
    if (motionName != null) __obj.updateDynamic("motionName")(motionName.asInstanceOf[js.Any])
    if (onAppearActive != null) __obj.updateDynamic("onAppearActive")(js.Any.fromFunction2(onAppearActive))
    if (onAppearEnd != null) __obj.updateDynamic("onAppearEnd")(js.Any.fromFunction2(onAppearEnd))
    if (onAppearStart != null) __obj.updateDynamic("onAppearStart")(js.Any.fromFunction2(onAppearStart))
    if (onEnterActive != null) __obj.updateDynamic("onEnterActive")(js.Any.fromFunction2(onEnterActive))
    if (onEnterEnd != null) __obj.updateDynamic("onEnterEnd")(js.Any.fromFunction2(onEnterEnd))
    if (onEnterStart != null) __obj.updateDynamic("onEnterStart")(js.Any.fromFunction2(onEnterStart))
    if (onLeaveActive != null) __obj.updateDynamic("onLeaveActive")(js.Any.fromFunction2(onLeaveActive))
    if (onLeaveEnd != null) __obj.updateDynamic("onLeaveEnd")(js.Any.fromFunction2(onLeaveEnd))
    if (onLeaveStart != null) __obj.updateDynamic("onLeaveStart")(js.Any.fromFunction2(onLeaveStart))
    if (!js.isUndefined(removeOnLeave)) __obj.updateDynamic("removeOnLeave")(removeOnLeave.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionType]
  }
}

