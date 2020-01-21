package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsMsgArray extends js.Object {
  var args: js.Array[String] | String
  var msg: String
}

object AnonArgsMsgArray {
  @scala.inline
  def apply(args: js.Array[String] | String, msg: String): AnonArgsMsgArray = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgsMsgArray]
  }
}

