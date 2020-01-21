package typings.pulumiAws.routeTablePropagationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteTablePropagationState extends js.Object {
  /**
    * Identifier of the resource
    */
  val resourceId: js.UndefOr[Input[String]] = js.native
  /**
    * Type of the resource
    */
  val resourceType: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of EC2 Transit Gateway Attachment.
    */
  val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: js.UndefOr[Input[String]] = js.native
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

