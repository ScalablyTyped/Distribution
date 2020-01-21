package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotInstanceRequestNetworkInterface extends js.Object {
  /**
    * Whether the volume should be destroyed
    * on instance termination (Default: `true`).
    */
  var deleteOnTermination: js.UndefOr[Boolean] = js.native
  var deviceIndex: Double = js.native
  var networkInterfaceId: String = js.native
}

object SpotInstanceRequestNetworkInterface {
  @scala.inline
  def apply(
    deviceIndex: Double,
    networkInterfaceId: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): SpotInstanceRequestNetworkInterface = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequestNetworkInterface]
  }
}

