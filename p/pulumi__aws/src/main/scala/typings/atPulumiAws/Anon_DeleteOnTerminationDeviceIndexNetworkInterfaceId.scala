package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceIndexNetworkInterfaceId extends js.Object {
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.undefined
  var deviceIndex: Input[Double]
  var networkInterfaceId: Input[String]
}

object Anon_DeleteOnTerminationDeviceIndexNetworkInterfaceId {
  @scala.inline
  def apply(
    deviceIndex: Input[Double],
    networkInterfaceId: Input[String],
    deleteOnTermination: Input[Boolean] = null
  ): Anon_DeleteOnTerminationDeviceIndexNetworkInterfaceId = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceIndexNetworkInterfaceId]
  }
}

