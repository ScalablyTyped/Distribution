package typings.rxLite.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeInterval[T] extends StObject {
  
  var interval: Double
  
  var value: T
}
object TimeInterval {
  
  inline def apply[T](interval: Double, value: T): TimeInterval[T] = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeInterval[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeInterval[?], T] (val x: Self & TimeInterval[T]) extends AnyVal {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
