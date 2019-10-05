package typings.atPulumiAws.typesOutputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterEc2Attributes extends js.Object {
  var additionalMasterSecurityGroups: js.UndefOr[String] = js.undefined
  var additionalSlaveSecurityGroups: js.UndefOr[String] = js.undefined
  var emrManagedMasterSecurityGroup: js.UndefOr[String] = js.undefined
  var emrManagedSlaveSecurityGroup: js.UndefOr[String] = js.undefined
  var instanceProfile: String
  var keyName: js.UndefOr[String] = js.undefined
  var serviceAccessSecurityGroup: js.UndefOr[String] = js.undefined
  var subnetId: js.UndefOr[String] = js.undefined
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
    val __obj = js.Dynamic.literal(instanceProfile = instanceProfile)
    if (additionalMasterSecurityGroups != null) __obj.updateDynamic("additionalMasterSecurityGroups")(additionalMasterSecurityGroups)
    if (additionalSlaveSecurityGroups != null) __obj.updateDynamic("additionalSlaveSecurityGroups")(additionalSlaveSecurityGroups)
    if (emrManagedMasterSecurityGroup != null) __obj.updateDynamic("emrManagedMasterSecurityGroup")(emrManagedMasterSecurityGroup)
    if (emrManagedSlaveSecurityGroup != null) __obj.updateDynamic("emrManagedSlaveSecurityGroup")(emrManagedSlaveSecurityGroup)
    if (keyName != null) __obj.updateDynamic("keyName")(keyName)
    if (serviceAccessSecurityGroup != null) __obj.updateDynamic("serviceAccessSecurityGroup")(serviceAccessSecurityGroup)
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId)
    __obj.asInstanceOf[ClusterEc2Attributes]
  }
}

