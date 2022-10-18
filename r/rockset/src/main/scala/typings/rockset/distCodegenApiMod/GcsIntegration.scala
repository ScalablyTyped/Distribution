package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcsIntegration extends StObject {
  
  /**
    * credentials for an AWS key integration
    * @type {GcpServiceAccount}
    * @memberof GcsIntegration
    */
  var gcp_service_account: js.UndefOr[GcpServiceAccount] = js.undefined
}
object GcsIntegration {
  
  inline def apply(): GcsIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsIntegration]
  }
  
  extension [Self <: GcsIntegration](x: Self) {
    
    inline def setGcp_service_account(value: GcpServiceAccount): Self = StObject.set(x, "gcp_service_account", value.asInstanceOf[js.Any])
    
    inline def setGcp_service_accountUndefined: Self = StObject.set(x, "gcp_service_account", js.undefined)
  }
}
