package typings.rxjs.internalTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeInterval[T] extends StObject {
  
  /**
    * The amount of time between this value's emission and the previous value's emission.
    * If this is the first emitted value, then it will be the amount of time since subscription
    * started.
    */
  var interval: Double
  
  var value: T
}
object TimeInterval {
  
  inline def apply[T](interval: Double, value: T): TimeInterval[T] = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeInterval[T]]
  }
  
  extension [Self <: TimeInterval[?], T](x: Self & TimeInterval[T]) {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
