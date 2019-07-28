package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AffinityAvailabilityZone extends js.Object {
  var affinity: js.UndefOr[String] = js.undefined
  var availabilityZone: js.UndefOr[String] = js.undefined
  var groupName: js.UndefOr[String] = js.undefined
  var hostId: js.UndefOr[String] = js.undefined
  var spreadDomain: js.UndefOr[String] = js.undefined
  var tenancy: js.UndefOr[String] = js.undefined
}

object Anon_AffinityAvailabilityZone {
  @scala.inline
  def apply(
    affinity: String = null,
    availabilityZone: String = null,
    groupName: String = null,
    hostId: String = null,
    spreadDomain: String = null,
    tenancy: String = null
  ): Anon_AffinityAvailabilityZone = {
    val __obj = js.Dynamic.literal()
    if (affinity != null) __obj.updateDynamic("affinity")(affinity)
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone)
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    if (hostId != null) __obj.updateDynamic("hostId")(hostId)
    if (spreadDomain != null) __obj.updateDynamic("spreadDomain")(spreadDomain)
    if (tenancy != null) __obj.updateDynamic("tenancy")(tenancy)
    __obj.asInstanceOf[Anon_AffinityAvailabilityZone]
  }
}

