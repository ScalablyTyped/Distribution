package typings
package qlikDashEngineapiLib.EngineAPINs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qBadFieldNames")(qBadFieldNames)
    __obj.asInstanceOf[IExpressionResult]
  }
}

