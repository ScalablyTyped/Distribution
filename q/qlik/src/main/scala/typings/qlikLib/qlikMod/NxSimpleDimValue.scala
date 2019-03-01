package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxSimpleDimValue extends js.Object {
  var qElemNo: scala.Double
  var qText: java.lang.String
}

object NxSimpleDimValue {
  @scala.inline
  def apply(qElemNo: scala.Double, qText: java.lang.String): NxSimpleDimValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qElemNo")(qElemNo)
    __obj.updateDynamic("qText")(qText)
    __obj.asInstanceOf[NxSimpleDimValue]
  }
}

