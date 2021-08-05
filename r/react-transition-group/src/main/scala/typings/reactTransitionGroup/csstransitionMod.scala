package typings.reactTransitionGroup

import typings.react.mod.Component
import typings.reactTransitionGroup.anon.ClassNames
import typings.reactTransitionGroup.transitionMod.TransitionProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csstransitionMod {
  
  @JSImport("react-transition-group/CSSTransition", JSImport.Default)
  @js.native
  class default[Ref /* <: js.UndefOr[HTMLElement] */] ()
    extends Component[CSSTransitionProps[Ref], js.Object, js.Any]
  
  type CSSTransition[Ref /* <: js.UndefOr[HTMLElement] */] = Component[CSSTransitionProps[Ref], js.Object, js.Any]
  
  trait CSSTransitionClassNames extends StObject {
    
    var appear: js.UndefOr[String] = js.undefined
    
    var appearActive: js.UndefOr[String] = js.undefined
    
    var appearDone: js.UndefOr[String] = js.undefined
    
    var enter: js.UndefOr[String] = js.undefined
    
    var enterActive: js.UndefOr[String] = js.undefined
    
    var enterDone: js.UndefOr[String] = js.undefined
    
    var exit: js.UndefOr[String] = js.undefined
    
    var exitActive: js.UndefOr[String] = js.undefined
    
    var exitDone: js.UndefOr[String] = js.undefined
  }
  object CSSTransitionClassNames {
    
    inline def apply(): CSSTransitionClassNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSTransitionClassNames]
    }
    
    extension [Self <: CSSTransitionClassNames](x: Self) {
      
      inline def setAppear(value: String): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setAppearActive(value: String): Self = StObject.set(x, "appearActive", value.asInstanceOf[js.Any])
      
      inline def setAppearActiveUndefined: Self = StObject.set(x, "appearActive", js.undefined)
      
      inline def setAppearDone(value: String): Self = StObject.set(x, "appearDone", value.asInstanceOf[js.Any])
      
      inline def setAppearDoneUndefined: Self = StObject.set(x, "appearDone", js.undefined)
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def setEnter(value: String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterActive(value: String): Self = StObject.set(x, "enterActive", value.asInstanceOf[js.Any])
      
      inline def setEnterActiveUndefined: Self = StObject.set(x, "enterActive", js.undefined)
      
      inline def setEnterDone(value: String): Self = StObject.set(x, "enterDone", value.asInstanceOf[js.Any])
      
      inline def setEnterDoneUndefined: Self = StObject.set(x, "enterDone", js.undefined)
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: String): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitActive(value: String): Self = StObject.set(x, "exitActive", value.asInstanceOf[js.Any])
      
      inline def setExitActiveUndefined: Self = StObject.set(x, "exitActive", js.undefined)
      
      inline def setExitDone(value: String): Self = StObject.set(x, "exitDone", value.asInstanceOf[js.Any])
      
      inline def setExitDoneUndefined: Self = StObject.set(x, "exitDone", js.undefined)
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    }
  }
  
  type CSSTransitionProps[Ref /* <: js.UndefOr[HTMLElement] */] = TransitionProps[Ref] & ClassNames
}
