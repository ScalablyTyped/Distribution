package typings.sinonjsFakeTimers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Now extends StObject {
    
    def now(): Double
  }
  object Now {
    
    @scala.inline
    def apply(now: () => Double): Now = {
      val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
      __obj.asInstanceOf[Now]
    }
    
    @scala.inline
    implicit class NowMutableBuilder[Self <: Now] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
    }
  }
}
