package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_VpcId extends js.Object {
  var vpcId: java.lang.String
  var vpcRegion: java.lang.String
}

object Anon_VpcId {
  @scala.inline
  def apply(vpcId: java.lang.String, vpcRegion: java.lang.String): Anon_VpcId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("vpcId")(vpcId)
    __obj.updateDynamic("vpcRegion")(vpcRegion)
    __obj.asInstanceOf[Anon_VpcId]
  }
}

