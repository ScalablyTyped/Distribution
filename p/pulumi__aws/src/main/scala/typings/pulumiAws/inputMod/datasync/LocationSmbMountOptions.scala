package typings.pulumiAws.inputMod.datasync

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationSmbMountOptions extends js.Object {
  /**
    * The specific SMB version that you want DataSync to use for mounting your SMB share. Valid values: `AUTOMATIC`, `SMB2`, and `SMB3`. Default: `AUTOMATIC`
    */
  var version: js.UndefOr[Input[String]] = js.native
}

object LocationSmbMountOptions {
  @scala.inline
  def apply(version: Input[String] = null): LocationSmbMountOptions = {
    val __obj = js.Dynamic.literal()
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationSmbMountOptions]
  }
}

