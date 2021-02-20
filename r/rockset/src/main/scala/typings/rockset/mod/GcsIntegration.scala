package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcsIntegration extends StObject {
  
  // credentials for an AWS key integration
  var gcp_service_account: js.UndefOr[GcpServiceAccount] = js.native
}
object GcsIntegration {
  
  @scala.inline
  def apply(): GcsIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsIntegration]
  }
  
  @scala.inline
  implicit class GcsIntegrationMutableBuilder[Self <: GcsIntegration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcp_service_account(value: GcpServiceAccount): Self = StObject.set(x, "gcp_service_account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcp_service_accountUndefined: Self = StObject.set(x, "gcp_service_account", js.undefined)
  }
}
