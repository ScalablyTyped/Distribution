package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var qcx: Double
  var qcy: Double
}

object Size {
  @scala.inline
  def apply(qcx: Double, qcy: Double): Size = {
    val __obj = js.Dynamic.literal(qcx = qcx.asInstanceOf[js.Any], qcy = qcy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Size]
  }
}

