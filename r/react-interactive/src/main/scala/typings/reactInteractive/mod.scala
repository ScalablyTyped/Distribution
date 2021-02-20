package typings.reactInteractive

import typings.react.mod.Component
import typings.reactInteractive.anon.As
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-interactive", JSImport.Default)
  @js.native
  class default ()
    extends Component[InteractiveProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactInteractive.anon.Active
    - typings.reactInteractive.anon.HoverActive
  */
  trait ActiveProps extends StObject
  object ActiveProps {
    
    @scala.inline
    def Active(): typings.reactInteractive.anon.Active = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactInteractive.anon.Active]
    }
    
    @scala.inline
    def HoverActive(): typings.reactInteractive.anon.HoverActive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactInteractive.anon.HoverActive]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactInteractive.reactInteractiveStrings.mouseClick
    - typings.reactInteractive.reactInteractiveStrings.tapClick
    - typings.reactInteractive.reactInteractiveStrings.keyClick
  */
  trait ClickType extends StObject
  object ClickType {
    
    @scala.inline
    def keyClick: typings.reactInteractive.reactInteractiveStrings.keyClick = "keyClick".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.keyClick]
    
    @scala.inline
    def mouseClick: typings.reactInteractive.reactInteractiveStrings.mouseClick = "mouseClick".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.mouseClick]
    
    @scala.inline
    def tapClick: typings.reactInteractive.reactInteractiveStrings.tapClick = "tapClick".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.tapClick]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactInteractive.reactInteractiveBooleans.`false`
    - typings.reactInteractive.reactInteractiveStrings.tab
    - typings.reactInteractive.reactInteractiveStrings.mouse
    - typings.reactInteractive.reactInteractiveStrings.touch
  */
  trait Focus extends StObject
  object Focus {
    
    @scala.inline
    def `false`: typings.reactInteractive.reactInteractiveBooleans.`false` = false.asInstanceOf[typings.reactInteractive.reactInteractiveBooleans.`false`]
    
    @scala.inline
    def mouse: typings.reactInteractive.reactInteractiveStrings.mouse = "mouse".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.mouse]
    
    @scala.inline
    def tab: typings.reactInteractive.reactInteractiveStrings.tab = "tab".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.tab]
    
    @scala.inline
    def touch: typings.reactInteractive.reactInteractiveStrings.touch = "touch".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.touch]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactInteractive.anon.Focus
    - typings.reactInteractive.anon.FocusFromMouse
  */
  trait FocusProps extends StObject
  object FocusProps {
    
    @scala.inline
    def Focus(): typings.reactInteractive.anon.Focus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactInteractive.anon.Focus]
    }
    
    @scala.inline
    def FocusFromMouse(): typings.reactInteractive.anon.FocusFromMouse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactInteractive.anon.FocusFromMouse]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactInteractive.reactInteractiveStrings.normal
    - typings.reactInteractive.reactInteractiveStrings.hover
    - typings.reactInteractive.reactInteractiveStrings.hoverActive
    - typings.reactInteractive.reactInteractiveStrings.touchActive
    - typings.reactInteractive.reactInteractiveStrings.keyActive
  */
  trait IState extends StObject
  object IState {
    
    @scala.inline
    def hover: typings.reactInteractive.reactInteractiveStrings.hover = "hover".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.hover]
    
    @scala.inline
    def hoverActive: typings.reactInteractive.reactInteractiveStrings.hoverActive = "hoverActive".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.hoverActive]
    
    @scala.inline
    def keyActive: typings.reactInteractive.reactInteractiveStrings.keyActive = "keyActive".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.keyActive]
    
    @scala.inline
    def normal: typings.reactInteractive.reactInteractiveStrings.normal = "normal".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.normal]
    
    @scala.inline
    def touchActive: typings.reactInteractive.reactInteractiveStrings.touchActive = "touchActive".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.touchActive]
  }
  
  type Interactive = Component[InteractiveProps, js.Object, js.Any]
  
  type InteractiveProps = FocusProps with ActiveProps with As
  
  @js.native
  trait State extends StObject {
    
    var focus: Focus = js.native
    
    var iState: IState = js.native
  }
  object State {
    
    @scala.inline
    def apply(focus: Focus, iState: IState): State = {
      val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], iState = iState.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: Focus): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIState(value: IState): Self = StObject.set(x, "iState", value.asInstanceOf[js.Any])
    }
  }
}
