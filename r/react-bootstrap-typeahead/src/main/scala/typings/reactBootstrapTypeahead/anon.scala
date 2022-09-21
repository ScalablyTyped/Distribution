package typings.reactBootstrapTypeahead

import typings.react.mod.RefObject
import typings.react.mod.SyntheticEvent
import typings.reactBootstrapTypeahead.mod.EventHandler
import typings.reactBootstrapTypeahead.mod.Option
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Active extends StObject {
    
    var active: Boolean
    
    var onBlur: js.UndefOr[EventHandler[HTMLElement]] = js.undefined
    
    var onClick: js.UndefOr[EventHandler[HTMLElement]] = js.undefined
    
    var onFocus: js.UndefOr[EventHandler[HTMLElement]] = js.undefined
    
    var onKeyDown: EventHandler[HTMLElement]
    
    var onRemove: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var ref: RefObject[HTMLDivElement]
  }
  object Active {
    
    inline def apply(
      active: Boolean,
      onKeyDown: /* e */ SyntheticEvent[HTMLElement, Event] => Unit,
      ref: RefObject[HTMLDivElement]
    ): Active = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown), ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Active]
    }
    
    extension [Self <: Active](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: /* e */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: /* e */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: /* e */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnRemove(value: () => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction0(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setRef(value: RefObject[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomOption extends StObject {
    
    var customOption: Boolean
  }
  object CustomOption {
    
    inline def apply(customOption: Boolean): CustomOption = {
      val __obj = js.Dynamic.literal(customOption = customOption.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomOption]
    }
    
    extension [Self <: CustomOption](x: Self) {
      
      inline def setCustomOption(value: Boolean): Self = StObject.set(x, "customOption", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnBlur extends StObject {
    
    var onBlur: js.UndefOr[EventHandler[HTMLElement]] = js.undefined
    
    var onClick: js.UndefOr[EventHandler[HTMLElement]] = js.undefined
    
    var onFocus: js.UndefOr[EventHandler[HTMLElement]] = js.undefined
    
    var onRemove: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var option: Option
  }
  object OnBlur {
    
    inline def apply(option: Option): OnBlur = {
      val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnBlur]
    }
    
    extension [Self <: OnBlur](x: Self) {
      
      inline def setOnBlur(value: /* e */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: /* e */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: /* e */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnRemove(value: () => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction0(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setOption(value: Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    }
  }
}
