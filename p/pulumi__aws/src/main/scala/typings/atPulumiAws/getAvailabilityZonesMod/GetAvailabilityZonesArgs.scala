package typings.atPulumiAws.getAvailabilityZonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAvailabilityZonesArgs extends js.Object {
  /**
    * List of blacklisted Availability Zone names.
    */
  val blacklistedNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of blacklisted Availability Zone IDs.
    */
  val blacklistedZoneIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allows to filter list of Availability Zones based on their
    * current state. Can be either `"available"`, `"information"`, `"impaired"` or
    * `"unavailable"`. By default the list includes a complete set of Availability Zones
    * to which the underlying AWS account has access, regardless of their state.
    */
  val state: js.UndefOr[String] = js.native
}

object GetAvailabilityZonesArgs {
  @scala.inline
  def apply(
    blacklistedNames: js.Array[String] = null,
    blacklistedZoneIds: js.Array[String] = null,
    state: String = null
  ): GetAvailabilityZonesArgs = {
    val __obj = js.Dynamic.literal()
    if (blacklistedNames != null) __obj.updateDynamic("blacklistedNames")(blacklistedNames.asInstanceOf[js.Any])
    if (blacklistedZoneIds != null) __obj.updateDynamic("blacklistedZoneIds")(blacklistedZoneIds.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAvailabilityZonesArgs]
  }
}

