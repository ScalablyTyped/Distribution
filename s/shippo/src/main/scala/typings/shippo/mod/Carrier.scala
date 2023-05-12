package typings.shippo.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://goshippo.com/docs/reference#carriers
trait Carrier extends StObject {
  
  var account_id: String
  
  var active: Boolean
  
  var carrier: Carriers
  
  var is_shippo_account: Boolean
  
  var metadata: String
  
  var object_id: String
  
  var object_owner: String
  
  var parameters: js.UndefOr[Record[String, Any]] = js.undefined
  
  var test: js.UndefOr[Boolean] = js.undefined
}
object Carrier {
  
  inline def apply(
    account_id: String,
    active: Boolean,
    carrier: Carriers,
    is_shippo_account: Boolean,
    metadata: String,
    object_id: String,
    object_owner: String
  ): Carrier = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], carrier = carrier.asInstanceOf[js.Any], is_shippo_account = is_shippo_account.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], object_id = object_id.asInstanceOf[js.Any], object_owner = object_owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Carrier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Carrier] (val x: Self) extends AnyVal {
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setCarrier(value: Carriers): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setIs_shippo_account(value: Boolean): Self = StObject.set(x, "is_shippo_account", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject_id(value: String): Self = StObject.set(x, "object_id", value.asInstanceOf[js.Any])
    
    inline def setObject_owner(value: String): Self = StObject.set(x, "object_owner", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Record[String, Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
