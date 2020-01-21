package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplatePlacement extends js.Object {
  var affinity: String = js.native
  var availabilityZone: String = js.native
  var groupName: String = js.native
  var hostId: String = js.native
  var spreadDomain: String = js.native
  var tenancy: String = js.native
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
    val __obj = js.Dynamic.literal(affinity = affinity.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], hostId = hostId.asInstanceOf[js.Any], spreadDomain = spreadDomain.asInstanceOf[js.Any], tenancy = tenancy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLaunchTemplatePlacement]
  }
}

