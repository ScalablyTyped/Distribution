package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qx: scala.Double
  /**
    * Position of the cell on the y-axis.
    */
  var qy: scala.Double
}

object INxCellPosition {
  @scala.inline
  def apply(qx: scala.Double, qy: scala.Double): INxCellPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qx")(qx)
    __obj.updateDynamic("qy")(qy)
    __obj.asInstanceOf[INxCellPosition]
  }
}

