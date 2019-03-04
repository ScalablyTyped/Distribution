package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SubnetIds extends js.Object {
  var subnetIds: js.Array[java.lang.String]
  var vpcId: java.lang.String
}

object Anon_SubnetIds {
  @scala.inline
  def apply(subnetIds: js.Array[java.lang.String], vpcId: java.lang.String): Anon_SubnetIds = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[Anon_SubnetIds]
  }
}

