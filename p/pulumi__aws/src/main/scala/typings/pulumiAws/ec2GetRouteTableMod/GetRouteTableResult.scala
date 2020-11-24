package typings.pulumiAws.ec2GetRouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetRouteTableAssociation
import typings.pulumiAws.outputMod.ec2.GetRouteTableFilter
import typings.pulumiAws.outputMod.ec2.GetRouteTableRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRouteTableResult extends js.Object {
  
  val associations: js.Array[GetRouteTableAssociation] = js.native
  
  val filters: js.UndefOr[js.Array[GetRouteTableFilter]] = js.native
  
  /**
    * The Gateway ID. Only set when associated with an Internet Gateway or Virtual Private Gateway.
    */
  val gatewayId: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The ID of the AWS account that owns the route table
    */
  val ownerId: String = js.native
  
  /**
    * The Route Table ID.
    */
  val routeTableId: String = js.native
  
  val routes: js.Array[GetRouteTableRoute] = js.native
  
  /**
    * The Subnet ID. Only set when associated with a Subnet.
    */
  val subnetId: String = js.native
  
  val tags: StringDictionary[String] = js.native
  
  val vpcId: String = js.native
}
object GetRouteTableResult {
  
  @scala.inline
  def apply(
    associations: js.Array[GetRouteTableAssociation],
    gatewayId: String,
    id: String,
    ownerId: String,
    routeTableId: String,
    routes: js.Array[GetRouteTableRoute],
    subnetId: String,
    tags: StringDictionary[String],
    vpcId: String
  ): GetRouteTableResult = {
    val __obj = js.Dynamic.literal(associations = associations.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], routeTableId = routeTableId.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteTableResult]
  }
  
  @scala.inline
  implicit class GetRouteTableResultOps[Self <: GetRouteTableResult] (val x: Self) extends AnyVal {
    
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
    def setAssociationsVarargs(value: GetRouteTableAssociation*): Self = this.set("associations", js.Array(value :_*))
    
    @scala.inline
    def setAssociations(value: js.Array[GetRouteTableAssociation]): Self = this.set("associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayId(value: String): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteTableId(value: String): Self = this.set("routeTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: GetRouteTableRoute*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[GetRouteTableRoute]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: String): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetRouteTableFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetRouteTableFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
}
