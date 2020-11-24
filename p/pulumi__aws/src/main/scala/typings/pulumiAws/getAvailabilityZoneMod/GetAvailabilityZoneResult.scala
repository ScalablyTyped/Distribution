package typings.pulumiAws.getAvailabilityZoneMod

import typings.pulumiAws.outputMod.GetAvailabilityZoneFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAvailabilityZoneResult extends js.Object {
  
  val allAvailabilityZones: js.UndefOr[Boolean] = js.native
  
  val filters: js.UndefOr[js.Array[GetAvailabilityZoneFilter]] = js.native
  
  /**
    * For Availability Zones, this is the same value as the Region name. For Local Zones, the name of the associated group, for example `us-west-2-lax-1`.
    */
  val groupName: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
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
    zoneId: String
  ): GetAvailabilityZoneResult = {
    val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameSuffix = nameSuffix.asInstanceOf[js.Any], networkBorderGroup = networkBorderGroup.asInstanceOf[js.Any], optInStatus = optInStatus.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAvailabilityZoneResult]
  }
  
  @scala.inline
  implicit class GetAvailabilityZoneResultOps[Self <: GetAvailabilityZoneResult] (val x: Self) extends AnyVal {
    
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
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameSuffix(value: String): Self = this.set("nameSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkBorderGroup(value: String): Self = this.set("networkBorderGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptInStatus(value: String): Self = this.set("optInStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneId(value: String): Self = this.set("zoneId", value.asInstanceOf[js.Any])
    
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
  }
}
