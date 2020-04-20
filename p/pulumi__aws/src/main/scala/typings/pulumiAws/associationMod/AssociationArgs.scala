package typings.pulumiAws.associationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationArgs extends js.Object {
  /**
    * ARN of the license configuration.
    */
  val licenseConfigurationArn: Input[String] = js.native
  /**
    * ARN of the resource associated with the license configuration.
    */
  val resourceArn: Input[String] = js.native
}

object AssociationArgs {
  @scala.inline
  def apply(licenseConfigurationArn: Input[String], resourceArn: Input[String]): AssociationArgs = {
    val __obj = js.Dynamic.literal(licenseConfigurationArn = licenseConfigurationArn.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationArgs]
  }
}

