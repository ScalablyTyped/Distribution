package typings.qlikEngineapi.EngineAPI

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
    val __obj = js.Dynamic.literal(qBadFieldNames = qBadFieldNames.asInstanceOf[js.Any], qErrorMsg = qErrorMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICheckNumberOrExpressionResult]
  }
}

