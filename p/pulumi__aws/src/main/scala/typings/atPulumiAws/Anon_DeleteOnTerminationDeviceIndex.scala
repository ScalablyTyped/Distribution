package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceIndex extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var deviceIndex: Double
  var networkInterfaceId: String
}

object Anon_DeleteOnTerminationDeviceIndex {
  @scala.inline
  def apply(
    deviceIndex: Double,
    networkInterfaceId: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): Anon_DeleteOnTerminationDeviceIndex = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex, networkInterfaceId = networkInterfaceId)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceIndex]
  }
}

