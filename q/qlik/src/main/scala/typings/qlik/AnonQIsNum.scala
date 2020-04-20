package typings.qlik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQIsNum extends js.Object {
  var qIsNum: Boolean
  var qString: String
}

object AnonQIsNum {
  @scala.inline
  def apply(qIsNum: Boolean, qString: String): AnonQIsNum = {
    val __obj = js.Dynamic.literal(qIsNum = qIsNum.asInstanceOf[js.Any], qString = qString.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQIsNum]
  }
}

