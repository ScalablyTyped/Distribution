package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxStateCounts extends js.Object {
  var qAlternative: Double = js.native
  var qDeselected: Double = js.native
  var qExcluded: Double = js.native
  var qLocked: Double = js.native
  var qLockedExcluded: Double = js.native
  var qOption: Double = js.native
  var qSelected: Double = js.native
  var qSelectedExcluded: Double = js.native
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
  @scala.inline
  implicit class NxStateCountsOps[Self <: NxStateCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQAlternative(value: Double): Self = this.set("qAlternative", value.asInstanceOf[js.Any])
    @scala.inline
    def setQDeselected(value: Double): Self = this.set("qDeselected", value.asInstanceOf[js.Any])
    @scala.inline
    def setQExcluded(value: Double): Self = this.set("qExcluded", value.asInstanceOf[js.Any])
    @scala.inline
    def setQLocked(value: Double): Self = this.set("qLocked", value.asInstanceOf[js.Any])
    @scala.inline
    def setQLockedExcluded(value: Double): Self = this.set("qLockedExcluded", value.asInstanceOf[js.Any])
    @scala.inline
    def setQOption(value: Double): Self = this.set("qOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSelected(value: Double): Self = this.set("qSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSelectedExcluded(value: Double): Self = this.set("qSelectedExcluded", value.asInstanceOf[js.Any])
  }
  
}

