package typings.atPulumiAws.ec2AmiLaunchPermissionMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmiLaunchPermissionArgs extends js.Object {
  /**
    * An AWS Account ID to add launch permissions.
    */
  val accountId: Input[String]
  /**
    * A region-unique name for the AMI.
    */
  val imageId: Input[String]
}

object AmiLaunchPermissionArgs {
  @scala.inline
  def apply(accountId: Input[String], imageId: Input[String]): AmiLaunchPermissionArgs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AmiLaunchPermissionArgs]
  }
}

