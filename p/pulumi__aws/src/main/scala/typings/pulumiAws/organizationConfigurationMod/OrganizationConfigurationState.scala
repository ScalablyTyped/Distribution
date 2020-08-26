package typings.pulumiAws.organizationConfigurationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationConfigurationState extends js.Object {
  /**
    * When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
    */
  val autoEnable: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The detector ID of the GuardDuty account.
    */
  val detectorId: js.UndefOr[Input[String]] = js.native
}

object OrganizationConfigurationState {
  @scala.inline
  def apply(): OrganizationConfigurationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationConfigurationState]
  }
  @scala.inline
  implicit class OrganizationConfigurationStateOps[Self <: OrganizationConfigurationState] (val x: Self) extends AnyVal {
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
    def setAutoEnable(value: Input[Boolean]): Self = this.set("autoEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoEnable: Self = this.set("autoEnable", js.undefined)
    @scala.inline
    def setDetectorId(value: Input[String]): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorId: Self = this.set("detectorId", js.undefined)
  }
  
}

