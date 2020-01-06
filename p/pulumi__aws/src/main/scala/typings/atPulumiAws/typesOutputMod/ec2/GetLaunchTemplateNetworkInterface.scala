package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateNetworkInterface extends js.Object {
  var associatePublicIpAddress: Boolean = js.native
  var deleteOnTermination: Boolean = js.native
  /**
    * Description of the launch template.
    */
  var description: String = js.native
  var deviceIndex: Double = js.native
  var ipv4AddressCount: Double = js.native
  var ipv4Addresses: js.Array[String] = js.native
  var ipv6AddressCount: Double = js.native
  var ipv6Addresses: js.Array[String] = js.native
  var networkInterfaceId: String = js.native
  var privateIpAddress: String = js.native
  var securityGroups: js.Array[String] = js.native
  var subnetId: String = js.native
}

object GetLaunchTemplateNetworkInterface {
  @scala.inline
  def apply(
    associatePublicIpAddress: Boolean,
    deleteOnTermination: Boolean,
    description: String,
    deviceIndex: Double,
    ipv4AddressCount: Double,
    ipv4Addresses: js.Array[String],
    ipv6AddressCount: Double,
    ipv6Addresses: js.Array[String],
    networkInterfaceId: String,
    privateIpAddress: String,
    securityGroups: js.Array[String],
    subnetId: String
  ): GetLaunchTemplateNetworkInterface = {
    val __obj = js.Dynamic.literal(associatePublicIpAddress = associatePublicIpAddress.asInstanceOf[js.Any], deleteOnTermination = deleteOnTermination.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], deviceIndex = deviceIndex.asInstanceOf[js.Any], ipv4AddressCount = ipv4AddressCount.asInstanceOf[js.Any], ipv4Addresses = ipv4Addresses.asInstanceOf[js.Any], ipv6AddressCount = ipv6AddressCount.asInstanceOf[js.Any], ipv6Addresses = ipv6Addresses.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], privateIpAddress = privateIpAddress.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLaunchTemplateNetworkInterface]
  }
}

