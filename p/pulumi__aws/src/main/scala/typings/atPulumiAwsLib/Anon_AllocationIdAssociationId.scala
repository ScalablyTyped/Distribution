package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllocationIdAssociationId extends js.Object {
  var allocationId: java.lang.String
  var associationId: java.lang.String
  var ipOwnerId: java.lang.String
  var publicDnsName: java.lang.String
  var publicIp: java.lang.String
}

object Anon_AllocationIdAssociationId {
  @scala.inline
  def apply(
    allocationId: java.lang.String,
    associationId: java.lang.String,
    ipOwnerId: java.lang.String,
    publicDnsName: java.lang.String,
    publicIp: java.lang.String
  ): Anon_AllocationIdAssociationId = {
    val __obj = js.Dynamic.literal(allocationId = allocationId, associationId = associationId, ipOwnerId = ipOwnerId, publicDnsName = publicDnsName, publicIp = publicIp)
  
    __obj.asInstanceOf[Anon_AllocationIdAssociationId]
  }
}

