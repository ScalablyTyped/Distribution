package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiFromInstanceEphemeralBlockDevice extends js.Object {
  /**
    * The path at which the device is exposed to created instances.
    */
  var deviceName: String = js.native
  /**
    * A name for the ephemeral device, of the form "ephemeralN" where
    * *N* is a volume number starting from zero.
    */
  var virtualName: String = js.native
}

object AmiFromInstanceEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: String, virtualName: String): AmiFromInstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AmiFromInstanceEphemeralBlockDevice]
  }
}

