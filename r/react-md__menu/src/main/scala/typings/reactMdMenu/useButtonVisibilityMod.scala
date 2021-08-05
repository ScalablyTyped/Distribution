package typings.reactMdMenu

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.reactMdMenu.useVisibilityMod.FocusType
import typings.reactMdMenu.useVisibilityMod.VisibilityOptions
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useButtonVisibilityMod {
  
  @JSImport("@react-md/menu/types/useButtonVisibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useButtonVisibility(): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useButtonVisibility")().asInstanceOf[ReturnValue]
  inline def useButtonVisibility(
    hasPropOnClickPropOnKeyDownDefaultVisiblePropDefaultFocusOnVisibilityChange: ButtonVisibilityOptions
  ): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useButtonVisibility")(hasPropOnClickPropOnKeyDownDefaultVisiblePropDefaultFocusOnVisibilityChange.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
  
  trait ButtonVisibilityOptions
    extends StObject
       with VisibilityOptions {
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.undefined
  }
  object ButtonVisibilityOptions {
    
    inline def apply(): ButtonVisibilityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonVisibilityOptions]
    }
    
    extension [Self <: ButtonVisibilityOptions](x: Self) {
      
      inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  /* Inlined parent std.Required<std.Pick<react.react.HTMLAttributes<std.HTMLButtonElement>, 'onClick' | 'onKeyDown'>> */
  trait ReturnValue extends StObject {
    
    var defaultFocus: FocusType
    
    def hide(): Unit
    
    var onClick: MouseEventHandler[HTMLButtonElement]
    
    var onKeyDown: KeyboardEventHandler[HTMLButtonElement]
    
    var visible: Boolean
  }
  object ReturnValue {
    
    inline def apply(
      defaultFocus: FocusType,
      hide: () => Unit,
      onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
      onKeyDown: KeyboardEvent[HTMLButtonElement] => Unit,
      visible: Boolean
    ): ReturnValue = {
      val __obj = js.Dynamic.literal(defaultFocus = defaultFocus.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), onClick = js.Any.fromFunction1(onClick), onKeyDown = js.Any.fromFunction1(onKeyDown), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue]
    }
    
    extension [Self <: ReturnValue](x: Self) {
      
      inline def setDefaultFocus(value: FocusType): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
