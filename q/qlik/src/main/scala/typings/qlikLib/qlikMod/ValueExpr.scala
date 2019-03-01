package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueExpr extends js.Object {
  var qv: java.lang.String
}

object ValueExpr {
  @scala.inline
  def apply(qv: java.lang.String): ValueExpr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qv")(qv)
    __obj.asInstanceOf[ValueExpr]
  }
}

