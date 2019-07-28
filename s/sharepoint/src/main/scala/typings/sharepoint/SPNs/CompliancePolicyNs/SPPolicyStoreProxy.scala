package typings.sharepoint.SPNs.CompliancePolicyNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.ClientRuntimeContext
import typings.sharepoint.SPNs.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.CompliancePolicy.SPPolicyStoreProxy")
@js.native
class SPPolicyStoreProxy protected () extends ClientObject {
  def this(context: ClientRuntimeContext, web: Web) = this()
  def get_policyStoreUrl(): String = js.native
}

