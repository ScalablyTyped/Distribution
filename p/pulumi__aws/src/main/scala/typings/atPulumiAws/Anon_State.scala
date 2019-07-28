package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_State extends js.Object {
  var state: String
  var vpcId: String
}

object Anon_State {
  @scala.inline
  def apply(state: String, vpcId: String): Anon_State = {
    val __obj = js.Dynamic.literal(state = state, vpcId = vpcId)
  
    __obj.asInstanceOf[Anon_State]
  }
}

