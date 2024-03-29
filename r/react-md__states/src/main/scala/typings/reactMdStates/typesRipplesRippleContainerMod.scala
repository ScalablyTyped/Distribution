package typings.reactMdStates

import typings.react.mod.ReactElement
import typings.reactMdStates.typesRipplesTypesMod.RippleState
import typings.reactMdStates.typesRipplesTypesMod.RipplesState
import typings.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typings.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRipplesRippleContainerMod {
  
  @JSImport("@react-md/states/types/ripples/RippleContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RippleContainer(param0: RippleContainerProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("RippleContainer")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait RippleContainerProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var classNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
    
    def entered(ripple: RippleState): Unit
    
    def exited(ripple: RippleState): Unit
    
    var rippleClassName: js.UndefOr[String] = js.undefined
    
    var ripples: RipplesState
    
    var timeout: js.UndefOr[TransitionTimeout] = js.undefined
  }
  object RippleContainerProps {
    
    inline def apply(entered: RippleState => Unit, exited: RippleState => Unit, ripples: RipplesState): RippleContainerProps = {
      val __obj = js.Dynamic.literal(entered = js.Any.fromFunction1(entered), exited = js.Any.fromFunction1(exited), ripples = ripples.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RippleContainerProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setEntered(value: RippleState => Unit): Self = StObject.set(x, "entered", js.Any.fromFunction1(value))
      
      inline def setExited(value: RippleState => Unit): Self = StObject.set(x, "exited", js.Any.fromFunction1(value))
      
      inline def setRippleClassName(value: String): Self = StObject.set(x, "rippleClassName", value.asInstanceOf[js.Any])
      
      inline def setRippleClassNameUndefined: Self = StObject.set(x, "rippleClassName", js.undefined)
      
      inline def setRipples(value: RipplesState): Self = StObject.set(x, "ripples", value.asInstanceOf[js.Any])
      
      inline def setRipplesVarargs(value: RippleState*): Self = StObject.set(x, "ripples", js.Array(value*))
      
      inline def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
