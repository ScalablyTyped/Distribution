package typings.reactMdStates

import typings.react.mod.ReactElement
import typings.reactMdStates.typesRipplesTypesMod.RippleState
import typings.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typings.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRipplesRippleMod {
  
  @JSImport("@react-md/states/types/ripples/Ripple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Ripple(hasClassNamePropClassNamesPropTimeoutRippleEnteredExited: RippleProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(hasClassNamePropClassNamesPropTimeoutRippleEnteredExited.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  trait RippleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var classNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
    
    def entered(ripple: RippleState): Unit
    
    def exited(ripple: RippleState): Unit
    
    var ripple: RippleState
    
    var timeout: js.UndefOr[TransitionTimeout] = js.undefined
  }
  object RippleProps {
    
    inline def apply(entered: RippleState => Unit, exited: RippleState => Unit, ripple: RippleState): RippleProps = {
      val __obj = js.Dynamic.literal(entered = js.Any.fromFunction1(entered), exited = js.Any.fromFunction1(exited), ripple = ripple.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleProps]
    }
    
    extension [Self <: RippleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setEntered(value: RippleState => Unit): Self = StObject.set(x, "entered", js.Any.fromFunction1(value))
      
      inline def setExited(value: RippleState => Unit): Self = StObject.set(x, "exited", js.Any.fromFunction1(value))
      
      inline def setRipple(value: RippleState): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
