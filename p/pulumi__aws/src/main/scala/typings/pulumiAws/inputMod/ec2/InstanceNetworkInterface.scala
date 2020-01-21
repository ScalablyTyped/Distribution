package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceNetworkInterface extends js.Object {
  /**
    * Whether the volume should be destroyed
    * on instance termination (Default: `true`).
    */
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.native
  var deviceIndex: Input[Double] = js.native
  var networkInterfaceId: Input[String] = js.native
}

object InstanceNetworkInterface {
  @scala.inline
  def apply(
    deviceIndex: Input[Double],
    networkInterfaceId: Input[String],
    deleteOnTermination: Input[Boolean] = null
  ): InstanceNetworkInterface = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceNetworkInterface]
  }
}

