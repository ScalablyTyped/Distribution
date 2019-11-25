package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Msg extends js.Object {
  var msg: String
  var name: String
}

object Anon_Msg {
  @scala.inline
  def apply(msg: String, name: String): Anon_Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Msg]
  }
}

