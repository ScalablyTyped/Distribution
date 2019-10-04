package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceNetworkInterface extends js.Object {
  /**
    * Whether the volume should be destroyed
    * on instance termination (Default: `true`).
    */
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var deviceIndex: Double
  var networkInterfaceId: String
}

object InstanceNetworkInterface {
  @scala.inline
  def apply(
    deviceIndex: Double,
    networkInterfaceId: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): InstanceNetworkInterface = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex, networkInterfaceId = networkInterfaceId)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[InstanceNetworkInterface]
  }
}

