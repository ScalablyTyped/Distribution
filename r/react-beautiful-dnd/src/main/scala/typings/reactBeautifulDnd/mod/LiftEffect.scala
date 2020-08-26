package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiftEffect extends js.Object {
  var displacedBy: DisplacedBy = js.native
  var effected: DraggableIdMap = js.native
  var inVirtualList: Boolean = js.native
}

object LiftEffect {
  @scala.inline
  def apply(displacedBy: DisplacedBy, effected: DraggableIdMap, inVirtualList: Boolean): LiftEffect = {
    val __obj = js.Dynamic.literal(displacedBy = displacedBy.asInstanceOf[js.Any], effected = effected.asInstanceOf[js.Any], inVirtualList = inVirtualList.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiftEffect]
  }
  @scala.inline
  implicit class LiftEffectOps[Self <: LiftEffect] (val x: Self) extends AnyVal {
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
    def setDisplacedBy(value: DisplacedBy): Self = this.set("displacedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffected(value: DraggableIdMap): Self = this.set("effected", value.asInstanceOf[js.Any])
    @scala.inline
    def setInVirtualList(value: Boolean): Self = this.set("inVirtualList", value.asInstanceOf[js.Any])
  }
  
}

