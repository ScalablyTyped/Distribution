package typings.reactDnd

import typings.dndCore.interfacesMod.BackendFactory
import typings.react.mod.Context
import typings.react.mod.FC
import typings.reactDnd.anon.DragDropManager
import typings.reactDnd.dndContextMod.DndContextType
import typings.reactDnd.dndProviderMod.DndProviderProps
import typings.reactDnd.dragPreviewImageMod.DragPreviewImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common", JSImport.Namespace)
@js.native
object commonMod extends js.Object {
  val DndContext: Context[DndContextType] = js.native
  val DndProvider: FC[DndProviderProps[js.Any, js.Any]] = js.native
  val DragPreviewImage: FC[DragPreviewImageProps] = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory): DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): DragDropManager = js.native
}

