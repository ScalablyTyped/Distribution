package typings.rcMotion.anon

import typings.rcMotion.cssmotionMod.MotionName
import typings.rcMotion.interfaceMod.MotionEndEventHandler
import typings.rcMotion.interfaceMod.MotionEvent
import typings.rcMotion.interfaceMod.MotionEventHandler
import typings.rcMotion.interfaceMod.MotionPrepareEventHandler
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rc-motion.rc-motion/es/CSSMotion.CSSMotionProps & {  ref :react.react.Ref<any> | undefined} */
@js.native
trait CSSMotionPropsrefRefanyun extends js.Object {
  
  var children: js.UndefOr[
    js.Function2[/* props */ Dictkey, /* ref */ js.Function1[/* node */ js.Any, Unit], ReactElement]
  ] = js.native
  
  /** @private Used by CSSMotionList. Do not use in your production. */
  var eventProps: js.UndefOr[js.Object] = js.native
  
  /**
    * Create element in view even the element is invisible.
    * Will patch `display: none` style on it.
    */
  var forceRender: js.UndefOr[Boolean] = js.native
  
  var internalRef: js.UndefOr[Ref[_]] = js.native
  
  var leavedClassName: js.UndefOr[String] = js.native
  
  var motionAppear: js.UndefOr[Boolean] = js.native
  
  var motionDeadline: js.UndefOr[Double] = js.native
  
  var motionEnter: js.UndefOr[Boolean] = js.native
  
  var motionLeave: js.UndefOr[Boolean] = js.native
  
  var motionLeaveImmediately: js.UndefOr[Boolean] = js.native
  
  var motionName: js.UndefOr[MotionName] = js.native
  
  var onAppearActive: js.UndefOr[MotionEventHandler] = js.native
  
  var onAppearEnd: js.UndefOr[MotionEndEventHandler] = js.native
  
  var onAppearPrepare: js.UndefOr[MotionPrepareEventHandler] = js.native
  
  var onAppearStart: js.UndefOr[MotionEventHandler] = js.native
  
  var onEnterActive: js.UndefOr[MotionEventHandler] = js.native
  
  var onEnterEnd: js.UndefOr[MotionEndEventHandler] = js.native
  
  var onEnterPrepare: js.UndefOr[MotionPrepareEventHandler] = js.native
  
  var onEnterStart: js.UndefOr[MotionEventHandler] = js.native
  
  var onLeaveActive: js.UndefOr[MotionEventHandler] = js.native
  
  var onLeaveEnd: js.UndefOr[MotionEndEventHandler] = js.native
  
  var onLeavePrepare: js.UndefOr[MotionPrepareEventHandler] = js.native
  
  var onLeaveStart: js.UndefOr[MotionEventHandler] = js.native
  
  /** This will always trigger after final visible changed. Even if no motion configured. */
  var onVisibleChanged: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  
  var ref: js.UndefOr[Ref[_]] = js.native
  
  /**
    * Remove element when motion end. This will not work when `forceRender` is set.
    */
  var removeOnLeave: js.UndefOr[Boolean] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object CSSMotionPropsrefRefanyun {
  
  @scala.inline
  def apply(): CSSMotionPropsrefRefanyun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSMotionPropsrefRefanyun]
  }
  
  @scala.inline
  implicit class CSSMotionPropsrefRefanyunOps[Self <: CSSMotionPropsrefRefanyun] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: (/* props */ Dictkey, /* ref */ js.Function1[/* node */ js.Any, Unit]) => ReactElement): Self = this.set("children", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setEventProps(value: js.Object): Self = this.set("eventProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventProps: Self = this.set("eventProps", js.undefined)
    
    @scala.inline
    def setForceRender(value: Boolean): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceRender: Self = this.set("forceRender", js.undefined)
    
    @scala.inline
    def setInternalRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("internalRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInternalRef(value: Ref[_]): Self = this.set("internalRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalRef: Self = this.set("internalRef", js.undefined)
    
    @scala.inline
    def setInternalRefNull: Self = this.set("internalRef", null)
    
    @scala.inline
    def setLeavedClassName(value: String): Self = this.set("leavedClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeavedClassName: Self = this.set("leavedClassName", js.undefined)
    
    @scala.inline
    def setMotionAppear(value: Boolean): Self = this.set("motionAppear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionAppear: Self = this.set("motionAppear", js.undefined)
    
    @scala.inline
    def setMotionDeadline(value: Double): Self = this.set("motionDeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionDeadline: Self = this.set("motionDeadline", js.undefined)
    
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
    def setMotionName(value: MotionName): Self = this.set("motionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionName: Self = this.set("motionName", js.undefined)
    
    @scala.inline
    def setOnAppearActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = this.set("onAppearActive", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnAppearActive: Self = this.set("onAppearActive", js.undefined)
    
    @scala.inline
    def setOnAppearEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): Self = this.set("onAppearEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnAppearEnd: Self = this.set("onAppearEnd", js.undefined)
    
    @scala.inline
    def setOnAppearPrepare(value: /* element */ HTMLElement => js.Promise[js.Any] | Unit): Self = this.set("onAppearPrepare", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAppearPrepare: Self = this.set("onAppearPrepare", js.undefined)
    
    @scala.inline
    def setOnAppearStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = this.set("onAppearStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnAppearStart: Self = this.set("onAppearStart", js.undefined)
    
    @scala.inline
    def setOnEnterActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = this.set("onEnterActive", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnEnterActive: Self = this.set("onEnterActive", js.undefined)
    
    @scala.inline
    def setOnEnterEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): Self = this.set("onEnterEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnEnterEnd: Self = this.set("onEnterEnd", js.undefined)
    
    @scala.inline
    def setOnEnterPrepare(value: /* element */ HTMLElement => js.Promise[js.Any] | Unit): Self = this.set("onEnterPrepare", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnterPrepare: Self = this.set("onEnterPrepare", js.undefined)
    
    @scala.inline
    def setOnEnterStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = this.set("onEnterStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnEnterStart: Self = this.set("onEnterStart", js.undefined)
    
    @scala.inline
    def setOnLeaveActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = this.set("onLeaveActive", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnLeaveActive: Self = this.set("onLeaveActive", js.undefined)
    
    @scala.inline
    def setOnLeaveEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): Self = this.set("onLeaveEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnLeaveEnd: Self = this.set("onLeaveEnd", js.undefined)
    
    @scala.inline
    def setOnLeavePrepare(value: /* element */ HTMLElement => js.Promise[js.Any] | Unit): Self = this.set("onLeavePrepare", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLeavePrepare: Self = this.set("onLeavePrepare", js.undefined)
    
    @scala.inline
    def setOnLeaveStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = this.set("onLeaveStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnLeaveStart: Self = this.set("onLeaveStart", js.undefined)
    
    @scala.inline
    def setOnVisibleChanged(value: /* visible */ Boolean => Unit): Self = this.set("onVisibleChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnVisibleChanged: Self = this.set("onVisibleChanged", js.undefined)
    
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    
    @scala.inline
    def setRemoveOnLeave(value: Boolean): Self = this.set("removeOnLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveOnLeave: Self = this.set("removeOnLeave", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
