package typings
package qlikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QIsNum extends js.Object {
  var qIsNum: scala.Boolean
  var qString: java.lang.String
}

object Anon_QIsNum {
  @scala.inline
  def apply(qIsNum: scala.Boolean, qString: java.lang.String): Anon_QIsNum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qIsNum")(qIsNum)
    __obj.updateDynamic("qString")(qString)
    __obj.asInstanceOf[Anon_QIsNum]
  }
}

