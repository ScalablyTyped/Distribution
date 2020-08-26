package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletedDrag extends js.Object {
  var afterCritical: LiftEffect = js.native
  var critical: Critical = js.native
  var impact: DragImpact = js.native
  var result: DropResult = js.native
}

object CompletedDrag {
  @scala.inline
  def apply(afterCritical: LiftEffect, critical: Critical, impact: DragImpact, result: DropResult): CompletedDrag = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedDrag]
  }
  @scala.inline
  implicit class CompletedDragOps[Self <: CompletedDrag] (val x: Self) extends AnyVal {
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
    def setAfterCritical(value: LiftEffect): Self = this.set("afterCritical", value.asInstanceOf[js.Any])
    @scala.inline
    def setCritical(value: Critical): Self = this.set("critical", value.asInstanceOf[js.Any])
    @scala.inline
    def setImpact(value: DragImpact): Self = this.set("impact", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: DropResult): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

