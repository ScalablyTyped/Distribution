package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxCellPosition extends js.Object {
  var qx: Double
  var qy: Double
}

object NxCellPosition {
  @scala.inline
  def apply(qx: Double, qy: Double): NxCellPosition = {
    val __obj = js.Dynamic.literal(qx = qx.asInstanceOf[js.Any], qy = qy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NxCellPosition]
  }
}

