package typings.reactMdMenu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useVisibilityMod {
  
  @JSImport("@react-md/menu/types/useVisibility", "useVisibility")
  @js.native
  def useVisibility(): ReturnValue = js.native
  @JSImport("@react-md/menu/types/useVisibility", "useVisibility")
  @js.native
  def useVisibility(hasDefaultVisibleDefaultFocusOnVisibilityChange: VisibilityOptions): ReturnValue = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdMenu.reactMdMenuStrings.first
    - typings.reactMdMenu.reactMdMenuStrings.last
  */
  trait FocusType extends StObject
  object FocusType {
    
    @scala.inline
    def first: typings.reactMdMenu.reactMdMenuStrings.first = "first".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.first]
    
    @scala.inline
    def last: typings.reactMdMenu.reactMdMenuStrings.last = "last".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.last]
  }
  
  @js.native
  trait ReturnValue extends StObject {
    
    var defaultFocus: FocusType = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
    
    def showWithFocus(defaultFocus: FocusType): Unit = js.native
    
    def toggle(): Unit = js.native
    
    var visible: Boolean = js.native
  }
  object ReturnValue {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ReturnValueMutableBuilder[Self <: ReturnValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultFocus(value: FocusType): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowWithFocus(value: FocusType => Unit): Self = StObject.set(x, "showWithFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VisibilityOptions extends StObject {
    
    var defaultFocus: js.UndefOr[FocusType] = js.native
    
    var defaultVisible: js.UndefOr[Boolean] = js.native
    
    var onVisibilityChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  }
  object VisibilityOptions {
    
    @scala.inline
    def apply(): VisibilityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisibilityOptions]
    }
    
    @scala.inline
    implicit class VisibilityOptionsMutableBuilder[Self <: VisibilityOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultFocus(value: FocusType): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFocusUndefined: Self = StObject.set(x, "defaultFocus", js.undefined)
      
      @scala.inline
      def setDefaultVisible(value: Boolean): Self = StObject.set(x, "defaultVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultVisibleUndefined: Self = StObject.set(x, "defaultVisible", js.undefined)
      
      @scala.inline
      def setOnVisibilityChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibilityChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibilityChangeUndefined: Self = StObject.set(x, "onVisibilityChange", js.undefined)
    }
  }
  
  @js.native
  trait VisibilityState extends StObject {
    
    var defaultFocus: FocusType = js.native
    
    var visible: Boolean = js.native
  }
  object VisibilityState {
    
    @scala.inline
    def apply(defaultFocus: FocusType, visible: Boolean): VisibilityState = {
      val __obj = js.Dynamic.literal(defaultFocus = defaultFocus.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisibilityState]
    }
    
    @scala.inline
    implicit class VisibilityStateMutableBuilder[Self <: VisibilityState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultFocus(value: FocusType): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
