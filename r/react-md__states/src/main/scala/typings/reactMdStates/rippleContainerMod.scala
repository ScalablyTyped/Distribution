package typings.reactMdStates

import typings.react.mod.ReactElement
import typings.reactMdStates.typesMod.RippleState
import typings.reactMdStates.typesMod.RipplesState
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rippleContainerMod {
  
  @JSImport("@react-md/states/types/ripples/RippleContainer", "RippleContainer")
  @js.native
  def RippleContainer(hasRipplesClassNameRippleClassNameTimeoutClassNamesEnteredExited: RippleContainerProps): ReactElement = js.native
  
  @js.native
  trait RippleContainerProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var classNames: js.UndefOr[CSSTransitionClassNames] = js.native
    
    def entered(ripple: RippleState): Unit = js.native
    
    def exited(ripple: RippleState): Unit = js.native
    
    var rippleClassName: js.UndefOr[String] = js.native
    
    var ripples: RipplesState = js.native
    
    var timeout: js.UndefOr[TransitionTimeout] = js.native
  }
  object RippleContainerProps {
    
    @scala.inline
    def apply(entered: RippleState => Unit, exited: RippleState => Unit, ripples: RipplesState): RippleContainerProps = {
      val __obj = js.Dynamic.literal(entered = js.Any.fromFunction1(entered), exited = js.Any.fromFunction1(exited), ripples = ripples.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleContainerProps]
    }
    
    @scala.inline
    implicit class RippleContainerPropsMutableBuilder[Self <: RippleContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setEntered(value: RippleState => Unit): Self = StObject.set(x, "entered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExited(value: RippleState => Unit): Self = StObject.set(x, "exited", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRippleClassName(value: String): Self = StObject.set(x, "rippleClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleClassNameUndefined: Self = StObject.set(x, "rippleClassName", js.undefined)
      
      @scala.inline
      def setRipples(value: RipplesState): Self = StObject.set(x, "ripples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRipplesVarargs(value: RippleState*): Self = StObject.set(x, "ripples", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
