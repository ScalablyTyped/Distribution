package typings.reactDnd.dndContextMod

import typings.dndCore.interfacesMod.BackendFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/DndContext", "createDndContext")
@js.native
object createDndContext extends js.Object {
  def apply[BackendContext, BackendOptions](backend: BackendFactory): DndContextType = js.native
  def apply[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): DndContextType = js.native
  def apply[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): DndContextType = js.native
  def apply[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): DndContextType = js.native
  def apply[BackendContext, BackendOptions](
    backend: BackendFactory,
    context: BackendContext,
    options: js.UndefOr[scala.Nothing],
    debugMode: Boolean
  ): DndContextType = js.native
  def apply[BackendContext, BackendOptions](backend: BackendFactory, context: js.UndefOr[scala.Nothing], options: BackendOptions): DndContextType = js.native
  def apply[BackendContext, BackendOptions](
    backend: BackendFactory,
    context: js.UndefOr[scala.Nothing],
    options: BackendOptions,
    debugMode: Boolean
  ): DndContextType = js.native
  def apply[BackendContext, BackendOptions](
    backend: BackendFactory,
    context: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    debugMode: Boolean
  ): DndContextType = js.native
}

