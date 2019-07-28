package typings.atPulumiAws.ec2transitgatewayRouteTablePropagationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTablePropagationState extends js.Object {
  /**
    * Identifier of the resource
    */
  val resourceId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Type of the resource
    */
  val resourceType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of EC2 Transit Gateway Attachment.
    */
  val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: js.UndefOr[Input[String]] = js.undefined
}

object RouteTablePropagationState {
  @scala.inline
  def apply(
    resourceId: Input[String] = null,
    resourceType: Input[String] = null,
    transitGatewayAttachmentId: Input[String] = null,
    transitGatewayRouteTableId: Input[String] = null
  ): RouteTablePropagationState = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (transitGatewayAttachmentId != null) __obj.updateDynamic("transitGatewayAttachmentId")(transitGatewayAttachmentId.asInstanceOf[js.Any])
    if (transitGatewayRouteTableId != null) __obj.updateDynamic("transitGatewayRouteTableId")(transitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTablePropagationState]
  }
}

