package typings
package atPulumiAwsLib.cloudhsmv2HsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HsmState extends js.Object {
  /**
    * The IDs of AZ in which HSM module will be located. Do not use together with subnet_id.
    */
  val availabilityZone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of Cloud HSM v2 cluster to which HSM will be added.
    */
  val clusterId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The id of the ENI interface allocated for HSM module.
    */
  val hsmEniId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The id of the HSM module.
    */
  val hsmId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The state of the HSM module.
    */
  val hsmState: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IP address of HSM module. Must be within the CIDR of selected subnet.
    */
  val ipAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of subnet in which HSM module will be located.
    */
  val subnetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object HsmState {
  @scala.inline
  def apply(
    availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clusterId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    hsmEniId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    hsmId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    hsmState: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ipAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): HsmState = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (hsmEniId != null) __obj.updateDynamic("hsmEniId")(hsmEniId.asInstanceOf[js.Any])
    if (hsmId != null) __obj.updateDynamic("hsmId")(hsmId.asInstanceOf[js.Any])
    if (hsmState != null) __obj.updateDynamic("hsmState")(hsmState.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HsmState]
  }
}

