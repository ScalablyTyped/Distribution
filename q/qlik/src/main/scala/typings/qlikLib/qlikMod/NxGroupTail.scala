package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxGroupTail extends js.Object {
  var qDown: scala.Double
  var qUp: scala.Double
}

object NxGroupTail {
  @scala.inline
  def apply(qDown: scala.Double, qUp: scala.Double): NxGroupTail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qDown")(qDown)
    __obj.updateDynamic("qUp")(qUp)
    __obj.asInstanceOf[NxGroupTail]
  }
}

