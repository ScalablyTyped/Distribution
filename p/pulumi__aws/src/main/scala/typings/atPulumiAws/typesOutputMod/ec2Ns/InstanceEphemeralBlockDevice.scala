package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceEphemeralBlockDevice extends js.Object {
  /**
    * The name of the block device to mount on the instance.
    */
  var deviceName: String
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var noDevice: js.UndefOr[Boolean] = js.undefined
  /**
    * The [Instance Store Device
    * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
    * (e.g. `"ephemeral0"`).
    */
  var virtualName: js.UndefOr[String] = js.undefined
}

object InstanceEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: String, noDevice: js.UndefOr[Boolean] = js.undefined, virtualName: String = null): InstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName)
    if (!js.isUndefined(noDevice)) __obj.updateDynamic("noDevice")(noDevice)
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName)
    __obj.asInstanceOf[InstanceEphemeralBlockDevice]
  }
}

