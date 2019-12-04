package typings.reactDashDnd

import typings.dndDashCore.libInterfacesMod.DragDropManager
import typings.dndDashCore.libInterfacesMod.DragSource
import typings.dndDashCore.libInterfacesMod.DropTarget
import typings.dndDashCore.libInterfacesMod.Identifier
import typings.dndDashCore.libInterfacesMod.SourceType
import typings.dndDashCore.libInterfacesMod.TargetType
import typings.dndDashCore.libInterfacesMod.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/registration", JSImport.Namespace)
@js.native
object libCommonRegistrationMod extends js.Object {
  def registerSource(`type`: SourceType, source: DragSource, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = js.native
  def registerTarget(`type`: TargetType, target: DropTarget, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = js.native
}

