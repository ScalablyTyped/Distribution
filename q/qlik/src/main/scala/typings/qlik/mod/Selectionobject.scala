package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selectionobject extends js.Object {
  var qBackCount: Double = js.native
  var qForwardCount: Double = js.native
  var qSelections: js.Array[NxCurrentSelectionItem] = js.native
}

object Selectionobject {
  @scala.inline
  def apply(qBackCount: Double, qForwardCount: Double, qSelections: js.Array[NxCurrentSelectionItem]): Selectionobject = {
    val __obj = js.Dynamic.literal(qBackCount = qBackCount.asInstanceOf[js.Any], qForwardCount = qForwardCount.asInstanceOf[js.Any], qSelections = qSelections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectionobject]
  }
  @scala.inline
  implicit class SelectionobjectOps[Self <: Selectionobject] (val x: Self) extends AnyVal {
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
    def setQBackCount(value: Double): Self = this.set("qBackCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setQForwardCount(value: Double): Self = this.set("qForwardCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSelectionsVarargs(value: NxCurrentSelectionItem*): Self = this.set("qSelections", js.Array(value :_*))
    @scala.inline
    def setQSelections(value: js.Array[NxCurrentSelectionItem]): Self = this.set("qSelections", value.asInstanceOf[js.Any])
  }
  
}

