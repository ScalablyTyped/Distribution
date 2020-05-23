package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsBoolean extends js.Object {
  var args: Boolean
  var msg: String
}

object ArgsBoolean {
  @scala.inline
  def apply(args: Boolean, msg: String): ArgsBoolean = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsBoolean]
  }
}

