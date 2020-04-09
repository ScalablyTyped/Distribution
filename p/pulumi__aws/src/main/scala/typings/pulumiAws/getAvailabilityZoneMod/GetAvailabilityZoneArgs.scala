package typings.pulumiAws.getAvailabilityZoneMod

import typings.pulumiAws.inputMod.GetAvailabilityZoneFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAvailabilityZoneArgs extends js.Object {
  /**
    * Set to `true` to include all Availability Zones and Local Zones regardless of your opt in status.
    */
  val allAvailabilityZones: js.UndefOr[Boolean] = js.native
  /**
    * Configuration block(s) for filtering. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetAvailabilityZoneFilter]] = js.native
  /**
    * The name of the filter field. Valid values can be found in the [EC2 DescribeAvailabilityZones API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html).
    */
  val name: js.UndefOr[String] = js.native
  /**
    * A specific availability zone state to require. May be any of `"available"`, `"information"` or `"impaired"`.
    */
  val state: js.UndefOr[String] = js.native
  /**
    * The zone ID of the availability zone to select.
    */
  val zoneId: js.UndefOr[String] = js.native
}

object GetAvailabilityZoneArgs {
  @scala.inline
  def apply(
    allAvailabilityZones: js.UndefOr[Boolean] = js.undefined,
    filters: js.Array[GetAvailabilityZoneFilter] = null,
    name: String = null,
    state: String = null,
    zoneId: String = null
  ): GetAvailabilityZoneArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allAvailabilityZones)) __obj.updateDynamic("allAvailabilityZones")(allAvailabilityZones.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAvailabilityZoneArgs]
  }
}

