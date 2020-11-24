package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcpServiceAccount extends js.Object {
  
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
  implicit class GcpServiceAccountOps[Self <: GcpServiceAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setService_account_key_file_json(value: String): Self = this.set("service_account_key_file_json", value.asInstanceOf[js.Any])
  }
}
