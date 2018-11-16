package typings
package sharepointLib.SPNs.CompliancePolicyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.CompliancePolicy.SPPolicyStore")
@js.native
class SPPolicyStore protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientRuntimeContext, web: sharepointLib.SPNs.Web) = this()
  def deletePolicyAssociation(policyAssociationId: js.Any): scala.Unit = js.native
  def deletePolicyBinding(policyBindingId: js.Any): scala.Unit = js.native
  def deletePolicyDefinition(policyDefinitionId: js.Any): scala.Unit = js.native
  def deletePolicyRule(policyRuleId: js.Any): scala.Unit = js.native
  def getPolicyAssociation(policyAssociationId: js.Any): SPPolicyAssociation = js.native
  def getPolicyAssociationForContainer(containerId: SPContainerId): SPPolicyAssociation = js.native
  def getPolicyBinding(policyBindingId: js.Any): SPPolicyBinding = js.native
  def getPolicyDefinition(policyDefinitionId: js.Any): SPPolicyDefinition = js.native
  def getPolicyDefinitions(scenario: js.Any): sharepointLib.SPNs.ClientObjectList[SPPolicyDefinition] = js.native
  def getPolicyRule(policyRuleId: js.Any, throwIfNull: scala.Boolean): SPPolicyRule = js.native
  def notifyUnifiedPolicySync(
    notificationId: js.Any,
    syncSvcUrl: java.lang.String,
    changeInfos: js.Any,
    syncNow: scala.Boolean,
    fullSyncForTenant: scala.Boolean
  ): scala.Unit = js.native
  def updatePolicyAssociation(policyAssociation: SPPolicyAssociation): scala.Unit = js.native
  def updatePolicyBinding(policyBinding: SPPolicyBinding): scala.Unit = js.native
  def updatePolicyDefinition(policyDefinition: SPPolicyDefinition): scala.Unit = js.native
  def updatePolicyRule(policyRule: SPPolicyRule): scala.Unit = js.native
}

@JSGlobal("SP.CompliancePolicy.SPPolicyStore")
@js.native
object SPPolicyStore extends js.Object {
  def createPolicyAssociation(context: sharepointLib.SPNs.ClientRuntimeContext): sharepointLib.SPNs.CompliancePolicyNs.SPPolicyAssociation = js.native
  def createPolicyBinding(context: sharepointLib.SPNs.ClientRuntimeContext): sharepointLib.SPNs.CompliancePolicyNs.SPPolicyBinding = js.native
  def createPolicyDefinition(context: sharepointLib.SPNs.ClientRuntimeContext): sharepointLib.SPNs.CompliancePolicyNs.SPPolicyDefinition = js.native
  def createPolicyRule(context: sharepointLib.SPNs.ClientRuntimeContext): sharepointLib.SPNs.CompliancePolicyNs.SPPolicyRule = js.native
}

