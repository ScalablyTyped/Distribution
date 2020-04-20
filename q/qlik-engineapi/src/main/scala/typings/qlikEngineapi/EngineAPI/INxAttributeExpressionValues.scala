package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAttributeExpressionValues...
  */
trait INxAttributeExpressionValues extends js.Object {
  /**
    * List of attribute expressions values.
    */
  var qValues: js.Array[INxSimpleValue]
}

object INxAttributeExpressionValues {
  @scala.inline
  def apply(qValues: js.Array[INxSimpleValue]): INxAttributeExpressionValues = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttributeExpressionValues]
  }
}

