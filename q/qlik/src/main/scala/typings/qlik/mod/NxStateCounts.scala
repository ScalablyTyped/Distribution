package typings.qlik.mod

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
    val __obj = js.Dynamic.literal(qAlternative = qAlternative.asInstanceOf[js.Any], qDeselected = qDeselected.asInstanceOf[js.Any], qExcluded = qExcluded.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qLockedExcluded = qLockedExcluded.asInstanceOf[js.Any], qOption = qOption.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectedExcluded = qSelectedExcluded.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxStateCounts]
  }
}

