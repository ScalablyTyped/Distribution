package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExpressionResult...
  */
trait IExpressionResult extends js.Object {
  var qBadFieldNames: js.Array[INxRange]
}

object IExpressionResult {
  @scala.inline
  def apply(qBadFieldNames: js.Array[INxRange]): IExpressionResult = {
    val __obj = js.Dynamic.literal(qBadFieldNames = qBadFieldNames)
  
    __obj.asInstanceOf[IExpressionResult]
  }
}

