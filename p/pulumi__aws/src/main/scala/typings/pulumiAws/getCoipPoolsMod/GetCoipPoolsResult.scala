package typings.pulumiAws.getCoipPoolsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetCoipPoolsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCoipPoolsResult extends js.Object {
  
  val filters: js.UndefOr[js.Array[GetCoipPoolsFilter]] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * Set of COIP Pool Identifiers
    */
  val poolIds: js.Array[String] = js.native
  
  val tags: StringDictionary[String] = js.native
}
object GetCoipPoolsResult {
  
  @scala.inline
  def apply(id: String, poolIds: js.Array[String], tags: StringDictionary[String]): GetCoipPoolsResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], poolIds = poolIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCoipPoolsResult]
  }
  
  @scala.inline
  implicit class GetCoipPoolsResultOps[Self <: GetCoipPoolsResult] (val x: Self) extends AnyVal {
    
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
    def setPoolIdsVarargs(value: String*): Self = this.set("poolIds", js.Array(value :_*))
    
    @scala.inline
    def setPoolIds(value: js.Array[String]): Self = this.set("poolIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetCoipPoolsFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetCoipPoolsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
}
