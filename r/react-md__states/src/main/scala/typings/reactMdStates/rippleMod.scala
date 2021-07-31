package typings.reactMdStates

import typings.react.mod.ReactElement
import typings.reactMdStates.typesMod.RippleState
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rippleMod {
  
  @JSImport("@react-md/states/types/ripples/Ripple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Ripple(hasClassNamePropClassNamesPropTimeoutRippleEnteredExited: RippleProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(hasClassNamePropClassNamesPropTimeoutRippleEnteredExited.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait RippleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var classNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
    
    def entered(ripple: RippleState): Unit
    
    def exited(ripple: RippleState): Unit
    
    var ripple: RippleState
    
    var timeout: js.UndefOr[TransitionTimeout] = js.undefined
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
