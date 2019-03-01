package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_State extends js.Object {
  var state: java.lang.String
  var vpcId: java.lang.String
}

object Anon_State {
  @scala.inline
  def apply(state: java.lang.String, vpcId: java.lang.String): Anon_State = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[Anon_State]
  }
}

