package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxListObjectExpression...
  */
trait INxListObjectExpression extends js.Object {
  /**
    * Gives information on the error.
    * >> This parameter is optional.
    */
  var qError: js.UndefOr[INxLayoutErrors] = js.undefined
  /**
    * Value of the expression.
    */
  var qExpr: java.lang.String
}

object INxListObjectExpression {
  @scala.inline
  def apply(qExpr: java.lang.String, qError: INxLayoutErrors = null): INxListObjectExpression = {
    val __obj = js.Dynamic.literal(qExpr = qExpr)
    if (qError != null) __obj.updateDynamic("qError")(qError)
    __obj.asInstanceOf[INxListObjectExpression]
  }
}

