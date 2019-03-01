package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ValueExpression... Where <expression> is a string.
  */
trait IValueExpr extends js.Object {
  var qv: java.lang.String
}

object IValueExpr {
  @scala.inline
  def apply(qv: java.lang.String): IValueExpr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qv")(qv)
    __obj.asInstanceOf[IValueExpr]
  }
}

