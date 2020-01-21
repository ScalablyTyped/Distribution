package typings.pulumiAws.ec2GetRouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetRouteTableFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteTableArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetRouteTableFilter]] = js.native
  /**
    * The id of an Internet Gateway or Virtual Private Gateway which is connected to the Route Table (not exported if not passed as a parameter).
    */
  val gatewayId: js.UndefOr[String] = js.native
  /**
    * The id of the specific Route Table to retrieve.
    */
  val routeTableId: js.UndefOr[String] = js.native
  /**
    * The id of a Subnet which is connected to the Route Table (not exported if not passed as a parameter).
    */
  val subnetId: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired Route Table.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The id of the VPC that the desired Route Table belongs to.
    */
  val vpcId: js.UndefOr[String] = js.native
}

object GetRouteTableArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetRouteTableFilter] = null,
    gatewayId: String = null,
    routeTableId: String = null,
    subnetId: String = null,
    tags: StringDictionary[js.Any] = null,
    vpcId: String = null
  ): GetRouteTableArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (gatewayId != null) __obj.updateDynamic("gatewayId")(gatewayId.asInstanceOf[js.Any])
    if (routeTableId != null) __obj.updateDynamic("routeTableId")(routeTableId.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteTableArgs]
  }
}

