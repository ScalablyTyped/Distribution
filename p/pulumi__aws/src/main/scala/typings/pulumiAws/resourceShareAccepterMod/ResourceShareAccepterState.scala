package typings.pulumiAws.resourceShareAccepterMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceShareAccepterState extends js.Object {
  /**
    * The ARN of the resource share invitation.
    */
  val invitationArn: js.UndefOr[Input[String]] = js.native
  /**
    * The account ID of the receiver account which accepts the invitation.
    */
  val receiverAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of the resource ARNs shared via the resource share.
    */
  val resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The account ID of the sender account which submits the invitation.
    */
  val senderAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the resource share.
    */
  val shareArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the resource share as displayed in the console.
    */
  val shareId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the resource share.
    */
  val shareName: js.UndefOr[Input[String]] = js.native
  /**
    * The status of the resource share (ACTIVE, PENDING, FAILED, DELETING, DELETED).
    */
  val status: js.UndefOr[Input[String]] = js.native
}

object ResourceShareAccepterState {
  @scala.inline
  def apply(): ResourceShareAccepterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceShareAccepterState]
  }
  @scala.inline
  implicit class ResourceShareAccepterStateOps[Self <: ResourceShareAccepterState] (val x: Self) extends AnyVal {
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
    def setInvitationArn(value: Input[String]): Self = this.set("invitationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitationArn: Self = this.set("invitationArn", js.undefined)
    @scala.inline
    def setReceiverAccountId(value: Input[String]): Self = this.set("receiverAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceiverAccountId: Self = this.set("receiverAccountId", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: Input[String]*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: Input[js.Array[Input[String]]]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setSenderAccountId(value: Input[String]): Self = this.set("senderAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenderAccountId: Self = this.set("senderAccountId", js.undefined)
    @scala.inline
    def setShareArn(value: Input[String]): Self = this.set("shareArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareArn: Self = this.set("shareArn", js.undefined)
    @scala.inline
    def setShareId(value: Input[String]): Self = this.set("shareId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareId: Self = this.set("shareId", js.undefined)
    @scala.inline
    def setShareName(value: Input[String]): Self = this.set("shareName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareName: Self = this.set("shareName", js.undefined)
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

