package typings.reactMdStates

import typings.react.mod.ReactElement
import typings.reactMdStates.typesMod.RippleState
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rippleMod {
  
  @JSImport("@react-md/states/types/ripples/Ripple", "Ripple")
  @js.native
  def Ripple(hasClassNameClassNamesTimeoutRippleEnteredExited: RippleProps): ReactElement = js.native
  
  @js.native
  trait RippleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var classNames: js.UndefOr[CSSTransitionClassNames] = js.native
    
    def entered(ripple: RippleState): Unit = js.native
    
    def exited(ripple: RippleState): Unit = js.native
    
    var ripple: RippleState = js.native
    
    var timeout: js.UndefOr[TransitionTimeout] = js.native
  }
  object RippleProps {
    
    @scala.inline
    def apply(entered: RippleState => Unit, exited: RippleState => Unit, ripple: RippleState): RippleProps = {
      val __obj = js.Dynamic.literal(entered = js.Any.fromFunction1(entered), exited = js.Any.fromFunction1(exited), ripple = ripple.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleProps]
    }
    
    @scala.inline
    implicit class RipplePropsMutableBuilder[Self <: RippleProps] (val x: Self) extends AnyVal {
      
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
      def setRipple(value: RippleState): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
