package typings.pulumiAws.getAvailabilityZonesMod

import typings.pulumiAws.inputMod.GetAvailabilityZonesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAvailabilityZonesArgs extends js.Object {
  
  /**
    * Set to `true` to include all Availability Zones and Local Zones regardless of your opt in status.
    */
  val allAvailabilityZones: js.UndefOr[Boolean] = js.native
  
  /**
    * List of Availability Zone names to exclude.
    */
  val excludeNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of Availability Zone IDs to exclude.
    */
  val excludeZoneIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Configuration block(s) for filtering. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetAvailabilityZonesFilter]] = js.native
  
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
  def apply(): GetAvailabilityZonesArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAvailabilityZonesArgs]
  }
  
  @scala.inline
  implicit class GetAvailabilityZonesArgsOps[Self <: GetAvailabilityZonesArgs] (val x: Self) extends AnyVal {
    
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
