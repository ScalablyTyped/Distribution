package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Msg extends js.Object {
  var msg: String
  var response: Anon_Body
}

object Anon_Msg {
  @scala.inline
  def apply(msg: String, response: Anon_Body): Anon_Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Msg]
  }
}

