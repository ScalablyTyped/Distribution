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

