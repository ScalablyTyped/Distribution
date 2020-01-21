package typings.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionPhysicalConnectionRequirements extends js.Object {
  /**
    * The availability zone of the connection. This field is redundant and implied by `subnetId`, but is currently an api requirement.
    */
  var availabilityZone: js.UndefOr[String] = js.native
  /**
    * The security group ID list used by the connection.
    */
  var securityGroupIdLists: js.UndefOr[js.Array[String]] = js.native
  /**
    * The subnet ID used by the connection.
    */
  var subnetId: js.UndefOr[String] = js.native
}

object ConnectionPhysicalConnectionRequirements {
  @scala.inline
  def apply(
    availabilityZone: String = null,
    securityGroupIdLists: js.Array[String] = null,
    subnetId: String = null
  ): ConnectionPhysicalConnectionRequirements = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (securityGroupIdLists != null) __obj.updateDynamic("securityGroupIdLists")(securityGroupIdLists.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionPhysicalConnectionRequirements]
  }
}

