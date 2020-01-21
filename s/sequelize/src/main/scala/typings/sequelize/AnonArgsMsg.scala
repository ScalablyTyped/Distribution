package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsMsg extends js.Object {
  var args: js.Array[js.Array[String]]
  var msg: String
}

object AnonArgsMsg {
  @scala.inline
  def apply(args: js.Array[js.Array[String]], msg: String): AnonArgsMsg = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgsMsg]
  }
}

