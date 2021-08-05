package typings.reactMdMenu

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.reactMdMenu.useVisibilityMod.FocusType
import typings.reactMdMenu.useVisibilityMod.VisibilityOptions
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useItemVisibilityMod {
  
  @JSImport("@react-md/menu/types/useItemVisibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useItemVisibility(): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useItemVisibility")().asInstanceOf[ReturnValue]
  inline def useItemVisibility(
    hasHorizontalPropOnClickPropOnKeyDownDefaultVisiblePropDefaultFocusOnVisibilityChange: ItemVisibilityOptions
  ): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useItemVisibility")(hasHorizontalPropOnClickPropOnKeyDownDefaultVisiblePropDefaultFocusOnVisibilityChange.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
  
  trait ItemVisibilityOptions
    extends StObject
       with VisibilityOptions {
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.undefined
  }
  object ItemVisibilityOptions {
    
    inline def apply(): ItemVisibilityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemVisibilityOptions]
    }
    
    extension [Self <: ItemVisibilityOptions](x: Self) {
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  /* Inlined parent std.Pick<react.react.HTMLAttributes<std.HTMLLIElement>, 'onClick' | 'onKeyDown'> */
  trait ReturnValue extends StObject {
    
    var defaultFocus: FocusType
    
    def hide(): Unit
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.undefined
    
    var visible: Boolean
  }
  object ReturnValue {
    
    inline def apply(defaultFocus: FocusType, hide: () => Unit, visible: Boolean): ReturnValue = {
      val __obj = js.Dynamic.literal(defaultFocus = defaultFocus.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue]
    }
    
    extension [Self <: ReturnValue](x: Self) {
      
      inline def setDefaultFocus(value: FocusType): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setOnClick(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
