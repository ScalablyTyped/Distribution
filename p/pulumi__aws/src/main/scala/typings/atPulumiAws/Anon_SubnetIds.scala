package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SubnetIds extends js.Object {
  var subnetIds: js.Array[String]
  var vpcId: String
}

object Anon_SubnetIds {
  @scala.inline
  def apply(subnetIds: js.Array[String], vpcId: String): Anon_SubnetIds = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[Anon_SubnetIds]
  }
}

