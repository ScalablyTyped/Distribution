package typings.pulumiAws.getLocalGatewayRouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetLocalGatewayRouteTableFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocalGatewayRouteTableResult extends js.Object {
  
  val filters: js.UndefOr[js.Array[GetLocalGatewayRouteTableFilter]] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val localGatewayId: String = js.native
  
  val localGatewayRouteTableId: String = js.native
  
  val outpostArn: String = js.native
  
  val state: String = js.native
  
  val tags: StringDictionary[String] = js.native
}
object GetLocalGatewayRouteTableResult {
  
  @scala.inline
  def apply(
    id: String,
    localGatewayId: String,
    localGatewayRouteTableId: String,
    outpostArn: String,
    state: String,
    tags: StringDictionary[String]
  ): GetLocalGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], localGatewayId = localGatewayId.asInstanceOf[js.Any], localGatewayRouteTableId = localGatewayRouteTableId.asInstanceOf[js.Any], outpostArn = outpostArn.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocalGatewayRouteTableResult]
  }
  
  @scala.inline
  implicit class GetLocalGatewayRouteTableResultOps[Self <: GetLocalGatewayRouteTableResult] (val x: Self) extends AnyVal {
    
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
    def setLocalGatewayId(value: String): Self = this.set("localGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayRouteTableId(value: String): Self = this.set("localGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostArn(value: String): Self = this.set("outpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetLocalGatewayRouteTableFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetLocalGatewayRouteTableFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
}
