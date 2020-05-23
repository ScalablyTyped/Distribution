package typings.pulumiAws.getAvailabilityZonesMod

import typings.pulumiAws.inputMod.GetAvailabilityZonesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAvailabilityZonesArgs extends js.Object {
  /**
    * Set to `true` to include all Availability Zones and Local Zones regardless of your opt in status.
    */
  val allAvailabilityZones: js.UndefOr[Boolean] = js.native
  /**
    * List of blacklisted Availability Zone names.
    */
  val blacklistedNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of blacklisted Availability Zone IDs.
    */
  val blacklistedZoneIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Configuration block(s) for filtering. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetAvailabilityZonesFilter]] = js.native
  val groupNames: js.UndefOr[js.Array[String]] = js.native
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
    allAvailabilityZones: js.UndefOr[Boolean] = js.undefined,
    blacklistedNames: js.Array[String] = null,
    blacklistedZoneIds: js.Array[String] = null,
    filters: js.Array[GetAvailabilityZonesFilter] = null,
    groupNames: js.Array[String] = null,
    state: String = null
  ): GetAvailabilityZonesArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allAvailabilityZones)) __obj.updateDynamic("allAvailabilityZones")(allAvailabilityZones.get.asInstanceOf[js.Any])
    if (blacklistedNames != null) __obj.updateDynamic("blacklistedNames")(blacklistedNames.asInstanceOf[js.Any])
    if (blacklistedZoneIds != null) __obj.updateDynamic("blacklistedZoneIds")(blacklistedZoneIds.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (groupNames != null) __obj.updateDynamic("groupNames")(groupNames.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAvailabilityZonesArgs]
  }
}

