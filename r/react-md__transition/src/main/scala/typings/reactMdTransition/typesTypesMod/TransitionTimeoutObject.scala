package typings.reactMdTransition.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ action in keyof @react-md/transition.@react-md/transition/types/types.TransitionActions ]:? number} */
trait TransitionTimeoutObject extends StObject {
  
  var appear: js.UndefOr[Double] = js.undefined
  
  var enter: js.UndefOr[Double] = js.undefined
  
  var exit: js.UndefOr[Double] = js.undefined
}
object TransitionTimeoutObject {
  
  inline def apply(): TransitionTimeoutObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionTimeoutObject]
  }
  
  extension [Self <: TransitionTimeoutObject](x: Self) {
    
    inline def setAppear(value: Double): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
    
    inline def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
