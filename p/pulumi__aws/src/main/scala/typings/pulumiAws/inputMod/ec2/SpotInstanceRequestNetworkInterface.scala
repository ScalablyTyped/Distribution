package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotInstanceRequestNetworkInterface extends js.Object {
  /**
    * Whether or not to delete the network interface on instance termination. Defaults to `false`. Currently, the only valid value is `false`, as this is only supported when creating new network interfaces when launching an instance.
    */
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The integer index of the network interface attachment. Limited by instance type.
    */
  var deviceIndex: Input[Double] = js.native
  /**
    * The ID of the network interface to attach.
    */
  var networkInterfaceId: Input[String] = js.native
}

object SpotInstanceRequestNetworkInterface {
  @scala.inline
  def apply(
    deviceIndex: Input[Double],
    networkInterfaceId: Input[String],
    deleteOnTermination: Input[Boolean] = null
  ): SpotInstanceRequestNetworkInterface = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequestNetworkInterface]
  }
}

