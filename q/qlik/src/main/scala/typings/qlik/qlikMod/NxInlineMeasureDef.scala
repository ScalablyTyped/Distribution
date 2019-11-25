package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxInlineMeasureDef extends js.Object {
  var qcx: Double
  var qcy: Double
}

object NxInlineMeasureDef {
  @scala.inline
  def apply(qcx: Double, qcy: Double): NxInlineMeasureDef = {
    val __obj = js.Dynamic.literal(qcx = qcx.asInstanceOf[js.Any], qcy = qcy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NxInlineMeasureDef]
  }
}

