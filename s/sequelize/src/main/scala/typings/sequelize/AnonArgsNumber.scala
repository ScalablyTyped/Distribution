package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsNumber extends js.Object {
  var args: Double
  var msg: String
}

object AnonArgsNumber {
  @scala.inline
  def apply(args: Double, msg: String): AnonArgsNumber = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgsNumber]
  }
}

