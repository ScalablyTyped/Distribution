package typings.atPulumiAws.typesOutputMod.route53Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneVpc extends js.Object {
  /**
    * ID of the VPC to associate.
    */
  var vpcId: String
  /**
    * Region of the VPC to associate. Defaults to AWS provider region.
    */
  var vpcRegion: String
}

object ZoneVpc {
  @scala.inline
  def apply(vpcId: String, vpcRegion: String): ZoneVpc = {
    val __obj = js.Dynamic.literal(vpcId = vpcId, vpcRegion = vpcRegion)
  
    __obj.asInstanceOf[ZoneVpc]
  }
}

