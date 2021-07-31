package typings.reactNativeWindows

import typings.reactNative.mod.NativeSyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardExtPropsMod {
  
  @js.native
  sealed trait EventPhase extends StObject
  @JSImport("react-native-windows/Libraries/Components/Keyboard/KeyboardExtProps", "EventPhase")
  @js.native
  object EventPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EventPhase & Double] = js.native
    
    @js.native
    sealed trait AtTarget
      extends StObject
         with EventPhase
    /* 2 */ val AtTarget: typings.reactNativeWindows.keyboardExtPropsMod.EventPhase.AtTarget & Double = js.native
    
    @js.native
    sealed trait Bubbling
      extends StObject
         with EventPhase
    /* 3 */ val Bubbling: typings.reactNativeWindows.keyboardExtPropsMod.EventPhase.Bubbling & Double = js.native
    
    @js.native
    sealed trait Capturing
      extends StObject
         with EventPhase
    /* 1 */ val Capturing: typings.reactNativeWindows.keyboardExtPropsMod.EventPhase.Capturing & Double = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with EventPhase
    /* 0 */ val None: typings.reactNativeWindows.keyboardExtPropsMod.EventPhase.None & Double = js.native
  }
  
  @js.native
  sealed trait HandledEventPhase extends StObject
  @JSImport("react-native-windows/Libraries/Components/Keyboard/KeyboardExtProps", "HandledEventPhase")
  @js.native
  object HandledEventPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HandledEventPhase & Double] = js.native
    
    @js.native
    sealed trait Bubbling
      extends StObject
         with HandledEventPhase
    /* 3 */ val Bubbling: typings.reactNativeWindows.keyboardExtPropsMod.HandledEventPhase.Bubbling & Double = js.native
    
    @js.native
    sealed trait Capturing
      extends StObject
         with HandledEventPhase
    /* 1 */ val Capturing: typings.reactNativeWindows.keyboardExtPropsMod.HandledEventPhase.Capturing & Double = js.native
  }
  
  trait IHandledKeyboardEvent extends StObject {
    
    var altKey: js.UndefOr[Boolean] = js.undefined
    
    var code: String
    
    var ctrlKey: js.UndefOr[Boolean] = js.undefined
    
    var handledEventPhase: js.UndefOr[HandledEventPhase] = js.undefined
    
    var metaKey: js.UndefOr[Boolean] = js.undefined
    
    var shiftKey: js.UndefOr[Boolean] = js.undefined
  }
  object IHandledKeyboardEvent {
    
    @scala.inline
    def apply(code: String): IHandledKeyboardEvent = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHandledKeyboardEvent]
    }
    
    @scala.inline
    implicit class IHandledKeyboardEventMutableBuilder[Self <: IHandledKeyboardEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
      
      @scala.inline
      def setHandledEventPhase(value: HandledEventPhase): Self = StObject.set(x, "handledEventPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandledEventPhaseUndefined: Self = StObject.set(x, "handledEventPhase", js.undefined)
      
      @scala.inline
      def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
    }
  }
  
  type IKeyboardEvent = NativeSyntheticEvent[INativeKeyboardEvent]
  
  trait IKeyboardProps extends StObject {
    
    var keyDownEvents: js.UndefOr[js.Array[IHandledKeyboardEvent]] = js.undefined
    
    var keyUpEvents: js.UndefOr[js.Array[IHandledKeyboardEvent]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* args */ IKeyboardEvent, Unit]] = js.undefined
    
    var onKeyDownCapture: js.UndefOr[js.Function1[/* args */ IKeyboardEvent, Unit]] = js.undefined
    
    var onKeyUp: js.UndefOr[js.Function1[/* args */ IKeyboardEvent, Unit]] = js.undefined
    
    var onKeyUpCapture: js.UndefOr[js.Function1[/* args */ IKeyboardEvent, Unit]] = js.undefined
  }
  object IKeyboardProps {
    
    @scala.inline
    def apply(): IKeyboardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IKeyboardProps]
    }
    
    @scala.inline
    implicit class IKeyboardPropsMutableBuilder[Self <: IKeyboardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyDownEvents(value: js.Array[IHandledKeyboardEvent]): Self = StObject.set(x, "keyDownEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyDownEventsUndefined: Self = StObject.set(x, "keyDownEvents", js.undefined)
      
      @scala.inline
      def setKeyDownEventsVarargs(value: IHandledKeyboardEvent*): Self = StObject.set(x, "keyDownEvents", js.Array(value :_*))
      
      @scala.inline
      def setKeyUpEvents(value: js.Array[IHandledKeyboardEvent]): Self = StObject.set(x, "keyUpEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUpEventsUndefined: Self = StObject.set(x, "keyUpEvents", js.undefined)
      
      @scala.inline
      def setKeyUpEventsVarargs(value: IHandledKeyboardEvent*): Self = StObject.set(x, "keyUpEvents", js.Array(value :_*))
      
      @scala.inline
      def setOnKeyDown(value: /* args */ IKeyboardEvent => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownCapture(value: /* args */ IKeyboardEvent => Unit): Self = StObject.set(x, "onKeyDownCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: /* args */ IKeyboardEvent => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpCapture(value: /* args */ IKeyboardEvent => Unit): Self = StObject.set(x, "onKeyUpCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    }
  }
  
  trait INativeKeyboardEvent extends StObject {
    
    var altKey: Boolean
    
    var code: String
    
    var ctrlKey: Boolean
    
    var eventPhase: EventPhase
    
    var key: String
    
    var metaKey: Boolean
    
    var shiftKey: Boolean
  }
  object INativeKeyboardEvent {
    
    @scala.inline
    def apply(
      altKey: Boolean,
      code: String,
      ctrlKey: Boolean,
      eventPhase: EventPhase,
      key: String,
      metaKey: Boolean,
      shiftKey: Boolean
    ): INativeKeyboardEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[INativeKeyboardEvent]
    }
    
    @scala.inline
    implicit class INativeKeyboardEventMutableBuilder[Self <: INativeKeyboardEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPhase(value: EventPhase): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    }
  }
}
