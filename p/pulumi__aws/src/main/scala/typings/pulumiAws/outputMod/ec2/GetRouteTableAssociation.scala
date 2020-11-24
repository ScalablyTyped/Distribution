package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRouteTableAssociation extends js.Object {
  
  /**
    * The id of an Internet Gateway or Virtual Private Gateway which is connected to the Route Table (not exported if not passed as a parameter).
    */
  var gatewayId: String = js.native
  
  /**
    * If the Association due to the Main Route Table.
    */
  var main: Boolean = js.native
  
  /**
    * The Association ID.
    */
  var routeTableAssociationId: String = js.native
  
  /**
    * The id of the specific Route Table to retrieve.
    */
  var routeTableId: String = js.native
  
  /**
    * The id of a Subnet which is connected to the Route Table (not exported if not passed as a parameter).
    */
  var subnetId: String = js.native
}
object GetRouteTableAssociation {
  
  @scala.inline
  def apply(
    gatewayId: String,
    main: Boolean,
    routeTableAssociationId: String,
    routeTableId: String,
    subnetId: String
  ): GetRouteTableAssociation = {
    val __obj = js.Dynamic.literal(gatewayId = gatewayId.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], routeTableAssociationId = routeTableAssociationId.asInstanceOf[js.Any], routeTableId = routeTableId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteTableAssociation]
  }
  
  @scala.inline
  implicit class GetRouteTableAssociationOps[Self <: GetRouteTableAssociation] (val x: Self) extends AnyVal {
    
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
    def setGatewayId(value: String): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMain(value: Boolean): Self = this.set("main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteTableAssociationId(value: String): Self = this.set("routeTableAssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteTableId(value: String): Self = this.set("routeTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: String): Self = this.set("subnetId", value.asInstanceOf[js.Any])
  }
}
