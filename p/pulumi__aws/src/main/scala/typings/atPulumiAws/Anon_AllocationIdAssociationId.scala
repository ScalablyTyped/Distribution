package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllocationIdAssociationId extends js.Object {
  var allocationId: String
  var associationId: String
  var ipOwnerId: String
  var publicDnsName: String
  var publicIp: String
}

object Anon_AllocationIdAssociationId {
  @scala.inline
  def apply(
    allocationId: String,
    associationId: String,
    ipOwnerId: String,
    publicDnsName: String,
    publicIp: String
  ): Anon_AllocationIdAssociationId = {
    val __obj = js.Dynamic.literal(allocationId = allocationId, associationId = associationId, ipOwnerId = ipOwnerId, publicDnsName = publicDnsName, publicIp = publicIp)
  
    __obj.asInstanceOf[Anon_AllocationIdAssociationId]
  }
}

