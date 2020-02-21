package typings.pulumiAws.outputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEc2Attributes extends js.Object {
  var additionalMasterSecurityGroups: js.UndefOr[String] = js.native
  var additionalSlaveSecurityGroups: js.UndefOr[String] = js.native
  var emrManagedMasterSecurityGroup: String = js.native
  var emrManagedSlaveSecurityGroup: String = js.native
  var instanceProfile: String = js.native
  var keyName: js.UndefOr[String] = js.native
  var serviceAccessSecurityGroup: String = js.native
  var subnetId: js.UndefOr[String] = js.native
}

object ClusterEc2Attributes {
  @scala.inline
  def apply(
    emrManagedMasterSecurityGroup: String,
    emrManagedSlaveSecurityGroup: String,
    instanceProfile: String,
    serviceAccessSecurityGroup: String,
    additionalMasterSecurityGroups: String = null,
    additionalSlaveSecurityGroups: String = null,
    keyName: String = null,
    subnetId: String = null
  ): ClusterEc2Attributes = {
    val __obj = js.Dynamic.literal(emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup.asInstanceOf[js.Any], emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup.asInstanceOf[js.Any], instanceProfile = instanceProfile.asInstanceOf[js.Any], serviceAccessSecurityGroup = serviceAccessSecurityGroup.asInstanceOf[js.Any])
    if (additionalMasterSecurityGroups != null) __obj.updateDynamic("additionalMasterSecurityGroups")(additionalMasterSecurityGroups.asInstanceOf[js.Any])
    if (additionalSlaveSecurityGroups != null) __obj.updateDynamic("additionalSlaveSecurityGroups")(additionalSlaveSecurityGroups.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEc2Attributes]
  }
}

