package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRouteTableAssociation extends StObject {
  
  /**
    * The id of an Internet Gateway or Virtual Private Gateway which is connected to the Route Table (not exported if not passed as a parameter).
    */
  var gatewayId: String
  
  /**
    * If the Association due to the Main Route Table.
    */
  var main: Boolean
  
  /**
    * The Association ID.
    */
  var routeTableAssociationId: String
  
  /**
    * The id of the specific Route Table to retrieve.
    */
  var routeTableId: String
  
  /**
    * The id of a Subnet which is connected to the Route Table (not exported if not passed as a parameter).
    */
  var subnetId: String
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
  implicit class GetRouteTableAssociationMutableBuilder[Self <: GetRouteTableAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayId(value: String): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMain(value: Boolean): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteTableAssociationId(value: String): Self = StObject.set(x, "routeTableAssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteTableId(value: String): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
  }
}
