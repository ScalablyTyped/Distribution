package typings.atPulumiAws.typesInputMod.glueNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionPhysicalConnectionRequirements extends js.Object {
  /**
    * The availability zone of the connection. This field is redundant and implied by `subnetId`, but is currently an api requirement.
    */
  var availabilityZone: js.UndefOr[Input[String]] = js.undefined
  /**
    * The security group ID list used by the connection.
    */
  var securityGroupIdLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The subnet ID used by the connection.
    */
  var subnetId: js.UndefOr[Input[String]] = js.undefined
}

object ConnectionPhysicalConnectionRequirements {
  @scala.inline
  def apply(
    availabilityZone: Input[String] = null,
    securityGroupIdLists: Input[js.Array[Input[String]]] = null,
    subnetId: Input[String] = null
  ): ConnectionPhysicalConnectionRequirements = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (securityGroupIdLists != null) __obj.updateDynamic("securityGroupIdLists")(securityGroupIdLists.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionPhysicalConnectionRequirements]
  }
}

