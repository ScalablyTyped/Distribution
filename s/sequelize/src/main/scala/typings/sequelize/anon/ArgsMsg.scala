package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsMsg extends js.Object {
  var args: js.Array[js.Array[String]]
  var msg: String
}

object ArgsMsg {
  @scala.inline
  def apply(args: js.Array[js.Array[String]], msg: String): ArgsMsg = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsMsg]
  }
}

