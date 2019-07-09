package typings
package reactDashDndLib.libInterfacesHooksApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragObjectWithType extends js.Object {
  var `type`: dndDashCoreLib.libInterfacesMod.SourceType
}

object DragObjectWithType {
  @scala.inline
  def apply(`type`: dndDashCoreLib.libInterfacesMod.SourceType): DragObjectWithType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragObjectWithType]
  }
}

