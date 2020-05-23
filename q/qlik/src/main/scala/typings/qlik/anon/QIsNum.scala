package typings.qlik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QIsNum extends js.Object {
  var qIsNum: Boolean
  var qString: String
}

object QIsNum {
  @scala.inline
  def apply(qIsNum: Boolean, qString: String): QIsNum = {
    val __obj = js.Dynamic.literal(qIsNum = qIsNum.asInstanceOf[js.Any], qString = qString.asInstanceOf[js.Any])
    __obj.asInstanceOf[QIsNum]
  }
}

