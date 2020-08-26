package typings.pulumiAws.associationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationState extends js.Object {
  /**
    * ARN of the license configuration.
    */
  val licenseConfigurationArn: js.UndefOr[Input[String]] = js.native
  /**
    * ARN of the resource associated with the license configuration.
    */
  val resourceArn: js.UndefOr[Input[String]] = js.native
}

object AssociationState {
  @scala.inline
  def apply(): AssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationState]
  }
  @scala.inline
  implicit class AssociationStateOps[Self <: AssociationState] (val x: Self) extends AnyVal {
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
    def setLicenseConfigurationArn(value: Input[String]): Self = this.set("licenseConfigurationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseConfigurationArn: Self = this.set("licenseConfigurationArn", js.undefined)
    @scala.inline
    def setResourceArn(value: Input[String]): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("resourceArn", js.undefined)
  }
  
}

