package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplacementGroups extends js.Object {
  var all: js.Array[DraggableId] = js.native
  var invisible: DraggableIdMap = js.native
  var visible: DisplacementMap = js.native
}

object DisplacementGroups {
  @scala.inline
  def apply(all: js.Array[DraggableId], invisible: DraggableIdMap, visible: DisplacementMap): DisplacementGroups = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], invisible = invisible.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplacementGroups]
  }
  @scala.inline
  implicit class DisplacementGroupsOps[Self <: DisplacementGroups] (val x: Self) extends AnyVal {
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
    def setAllVarargs(value: DraggableId*): Self = this.set("all", js.Array(value :_*))
    @scala.inline
    def setAll(value: js.Array[DraggableId]): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvisible(value: DraggableIdMap): Self = this.set("invisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: DisplacementMap): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

