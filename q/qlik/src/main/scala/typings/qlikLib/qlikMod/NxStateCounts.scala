package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxStateCounts extends js.Object {
  var qAlternative: scala.Double
  var qDeselected: scala.Double
  var qExcluded: scala.Double
  var qLocked: scala.Double
  var qLockedExcluded: scala.Double
  var qOption: scala.Double
  var qSelected: scala.Double
  var qSelectedExcluded: scala.Double
}

object NxStateCounts {
  @scala.inline
  def apply(
    qAlternative: scala.Double,
    qDeselected: scala.Double,
    qExcluded: scala.Double,
    qLocked: scala.Double,
    qLockedExcluded: scala.Double,
    qOption: scala.Double,
    qSelected: scala.Double,
    qSelectedExcluded: scala.Double
  ): NxStateCounts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qAlternative")(qAlternative)
    __obj.updateDynamic("qDeselected")(qDeselected)
    __obj.updateDynamic("qExcluded")(qExcluded)
    __obj.updateDynamic("qLocked")(qLocked)
    __obj.updateDynamic("qLockedExcluded")(qLockedExcluded)
    __obj.updateDynamic("qOption")(qOption)
    __obj.updateDynamic("qSelected")(qSelected)
    __obj.updateDynamic("qSelectedExcluded")(qSelectedExcluded)
    __obj.asInstanceOf[NxStateCounts]
  }
}

