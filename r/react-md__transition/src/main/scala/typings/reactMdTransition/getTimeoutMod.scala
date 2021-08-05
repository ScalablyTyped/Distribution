package typings.reactMdTransition

import typings.reactMdTransition.typesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTimeoutMod {
  
  @JSImport("@react-md/transition/types/getTimeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTimeout(timeout: TransitionTimeout, appear: Boolean): DefinedTimeout = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeout")(timeout.asInstanceOf[js.Any], appear.asInstanceOf[js.Any])).asInstanceOf[DefinedTimeout]
  
  trait DefinedTimeout extends StObject {
    
    var appear: Double
    
    var enter: Double
    
    var exit: Double
  }
  object DefinedTimeout {
    
    inline def apply(appear: Double, enter: Double, exit: Double): DefinedTimeout = {
      val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefinedTimeout]
    }
    
    extension [Self <: DefinedTimeout](x: Self) {
      
      inline def setAppear(value: Double): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    }
  }
}
