package typings.atPulumiAws.typesInputMod.dax

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterNode extends js.Object {
  var address: js.UndefOr[Input[String]] = js.native
  var availabilityZone: js.UndefOr[Input[String]] = js.native
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * The port used by the configuration endpoint
    */
  var port: js.UndefOr[Input[Double]] = js.native
}

object ClusterNode {
  @scala.inline
  def apply(
    address: Input[String] = null,
    availabilityZone: Input[String] = null,
    id: Input[String] = null,
    port: Input[Double] = null
  ): ClusterNode = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterNode]
  }
}

