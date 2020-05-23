package typings.reactDnd.dndContextMod

import typings.dndCore.interfacesMod.BackendFactory
import typings.reactDnd.anon.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/DndContext", "createDndContext")
@js.native
object createDndContext extends js.Object {
  def apply[BackendContext, BackendOptions](backend: BackendFactory): DragDropManager = js.native
  def apply[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): DragDropManager = js.native
  def apply[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): DragDropManager = js.native
  def apply[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): DragDropManager = js.native
}

