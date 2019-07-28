package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueExpr extends js.Object {
  var qv: String
}

object ValueExpr {
  @scala.inline
  def apply(qv: String): ValueExpr = {
    val __obj = js.Dynamic.literal(qv = qv)
  
    __obj.asInstanceOf[ValueExpr]
  }
}

