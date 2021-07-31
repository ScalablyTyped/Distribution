package typings.sentiment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Apply extends StObject {
    
    @JSName("apply")
    def apply(tokens: js.Array[String], cursor: Double, tokenScore: Double): Double
  }
  object Apply {
    
    @scala.inline
    def apply(apply: (js.Array[String], Double, Double) => Double): Apply = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3(apply))
      __obj.asInstanceOf[Apply]
    }
    
    @scala.inline
    implicit class ApplyMutableBuilder[Self <: Apply] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: (js.Array[String], Double, Double) => Double): Self = StObject.set(x, "apply", js.Any.fromFunction3(value))
    }
  }
}
