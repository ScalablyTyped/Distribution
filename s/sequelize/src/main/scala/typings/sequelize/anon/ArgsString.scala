package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsString extends js.Object {
  var args: String
  var msg: String
}

object ArgsString {
  @scala.inline
  def apply(args: String, msg: String): ArgsString = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsString]
  }
}

