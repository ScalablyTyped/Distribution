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
  def apply(): GetAvailabilityZoneArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAvailabilityZoneArgs]
  }
  @scala.inline
  implicit class GetAvailabilityZoneArgsOps[Self <: GetAvailabilityZoneArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllAvailabilityZones(value: Boolean): Self = this.set("allAvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllAvailabilityZones: Self = this.set("allAvailabilityZones", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: GetAvailabilityZoneFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetAvailabilityZoneFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setZoneId(value: String): Self = this.set("zoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoneId: Self = this.set("zoneId", js.undefined)
  }
  
}

