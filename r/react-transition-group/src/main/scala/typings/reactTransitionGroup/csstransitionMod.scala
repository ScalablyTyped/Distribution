package typings.reactTransitionGroup

import typings.react.mod.Component
import typings.reactTransitionGroup.anon.ClassNames
import typings.reactTransitionGroup.transitionMod.TransitionProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csstransitionMod {
  
  @JSImport("react-transition-group/CSSTransition", JSImport.Default)
  @js.native
  class default[Ref /* <: js.UndefOr[HTMLElement] */] ()
    extends Component[CSSTransitionProps[Ref], js.Object, js.Any]
  
  type CSSTransition[Ref /* <: js.UndefOr[HTMLElement] */] = Component[CSSTransitionProps[Ref], js.Object, js.Any]
  
  @js.native
  trait CSSTransitionClassNames extends StObject {
    
    var appear: js.UndefOr[String] = js.native
    
    var appearActive: js.UndefOr[String] = js.native
    
    var appearDone: js.UndefOr[String] = js.native
    
    var enter: js.UndefOr[String] = js.native
    
    var enterActive: js.UndefOr[String] = js.native
    
    var enterDone: js.UndefOr[String] = js.native
    
    var exit: js.UndefOr[String] = js.native
    
    var exitActive: js.UndefOr[String] = js.native
    
    var exitDone: js.UndefOr[String] = js.native
  }
  object CSSTransitionClassNames {
    
    @scala.inline
    def apply(): CSSTransitionClassNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSTransitionClassNames]
    }
    
    @scala.inline
    implicit class CSSTransitionClassNamesMutableBuilder[Self <: CSSTransitionClassNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppear(value: String): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearActive(value: String): Self = StObject.set(x, "appearActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearActiveUndefined: Self = StObject.set(x, "appearActive", js.undefined)
      
      @scala.inline
      def setAppearDone(value: String): Self = StObject.set(x, "appearDone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearDoneUndefined: Self = StObject.set(x, "appearDone", js.undefined)
      
      @scala.inline
      def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      @scala.inline
      def setEnter(value: String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterActive(value: String): Self = StObject.set(x, "enterActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterActiveUndefined: Self = StObject.set(x, "enterActive", js.undefined)
      
      @scala.inline
      def setEnterDone(value: String): Self = StObject.set(x, "enterDone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterDoneUndefined: Self = StObject.set(x, "enterDone", js.undefined)
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setExit(value: String): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitActive(value: String): Self = StObject.set(x, "exitActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitActiveUndefined: Self = StObject.set(x, "exitActive", js.undefined)
      
      @scala.inline
      def setExitDone(value: String): Self = StObject.set(x, "exitDone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitDoneUndefined: Self = StObject.set(x, "exitDone", js.undefined)
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    }
  }
  
  type CSSTransitionProps[Ref /* <: js.UndefOr[HTMLElement] */] = TransitionProps[Ref] with ClassNames
}
