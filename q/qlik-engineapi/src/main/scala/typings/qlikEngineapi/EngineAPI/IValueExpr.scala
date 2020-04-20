package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ValueExpression... Where <expression> is a string.
  */
trait IValueExpr extends js.Object {
  var qv: String
}

object IValueExpr {
  @scala.inline
  def apply(qv: String): IValueExpr = {
    val __obj = js.Dynamic.literal(qv = qv.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueExpr]
  }
}

