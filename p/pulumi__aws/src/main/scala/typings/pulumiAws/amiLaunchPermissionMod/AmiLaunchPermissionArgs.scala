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
  @scala.inline
  implicit class AmiLaunchPermissionArgsOps[Self <: AmiLaunchPermissionArgs] (val x: Self) extends AnyVal {
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
    def setAccountId(value: Input[String]): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageId(value: Input[String]): Self = this.set("imageId", value.asInstanceOf[js.Any])
  }
  
}

