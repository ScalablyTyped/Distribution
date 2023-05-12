package typings.rcMotion

import org.scalablytyped.runtime.StringDictionary
import typings.rcMotion.esCssmotionMod.MotionName
import typings.rcMotion.esInterfaceMod.MotionEndEventHandler
import typings.rcMotion.esInterfaceMod.MotionEvent
import typings.rcMotion.esInterfaceMod.MotionEventHandler
import typings.rcMotion.esInterfaceMod.MotionPrepareEventHandler
import typings.rcMotion.esUtilDiffMod.DiffStatus
import typings.rcMotion.rcMotionInts.`0`
import typings.rcMotion.rcMotionInts.`1`
import typings.rcMotion.rcMotionInts.`2`
import typings.rcMotion.rcMotionInts.`3`
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.DOMHighResTimeStamp
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.AnimationEvent & {  deadline :boolean | undefined} */
  @js.native
  trait AnimationEventdeadlineboo
    extends StObject
       with MotionEvent {
    
    /* standard dom */
    val AT_TARGET: `2` = js.native
    
    /* standard dom */
    val BUBBLING_PHASE: `3` = js.native
    
    /* standard dom */
    val CAPTURING_PHASE: `1` = js.native
    
    /* standard dom */
    val NONE: `0` = js.native
    
    /* standard dom */
    val animationName: String = js.native
    
    /** Returns true or false depending on how event was initialized. True if event goes through its target's ancestors in reverse tree order, and false otherwise. */
    /* standard dom */
    val bubbles: Boolean = js.native
    
    /** @deprecated */
    /* standard dom */
    var cancelBubble: Boolean = js.native
    
    /** Returns true or false depending on how event was initialized. Its return value does not always carry meaning, but true can indicate that part of the operation during which event was dispatched, can be canceled by invoking the preventDefault() method. */
    /* standard dom */
    val cancelable: Boolean = js.native
    
    /** Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise. */
    /* standard dom */
    val composed: Boolean = js.native
    
    /** Returns the invocation target objects of event's path (objects on which listeners will be invoked), except for any nodes in shadow trees of which the shadow root's mode is "closed" that are not reachable from event's currentTarget. */
    /* standard dom */
    def composedPath(): js.Array[EventTarget] = js.native
    
    /** Returns the object whose event listener's callback is currently being invoked. */
    /* standard dom */
    val currentTarget: EventTarget | Null = js.native
    
    var deadline: js.UndefOr[Boolean] = js.native
    
    /** Returns true if preventDefault() was invoked successfully to indicate cancelation, and false otherwise. */
    /* standard dom */
    val defaultPrevented: Boolean = js.native
    
    /* standard dom */
    val elapsedTime: Double = js.native
    
    /** Returns the event's phase, which is one of NONE, CAPTURING_PHASE, AT_TARGET, and BUBBLING_PHASE. */
    /* standard dom */
    val eventPhase: Double = js.native
    
    /** @deprecated */
    /* standard dom */
    def initEvent(`type`: String): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Unit, cancelable: Boolean): Unit = js.native
    
    /** Returns true if event was dispatched by the user agent, and false otherwise. */
    /* standard dom */
    val isTrusted: Boolean = js.native
    
    /** If invoked when the cancelable attribute value is true, and while executing a listener for the event with passive set to false, signals to the operation that caused event to be dispatched that it needs to be canceled. */
    /* standard dom */
    def preventDefault(): Unit = js.native
    
    /* standard dom */
    val pseudoElement: String = js.native
    
    /** @deprecated */
    /* standard dom */
    var returnValue: Boolean = js.native
    
    /** @deprecated */
    /* standard dom */
    val srcElement: EventTarget | Null = js.native
    
    /** Invoking this method prevents event from reaching any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any other objects. */
    /* standard dom */
    def stopImmediatePropagation(): Unit = js.native
    
    /** When dispatched in a tree, invoking this method prevents event from reaching any objects other than the current object. */
    /* standard dom */
    def stopPropagation(): Unit = js.native
    
    /** Returns the object to which event is dispatched (its target). */
    /* standard dom */
    val target: EventTarget | Null = js.native
    
    /** Returns the event's timestamp as the number of milliseconds measured relative to the time origin. */
    /* standard dom */
    val timeStamp: DOMHighResTimeStamp = js.native
    
    /** Returns the type of event, e.g. "click", "hashchange", or "submit". */
    /* standard dom */
    val `type`: String = js.native
  }
  
  trait Animationend extends StObject {
    
    var animationend: Record[String, String]
    
    var transitionend: Record[String, String]
  }
  object Animationend {
    
    inline def apply(animationend: Record[String, String], transitionend: Record[String, String]): Animationend = {
      val __obj = js.Dynamic.literal(animationend = animationend.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animationend]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Animationend] (val x: Self) extends AnyVal {
      
      inline def setAnimationend(value: Record[String, String]): Self = StObject.set(x, "animationend", value.asInstanceOf[js.Any])
      
      inline def setTransitionend(value: Record[String, String]): Self = StObject.set(x, "transitionend", value.asInstanceOf[js.Any])
    }
  }
  
  trait Appear extends StObject {
    
    var appear: js.UndefOr[String] = js.undefined
    
    var appearActive: js.UndefOr[String] = js.undefined
    
    var enter: js.UndefOr[String] = js.undefined
    
    var enterActive: js.UndefOr[String] = js.undefined
    
    var leave: js.UndefOr[String] = js.undefined
    
    var leaveActive: js.UndefOr[String] = js.undefined
  }
  object Appear {
    
    inline def apply(): Appear = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Appear]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Appear] (val x: Self) extends AnyVal {
      
      inline def setAppear(value: String): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setAppearActive(value: String): Self = StObject.set(x, "appearActive", value.asInstanceOf[js.Any])
      
      inline def setAppearActiveUndefined: Self = StObject.set(x, "appearActive", js.undefined)
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def setEnter(value: String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterActive(value: String): Self = StObject.set(x, "enterActive", value.asInstanceOf[js.Any])
      
      inline def setEnterActiveUndefined: Self = StObject.set(x, "enterActive", js.undefined)
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setLeave(value: String): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      inline def setLeaveActive(value: String): Self = StObject.set(x, "leaveActive", value.asInstanceOf[js.Any])
      
      inline def setLeaveActiveUndefined: Self = StObject.set(x, "leaveActive", js.undefined)
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    }
  }
  
  /* Inlined rc-motion.rc-motion/es/CSSMotion.CSSMotionProps & {  ref :react.react.Ref<any> | undefined} */
  trait CSSMotionPropsrefRefanyun extends StObject {
    
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
    
    /** Prepare phase is used for measure element info. It will always trigger even motion is off */
    var onAppearPrepare: js.UndefOr[MotionPrepareEventHandler] = js.undefined
    
    var onAppearStart: js.UndefOr[MotionEventHandler] = js.undefined
    
    var onEnterActive: js.UndefOr[MotionEventHandler] = js.undefined
    
    var onEnterEnd: js.UndefOr[MotionEndEventHandler] = js.undefined
    
    /** Prepare phase is used for measure element info. It will always trigger even motion is off */
    var onEnterPrepare: js.UndefOr[MotionPrepareEventHandler] = js.undefined
    
    var onEnterStart: js.UndefOr[MotionEventHandler] = js.undefined
    
    var onLeaveActive: js.UndefOr[MotionEventHandler] = js.undefined
    
    var onLeaveEnd: js.UndefOr[MotionEndEventHandler] = js.undefined
    
    /** Prepare phase is used for measure element info. It will always trigger even motion is off */
    var onLeavePrepare: js.UndefOr[MotionPrepareEventHandler] = js.undefined
    
    var onLeaveStart: js.UndefOr[MotionEventHandler] = js.undefined
    
    /** This will always trigger after final visible changed. Even if no motion configured. */
    var onVisibleChanged: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
    
    /**
      * Remove element when motion end. This will not work when `forceRender` is set.
      */
    var removeOnLeave: js.UndefOr[Boolean] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object CSSMotionPropsrefRefanyun {
    
    inline def apply(): CSSMotionPropsrefRefanyun = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSMotionPropsrefRefanyun]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CSSMotionPropsrefRefanyun] (val x: Self) extends AnyVal {
      
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
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRemoveOnLeave(value: Boolean): Self = StObject.set(x, "removeOnLeave", value.asInstanceOf[js.Any])
      
      inline def setRemoveOnLeaveUndefined: Self = StObject.set(x, "removeOnLeave", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /* name */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait Dictname
    extends StObject
       with /* name */ StringDictionary[Any] {
    
    var key: typings.react.mod.Key
  }
  object Dictname {
    
    inline def apply(key: typings.react.mod.Key): Dictname = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictname]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictname] (val x: Self) extends AnyVal {
      
      inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait ForwardRef extends StObject {
    
    /** @deprecated, no need this anymore since `rc-motion` only support latest react */
    var forwardRef: js.UndefOr[Boolean] = js.undefined
    
    var transitionSupport: js.UndefOr[Boolean] = js.undefined
  }
  object ForwardRef {
    
    inline def apply(): ForwardRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForwardRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ForwardRef] (val x: Self) extends AnyVal {
      
      inline def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      inline def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
      
      inline def setTransitionSupport(value: Boolean): Self = StObject.set(x, "transitionSupport", value.asInstanceOf[js.Any])
      
      inline def setTransitionSupportUndefined: Self = StObject.set(x, "transitionSupport", js.undefined)
    }
  }
  
  trait IsCanceled extends StObject {
    
    def isCanceled(): Boolean
  }
  object IsCanceled {
    
    inline def apply(isCanceled: () => Boolean): IsCanceled = {
      val __obj = js.Dynamic.literal(isCanceled = js.Any.fromFunction0(isCanceled))
      __obj.asInstanceOf[IsCanceled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsCanceled] (val x: Self) extends AnyVal {
      
      inline def setIsCanceled(value: () => Boolean): Self = StObject.set(x, "isCanceled", js.Any.fromFunction0(value))
    }
  }
  
  trait Key extends StObject {
    
    var key: typings.react.mod.Key
  }
  object Key {
    
    inline def apply(key: typings.react.mod.Key): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined rc-motion.rc-motion/es/context.MotionContextProps & {  children :react.react.ReactNode | undefined} */
  trait MotionContextPropschildre extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var motion: js.UndefOr[Boolean] = js.undefined
  }
  object MotionContextPropschildre {
    
    inline def apply(): MotionContextPropschildre = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MotionContextPropschildre]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MotionContextPropschildre] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setMotion(value: Boolean): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
    }
  }
  
  trait Status extends StObject {
    
    var key: String
    
    var status: js.UndefOr[DiffStatus] = js.undefined
  }
  object Status {
    
    inline def apply(key: String): Status = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: DiffStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Inlined std.TransitionEvent & {  deadline :boolean | undefined} */
  @js.native
  trait TransitionEventdeadlinebo
    extends StObject
       with MotionEvent {
    
    /* standard dom */
    val AT_TARGET: `2` = js.native
    
    /* standard dom */
    val BUBBLING_PHASE: `3` = js.native
    
    /* standard dom */
    val CAPTURING_PHASE: `1` = js.native
    
    /* standard dom */
    val NONE: `0` = js.native
    
    /** Returns true or false depending on how event was initialized. True if event goes through its target's ancestors in reverse tree order, and false otherwise. */
    /* standard dom */
    val bubbles: Boolean = js.native
    
    /** @deprecated */
    /* standard dom */
    var cancelBubble: Boolean = js.native
    
    /** Returns true or false depending on how event was initialized. Its return value does not always carry meaning, but true can indicate that part of the operation during which event was dispatched, can be canceled by invoking the preventDefault() method. */
    /* standard dom */
    val cancelable: Boolean = js.native
    
    /** Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise. */
    /* standard dom */
    val composed: Boolean = js.native
    
    /** Returns the invocation target objects of event's path (objects on which listeners will be invoked), except for any nodes in shadow trees of which the shadow root's mode is "closed" that are not reachable from event's currentTarget. */
    /* standard dom */
    def composedPath(): js.Array[EventTarget] = js.native
    
    /** Returns the object whose event listener's callback is currently being invoked. */
    /* standard dom */
    val currentTarget: EventTarget | Null = js.native
    
    var deadline: js.UndefOr[Boolean] = js.native
    
    /** Returns true if preventDefault() was invoked successfully to indicate cancelation, and false otherwise. */
    /* standard dom */
    val defaultPrevented: Boolean = js.native
    
    /* standard dom */
    val elapsedTime: Double = js.native
    
    /** Returns the event's phase, which is one of NONE, CAPTURING_PHASE, AT_TARGET, and BUBBLING_PHASE. */
    /* standard dom */
    val eventPhase: Double = js.native
    
    /** @deprecated */
    /* standard dom */
    def initEvent(`type`: String): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Unit, cancelable: Boolean): Unit = js.native
    
    /** Returns true if event was dispatched by the user agent, and false otherwise. */
    /* standard dom */
    val isTrusted: Boolean = js.native
    
    /** If invoked when the cancelable attribute value is true, and while executing a listener for the event with passive set to false, signals to the operation that caused event to be dispatched that it needs to be canceled. */
    /* standard dom */
    def preventDefault(): Unit = js.native
    
    /* standard dom */
    val propertyName: String = js.native
    
    /* standard dom */
    val pseudoElement: String = js.native
    
    /** @deprecated */
    /* standard dom */
    var returnValue: Boolean = js.native
    
    /** @deprecated */
    /* standard dom */
    val srcElement: EventTarget | Null = js.native
    
    /** Invoking this method prevents event from reaching any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any other objects. */
    /* standard dom */
    def stopImmediatePropagation(): Unit = js.native
    
    /** When dispatched in a tree, invoking this method prevents event from reaching any objects other than the current object. */
    /* standard dom */
    def stopPropagation(): Unit = js.native
    
    /** Returns the object to which event is dispatched (its target). */
    /* standard dom */
    val target: EventTarget | Null = js.native
    
    /** Returns the event's timestamp as the number of milliseconds measured relative to the time origin. */
    /* standard dom */
    val timeStamp: DOMHighResTimeStamp = js.native
    
    /** Returns the type of event, e.g. "click", "hashchange", or "submit". */
    /* standard dom */
    val `type`: String = js.native
  }
}
