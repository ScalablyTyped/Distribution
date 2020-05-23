package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Msg extends js.Object {
  var msg: String
  var response: Body
}

object Msg {
  @scala.inline
  def apply(msg: String, response: Body): Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
}

