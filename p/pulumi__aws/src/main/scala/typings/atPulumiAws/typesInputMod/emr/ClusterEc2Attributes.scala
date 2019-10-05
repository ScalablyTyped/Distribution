package typings.atPulumiAws.typesInputMod.emr

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterEc2Attributes extends js.Object {
  var additionalMasterSecurityGroups: js.UndefOr[Input[String]] = js.undefined
  var additionalSlaveSecurityGroups: js.UndefOr[Input[String]] = js.undefined
  var emrManagedMasterSecurityGroup: js.UndefOr[Input[String]] = js.undefined
  var emrManagedSlaveSecurityGroup: js.UndefOr[Input[String]] = js.undefined
  var instanceProfile: Input[String]
  var keyName: js.UndefOr[Input[String]] = js.undefined
  var serviceAccessSecurityGroup: js.UndefOr[Input[String]] = js.undefined
  var subnetId: js.UndefOr[Input[String]] = js.undefined
}

object ClusterEc2Attributes {
  @scala.inline
  def apply(
    instanceProfile: Input[String],
    additionalMasterSecurityGroups: Input[String] = null,
    additionalSlaveSecurityGroups: Input[String] = null,
    emrManagedMasterSecurityGroup: Input[String] = null,
    emrManagedSlaveSecurityGroup: Input[String] = null,
    keyName: Input[String] = null,
    serviceAccessSecurityGroup: Input[String] = null,
    subnetId: Input[String] = null
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

