package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxSimpleValue extends js.Object {
  var qNum: scala.Double
  var qText: java.lang.String
}

object NxSimpleValue {
  @scala.inline
  def apply(qNum: scala.Double, qText: java.lang.String): NxSimpleValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qNum")(qNum)
    __obj.updateDynamic("qText")(qText)
    __obj.asInstanceOf[NxSimpleValue]
  }
}

