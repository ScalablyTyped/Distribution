package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get the cell postion of x- and y-axis.
  */
@js.native
trait INxCellPosition extends js.Object {
  /**
    * Position of the cell on the x-axis.
    */
  var qx: Double = js.native
  /**
    * Position of the cell on the y-axis.
    */
  var qy: Double = js.native
}

object INxCellPosition {
  @scala.inline
  def apply(qx: Double, qy: Double): INxCellPosition = {
    val __obj = js.Dynamic.literal(qx = qx.asInstanceOf[js.Any], qy = qy.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxCellPosition]
  }
  @scala.inline
  implicit class INxCellPositionOps[Self <: INxCellPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQx(value: Double): Self = this.set("qx", value.asInstanceOf[js.Any])
    @scala.inline
    def setQy(value: Double): Self = this.set("qy", value.asInstanceOf[js.Any])
  }
  
}

