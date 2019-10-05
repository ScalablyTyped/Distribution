package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CheckNumberOrExpressionResult width extend ExpressionResult
  */
trait ICheckNumberOrExpressionResult extends IExpressionResult {
  var qErrorMsg: String
}

object ICheckNumberOrExpressionResult {
  @scala.inline
  def apply(qBadFieldNames: js.Array[INxRange], qErrorMsg: String): ICheckNumberOrExpressionResult = {
    val __obj = js.Dynamic.literal(qBadFieldNames = qBadFieldNames, qErrorMsg = qErrorMsg)
  
    __obj.asInstanceOf[ICheckNumberOrExpressionResult]
  }
}

