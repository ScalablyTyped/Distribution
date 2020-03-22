package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsMsgString extends js.Object {
  var args: js.Array[String] | String
  var msg: String
}

object AnonArgsMsgString {
  @scala.inline
  def apply(args: js.Array[String] | String, msg: String): AnonArgsMsgString = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgsMsgString]
  }
}

