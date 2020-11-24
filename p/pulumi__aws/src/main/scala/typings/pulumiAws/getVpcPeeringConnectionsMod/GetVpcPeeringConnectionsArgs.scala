package typings.pulumiAws.getVpcPeeringConnectionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcPeeringConnectionsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVpcPeeringConnectionsArgs extends js.Object {
  
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpcPeeringConnectionsFilter]] = js.native
  
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired VPC Peering Connection.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}
object GetVpcPeeringConnectionsArgs {
  
  @scala.inline
  def apply(): GetVpcPeeringConnectionsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcPeeringConnectionsArgs]
  }
  
  @scala.inline
  implicit class GetVpcPeeringConnectionsArgsOps[Self <: GetVpcPeeringConnectionsArgs] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: GetVpcPeeringConnectionsFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetVpcPeeringConnectionsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
