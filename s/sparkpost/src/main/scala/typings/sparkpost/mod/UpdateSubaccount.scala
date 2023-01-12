package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSubaccount extends StObject {
  
  /** id of the default IP pool assigned to subaccount"s transmissions */
  var ip_pool: js.UndefOr[String] = js.undefined
  
  /** user-friendly name */
  var name: String
  
  /** status of the subaccount */
  var status: String
}
object UpdateSubaccount {
  
  inline def apply(name: String, status: String): UpdateSubaccount = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubaccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSubaccount] (val x: Self) extends AnyVal {
    
    inline def setIp_pool(value: String): Self = StObject.set(x, "ip_pool", value.asInstanceOf[js.Any])
    
    inline def setIp_poolUndefined: Self = StObject.set(x, "ip_pool", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
