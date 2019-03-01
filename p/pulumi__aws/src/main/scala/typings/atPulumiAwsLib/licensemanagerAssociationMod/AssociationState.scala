package typings
package atPulumiAwsLib.licensemanagerAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationState extends js.Object {
  /**
    * ARN of the license configuration.
    */
  val licenseConfigurationArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * ARN of the resource associated with the license configuration.
    */
  val resourceArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object AssociationState {
  @scala.inline
  def apply(
    licenseConfigurationArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    resourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): AssociationState = {
    val __obj = js.Dynamic.literal()
    if (licenseConfigurationArn != null) __obj.updateDynamic("licenseConfigurationArn")(licenseConfigurationArn.asInstanceOf[js.Any])
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationState]
  }
}

