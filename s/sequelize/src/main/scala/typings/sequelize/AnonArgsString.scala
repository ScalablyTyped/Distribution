package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsString extends js.Object {
  var args: String
  var msg: String
}

object AnonArgsString {
  @scala.inline
  def apply(args: String, msg: String): AnonArgsString = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgsString]
  }
}

