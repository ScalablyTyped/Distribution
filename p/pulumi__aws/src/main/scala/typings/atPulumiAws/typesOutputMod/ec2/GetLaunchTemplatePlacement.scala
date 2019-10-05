package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchTemplatePlacement extends js.Object {
  var affinity: String
  var availabilityZone: String
  var groupName: String
  var hostId: String
  var spreadDomain: String
  var tenancy: String
}

object GetLaunchTemplatePlacement {
  @scala.inline
  def apply(
    affinity: String,
    availabilityZone: String,
    groupName: String,
    hostId: String,
    spreadDomain: String,
    tenancy: String
  ): GetLaunchTemplatePlacement = {
    val __obj = js.Dynamic.literal(affinity = affinity, availabilityZone = availabilityZone, groupName = groupName, hostId = hostId, spreadDomain = spreadDomain, tenancy = tenancy)
  
    __obj.asInstanceOf[GetLaunchTemplatePlacement]
  }
}

