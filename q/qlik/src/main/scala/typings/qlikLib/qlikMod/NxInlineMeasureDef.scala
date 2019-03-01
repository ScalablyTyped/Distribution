package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxInlineMeasureDef extends js.Object {
  var qcx: scala.Double
  var qcy: scala.Double
}

object NxInlineMeasureDef {
  @scala.inline
  def apply(qcx: scala.Double, qcy: scala.Double): NxInlineMeasureDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qcx")(qcx)
    __obj.updateDynamic("qcy")(qcy)
    __obj.asInstanceOf[NxInlineMeasureDef]
  }
}

