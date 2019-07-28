package typings.reactDashDnd

import typings.dndDashCore.libInterfacesMod.BackendFactory
import typings.react.reactMod.Context
import typings.react.reactMod.FC
import typings.reactDashDnd.libCommonDndContextMod.DndContextType
import typings.reactDashDnd.libCommonDndProviderMod.DndProviderProps
import typings.reactDashDnd.libCommonDragPreviewImageMod.DragPreviewImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common", JSImport.Namespace)
@js.native
object libCommonMod extends js.Object {
  val DndContext: Context[DndContextType] = js.native
  val DndProvider: FC[DndProviderProps[js.Any, js.Any]] = js.native
  val DragPreviewImage: FC[DragPreviewImageProps] = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory): Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): Anon_DragDropManager = js.native
}

