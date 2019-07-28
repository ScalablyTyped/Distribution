package typings.sharepoint.SPNs.CompliancePolicyNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.ClientObjectList
import typings.sharepoint.SPNs.ClientRuntimeContext
import typings.sharepoint.SPNs.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.CompliancePolicy.SPPolicyStore")
@js.native
class SPPolicyStore protected () extends ClientObject {
  def this(context: ClientRuntimeContext, web: Web) = this()
  def deletePolicyAssociation(policyAssociationId: js.Any): Unit = js.native
  def deletePolicyBinding(policyBindingId: js.Any): Unit = js.native
  def deletePolicyDefinition(policyDefinitionId: js.Any): Unit = js.native
  def deletePolicyRule(policyRuleId: js.Any): Unit = js.native
  def getPolicyAssociation(policyAssociationId: js.Any): SPPolicyAssociation = js.native
  def getPolicyAssociationForContainer(containerId: SPContainerId): SPPolicyAssociation = js.native
  def getPolicyBinding(policyBindingId: js.Any): SPPolicyBinding = js.native
  def getPolicyDefinition(policyDefinitionId: js.Any): SPPolicyDefinition = js.native
  def getPolicyDefinitions(scenario: js.Any): ClientObjectList[SPPolicyDefinition] = js.native
  def getPolicyRule(policyRuleId: js.Any, throwIfNull: Boolean): SPPolicyRule = js.native
  def notifyUnifiedPolicySync(
    notificationId: js.Any,
    syncSvcUrl: String,
    changeInfos: js.Any,
    syncNow: Boolean,
    fullSyncForTenant: Boolean
  ): Unit = js.native
  def updatePolicyAssociation(policyAssociation: SPPolicyAssociation): Unit = js.native
  def updatePolicyBinding(policyBinding: SPPolicyBinding): Unit = js.native
  def updatePolicyDefinition(policyDefinition: SPPolicyDefinition): Unit = js.native
  def updatePolicyRule(policyRule: SPPolicyRule): Unit = js.native
}

/* static members */
@JSGlobal("SP.CompliancePolicy.SPPolicyStore")
@js.native
object SPPolicyStore extends js.Object {
  def createPolicyAssociation(context: ClientRuntimeContext): SPPolicyAssociation = js.native
  def createPolicyBinding(context: ClientRuntimeContext): SPPolicyBinding = js.native
  def createPolicyDefinition(context: ClientRuntimeContext): SPPolicyDefinition = js.native
  def createPolicyRule(context: ClientRuntimeContext): SPPolicyRule = js.native
}

