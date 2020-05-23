package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsMsgString extends js.Object {
  var args: js.Array[String] | String
  var msg: String
}

object ArgsMsgString {
  @scala.inline
  def apply(args: js.Array[String] | String, msg: String): ArgsMsgString = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsMsgString]
  }
}

