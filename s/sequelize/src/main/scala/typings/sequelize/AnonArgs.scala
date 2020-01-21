package typings.sequelize

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: String | (js.Array[String | RegExp]) | RegExp
  var msg: String
}

object AnonArgs {
  @scala.inline
  def apply(args: String | (js.Array[String | RegExp]) | RegExp, msg: String): AnonArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgs]
  }
}

