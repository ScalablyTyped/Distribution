package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get the cell postion of x- and y-axis.
  */
trait INxCellPosition extends js.Object {
  /**
    * Position of the cell on the x-axis.
    */
  var qx: Double
  /**
    * Position of the cell on the y-axis.
    */
  var qy: Double
}

object INxCellPosition {
  @scala.inline
  def apply(qx: Double, qy: Double): INxCellPosition = {
    val __obj = js.Dynamic.literal(qx = qx, qy = qy)
  
    __obj.asInstanceOf[INxCellPosition]
  }
}

