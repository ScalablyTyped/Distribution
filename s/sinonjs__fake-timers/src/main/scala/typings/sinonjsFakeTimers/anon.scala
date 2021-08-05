package typings.sinonjsFakeTimers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Now extends StObject {
    
    def now(): Double
  }
  object Now {
    
    inline def apply(now: () => Double): Now = {
      val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
      __obj.asInstanceOf[Now]
    }
    
    extension [Self <: Now](x: Self) {
      
      inline def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
    }
  }
}
