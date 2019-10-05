package typings.qlikDashVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxAttributeExpressionValues extends js.Object {
  /**
    * List of attribute expressions values.
    * Array of NxSimpleValue
    */
  var qValues: js.Array[INxSimpleValue]
}

object INxAttributeExpressionValues {
  @scala.inline
  def apply(qValues: js.Array[INxSimpleValue]): INxAttributeExpressionValues = {
    val __obj = js.Dynamic.literal(qValues = qValues)
  
    __obj.asInstanceOf[INxAttributeExpressionValues]
  }
}

