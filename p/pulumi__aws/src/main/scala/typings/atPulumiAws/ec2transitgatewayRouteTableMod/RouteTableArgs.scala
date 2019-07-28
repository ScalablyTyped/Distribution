package typings.atPulumiAws.ec2transitgatewayRouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTableArgs extends js.Object {
  /**
    * Key-value tags for the EC2 Transit Gateway Route Table.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: Input[String]
}

object RouteTableArgs {
  @scala.inline
  def apply(transitGatewayId: Input[String], tags: Input[StringDictionary[Input[String]]] = null): RouteTableArgs = {
    val __obj = js.Dynamic.literal(transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableArgs]
  }
}

