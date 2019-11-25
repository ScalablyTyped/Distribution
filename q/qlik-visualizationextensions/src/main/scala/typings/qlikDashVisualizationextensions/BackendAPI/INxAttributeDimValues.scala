package typings.qlikDashVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxAttributeDimValues extends js.Object {
  /**
    * List of values.
    * Array of NxSimpleDimValue
    */
  var qValues: js.Array[INxSimpleDimValue]
}

object INxAttributeDimValues {
  @scala.inline
  def apply(qValues: js.Array[INxSimpleDimValue]): INxAttributeDimValues = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxAttributeDimValues]
  }
}

