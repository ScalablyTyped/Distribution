package typings.rcMotion

import typings.rcMotion.anon.Appear
import typings.rcMotion.anon.CSSMotionPropsrefRefanyun
import typings.rcMotion.anon.Dictkey
import typings.rcMotion.anon.ForwardRef
import typings.rcMotion.interfaceMod.MotionEndEventHandler
import typings.rcMotion.interfaceMod.MotionEvent
import typings.rcMotion.interfaceMod.MotionEventHandler
import typings.rcMotion.interfaceMod.MotionPrepareEventHandler
import typings.rcMotion.interfaceMod.MotionStatus
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssmotionMod {
  
  @JSImport("rc-motion/es/CSSMotion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-motion/es/CSSMotion", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[CSSMotionPropsrefRefanyun] = js.native
  
  inline def genCSSMotion(config: CSSMotionConfig): ForwardRefExoticComponent[CSSMotionPropsrefRefanyun] = ^.asInstanceOf[js.Dynamic].applyDynamic("genCSSMotion")(config.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[CSSMotionPropsrefRefanyun]]
  
  type CSSMotionConfig = Boolean | ForwardRef
  
  trait CSSMotionProps extends StObject {
    
    var children: js.UndefOr[
        js.Function2[/* props */ Dictkey, /* ref */ js.Function1[/* node */ Any, Unit], ReactElement]
      ] = js.undefined
    
    /** @private Used by CSSMotionList. Do not use in your production. */
    var eventProps: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Create element in view even the element is invisible.
      * Will patch `display: none` style on it.
      */
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var internalRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var leavedClassName: js.UndefOr[String] = js.undefined
    
    var motionAppear: js.UndefOr[Boolean] = js.undefined
    
    var motionDeadline: js.UndefOr[Double] = js.undefined
    
    var motionEnter: js.UndefOr[Boolean] = js.undefined
    
    var motionLeave: js.UndefOr[Boolean] = js.undefined
    
    var motionLeaveImmediately: js.UndefOr[Boolean] = js.undefined
    
    var motionName: js.UndefOr[MotionName] = js.undefined
    
    var onAppearActive: js.UndefOr[MotionEventHandler] = js.undefined
    
    var onAppearEnd: js.UndefOr[MotionEndEventHandler] = js.undefined
    
    var onAppearPrepare: js.UndefOr[MotionPrepareEventHandler] = js.undefined
    
    var onAppearStart: js.UndefOr[MotionEventHandler] = js.undefined
    
    var onEnterActive: js.UndefOr[MotionEventHandler] = js.undefined
    
    var onEnterEnd: js.UndefOr[MotionEndEventHandler] = js.undefined
    
    var onEnterPrepare: js.UndefOr[MotionPrepareEventHandler] = js.undefined
    
    var onEnterStart: js.UndefOr[MotionEventHandler] = js.undefined
    
    var onLeaveActive: js.UndefOr[MotionEventHandler] = js.undefined
    
    var onLeaveEnd: js.UndefOr[MotionEndEventHandler] = js.undefined
    
    var onLeavePrepare: js.UndefOr[MotionPrepareEventHandler] = js.undefined
    
    var onLeaveStart: js.UndefOr[MotionEventHandler] = js.undefined
    
    /** This will always trigger after final visible changed. Even if no motion configured. */
    var onVisibleChanged: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    /**
      * Remove element when motion end. This will not work when `forceRender` is set.
      */
    var removeOnLeave: js.UndefOr[Boolean] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object CSSMotionProps {
    
    inline def apply(): CSSMotionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSMotionProps]
    }
    
    extension [Self <: CSSMotionProps](x: Self) {
      
      inline def setChildren(value: (/* props */ Dictkey, /* ref */ js.Function1[/* node */ Any, Unit]) => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setEventProps(value: js.Object): Self = StObject.set(x, "eventProps", value.asInstanceOf[js.Any])
      
      inline def setEventPropsUndefined: Self = StObject.set(x, "eventProps", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setInternalRef(value: Ref[Any]): Self = StObject.set(x, "internalRef", value.asInstanceOf[js.Any])
      
      inline def setInternalRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "internalRef", js.Any.fromFunction1(value))
      
      inline def setInternalRefNull: Self = StObject.set(x, "internalRef", null)
      
      inline def setInternalRefUndefined: Self = StObject.set(x, "internalRef", js.undefined)
      
      inline def setLeavedClassName(value: String): Self = StObject.set(x, "leavedClassName", value.asInstanceOf[js.Any])
      
      inline def setLeavedClassNameUndefined: Self = StObject.set(x, "leavedClassName", js.undefined)
      
      inline def setMotionAppear(value: Boolean): Self = StObject.set(x, "motionAppear", value.asInstanceOf[js.Any])
      
      inline def setMotionAppearUndefined: Self = StObject.set(x, "motionAppear", js.undefined)
      
      inline def setMotionDeadline(value: Double): Self = StObject.set(x, "motionDeadline", value.asInstanceOf[js.Any])
      
      inline def setMotionDeadlineUndefined: Self = StObject.set(x, "motionDeadline", js.undefined)
      
      inline def setMotionEnter(value: Boolean): Self = StObject.set(x, "motionEnter", value.asInstanceOf[js.Any])
      
      inline def setMotionEnterUndefined: Self = StObject.set(x, "motionEnter", js.undefined)
      
      inline def setMotionLeave(value: Boolean): Self = StObject.set(x, "motionLeave", value.asInstanceOf[js.Any])
      
      inline def setMotionLeaveImmediately(value: Boolean): Self = StObject.set(x, "motionLeaveImmediately", value.asInstanceOf[js.Any])
      
      inline def setMotionLeaveImmediatelyUndefined: Self = StObject.set(x, "motionLeaveImmediately", js.undefined)
      
      inline def setMotionLeaveUndefined: Self = StObject.set(x, "motionLeave", js.undefined)
      
      inline def setMotionName(value: MotionName): Self = StObject.set(x, "motionName", value.asInstanceOf[js.Any])
      
      inline def setMotionNameUndefined: Self = StObject.set(x, "motionName", js.undefined)
      
      inline def setOnAppearActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onAppearActive", js.Any.fromFunction2(value))
      
      inline def setOnAppearActiveUndefined: Self = StObject.set(x, "onAppearActive", js.undefined)
      
      inline def setOnAppearEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): Self = StObject.set(x, "onAppearEnd", js.Any.fromFunction2(value))
      
      inline def setOnAppearEndUndefined: Self = StObject.set(x, "onAppearEnd", js.undefined)
      
      inline def setOnAppearPrepare(value: /* element */ HTMLElement => js.Promise[Any] | Unit): Self = StObject.set(x, "onAppearPrepare", js.Any.fromFunction1(value))
      
      inline def setOnAppearPrepareUndefined: Self = StObject.set(x, "onAppearPrepare", js.undefined)
      
      inline def setOnAppearStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onAppearStart", js.Any.fromFunction2(value))
      
      inline def setOnAppearStartUndefined: Self = StObject.set(x, "onAppearStart", js.undefined)
      
      inline def setOnEnterActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onEnterActive", js.Any.fromFunction2(value))
      
      inline def setOnEnterActiveUndefined: Self = StObject.set(x, "onEnterActive", js.undefined)
      
      inline def setOnEnterEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): Self = StObject.set(x, "onEnterEnd", js.Any.fromFunction2(value))
      
      inline def setOnEnterEndUndefined: Self = StObject.set(x, "onEnterEnd", js.undefined)
      
      inline def setOnEnterPrepare(value: /* element */ HTMLElement => js.Promise[Any] | Unit): Self = StObject.set(x, "onEnterPrepare", js.Any.fromFunction1(value))
      
      inline def setOnEnterPrepareUndefined: Self = StObject.set(x, "onEnterPrepare", js.undefined)
      
      inline def setOnEnterStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onEnterStart", js.Any.fromFunction2(value))
      
      inline def setOnEnterStartUndefined: Self = StObject.set(x, "onEnterStart", js.undefined)
      
      inline def setOnLeaveActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onLeaveActive", js.Any.fromFunction2(value))
      
      inline def setOnLeaveActiveUndefined: Self = StObject.set(x, "onLeaveActive", js.undefined)
      
      inline def setOnLeaveEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): Self = StObject.set(x, "onLeaveEnd", js.Any.fromFunction2(value))
      
      inline def setOnLeaveEndUndefined: Self = StObject.set(x, "onLeaveEnd", js.undefined)
      
      inline def setOnLeavePrepare(value: /* element */ HTMLElement => js.Promise[Any] | Unit): Self = StObject.set(x, "onLeavePrepare", js.Any.fromFunction1(value))
      
      inline def setOnLeavePrepareUndefined: Self = StObject.set(x, "onLeavePrepare", js.undefined)
      
      inline def setOnLeaveStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onLeaveStart", js.Any.fromFunction2(value))
      
      inline def setOnLeaveStartUndefined: Self = StObject.set(x, "onLeaveStart", js.undefined)
      
      inline def setOnVisibleChanged(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChanged", js.Any.fromFunction1(value))
      
      inline def setOnVisibleChangedUndefined: Self = StObject.set(x, "onVisibleChanged", js.undefined)
      
      inline def setRemoveOnLeave(value: Boolean): Self = StObject.set(x, "removeOnLeave", value.asInstanceOf[js.Any])
      
      inline def setRemoveOnLeaveUndefined: Self = StObject.set(x, "removeOnLeave", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait CSSMotionState extends StObject {
    
    var newStatus: js.UndefOr[Boolean] = js.undefined
    
    var prevProps: js.UndefOr[CSSMotionProps] = js.undefined
    
    var status: js.UndefOr[MotionStatus] = js.undefined
    
    var statusActive: js.UndefOr[Boolean] = js.undefined
    
    var statusStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object CSSMotionState {
    
    inline def apply(): CSSMotionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSMotionState]
    }
    
    extension [Self <: CSSMotionState](x: Self) {
      
      inline def setNewStatus(value: Boolean): Self = StObject.set(x, "newStatus", value.asInstanceOf[js.Any])
      
      inline def setNewStatusUndefined: Self = StObject.set(x, "newStatus", js.undefined)
      
      inline def setPrevProps(value: CSSMotionProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      inline def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
      
      inline def setStatus(value: MotionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusActive(value: Boolean): Self = StObject.set(x, "statusActive", value.asInstanceOf[js.Any])
      
      inline def setStatusActiveUndefined: Self = StObject.set(x, "statusActive", js.undefined)
      
      inline def setStatusStyle(value: CSSProperties): Self = StObject.set(x, "statusStyle", value.asInstanceOf[js.Any])
      
      inline def setStatusStyleUndefined: Self = StObject.set(x, "statusStyle", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  type MotionName = String | Appear
}
