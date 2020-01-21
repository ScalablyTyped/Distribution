package typings.pulumiAws.routeTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteTableState extends js.Object {
  /**
    * Boolean whether this is the default association route table for the EC2 Transit Gateway.
    */
  val defaultAssociationRouteTable: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Boolean whether this is the default propagation route table for the EC2 Transit Gateway.
    */
  val defaultPropagationRouteTable: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway Route Table.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[Input[String]] = js.native
}

object RouteTableState {
  @scala.inline
  def apply(
    defaultAssociationRouteTable: Input[Boolean] = null,
    defaultPropagationRouteTable: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null,
    transitGatewayId: Input[String] = null
  ): RouteTableState = {
    val __obj = js.Dynamic.literal()
    if (defaultAssociationRouteTable != null) __obj.updateDynamic("defaultAssociationRouteTable")(defaultAssociationRouteTable.asInstanceOf[js.Any])
    if (defaultPropagationRouteTable != null) __obj.updateDynamic("defaultPropagationRouteTable")(defaultPropagationRouteTable.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transitGatewayId != null) __obj.updateDynamic("transitGatewayId")(transitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableState]
  }
}

