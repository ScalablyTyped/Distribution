package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceIndex extends js.Object {
  var deleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined
  var deviceIndex: scala.Double
  var networkInterfaceId: java.lang.String
}

object Anon_DeleteOnTerminationDeviceIndex {
  @scala.inline
  def apply(
    deviceIndex: scala.Double,
    networkInterfaceId: java.lang.String,
    deleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DeleteOnTerminationDeviceIndex = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex, networkInterfaceId = networkInterfaceId)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceIndex]
  }
}

