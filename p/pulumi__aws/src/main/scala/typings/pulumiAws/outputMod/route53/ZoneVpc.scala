package typings.pulumiAws.outputMod.route53

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneVpc extends js.Object {
  /**
    * ID of the VPC to associate.
    */
  var vpcId: String = js.native
  /**
    * Region of the VPC to associate. Defaults to AWS provider region.
    */
  var vpcRegion: String = js.native
}

object ZoneVpc {
  @scala.inline
  def apply(vpcId: String, vpcRegion: String): ZoneVpc = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], vpcRegion = vpcRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneVpc]
  }
}

