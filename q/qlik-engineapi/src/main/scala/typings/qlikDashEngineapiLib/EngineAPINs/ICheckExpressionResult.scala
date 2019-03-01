package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CheckExpressionResult width extend ExpressionResult
  */
trait ICheckExpressionResult extends IExpressionResult {
  var qDangerousFieldNames: js.Array[INxRange]
  var qErrorMsg: java.lang.String
}

object ICheckExpressionResult {
  @scala.inline
  def apply(
    qBadFieldNames: js.Array[INxRange],
    qDangerousFieldNames: js.Array[INxRange],
    qErrorMsg: java.lang.String
  ): ICheckExpressionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qBadFieldNames")(qBadFieldNames)
    __obj.updateDynamic("qDangerousFieldNames")(qDangerousFieldNames)
    __obj.updateDynamic("qErrorMsg")(qErrorMsg)
    __obj.asInstanceOf[ICheckExpressionResult]
  }
}

