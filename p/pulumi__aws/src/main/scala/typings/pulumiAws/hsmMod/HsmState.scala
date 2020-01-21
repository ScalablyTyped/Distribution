package typings.pulumiAws.hsmMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HsmState extends js.Object {
  /**
    * The IDs of AZ in which HSM module will be located. Do not use together with subnet_id.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of Cloud HSM v2 cluster to which HSM will be added.
    */
  val clusterId: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the ENI interface allocated for HSM module.
    */
  val hsmEniId: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the HSM module.
    */
  val hsmId: js.UndefOr[Input[String]] = js.native
  /**
    * The state of the HSM module.
    */
  val hsmState: js.UndefOr[Input[String]] = js.native
  /**
    * The IP address of HSM module. Must be within the CIDR of selected subnet.
    */
  val ipAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of subnet in which HSM module will be located.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
}

object HsmState {
  @scala.inline
  def apply(
    availabilityZone: Input[String] = null,
    clusterId: Input[String] = null,
    hsmEniId: Input[String] = null,
    hsmId: Input[String] = null,
    hsmState: Input[String] = null,
    ipAddress: Input[String] = null,
    subnetId: Input[String] = null
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

