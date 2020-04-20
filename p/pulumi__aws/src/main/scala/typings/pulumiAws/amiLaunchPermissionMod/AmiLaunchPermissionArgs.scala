package typings.pulumiAws.amiLaunchPermissionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiLaunchPermissionArgs extends js.Object {
  /**
    * An AWS Account ID to add launch permissions.
    */
  val accountId: Input[String] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val imageId: Input[String] = js.native
}

object AmiLaunchPermissionArgs {
  @scala.inline
  def apply(accountId: Input[String], imageId: Input[String]): AmiLaunchPermissionArgs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiLaunchPermissionArgs]
  }
}

