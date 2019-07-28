package typings.atPulumiAws.getAvailabilityZonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAvailabilityZonesArgs extends js.Object {
  /**
    * List of blacklisted Availability Zone names.
    */
  val blacklistedNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * List of blacklisted Availability Zone IDs.
    */
  val blacklistedZoneIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Allows to filter list of Availability Zones based on their
    * current state. Can be either `"available"`, `"information"`, `"impaired"` or
    * `"unavailable"`. By default the list includes a complete set of Availability Zones
    * to which the underlying AWS account has access, regardless of their state.
    */
  val state: js.UndefOr[String] = js.undefined
}

object GetAvailabilityZonesArgs {
  @scala.inline
  def apply(
    blacklistedNames: js.Array[String] = null,
    blacklistedZoneIds: js.Array[String] = null,
    state: String = null
  ): GetAvailabilityZonesArgs = {
    val __obj = js.Dynamic.literal()
    if (blacklistedNames != null) __obj.updateDynamic("blacklistedNames")(blacklistedNames)
    if (blacklistedZoneIds != null) __obj.updateDynamic("blacklistedZoneIds")(blacklistedZoneIds)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[GetAvailabilityZonesArgs]
  }
}

