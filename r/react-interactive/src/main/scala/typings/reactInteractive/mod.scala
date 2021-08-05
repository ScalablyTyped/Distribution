package typings.reactInteractive

import typings.react.mod.Component
import typings.reactInteractive.anon.As
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    inline def Active(): typings.reactInteractive.anon.Active = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactInteractive.anon.Active]
    }
    
    inline def HoverActive(): typings.reactInteractive.anon.HoverActive = {
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
    
    inline def keyClick: typings.reactInteractive.reactInteractiveStrings.keyClick = "keyClick".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.keyClick]
    
    inline def mouseClick: typings.reactInteractive.reactInteractiveStrings.mouseClick = "mouseClick".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.mouseClick]
    
    inline def tapClick: typings.reactInteractive.reactInteractiveStrings.tapClick = "tapClick".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.tapClick]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactInteractive.reactInteractiveBooleans.`false`
    - typings.reactInteractive.reactInteractiveStrings.tab
    - typings.reactInteractive.reactInteractiveStrings.mouse
    - typings.reactInteractive.reactInteractiveStrings.touch
  */
  trait Focus extends StObject
  object Focus {
    
    inline def `false`: typings.reactInteractive.reactInteractiveBooleans.`false` = false.asInstanceOf[typings.reactInteractive.reactInteractiveBooleans.`false`]
    
    inline def mouse: typings.reactInteractive.reactInteractiveStrings.mouse = "mouse".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.mouse]
    
    inline def tab: typings.reactInteractive.reactInteractiveStrings.tab = "tab".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.tab]
    
    inline def touch: typings.reactInteractive.reactInteractiveStrings.touch = "touch".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.touch]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactInteractive.anon.Focus
    - typings.reactInteractive.anon.FocusFromMouse
  */
  trait FocusProps extends StObject
  object FocusProps {
    
    inline def Focus(): typings.reactInteractive.anon.Focus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactInteractive.anon.Focus]
    }
    
    inline def FocusFromMouse(): typings.reactInteractive.anon.FocusFromMouse = {
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
    
    inline def hover: typings.reactInteractive.reactInteractiveStrings.hover = "hover".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.hover]
    
    inline def hoverActive: typings.reactInteractive.reactInteractiveStrings.hoverActive = "hoverActive".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.hoverActive]
    
    inline def keyActive: typings.reactInteractive.reactInteractiveStrings.keyActive = "keyActive".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.keyActive]
    
    inline def normal: typings.reactInteractive.reactInteractiveStrings.normal = "normal".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.normal]
    
    inline def touchActive: typings.reactInteractive.reactInteractiveStrings.touchActive = "touchActive".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.touchActive]
  }
  
  type Interactive = Component[InteractiveProps, js.Object, js.Any]
  
  type InteractiveProps = FocusProps & ActiveProps & As
  
  trait State extends StObject {
    
    var focus: Focus
    
    var iState: IState
  }
  object State {
    
    inline def apply(focus: Focus, iState: IState): State = {
      val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], iState = iState.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setFocus(value: Focus): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setIState(value: IState): Self = StObject.set(x, "iState", value.asInstanceOf[js.Any])
    }
  }
}
