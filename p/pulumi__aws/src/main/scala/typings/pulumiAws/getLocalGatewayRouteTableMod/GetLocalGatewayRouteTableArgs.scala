package typings.pulumiAws.getLocalGatewayRouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLocalGatewayRouteTableFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocalGatewayRouteTableArgs extends js.Object {
  
  val filters: js.UndefOr[js.Array[GetLocalGatewayRouteTableFilter]] = js.native
  
  /**
    * The id of the specific local gateway route table to retrieve.
    */
  val localGatewayId: js.UndefOr[String] = js.native
  
  /**
    * Local Gateway Route Table Id assigned to desired local gateway route table
    */
  val localGatewayRouteTableId: js.UndefOr[String] = js.native
  
  /**
    * The arn of the Outpost the local gateway route table is associated with.
    */
  val outpostArn: js.UndefOr[String] = js.native
  
  /**
    * The state of the local gateway route table.
    */
  val state: js.UndefOr[String] = js.native
  
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired local gateway route table.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}
object GetLocalGatewayRouteTableArgs {
  
  @scala.inline
  def apply(): GetLocalGatewayRouteTableArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLocalGatewayRouteTableArgs]
  }
  
  @scala.inline
  implicit class GetLocalGatewayRouteTableArgsOps[Self <: GetLocalGatewayRouteTableArgs] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: GetLocalGatewayRouteTableFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetLocalGatewayRouteTableFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setLocalGatewayId(value: String): Self = this.set("localGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayId: Self = this.set("localGatewayId", js.undefined)
    
    @scala.inline
    def setLocalGatewayRouteTableId(value: String): Self = this.set("localGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayRouteTableId: Self = this.set("localGatewayRouteTableId", js.undefined)
    
    @scala.inline
    def setOutpostArn(value: String): Self = this.set("outpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpostArn: Self = this.set("outpostArn", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
