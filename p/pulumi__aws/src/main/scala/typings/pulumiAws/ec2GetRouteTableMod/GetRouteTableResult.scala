package typings.pulumiAws.ec2GetRouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetRouteTableAssociation
import typings.pulumiAws.outputMod.ec2.GetRouteTableFilter
import typings.pulumiAws.outputMod.ec2.GetRouteTableRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteTableResult extends js.Object {
  val associations: js.Array[GetRouteTableAssociation] = js.native
  val filters: js.UndefOr[js.Array[GetRouteTableFilter]] = js.native
  /**
    * The Gateway ID. Only set when associated with an Internet Gateway or Virtual Private Gateway.
    */
  val gatewayId: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
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
  val tags: StringDictionary[js.Any] = js.native
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
    tags: StringDictionary[js.Any],
    vpcId: String,
    filters: js.Array[GetRouteTableFilter] = null
  ): GetRouteTableResult = {
    val __obj = js.Dynamic.literal(associations = associations.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], routeTableId = routeTableId.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteTableResult]
  }
}

