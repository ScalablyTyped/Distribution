package typings.pulumiAws.getAvailabilityZoneMod

import typings.pulumiAws.outputMod.GetAvailabilityZoneFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAvailabilityZoneResult extends js.Object {
  val allAvailabilityZones: js.UndefOr[Boolean] = js.native
  val filters: js.UndefOr[js.Array[GetAvailabilityZoneFilter]] = js.native
  /**
    * For Availability Zones, this is the same value as the Region name. For Local Zones, the name of the associated group, for example `us-west-2-lax-1`.
    */
  val groupName: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * The part of the AZ name that appears after the region name, uniquely identifying the AZ within its region.
    */
  val nameSuffix: String = js.native
  /**
    * The name of the location from which the address is advertised.
    */
  val networkBorderGroup: String = js.native
  /**
    * For Availability Zones, this always has the value of `opt-in-not-required`. For Local Zones, this is the opt in status. The possible values are `opted-in` and `not-opted-in`.
    */
  val optInStatus: String = js.native
  /**
    * The region where the selected availability zone resides. This is always the region selected on the provider, since this data source searches only within that region.
    */
  val region: String = js.native
  val state: String = js.native
  val zoneId: String = js.native
}

object GetAvailabilityZoneResult {
  @scala.inline
  def apply(
    groupName: String,
    id: String,
    name: String,
    nameSuffix: String,
    networkBorderGroup: String,
    optInStatus: String,
    region: String,
    state: String,
    zoneId: String,
    allAvailabilityZones: js.UndefOr[Boolean] = js.undefined,
    filters: js.Array[GetAvailabilityZoneFilter] = null
  ): GetAvailabilityZoneResult = {
    val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameSuffix = nameSuffix.asInstanceOf[js.Any], networkBorderGroup = networkBorderGroup.asInstanceOf[js.Any], optInStatus = optInStatus.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    if (!js.isUndefined(allAvailabilityZones)) __obj.updateDynamic("allAvailabilityZones")(allAvailabilityZones.get.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAvailabilityZoneResult]
  }
}

