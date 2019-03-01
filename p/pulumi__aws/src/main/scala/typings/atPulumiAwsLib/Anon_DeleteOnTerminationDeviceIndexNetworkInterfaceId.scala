package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceIndexNetworkInterfaceId extends js.Object {
  var deleteOnTermination: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var deviceIndex: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var networkInterfaceId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_DeleteOnTerminationDeviceIndexNetworkInterfaceId {
  @scala.inline
  def apply(
    deviceIndex: atPulumiPulumiLib.outputMod.Input[scala.Double],
    networkInterfaceId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    deleteOnTermination: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_DeleteOnTerminationDeviceIndexNetworkInterfaceId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceIndex")(deviceIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceIndexNetworkInterfaceId]
  }
}

