package typings.rcTrigger.anon

import typings.rcTrigger.rcTriggerBooleans.`false`
import typings.react.mod.AnimationEvent
import typings.react.mod.CSSProperties
import typings.react.mod.TransitionEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeavedClassName extends js.Object {
  var leavedClassName: js.UndefOr[String] = js.native
  var motionAppear: js.UndefOr[Boolean] = js.native
  var motionEnter: js.UndefOr[Boolean] = js.native
  var motionLeave: js.UndefOr[Boolean] = js.native
  var motionLeaveImmediately: js.UndefOr[Boolean] = js.native
  var motionName: js.UndefOr[String | Appear] = js.native
  var onAppearActive: js.UndefOr[
    js.Function2[
      /* element */ HTMLElement, 
      /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement], 
      `false` | Unit | CSSProperties
    ]
  ] = js.native
  var onAppearEnd: js.UndefOr[
    js.Function2[
      /* element */ HTMLElement, 
      /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement], 
      `false` | Unit | CSSProperties
    ]
  ] = js.native
  var onAppearStart: js.UndefOr[
    js.Function2[
      /* element */ HTMLElement, 
      /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement], 
      `false` | Unit | CSSProperties
    ]
  ] = js.native
  var onEnterActive: js.UndefOr[
    js.Function2[
      /* element */ HTMLElement, 
      /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement], 
      `false` | Unit | CSSProperties
    ]
  ] = js.native
  var onEnterEnd: js.UndefOr[
    js.Function2[
      /* element */ HTMLElement, 
      /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement], 
      `false` | Unit | CSSProperties
    ]
  ] = js.native
  var onEnterStart: js.UndefOr[
    js.Function2[
      /* element */ HTMLElement, 
      /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement], 
      `false` | Unit | CSSProperties
    ]
  ] = js.native
  var onLeaveActive: js.UndefOr[
    js.Function2[
      /* element */ HTMLElement, 
      /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement], 
      `false` | Unit | CSSProperties
    ]
  ] = js.native
  var onLeaveEnd: js.UndefOr[
    js.Function2[
      /* element */ HTMLElement, 
      /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement], 
      `false` | Unit | CSSProperties
    ]
  ] = js.native
  var onLeaveStart: js.UndefOr[
    js.Function2[
      /* element */ HTMLElement, 
      /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement], 
      `false` | Unit | CSSProperties
    ]
  ] = js.native
  var removeOnLeave: js.UndefOr[Boolean] = js.native
}

object LeavedClassName {
  @scala.inline
  def apply(): LeavedClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeavedClassName]
  }
  @scala.inline
  implicit class LeavedClassNameOps[Self <: LeavedClassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLeavedClassName(value: String): Self = this.set("leavedClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeavedClassName: Self = this.set("leavedClassName", js.undefined)
    @scala.inline
    def setMotionAppear(value: Boolean): Self = this.set("motionAppear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotionAppear: Self = this.set("motionAppear", js.undefined)
    @scala.inline
    def setMotionEnter(value: Boolean): Self = this.set("motionEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotionEnter: Self = this.set("motionEnter", js.undefined)
    @scala.inline
    def setMotionLeave(value: Boolean): Self = this.set("motionLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotionLeave: Self = this.set("motionLeave", js.undefined)
    @scala.inline
    def setMotionLeaveImmediately(value: Boolean): Self = this.set("motionLeaveImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotionLeaveImmediately: Self = this.set("motionLeaveImmediately", js.undefined)
    @scala.inline
    def setMotionName(value: String | Appear): Self = this.set("motionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotionName: Self = this.set("motionName", js.undefined)
    @scala.inline
    def setOnAppearActive(
      value: (/* element */ HTMLElement, /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement]) => `false` | Unit | CSSProperties
    ): Self = this.set("onAppearActive", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAppearActive: Self = this.set("onAppearActive", js.undefined)
    @scala.inline
    def setOnAppearEnd(
      value: (/* element */ HTMLElement, /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement]) => `false` | Unit | CSSProperties
    ): Self = this.set("onAppearEnd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAppearEnd: Self = this.set("onAppearEnd", js.undefined)
    @scala.inline
    def setOnAppearStart(
      value: (/* element */ HTMLElement, /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement]) => `false` | Unit | CSSProperties
    ): Self = this.set("onAppearStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAppearStart: Self = this.set("onAppearStart", js.undefined)
    @scala.inline
    def setOnEnterActive(
      value: (/* element */ HTMLElement, /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement]) => `false` | Unit | CSSProperties
    ): Self = this.set("onEnterActive", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEnterActive: Self = this.set("onEnterActive", js.undefined)
    @scala.inline
    def setOnEnterEnd(
      value: (/* element */ HTMLElement, /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement]) => `false` | Unit | CSSProperties
    ): Self = this.set("onEnterEnd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEnterEnd: Self = this.set("onEnterEnd", js.undefined)
    @scala.inline
    def setOnEnterStart(
      value: (/* element */ HTMLElement, /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement]) => `false` | Unit | CSSProperties
    ): Self = this.set("onEnterStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEnterStart: Self = this.set("onEnterStart", js.undefined)
    @scala.inline
    def setOnLeaveActive(
      value: (/* element */ HTMLElement, /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement]) => `false` | Unit | CSSProperties
    ): Self = this.set("onLeaveActive", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLeaveActive: Self = this.set("onLeaveActive", js.undefined)
    @scala.inline
    def setOnLeaveEnd(
      value: (/* element */ HTMLElement, /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement]) => `false` | Unit | CSSProperties
    ): Self = this.set("onLeaveEnd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLeaveEnd: Self = this.set("onLeaveEnd", js.undefined)
    @scala.inline
    def setOnLeaveStart(
      value: (/* element */ HTMLElement, /* event */ AnimationEvent[HTMLElement] | TransitionEvent[HTMLElement]) => `false` | Unit | CSSProperties
    ): Self = this.set("onLeaveStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLeaveStart: Self = this.set("onLeaveStart", js.undefined)
    @scala.inline
    def setRemoveOnLeave(value: Boolean): Self = this.set("removeOnLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveOnLeave: Self = this.set("removeOnLeave", js.undefined)
  }
  
}

