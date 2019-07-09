package typings
package reactDashDndLib.libCommonDndContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/DndContext", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DndContext: reactLib.reactMod.Context[DndContext] = js.native
  def createDndContext[BackendContext, BackendOptions](backend: dndDashCoreLib.libInterfacesMod.BackendFactory): reactDashDndLib.Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: dndDashCoreLib.libInterfacesMod.BackendFactory, context: BackendContext): reactDashDndLib.Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: dndDashCoreLib.libInterfacesMod.BackendFactory,
    context: BackendContext,
    options: BackendOptions
  ): reactDashDndLib.Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: dndDashCoreLib.libInterfacesMod.BackendFactory,
    context: BackendContext,
    options: BackendOptions,
    debugMode: scala.Boolean
  ): reactDashDndLib.Anon_DragDropManager = js.native
}

