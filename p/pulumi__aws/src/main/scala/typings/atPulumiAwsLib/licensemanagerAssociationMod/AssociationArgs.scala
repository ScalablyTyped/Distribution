package typings
package atPulumiAwsLib.licensemanagerAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationArgs extends js.Object {
  /**
    * ARN of the license configuration.
    */
  val licenseConfigurationArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * ARN of the resource associated with the license configuration.
    */
  val resourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object AssociationArgs {
  @scala.inline
  def apply(
    licenseConfigurationArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    resourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): AssociationArgs = {
    val __obj = js.Dynamic.literal(licenseConfigurationArn = licenseConfigurationArn.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociationArgs]
  }
}

