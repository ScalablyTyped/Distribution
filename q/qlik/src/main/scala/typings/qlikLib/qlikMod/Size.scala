package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var qcx: scala.Double
  var qcy: scala.Double
}

object Size {
  @scala.inline
  def apply(qcx: scala.Double, qcy: scala.Double): Size = {
    val __obj = js.Dynamic.literal(qcx = qcx, qcy = qcy)
  
    __obj.asInstanceOf[Size]
  }
}

