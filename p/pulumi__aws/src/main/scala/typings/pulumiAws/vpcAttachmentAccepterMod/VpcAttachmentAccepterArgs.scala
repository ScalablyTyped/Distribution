package typings.pulumiAws.vpcAttachmentAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcAttachmentAccepterArgs extends js.Object {
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The ID of the EC2 Transit Gateway Attachment to manage.
    */
  val transitGatewayAttachmentId: Input[String] = js.native
  /**
    * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTableAssociation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTablePropagation: js.UndefOr[Input[Boolean]] = js.native
}

object VpcAttachmentAccepterArgs {
  @scala.inline
  def apply(transitGatewayAttachmentId: Input[String]): VpcAttachmentAccepterArgs = {
    val __obj = js.Dynamic.literal(transitGatewayAttachmentId = transitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcAttachmentAccepterArgs]
  }
  @scala.inline
  implicit class VpcAttachmentAccepterArgsOps[Self <: VpcAttachmentAccepterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTransitGatewayAttachmentId(value: Input[String]): Self = this.set("transitGatewayAttachmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTransitGatewayDefaultRouteTableAssociation(value: Input[Boolean]): Self = this.set("transitGatewayDefaultRouteTableAssociation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayDefaultRouteTableAssociation: Self = this.set("transitGatewayDefaultRouteTableAssociation", js.undefined)
    @scala.inline
    def setTransitGatewayDefaultRouteTablePropagation(value: Input[Boolean]): Self = this.set("transitGatewayDefaultRouteTablePropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayDefaultRouteTablePropagation: Self = this.set("transitGatewayDefaultRouteTablePropagation", js.undefined)
  }
  
}

