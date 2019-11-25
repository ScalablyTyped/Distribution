package typings.qlikDashEngineapi.EngineAPI

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
  var qExpr: String
}

object INxListObjectExpression {
  @scala.inline
  def apply(qExpr: String, qError: INxLayoutErrors = null): INxListObjectExpression = {
    val __obj = js.Dynamic.literal(qExpr = qExpr.asInstanceOf[js.Any])
    if (qError != null) __obj.updateDynamic("qError")(qError.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxListObjectExpression]
  }
}

