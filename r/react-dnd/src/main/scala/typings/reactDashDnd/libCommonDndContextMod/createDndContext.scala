package typings.reactDashDnd.libCommonDndContextMod

import typings.dndDashCore.libInterfacesMod.BackendFactory
import typings.reactDashDnd.Anon_DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/DndContext", "createDndContext")
@js.native
object createDndContext extends js.Object {
  def apply[BackendContext, BackendOptions](backend: BackendFactory): Anon_DragDropManager = js.native
  def apply[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): Anon_DragDropManager = js.native
  def apply[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): Anon_DragDropManager = js.native
  def apply[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): Anon_DragDropManager = js.native
}

