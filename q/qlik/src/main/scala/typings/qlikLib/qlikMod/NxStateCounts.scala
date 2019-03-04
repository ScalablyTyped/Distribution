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
    val __obj = js.Dynamic.literal(qAlternative = qAlternative, qDeselected = qDeselected, qExcluded = qExcluded, qLocked = qLocked, qLockedExcluded = qLockedExcluded, qOption = qOption, qSelected = qSelected, qSelectedExcluded = qSelectedExcluded)
  
    __obj.asInstanceOf[NxStateCounts]
  }
}

