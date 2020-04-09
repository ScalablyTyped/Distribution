package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplatePlacement extends js.Object {
  /**
    * The affinity setting for an instance on a Dedicated Host.
    */
  var affinity: js.UndefOr[Input[String]] = js.native
  /**
    * The Availability Zone for the instance.
    */
  var availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the placement group for the instance.
    */
  var groupName: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the Dedicated Host for the instance.
    */
  var hostId: js.UndefOr[Input[String]] = js.native
  /**
    * Reserved for future use.
    */
  var spreadDomain: js.UndefOr[Input[String]] = js.native
  /**
    * The tenancy of the instance (if the instance is running in a VPC). Can be `default`, `dedicated`, or `host`.
    */
  var tenancy: js.UndefOr[Input[String]] = js.native
}

object LaunchTemplatePlacement {
  @scala.inline
  def apply(
    affinity: Input[String] = null,
    availabilityZone: Input[String] = null,
    groupName: Input[String] = null,
    hostId: Input[String] = null,
    spreadDomain: Input[String] = null,
    tenancy: Input[String] = null
  ): LaunchTemplatePlacement = {
    val __obj = js.Dynamic.literal()
    if (affinity != null) __obj.updateDynamic("affinity")(affinity.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (hostId != null) __obj.updateDynamic("hostId")(hostId.asInstanceOf[js.Any])
    if (spreadDomain != null) __obj.updateDynamic("spreadDomain")(spreadDomain.asInstanceOf[js.Any])
    if (tenancy != null) __obj.updateDynamic("tenancy")(tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplatePlacement]
  }
}

