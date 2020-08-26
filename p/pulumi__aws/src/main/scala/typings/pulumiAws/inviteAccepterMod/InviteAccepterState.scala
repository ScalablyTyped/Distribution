package typings.pulumiAws.inviteAccepterMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteAccepterState extends js.Object {
  /**
    * The detector ID of the member GuardDuty account.
    */
  val detectorId: js.UndefOr[Input[String]] = js.native
  /**
    * AWS account ID for master account.
    */
  val masterAccountId: js.UndefOr[Input[String]] = js.native
}

object InviteAccepterState {
  @scala.inline
  def apply(): InviteAccepterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteAccepterState]
  }
  @scala.inline
  implicit class InviteAccepterStateOps[Self <: InviteAccepterState] (val x: Self) extends AnyVal {
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
    def setDetectorId(value: Input[String]): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorId: Self = this.set("detectorId", js.undefined)
    @scala.inline
    def setMasterAccountId(value: Input[String]): Self = this.set("masterAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterAccountId: Self = this.set("masterAccountId", js.undefined)
  }
  
}

