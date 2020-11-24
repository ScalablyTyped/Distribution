package typings.pulumiAws.getAvailabilityZonesMod

import typings.pulumiAws.outputMod.GetAvailabilityZonesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAvailabilityZonesResult extends js.Object {
  
  val allAvailabilityZones: js.UndefOr[Boolean] = js.native
  
  val excludeNames: js.UndefOr[js.Array[String]] = js.native
  
  val excludeZoneIds: js.UndefOr[js.Array[String]] = js.native
  
  val filters: js.UndefOr[js.Array[GetAvailabilityZonesFilter]] = js.native
  
  val groupNames: js.Array[String] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
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
  def apply(groupNames: js.Array[String], id: String, names: js.Array[String], zoneIds: js.Array[String]): GetAvailabilityZonesResult = {
    val __obj = js.Dynamic.literal(groupNames = groupNames.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], zoneIds = zoneIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAvailabilityZonesResult]
  }
  
  @scala.inline
  implicit class GetAvailabilityZonesResultOps[Self <: GetAvailabilityZonesResult] (val x: Self) extends AnyVal {
    
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
    def setGroupNamesVarargs(value: String*): Self = this.set("groupNames", js.Array(value :_*))
    
    @scala.inline
    def setGroupNames(value: js.Array[String]): Self = this.set("groupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneIdsVarargs(value: String*): Self = this.set("zoneIds", js.Array(value :_*))
    
    @scala.inline
    def setZoneIds(value: js.Array[String]): Self = this.set("zoneIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllAvailabilityZones(value: Boolean): Self = this.set("allAvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllAvailabilityZones: Self = this.set("allAvailabilityZones", js.undefined)
    
    @scala.inline
    def setExcludeNamesVarargs(value: String*): Self = this.set("excludeNames", js.Array(value :_*))
    
    @scala.inline
    def setExcludeNames(value: js.Array[String]): Self = this.set("excludeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeNames: Self = this.set("excludeNames", js.undefined)
    
    @scala.inline
    def setExcludeZoneIdsVarargs(value: String*): Self = this.set("excludeZoneIds", js.Array(value :_*))
    
    @scala.inline
    def setExcludeZoneIds(value: js.Array[String]): Self = this.set("excludeZoneIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeZoneIds: Self = this.set("excludeZoneIds", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: GetAvailabilityZonesFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetAvailabilityZonesFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
