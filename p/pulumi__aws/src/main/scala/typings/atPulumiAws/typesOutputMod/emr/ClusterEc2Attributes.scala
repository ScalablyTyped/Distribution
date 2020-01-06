package typings.atPulumiAws.typesOutputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEc2Attributes extends js.Object {
  var additionalMasterSecurityGroups: js.UndefOr[String] = js.native
  var additionalSlaveSecurityGroups: js.UndefOr[String] = js.native
  var emrManagedMasterSecurityGroup: js.UndefOr[String] = js.native
  var emrManagedSlaveSecurityGroup: js.UndefOr[String] = js.native
  var instanceProfile: String = js.native
  var keyName: js.UndefOr[String] = js.native
  var serviceAccessSecurityGroup: js.UndefOr[String] = js.native
  var subnetId: js.UndefOr[String] = js.native
}

object ClusterEc2Attributes {
  @scala.inline
  def apply(
    instanceProfile: String,
    additionalMasterSecurityGroups: String = null,
    additionalSlaveSecurityGroups: String = null,
    emrManagedMasterSecurityGroup: String = null,
    emrManagedSlaveSecurityGroup: String = null,
    keyName: String = null,
    serviceAccessSecurityGroup: String = null,
    subnetId: String = null
  ): ClusterEc2Attributes = {
    val __obj = js.Dynamic.literal(instanceProfile = instanceProfile.asInstanceOf[js.Any])
    if (additionalMasterSecurityGroups != null) __obj.updateDynamic("additionalMasterSecurityGroups")(additionalMasterSecurityGroups.asInstanceOf[js.Any])
    if (additionalSlaveSecurityGroups != null) __obj.updateDynamic("additionalSlaveSecurityGroups")(additionalSlaveSecurityGroups.asInstanceOf[js.Any])
    if (emrManagedMasterSecurityGroup != null) __obj.updateDynamic("emrManagedMasterSecurityGroup")(emrManagedMasterSecurityGroup.asInstanceOf[js.Any])
    if (emrManagedSlaveSecurityGroup != null) __obj.updateDynamic("emrManagedSlaveSecurityGroup")(emrManagedSlaveSecurityGroup.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (serviceAccessSecurityGroup != null) __obj.updateDynamic("serviceAccessSecurityGroup")(serviceAccessSecurityGroup.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEc2Attributes]
  }
}

