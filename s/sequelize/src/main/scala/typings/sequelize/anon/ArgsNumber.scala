package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsNumber extends js.Object {
  var args: Double
  var msg: String
}

object ArgsNumber {
  @scala.inline
  def apply(args: Double, msg: String): ArgsNumber = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsNumber]
  }
}

