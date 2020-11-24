package typings.pulumiAws.getRegionsMod

import typings.pulumiAws.outputMod.GetRegionsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRegionsResult extends js.Object {
  
  val allRegions: js.UndefOr[Boolean] = js.native
  
  val filters: js.UndefOr[js.Array[GetRegionsFilter]] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * Names of regions that meets the criteria.
    */
  val names: js.Array[String] = js.native
}
object GetRegionsResult {
  
  @scala.inline
  def apply(id: String, names: js.Array[String]): GetRegionsResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegionsResult]
  }
  
  @scala.inline
  implicit class GetRegionsResultOps[Self <: GetRegionsResult] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllRegions(value: Boolean): Self = this.set("allRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllRegions: Self = this.set("allRegions", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: GetRegionsFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetRegionsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
}
