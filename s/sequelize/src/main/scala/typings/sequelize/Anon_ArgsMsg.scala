package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsMsg extends js.Object {
  var args: js.Array[js.Array[String]]
  var msg: String
}

object Anon_ArgsMsg {
  @scala.inline
  def apply(args: js.Array[js.Array[String]], msg: String): Anon_ArgsMsg = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArgsMsg]
  }
}

