package typings.pulumiAws.getCoipPoolsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetCoipPoolsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCoipPoolsArgs extends js.Object {
  
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetCoipPoolsFilter]] = js.native
  
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired aws_ec2_coip_pools.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}
object GetCoipPoolsArgs {
  
  @scala.inline
  def apply(): GetCoipPoolsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCoipPoolsArgs]
  }
  
  @scala.inline
  implicit class GetCoipPoolsArgsOps[Self <: GetCoipPoolsArgs] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: GetCoipPoolsFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetCoipPoolsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
