package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAxisData...
  */
trait INxAxisData extends js.Object {
  /**
    * List of Axis data.
    */
  var qAxis: js.Array[INxAxisTicks]
}

object INxAxisData {
  @scala.inline
  def apply(qAxis: js.Array[INxAxisTicks]): INxAxisData = {
    val __obj = js.Dynamic.literal(qAxis = qAxis)
  
    __obj.asInstanceOf[INxAxisData]
  }
}

