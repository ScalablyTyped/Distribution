package typings.reactDashDnd.libInterfacesHooksApiMod

import typings.dndDashCore.libInterfacesMod.SourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragObjectWithType extends js.Object {
  var `type`: SourceType
}

object DragObjectWithType {
  @scala.inline
  def apply(`type`: SourceType): DragObjectWithType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragObjectWithType]
  }
}

