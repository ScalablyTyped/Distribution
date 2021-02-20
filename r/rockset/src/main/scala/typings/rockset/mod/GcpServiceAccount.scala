package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcpServiceAccount extends StObject {
  
  // Contents of JSON Service Account key file
  var service_account_key_file_json: String = js.native
}
object GcpServiceAccount {
  
  @scala.inline
  def apply(service_account_key_file_json: String): GcpServiceAccount = {
    val __obj = js.Dynamic.literal(service_account_key_file_json = service_account_key_file_json.asInstanceOf[js.Any])
    __obj.asInstanceOf[GcpServiceAccount]
  }
  
  @scala.inline
  implicit class GcpServiceAccountMutableBuilder[Self <: GcpServiceAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService_account_key_file_json(value: String): Self = StObject.set(x, "service_account_key_file_json", value.asInstanceOf[js.Any])
  }
}
