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
    * The account ID of the sender account which extends the invitation.
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
    * The status of the invitation (e.g., ACCEPTED, REJECTED).
    */
  val status: js.UndefOr[Input[String]] = js.native
}

object ResourceShareAccepterState {
  @scala.inline
  def apply(
    invitationArn: Input[String] = null,
    receiverAccountId: Input[String] = null,
    resources: Input[js.Array[Input[String]]] = null,
    senderAccountId: Input[String] = null,
    shareArn: Input[String] = null,
    shareId: Input[String] = null,
    shareName: Input[String] = null,
    status: Input[String] = null
  ): ResourceShareAccepterState = {
    val __obj = js.Dynamic.literal()
    if (invitationArn != null) __obj.updateDynamic("invitationArn")(invitationArn.asInstanceOf[js.Any])
    if (receiverAccountId != null) __obj.updateDynamic("receiverAccountId")(receiverAccountId.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (senderAccountId != null) __obj.updateDynamic("senderAccountId")(senderAccountId.asInstanceOf[js.Any])
    if (shareArn != null) __obj.updateDynamic("shareArn")(shareArn.asInstanceOf[js.Any])
    if (shareId != null) __obj.updateDynamic("shareId")(shareId.asInstanceOf[js.Any])
    if (shareName != null) __obj.updateDynamic("shareName")(shareName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceShareAccepterState]
  }
}

