package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreAvailability extends StObject {
  
  var available: Boolean
  
  var location: Location
  
  var pickUpTime: String
}
object StoreAvailability {
  
  inline def apply(available: Boolean, location: Location, pickUpTime: String): StoreAvailability = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], pickUpTime = pickUpTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreAvailability]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoreAvailability] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setPickUpTime(value: String): Self = StObject.set(x, "pickUpTime", value.asInstanceOf[js.Any])
  }
}
