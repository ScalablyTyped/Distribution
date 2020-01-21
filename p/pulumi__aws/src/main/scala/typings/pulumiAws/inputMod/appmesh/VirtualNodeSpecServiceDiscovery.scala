package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecServiceDiscovery extends js.Object {
  /**
    * Specifies any AWS Cloud Map information for the virtual node.
    */
  var awsCloudMap: js.UndefOr[Input[VirtualNodeSpecServiceDiscoveryAwsCloudMap]] = js.native
  /**
    * Specifies the DNS service name for the virtual node.
    */
  var dns: js.UndefOr[Input[VirtualNodeSpecServiceDiscoveryDns]] = js.native
}

object VirtualNodeSpecServiceDiscovery {
  @scala.inline
  def apply(
    awsCloudMap: Input[VirtualNodeSpecServiceDiscoveryAwsCloudMap] = null,
    dns: Input[VirtualNodeSpecServiceDiscoveryDns] = null
  ): VirtualNodeSpecServiceDiscovery = {
    val __obj = js.Dynamic.literal()
    if (awsCloudMap != null) __obj.updateDynamic("awsCloudMap")(awsCloudMap.asInstanceOf[js.Any])
    if (dns != null) __obj.updateDynamic("dns")(dns.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecServiceDiscovery]
  }
}

