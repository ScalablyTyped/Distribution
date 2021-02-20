package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSubaccount extends StObject {
  
  /** id of the default IP pool assigned to subaccount"s transmissions */
  var ip_pool: js.UndefOr[String] = js.native
  
  /** user-friendly name */
  var name: String = js.native
  
  /** status of the subaccount */
  var status: String = js.native
}
object UpdateSubaccount {
  
  @scala.inline
  def apply(name: String, status: String): UpdateSubaccount = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubaccount]
  }
  
  @scala.inline
  implicit class UpdateSubaccountMutableBuilder[Self <: UpdateSubaccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp_pool(value: String): Self = StObject.set(x, "ip_pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp_poolUndefined: Self = StObject.set(x, "ip_pool", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
