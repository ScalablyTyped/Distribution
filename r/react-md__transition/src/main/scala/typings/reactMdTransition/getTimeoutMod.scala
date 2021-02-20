package typings.reactMdTransition

import typings.reactMdTransition.typesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTimeoutMod {
  
  @JSImport("@react-md/transition/types/getTimeout", "getTimeout")
  @js.native
  def getTimeout(timeout: TransitionTimeout, appear: Boolean): DefinedTimeout = js.native
  
  @js.native
  trait DefinedTimeout extends StObject {
    
    var appear: Double = js.native
    
    var enter: Double = js.native
    
    var exit: Double = js.native
  }
  object DefinedTimeout {
    
    @scala.inline
    def apply(appear: Double, enter: Double, exit: Double): DefinedTimeout = {
      val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefinedTimeout]
    }
    
    @scala.inline
    implicit class DefinedTimeoutMutableBuilder[Self <: DefinedTimeout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppear(value: Double): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    }
  }
}
