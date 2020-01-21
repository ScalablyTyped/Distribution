package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplatePlacement extends js.Object {
  var affinity: js.UndefOr[String] = js.native
  var availabilityZone: js.UndefOr[String] = js.native
  var groupName: js.UndefOr[String] = js.native
  var hostId: js.UndefOr[String] = js.native
  var spreadDomain: js.UndefOr[String] = js.native
  var tenancy: js.UndefOr[String] = js.native
}

object LaunchTemplatePlacement {
  @scala.inline
  def apply(
    affinity: String = null,
    availabilityZone: String = null,
    groupName: String = null,
    hostId: String = null,
    spreadDomain: String = null,
    tenancy: String = null
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

