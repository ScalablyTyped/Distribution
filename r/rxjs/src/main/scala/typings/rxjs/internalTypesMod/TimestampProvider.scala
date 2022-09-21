package typings.rxjs.internalTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampProvider extends StObject {
  
  /**
    * Returns a timestamp as a number.
    *
    * This is used by types like `ReplaySubject` or operators like `timestamp` to calculate
    * the amount of time passed between events.
    */
  def now(): Double
}
object TimestampProvider {
  
  inline def apply(now: () => Double): TimestampProvider = {
    val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
    __obj.asInstanceOf[TimestampProvider]
  }
  
  extension [Self <: TimestampProvider](x: Self) {
    
    inline def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
  }
}
