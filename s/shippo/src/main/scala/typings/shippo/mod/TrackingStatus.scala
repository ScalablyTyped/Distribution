package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<shippo.shippo.Metadata, 'object_owner'> */
trait TrackingStatus extends StObject {
  
  var location: Location
  
  var object_created: String
  
  var object_id: String
  
  var object_updated: String
  
  var status: TrackingStatuses
  
  var status_date: String
  
  var status_details: String
}
object TrackingStatus {
  
  inline def apply(
    location: Location,
    object_created: String,
    object_id: String,
    object_updated: String,
    status: TrackingStatuses,
    status_date: String,
    status_details: String
  ): TrackingStatus = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], object_created = object_created.asInstanceOf[js.Any], object_id = object_id.asInstanceOf[js.Any], object_updated = object_updated.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_date = status_date.asInstanceOf[js.Any], status_details = status_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackingStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackingStatus] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setObject_created(value: String): Self = StObject.set(x, "object_created", value.asInstanceOf[js.Any])
    
    inline def setObject_id(value: String): Self = StObject.set(x, "object_id", value.asInstanceOf[js.Any])
    
    inline def setObject_updated(value: String): Self = StObject.set(x, "object_updated", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TrackingStatuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatus_date(value: String): Self = StObject.set(x, "status_date", value.asInstanceOf[js.Any])
    
    inline def setStatus_details(value: String): Self = StObject.set(x, "status_details", value.asInstanceOf[js.Any])
  }
}
