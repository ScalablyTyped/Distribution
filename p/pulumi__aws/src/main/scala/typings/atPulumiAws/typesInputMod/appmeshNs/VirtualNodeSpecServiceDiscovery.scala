package typings.atPulumiAws.typesInputMod.appmeshNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpecServiceDiscovery extends js.Object {
  /**
    * Specifies any AWS Cloud Map information for the virtual node.
    */
  var awsCloudMap: js.UndefOr[Input[VirtualNodeSpecServiceDiscoveryAwsCloudMap]] = js.undefined
  /**
    * Specifies the DNS service name for the virtual node.
    */
  var dns: js.UndefOr[Input[VirtualNodeSpecServiceDiscoveryDns]] = js.undefined
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

