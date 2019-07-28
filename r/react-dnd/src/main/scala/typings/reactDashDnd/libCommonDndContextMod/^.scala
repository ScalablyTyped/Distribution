package typings.reactDashDnd.libCommonDndContextMod

import typings.dndDashCore.libInterfacesMod.BackendFactory
import typings.react.reactMod.Context
import typings.reactDashDnd.Anon_DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/DndContext", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DndContext: Context[DndContextType] = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory): Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): Anon_DragDropManager = js.native
}

