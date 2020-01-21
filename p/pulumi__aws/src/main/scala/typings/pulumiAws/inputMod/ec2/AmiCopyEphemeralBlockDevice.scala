package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiCopyEphemeralBlockDevice extends js.Object {
  var deviceName: js.UndefOr[Input[String]] = js.native
  var virtualName: js.UndefOr[Input[String]] = js.native
}

object AmiCopyEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: Input[String] = null, virtualName: Input[String] = null): AmiCopyEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiCopyEphemeralBlockDevice]
  }
}

