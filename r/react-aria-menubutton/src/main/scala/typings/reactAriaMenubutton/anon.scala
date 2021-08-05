package typings.reactAriaMenubutton

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FocusButton extends StObject {
    
    /**
      * If `true`, the widget's button will receive focus when the
      * menu closes. Default: `false`.
      */
    var focusButton: Boolean
  }
  object FocusButton {
    
    inline def apply(focusButton: Boolean): FocusButton = {
      val __obj = js.Dynamic.literal(focusButton = focusButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusButton]
    }
    
    extension [Self <: FocusButton](x: Self) {
      
      inline def setFocusButton(value: Boolean): Self = StObject.set(x, "focusButton", value.asInstanceOf[js.Any])
    }
  }
  
  trait FocusMenu extends StObject {
    
    /**
      * If `true`, the menu's first item will receive focus when the
      * menu opens. Default: `false`.
      */
    var focusMenu: Boolean
  }
  object FocusMenu {
    
    inline def apply(focusMenu: Boolean): FocusMenu = {
      val __obj = js.Dynamic.literal(focusMenu = focusMenu.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusMenu]
    }
    
    extension [Self <: FocusMenu](x: Self) {
      
      inline def setFocusMenu(value: Boolean): Self = StObject.set(x, "focusMenu", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsOpen extends StObject {
    
    var isOpen: Boolean
  }
  object IsOpen {
    
    inline def apply(isOpen: Boolean): IsOpen = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsOpen]
    }
    
    extension [Self <: IsOpen](x: Self) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
}
