package typings.reactNativeWindows

import typings.reactNative.mod.NativeSyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object librariesComponentsKeyboardKeyboardExtPropsMod {
  
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
    /* 2 */ val AtTarget: typings.reactNativeWindows.librariesComponentsKeyboardKeyboardExtPropsMod.EventPhase.AtTarget & Double = js.native
    
    @js.native
    sealed trait Bubbling
      extends StObject
         with EventPhase
    /* 3 */ val Bubbling: typings.reactNativeWindows.librariesComponentsKeyboardKeyboardExtPropsMod.EventPhase.Bubbling & Double = js.native
    
    @js.native
    sealed trait Capturing
      extends StObject
         with EventPhase
    /* 1 */ val Capturing: typings.reactNativeWindows.librariesComponentsKeyboardKeyboardExtPropsMod.EventPhase.Capturing & Double = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with EventPhase
    /* 0 */ val None: typings.reactNativeWindows.librariesComponentsKeyboardKeyboardExtPropsMod.EventPhase.None & Double = js.native
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
    /* 3 */ val Bubbling: typings.reactNativeWindows.librariesComponentsKeyboardKeyboardExtPropsMod.HandledEventPhase.Bubbling & Double = js.native
    
    @js.native
    sealed trait Capturing
      extends StObject
         with HandledEventPhase
    /* 1 */ val Capturing: typings.reactNativeWindows.librariesComponentsKeyboardKeyboardExtPropsMod.HandledEventPhase.Capturing & Double = js.native
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
    
    inline def apply(code: String): IHandledKeyboardEvent = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHandledKeyboardEvent]
    }
    
    extension [Self <: IHandledKeyboardEvent](x: Self) {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
      
      inline def setHandledEventPhase(value: HandledEventPhase): Self = StObject.set(x, "handledEventPhase", value.asInstanceOf[js.Any])
      
      inline def setHandledEventPhaseUndefined: Self = StObject.set(x, "handledEventPhase", js.undefined)
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
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
    
    inline def apply(): IKeyboardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IKeyboardProps]
    }
    
    extension [Self <: IKeyboardProps](x: Self) {
      
      inline def setKeyDownEvents(value: js.Array[IHandledKeyboardEvent]): Self = StObject.set(x, "keyDownEvents", value.asInstanceOf[js.Any])
      
      inline def setKeyDownEventsUndefined: Self = StObject.set(x, "keyDownEvents", js.undefined)
      
      inline def setKeyDownEventsVarargs(value: IHandledKeyboardEvent*): Self = StObject.set(x, "keyDownEvents", js.Array(value*))
      
      inline def setKeyUpEvents(value: js.Array[IHandledKeyboardEvent]): Self = StObject.set(x, "keyUpEvents", value.asInstanceOf[js.Any])
      
      inline def setKeyUpEventsUndefined: Self = StObject.set(x, "keyUpEvents", js.undefined)
      
      inline def setKeyUpEventsVarargs(value: IHandledKeyboardEvent*): Self = StObject.set(x, "keyUpEvents", js.Array(value*))
      
      inline def setOnKeyDown(value: /* args */ IKeyboardEvent => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownCapture(value: /* args */ IKeyboardEvent => Unit): Self = StObject.set(x, "onKeyDownCapture", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyUp(value: /* args */ IKeyboardEvent => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpCapture(value: /* args */ IKeyboardEvent => Unit): Self = StObject.set(x, "onKeyUpCapture", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
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
    
    inline def apply(
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
    
    extension [Self <: INativeKeyboardEvent](x: Self) {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setEventPhase(value: EventPhase): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    }
  }
}
