package typings.qlikDashEngineapi.EngineAPI

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
    val __obj = js.Dynamic.literal(qBadFieldNames = qBadFieldNames.asInstanceOf[js.Any], qDangerousFieldNames = qDangerousFieldNames.asInstanceOf[js.Any], qErrorMsg = qErrorMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICheckExpressionResult]
  }
}

