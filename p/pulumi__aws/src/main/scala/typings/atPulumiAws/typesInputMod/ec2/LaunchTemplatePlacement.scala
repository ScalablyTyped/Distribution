package typings.atPulumiAws.typesInputMod.ec2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplatePlacement extends js.Object {
  var affinity: js.UndefOr[Input[String]] = js.undefined
  var availabilityZone: js.UndefOr[Input[String]] = js.undefined
  var groupName: js.UndefOr[Input[String]] = js.undefined
  var hostId: js.UndefOr[Input[String]] = js.undefined
  var spreadDomain: js.UndefOr[Input[String]] = js.undefined
  var tenancy: js.UndefOr[Input[String]] = js.undefined
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

