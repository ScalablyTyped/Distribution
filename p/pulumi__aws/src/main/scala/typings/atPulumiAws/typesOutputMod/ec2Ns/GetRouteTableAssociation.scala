package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteTableAssociation extends js.Object {
  /**
    * If the Association due to the Main Route Table.
    */
  var main: Boolean
  /**
    * The Association ID .
    */
  var routeTableAssociationId: String
  /**
    * The id of the specific Route Table to retrieve.
    */
  var routeTableId: String
  /**
    * The id of a Subnet which is connected to the Route Table (not be exported if not given in parameter).
    */
  var subnetId: String
}

object GetRouteTableAssociation {
  @scala.inline
  def apply(main: Boolean, routeTableAssociationId: String, routeTableId: String, subnetId: String): GetRouteTableAssociation = {
    val __obj = js.Dynamic.literal(main = main, routeTableAssociationId = routeTableAssociationId, routeTableId = routeTableId, subnetId = subnetId)
  
    __obj.asInstanceOf[GetRouteTableAssociation]
  }
}

