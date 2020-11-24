package typings.pulumiAws.getRegionsMod

import typings.pulumiAws.inputMod.GetRegionsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRegionsArgs extends js.Object {
  
  /**
    * If true the source will query all regions regardless of availability.
    */
  val allRegions: js.UndefOr[Boolean] = js.native
  
  /**
    * Configuration block(s) to use as filters. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetRegionsFilter]] = js.native
}
object GetRegionsArgs {
  
  @scala.inline
  def apply(): GetRegionsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegionsArgs]
  }
  
  @scala.inline
  implicit class GetRegionsArgsOps[Self <: GetRegionsArgs] (val x: Self) extends AnyVal {
    
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
