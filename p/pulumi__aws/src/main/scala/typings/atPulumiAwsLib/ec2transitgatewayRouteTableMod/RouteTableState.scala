package typings
package atPulumiAwsLib.ec2transitgatewayRouteTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTableState extends js.Object {
  /**
    * Boolean whether this is the default association route table for the EC2 Transit Gateway.
    */
  val defaultAssociationRouteTable: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Boolean whether this is the default propagation route table for the EC2 Transit Gateway.
    */
  val defaultPropagationRouteTable: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Key-value tags for the EC2 Transit Gateway Route Table.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object RouteTableState {
  @scala.inline
  def apply(
    defaultAssociationRouteTable: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    defaultPropagationRouteTable: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    tags: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    transitGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): RouteTableState = {
    val __obj = js.Dynamic.literal()
    if (defaultAssociationRouteTable != null) __obj.updateDynamic("defaultAssociationRouteTable")(defaultAssociationRouteTable.asInstanceOf[js.Any])
    if (defaultPropagationRouteTable != null) __obj.updateDynamic("defaultPropagationRouteTable")(defaultPropagationRouteTable.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transitGatewayId != null) __obj.updateDynamic("transitGatewayId")(transitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableState]
  }
}

