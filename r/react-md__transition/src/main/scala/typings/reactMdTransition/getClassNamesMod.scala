package typings.reactMdTransition

import typings.reactMdTransition.getTimeoutMod.DefinedTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getClassNamesMod {
  
  @JSImport("@react-md/transition/types/getClassNames", "getClassNames")
  @js.native
  def getClassNames(classNames: String, timeout: DefinedTimeout): DefinedCSSTransitionClassNames = js.native
  @JSImport("@react-md/transition/types/getClassNames", "getClassNames")
  @js.native
  def getClassNames(classNames: CSSTransitionClassNames, timeout: DefinedTimeout): DefinedCSSTransitionClassNames = js.native
  
  /* Inlined std.Required<react-transition-group.react-transition-group/CSSTransition.CSSTransitionClassNames> */
  @js.native
  trait DefinedCSSTransitionClassNames extends StObject {
    
    var appear: String = js.native
    
    var appearActive: String = js.native
    
    var appearDone: String = js.native
    
    var enter: String = js.native
    
    var enterActive: String = js.native
    
    var enterDone: String = js.native
    
    var exit: String = js.native
    
    var exitActive: String = js.native
    
    var exitDone: String = js.native
  }
  object DefinedCSSTransitionClassNames {
    
    @scala.inline
    def apply(
      appear: String,
      appearActive: String,
      appearDone: String,
      enter: String,
      enterActive: String,
      enterDone: String,
      exit: String,
      exitActive: String,
      exitDone: String
    ): DefinedCSSTransitionClassNames = {
      val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], appearActive = appearActive.asInstanceOf[js.Any], appearDone = appearDone.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], enterActive = enterActive.asInstanceOf[js.Any], enterDone = enterDone.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], exitActive = exitActive.asInstanceOf[js.Any], exitDone = exitDone.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefinedCSSTransitionClassNames]
    }
    
    @scala.inline
    implicit class DefinedCSSTransitionClassNamesMutableBuilder[Self <: DefinedCSSTransitionClassNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppear(value: String): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearActive(value: String): Self = StObject.set(x, "appearActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearDone(value: String): Self = StObject.set(x, "appearDone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnter(value: String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterActive(value: String): Self = StObject.set(x, "enterActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterDone(value: String): Self = StObject.set(x, "enterDone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExit(value: String): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitActive(value: String): Self = StObject.set(x, "exitActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitDone(value: String): Self = StObject.set(x, "exitDone", value.asInstanceOf[js.Any])
    }
  }
}
