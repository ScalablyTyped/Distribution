package typings
package atPulumiAwsLib.ec2AmiLaunchPermissionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmiLaunchPermissionState extends js.Object {
  /**
    * An AWS Account ID to add launch permissions.
    */
  val accountId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A region-unique name for the AMI.
    */
  val imageId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object AmiLaunchPermissionState {
  @scala.inline
  def apply(
    accountId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    imageId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): AmiLaunchPermissionState = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (imageId != null) __obj.updateDynamic("imageId")(imageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiLaunchPermissionState]
  }
}

