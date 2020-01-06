package typings.atPulumiAws.getAvailabilityZonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAvailabilityZonesResult extends js.Object {
  val blacklistedNames: js.UndefOr[js.Array[String]] = js.native
  val blacklistedZoneIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * A list of the Availability Zone names available to the account.
    */
  val names: js.Array[String] = js.native
  val state: js.UndefOr[String] = js.native
  /**
    * A list of the Availability Zone IDs available to the account.
    */
  val zoneIds: js.Array[String] = js.native
}

object GetAvailabilityZonesResult {
  @scala.inline
  def apply(
    id: String,
    names: js.Array[String],
    zoneIds: js.Array[String],
    blacklistedNames: js.Array[String] = null,
    blacklistedZoneIds: js.Array[String] = null,
    state: String = null
  ): GetAvailabilityZonesResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], zoneIds = zoneIds.asInstanceOf[js.Any])
    if (blacklistedNames != null) __obj.updateDynamic("blacklistedNames")(blacklistedNames.asInstanceOf[js.Any])
    if (blacklistedZoneIds != null) __obj.updateDynamic("blacklistedZoneIds")(blacklistedZoneIds.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAvailabilityZonesResult]
  }
}

