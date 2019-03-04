package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxCellPosition extends js.Object {
  var qx: scala.Double
  var qy: scala.Double
}

object NxCellPosition {
  @scala.inline
  def apply(qx: scala.Double, qy: scala.Double): NxCellPosition = {
    val __obj = js.Dynamic.literal(qx = qx, qy = qy)
  
    __obj.asInstanceOf[NxCellPosition]
  }
}

