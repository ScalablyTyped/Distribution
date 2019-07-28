package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAttributeDimValues...
  */
trait INxAttributeDimValues extends js.Object {
  /**
    * List of values.
    */
  var qValues: js.Array[INxSimpleDimValue]
}

object INxAttributeDimValues {
  @scala.inline
  def apply(qValues: js.Array[INxSimpleDimValue]): INxAttributeDimValues = {
    val __obj = js.Dynamic.literal(qValues = qValues)
  
    __obj.asInstanceOf[INxAttributeDimValues]
  }
}

