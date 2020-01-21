package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkInterfaceAssociation extends js.Object {
  /**
    * The allocation ID.
    */
  var allocationId: String = js.native
  /**
    * The association ID.
    */
  var associationId: String = js.native
  /**
    * The ID of the Elastic IP address owner.
    */
  var ipOwnerId: String = js.native
  /**
    * The public DNS name.
    */
  var publicDnsName: String = js.native
  /**
    * The address of the Elastic IP address bound to the network interface.
    */
  var publicIp: String = js.native
}

object GetNetworkInterfaceAssociation {
  @scala.inline
  def apply(
    allocationId: String,
    associationId: String,
    ipOwnerId: String,
    publicDnsName: String,
    publicIp: String
  ): GetNetworkInterfaceAssociation = {
    val __obj = js.Dynamic.literal(allocationId = allocationId.asInstanceOf[js.Any], associationId = associationId.asInstanceOf[js.Any], ipOwnerId = ipOwnerId.asInstanceOf[js.Any], publicDnsName = publicDnsName.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetNetworkInterfaceAssociation]
  }
}

