package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsMsgNumber extends js.Object {
  var args: js.Tuple2[Double, Double]
  var msg: String
}

object AnonArgsMsgNumber {
  @scala.inline
  def apply(args: js.Tuple2[Double, Double], msg: String): AnonArgsMsgNumber = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgsMsgNumber]
  }
}

