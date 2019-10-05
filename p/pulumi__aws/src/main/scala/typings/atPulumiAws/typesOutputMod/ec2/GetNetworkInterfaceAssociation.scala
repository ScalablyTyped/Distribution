package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkInterfaceAssociation extends js.Object {
  /**
    * The allocation ID.
    */
  var allocationId: String
  /**
    * The association ID.
    */
  var associationId: String
  /**
    * The ID of the Elastic IP address owner.
    */
  var ipOwnerId: String
  /**
    * The public DNS name.
    */
  var publicDnsName: String
  /**
    * The address of the Elastic IP address bound to the network interface.
    */
  var publicIp: String
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
    val __obj = js.Dynamic.literal(allocationId = allocationId, associationId = associationId, ipOwnerId = ipOwnerId, publicDnsName = publicDnsName, publicIp = publicIp)
  
    __obj.asInstanceOf[GetNetworkInterfaceAssociation]
  }
}

