package typings.reactMdMenu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useVisibilityMod {
  
  @JSImport("@react-md/menu/types/useVisibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useVisibility(): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useVisibility")().asInstanceOf[ReturnValue]
  inline def useVisibility(hasDefaultVisibleDefaultFocusValueOnVisibilityChange: VisibilityOptions): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useVisibility")(hasDefaultVisibleDefaultFocusValueOnVisibilityChange.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdMenu.reactMdMenuStrings.first
    - typings.reactMdMenu.reactMdMenuStrings.last
  */
  trait FocusType extends StObject
  object FocusType {
    
    inline def first: typings.reactMdMenu.reactMdMenuStrings.first = "first".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.first]
    
    inline def last: typings.reactMdMenu.reactMdMenuStrings.last = "last".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.last]
  }
  
  trait ReturnValue extends StObject {
    
    var defaultFocus: FocusType
    
    def hide(): Unit
    
    def show(): Unit
    
    def showWithFocus(defaultFocus: FocusType): Unit
    
    def toggle(): Unit
    
    var visible: Boolean
  }
  object ReturnValue {
    
    inline def apply(
      defaultFocus: FocusType,
      hide: () => Unit,
      show: () => Unit,
      showWithFocus: FocusType => Unit,
      toggle: () => Unit,
      visible: Boolean
    ): ReturnValue = {
      val __obj = js.Dynamic.literal(defaultFocus = defaultFocus.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), showWithFocus = js.Any.fromFunction1(showWithFocus), toggle = js.Any.fromFunction0(toggle), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue]
    }
    
    extension [Self <: ReturnValue](x: Self) {
      
      inline def setDefaultFocus(value: FocusType): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setShowWithFocus(value: FocusType => Unit): Self = StObject.set(x, "showWithFocus", js.Any.fromFunction1(value))
      
      inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait VisibilityOptions extends StObject {
    
    var defaultFocus: js.UndefOr[FocusType] = js.undefined
    
    var defaultVisible: js.UndefOr[Boolean] = js.undefined
    
    var onVisibilityChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  }
  object VisibilityOptions {
    
    inline def apply(): VisibilityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisibilityOptions]
    }
    
    extension [Self <: VisibilityOptions](x: Self) {
      
      inline def setDefaultFocus(value: FocusType): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      inline def setDefaultFocusUndefined: Self = StObject.set(x, "defaultFocus", js.undefined)
      
      inline def setDefaultVisible(value: Boolean): Self = StObject.set(x, "defaultVisible", value.asInstanceOf[js.Any])
      
      inline def setDefaultVisibleUndefined: Self = StObject.set(x, "defaultVisible", js.undefined)
      
      inline def setOnVisibilityChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibilityChange", js.Any.fromFunction1(value))
      
      inline def setOnVisibilityChangeUndefined: Self = StObject.set(x, "onVisibilityChange", js.undefined)
    }
  }
  
  trait VisibilityState extends StObject {
    
    var defaultFocus: FocusType
    
    var visible: Boolean
  }
  object VisibilityState {
    
    inline def apply(defaultFocus: FocusType, visible: Boolean): VisibilityState = {
      val __obj = js.Dynamic.literal(defaultFocus = defaultFocus.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisibilityState]
    }
    
    extension [Self <: VisibilityState](x: Self) {
      
      inline def setDefaultFocus(value: FocusType): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
