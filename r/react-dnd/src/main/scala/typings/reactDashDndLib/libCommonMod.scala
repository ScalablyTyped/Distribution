package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common", JSImport.Namespace)
@js.native
object libCommonMod extends js.Object {
  val DndContext: reactLib.reactMod.Context[reactDashDndLib.libCommonDndContextMod.DndContextType] = js.native
  val DndProvider: reactLib.reactMod.FC[reactDashDndLib.libCommonDndProviderMod.DndProviderProps[js.Any, js.Any]] = js.native
  val DragPreviewImage: reactLib.reactMod.FC[reactDashDndLib.libCommonDragPreviewImageMod.DragPreviewImageProps] = js.native
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

