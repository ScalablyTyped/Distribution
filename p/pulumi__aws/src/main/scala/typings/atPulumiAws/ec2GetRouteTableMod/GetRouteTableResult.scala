package typings.atPulumiAws.ec2GetRouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.GetRouteTableAssociation
import typings.atPulumiAws.typesOutputMod.ec2.GetRouteTableFilter
import typings.atPulumiAws.typesOutputMod.ec2.GetRouteTableRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteTableResult extends js.Object {
  val associations: js.Array[GetRouteTableAssociation]
  val filters: js.UndefOr[js.Array[GetRouteTableFilter]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The ID of the AWS account that owns the route table
    */
  val ownerId: String
  /**
    * The Route Table ID.
    */
  val routeTableId: String
  val routes: js.Array[GetRouteTableRoute]
  /**
    * The Subnet ID.
    */
  val subnetId: String
  val tags: StringDictionary[js.Any]
  val vpcId: String
}

object GetRouteTableResult {
  @scala.inline
  def apply(
    associations: js.Array[GetRouteTableAssociation],
    id: String,
    ownerId: String,
    routeTableId: String,
    routes: js.Array[GetRouteTableRoute],
    subnetId: String,
    tags: StringDictionary[js.Any],
    vpcId: String,
    filters: js.Array[GetRouteTableFilter] = null
  ): GetRouteTableResult = {
    val __obj = js.Dynamic.literal(associations = associations, id = id, ownerId = ownerId, routeTableId = routeTableId, routes = routes, subnetId = subnetId, tags = tags, vpcId = vpcId)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetRouteTableResult]
  }
}

