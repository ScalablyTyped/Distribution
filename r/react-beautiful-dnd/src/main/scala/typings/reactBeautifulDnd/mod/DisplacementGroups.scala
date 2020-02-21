package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplacementGroups extends js.Object {
  var all: js.Array[DraggableId]
  var invisible: DraggableIdMap
  var visible: DisplacementMap
}

object DisplacementGroups {
  @scala.inline
  def apply(all: js.Array[DraggableId], invisible: DraggableIdMap, visible: DisplacementMap): DisplacementGroups = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], invisible = invisible.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisplacementGroups]
  }
}

