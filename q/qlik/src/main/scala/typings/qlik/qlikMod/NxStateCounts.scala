package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxStateCounts extends js.Object {
  var qAlternative: Double
  var qDeselected: Double
  var qExcluded: Double
  var qLocked: Double
  var qLockedExcluded: Double
  var qOption: Double
  var qSelected: Double
  var qSelectedExcluded: Double
}

object NxStateCounts {
  @scala.inline
  def apply(
    qAlternative: Double,
    qDeselected: Double,
    qExcluded: Double,
    qLocked: Double,
    qLockedExcluded: Double,
    qOption: Double,
    qSelected: Double,
    qSelectedExcluded: Double
  ): NxStateCounts = {
    val __obj = js.Dynamic.literal(qAlternative = qAlternative, qDeselected = qDeselected, qExcluded = qExcluded, qLocked = qLocked, qLockedExcluded = qLockedExcluded, qOption = qOption, qSelected = qSelected, qSelectedExcluded = qSelectedExcluded)
  
    __obj.asInstanceOf[NxStateCounts]
  }
}

