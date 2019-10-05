package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxRange...
  */
trait INxRange extends js.Object {
  /**
    * Position in the expression of the first character of the field name.
    */
  var qCount: Double
  /**
    * Number of characters in the field name.
    */
  var qFrom: Double
}

object INxRange {
  @scala.inline
  def apply(qCount: Double, qFrom: Double): INxRange = {
    val __obj = js.Dynamic.literal(qCount = qCount, qFrom = qFrom)
  
    __obj.asInstanceOf[INxRange]
  }
}

