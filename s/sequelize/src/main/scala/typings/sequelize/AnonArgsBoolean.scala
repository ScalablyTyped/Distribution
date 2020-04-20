package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsBoolean extends js.Object {
  var args: Boolean
  var msg: String
}

object AnonArgsBoolean {
  @scala.inline
  def apply(args: Boolean, msg: String): AnonArgsBoolean = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgsBoolean]
  }
}

