package typings.rxjs.distTypesInternalTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timestamp[T] extends StObject {
  
  /**
    * The timestamp. By default, this is in epoch milliseconds.
    * Could vary based on the timestamp provider passed to the operator.
    */
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
