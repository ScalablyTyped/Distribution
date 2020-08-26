package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragImpact extends js.Object {
  var at: js.UndefOr[ImpactLocation] = js.native
  var displaced: DisplacementGroups = js.native
  var displacedBy: DisplacedBy = js.native
}

object DragImpact {
  @scala.inline
  def apply(displaced: DisplacementGroups, displacedBy: DisplacedBy): DragImpact = {
    val __obj = js.Dynamic.literal(displaced = displaced.asInstanceOf[js.Any], displacedBy = displacedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragImpact]
  }
  @scala.inline
  implicit class DragImpactOps[Self <: DragImpact] (val x: Self) extends AnyVal {
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
    def setDisplaced(value: DisplacementGroups): Self = this.set("displaced", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplacedBy(value: DisplacedBy): Self = this.set("displacedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setAt(value: ImpactLocation): Self = this.set("at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAt: Self = this.set("at", js.undefined)
  }
  
}

