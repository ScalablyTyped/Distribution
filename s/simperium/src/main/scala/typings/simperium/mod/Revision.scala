package typings.simperium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Revision[T] extends StObject {
  
  var data: T
  
  var id: EntityId
  
  var version: Double
}
object Revision {
  
  inline def apply[T](data: T, id: EntityId, version: Double): Revision[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision[T]]
  }
  
  extension [Self <: Revision[?], T](x: Self & Revision[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setId(value: EntityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
