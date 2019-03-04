package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalMasterSecurityGroups extends js.Object {
  var additionalMasterSecurityGroups: js.UndefOr[java.lang.String] = js.undefined
  var additionalSlaveSecurityGroups: js.UndefOr[java.lang.String] = js.undefined
  var emrManagedMasterSecurityGroup: js.UndefOr[java.lang.String] = js.undefined
  var emrManagedSlaveSecurityGroup: js.UndefOr[java.lang.String] = js.undefined
  var instanceProfile: java.lang.String
  var keyName: js.UndefOr[java.lang.String] = js.undefined
  var serviceAccessSecurityGroup: js.UndefOr[java.lang.String] = js.undefined
  var subnetId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AdditionalMasterSecurityGroups {
  @scala.inline
  def apply(
    instanceProfile: java.lang.String,
    additionalMasterSecurityGroups: java.lang.String = null,
    additionalSlaveSecurityGroups: java.lang.String = null,
    emrManagedMasterSecurityGroup: java.lang.String = null,
    emrManagedSlaveSecurityGroup: java.lang.String = null,
    keyName: java.lang.String = null,
    serviceAccessSecurityGroup: java.lang.String = null,
    subnetId: java.lang.String = null
  ): Anon_AdditionalMasterSecurityGroups = {
    val __obj = js.Dynamic.literal(instanceProfile = instanceProfile)
    if (additionalMasterSecurityGroups != null) __obj.updateDynamic("additionalMasterSecurityGroups")(additionalMasterSecurityGroups)
    if (additionalSlaveSecurityGroups != null) __obj.updateDynamic("additionalSlaveSecurityGroups")(additionalSlaveSecurityGroups)
    if (emrManagedMasterSecurityGroup != null) __obj.updateDynamic("emrManagedMasterSecurityGroup")(emrManagedMasterSecurityGroup)
    if (emrManagedSlaveSecurityGroup != null) __obj.updateDynamic("emrManagedSlaveSecurityGroup")(emrManagedSlaveSecurityGroup)
    if (keyName != null) __obj.updateDynamic("keyName")(keyName)
    if (serviceAccessSecurityGroup != null) __obj.updateDynamic("serviceAccessSecurityGroup")(serviceAccessSecurityGroup)
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId)
    __obj.asInstanceOf[Anon_AdditionalMasterSecurityGroups]
  }
}

