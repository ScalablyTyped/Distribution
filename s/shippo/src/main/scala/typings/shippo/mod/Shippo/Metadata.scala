package typings.shippo.mod.Shippo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  var object_created: String
  
  var object_id: String
  
  var object_owner: String
  
  var object_updated: String
}
object Metadata {
  
  inline def apply(object_created: String, object_id: String, object_owner: String, object_updated: String): Metadata = {
    val __obj = js.Dynamic.literal(object_created = object_created.asInstanceOf[js.Any], object_id = object_id.asInstanceOf[js.Any], object_owner = object_owner.asInstanceOf[js.Any], object_updated = object_updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    inline def setObject_created(value: String): Self = StObject.set(x, "object_created", value.asInstanceOf[js.Any])
    
    inline def setObject_id(value: String): Self = StObject.set(x, "object_id", value.asInstanceOf[js.Any])
    
    inline def setObject_owner(value: String): Self = StObject.set(x, "object_owner", value.asInstanceOf[js.Any])
    
    inline def setObject_updated(value: String): Self = StObject.set(x, "object_updated", value.asInstanceOf[js.Any])
  }
}
