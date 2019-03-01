package typings
package atPulumiAwsLib.ec2GetRouteTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteTableResult extends js.Object {
  val associations: js.Array[atPulumiAwsLib.Anon_Main]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The ID of the AWS account that owns the route table
    */
  val ownerId: java.lang.String
  /**
    * The Route Table ID.
    */
  val routeTableId: java.lang.String
  val routes: js.Array[atPulumiAwsLib.Anon_CidrBlockEgressOnlyGatewayIdGatewayId]
  /**
    * The Subnet ID.
    */
  val subnetId: java.lang.String
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val vpcId: java.lang.String
}

object GetRouteTableResult {
  @scala.inline
  def apply(
    associations: js.Array[atPulumiAwsLib.Anon_Main],
    id: java.lang.String,
    ownerId: java.lang.String,
    routeTableId: java.lang.String,
    routes: js.Array[atPulumiAwsLib.Anon_CidrBlockEgressOnlyGatewayIdGatewayId],
    subnetId: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    vpcId: java.lang.String
  ): GetRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("associations")(associations)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ownerId")(ownerId)
    __obj.updateDynamic("routeTableId")(routeTableId)
    __obj.updateDynamic("routes")(routes)
    __obj.updateDynamic("subnetId")(subnetId)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[GetRouteTableResult]
  }
}

