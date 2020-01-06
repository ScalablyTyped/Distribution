package typings.atPulumiAws.typesInputMod.ec2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiFromInstanceEphemeralBlockDevice extends js.Object {
  var deviceName: js.UndefOr[Input[String]] = js.native
  var virtualName: js.UndefOr[Input[String]] = js.native
}

object AmiFromInstanceEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: Input[String] = null, virtualName: Input[String] = null): AmiFromInstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiFromInstanceEphemeralBlockDevice]
  }
}

