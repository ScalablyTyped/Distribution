package typings.qlik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QIsNum extends js.Object {
  var qIsNum: Boolean
  var qString: String
}

object Anon_QIsNum {
  @scala.inline
  def apply(qIsNum: Boolean, qString: String): Anon_QIsNum = {
    val __obj = js.Dynamic.literal(qIsNum = qIsNum.asInstanceOf[js.Any], qString = qString.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_QIsNum]
  }
}

