package typings
package atPulumiAwsLib.ec2transitgatewayRouteTablePropagationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTablePropagationState extends js.Object {
  /**
    * Identifier of the resource
    */
  val resourceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Type of the resource
    */
  val resourceType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Identifier of EC2 Transit Gateway Attachment.
    */
  val transitGatewayAttachmentId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object RouteTablePropagationState {
  @scala.inline
  def apply(
    resourceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    resourceType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    transitGatewayAttachmentId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    transitGatewayRouteTableId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): RouteTablePropagationState = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (transitGatewayAttachmentId != null) __obj.updateDynamic("transitGatewayAttachmentId")(transitGatewayAttachmentId.asInstanceOf[js.Any])
    if (transitGatewayRouteTableId != null) __obj.updateDynamic("transitGatewayRouteTableId")(transitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTablePropagationState]
  }
}

