package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Affinity extends js.Object {
  var affinity: java.lang.String
  var availabilityZone: java.lang.String
  var groupName: java.lang.String
  var hostId: java.lang.String
  var spreadDomain: java.lang.String
  var tenancy: java.lang.String
}

object Anon_Affinity {
  @scala.inline
  def apply(
    affinity: java.lang.String,
    availabilityZone: java.lang.String,
    groupName: java.lang.String,
    hostId: java.lang.String,
    spreadDomain: java.lang.String,
    tenancy: java.lang.String
  ): Anon_Affinity = {
    val __obj = js.Dynamic.literal(affinity = affinity, availabilityZone = availabilityZone, groupName = groupName, hostId = hostId, spreadDomain = spreadDomain, tenancy = tenancy)
  
    __obj.asInstanceOf[Anon_Affinity]
  }
}

