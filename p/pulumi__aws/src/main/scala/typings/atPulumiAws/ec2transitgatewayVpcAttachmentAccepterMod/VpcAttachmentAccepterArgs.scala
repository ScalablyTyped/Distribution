package typings.atPulumiAws.ec2transitgatewayVpcAttachmentAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcAttachmentAccepterArgs extends js.Object {
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The ID of the EC2 Transit Gateway Attachment to manage.
    */
  val transitGatewayAttachmentId: Input[String]
  /**
    * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTableAssociation: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTablePropagation: js.UndefOr[Input[Boolean]] = js.undefined
}

object VpcAttachmentAccepterArgs {
  @scala.inline
  def apply(
    transitGatewayAttachmentId: Input[String],
    tags: Input[StringDictionary[_]] = null,
    transitGatewayDefaultRouteTableAssociation: Input[Boolean] = null,
    transitGatewayDefaultRouteTablePropagation: Input[Boolean] = null
  ): VpcAttachmentAccepterArgs = {
    val __obj = js.Dynamic.literal(transitGatewayAttachmentId = transitGatewayAttachmentId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transitGatewayDefaultRouteTableAssociation != null) __obj.updateDynamic("transitGatewayDefaultRouteTableAssociation")(transitGatewayDefaultRouteTableAssociation.asInstanceOf[js.Any])
    if (transitGatewayDefaultRouteTablePropagation != null) __obj.updateDynamic("transitGatewayDefaultRouteTablePropagation")(transitGatewayDefaultRouteTablePropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcAttachmentAccepterArgs]
  }
}

