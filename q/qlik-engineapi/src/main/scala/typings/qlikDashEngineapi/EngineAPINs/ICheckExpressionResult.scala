package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CheckExpressionResult width extend ExpressionResult
  */
trait ICheckExpressionResult extends IExpressionResult {
  var qDangerousFieldNames: js.Array[INxRange]
  var qErrorMsg: String
}

object ICheckExpressionResult {
  @scala.inline
  def apply(qBadFieldNames: js.Array[INxRange], qDangerousFieldNames: js.Array[INxRange], qErrorMsg: String): ICheckExpressionResult = {
    val __obj = js.Dynamic.literal(qBadFieldNames = qBadFieldNames, qDangerousFieldNames = qDangerousFieldNames, qErrorMsg = qErrorMsg)
  
    __obj.asInstanceOf[ICheckExpressionResult]
  }
}

