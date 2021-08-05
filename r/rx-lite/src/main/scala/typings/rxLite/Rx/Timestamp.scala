package typings.rxLite.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timestamp[T] extends StObject {
  
  var timestamp: Double
  
  var value: T
}
object Timestamp {
  
  inline def apply[T](timestamp: Double, value: T): Timestamp[T] = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timestamp[T]]
  }
  
  extension [Self <: Timestamp[?], T](x: Self & Timestamp[T]) {
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
