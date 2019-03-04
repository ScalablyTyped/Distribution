package typings
package atPulumiAwsLib.ec2transitgatewayRouteTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTableArgs extends js.Object {
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
  val transitGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object RouteTableArgs {
  @scala.inline
  def apply(
    transitGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    tags: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null
  ): RouteTableArgs = {
    val __obj = js.Dynamic.literal(transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableArgs]
  }
}

