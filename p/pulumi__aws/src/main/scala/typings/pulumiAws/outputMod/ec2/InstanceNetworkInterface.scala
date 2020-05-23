package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceNetworkInterface extends js.Object {
  /**
    * Whether or not to delete the network interface on instance termination. Defaults to `false`. Currently, the only valid value is `false`, as this is only supported when creating new network interfaces when launching an instance.
    */
  var deleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * The integer index of the network interface attachment. Limited by instance type.
    */
  var deviceIndex: Double = js.native
  /**
    * The ID of the network interface to attach.
    */
  var networkInterfaceId: String = js.native
}

object InstanceNetworkInterface {
  @scala.inline
  def apply(
    deviceIndex: Double,
    networkInterfaceId: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): InstanceNetworkInterface = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceNetworkInterface]
  }
}

