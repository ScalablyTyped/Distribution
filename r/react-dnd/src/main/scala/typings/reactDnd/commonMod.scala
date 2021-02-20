package typings.reactDnd

import typings.dndCore.interfacesMod.BackendFactory
import typings.react.mod.Context
import typings.react.mod.FC
import typings.reactDnd.dndContextMod.DndContextType
import typings.reactDnd.dndProviderMod.DndProviderProps
import typings.reactDnd.dragPreviewImageMod.DragPreviewImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("react-dnd/lib/common", "DndContext")
  @js.native
  val DndContext: Context[DndContextType] = js.native
  
  @JSImport("react-dnd/lib/common", "DndProvider")
  @js.native
  val DndProvider: FC[DndProviderProps[js.Any, js.Any]] = js.native
  
  @JSImport("react-dnd/lib/common", "DragPreviewImage")
  @js.native
  val DragPreviewImage: FC[DragPreviewImageProps] = js.native
  
  @JSImport("react-dnd/lib/common", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory): DndContextType = js.native
  @JSImport("react-dnd/lib/common", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): DndContextType = js.native
  @JSImport("react-dnd/lib/common", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): DndContextType = js.native
  @JSImport("react-dnd/lib/common", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): DndContextType = js.native
  @JSImport("react-dnd/lib/common", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: BackendFactory,
    context: BackendContext,
    options: js.UndefOr[scala.Nothing],
    debugMode: Boolean
  ): DndContextType = js.native
  @JSImport("react-dnd/lib/common", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: js.UndefOr[scala.Nothing], options: BackendOptions): DndContextType = js.native
  @JSImport("react-dnd/lib/common", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: BackendFactory,
    context: js.UndefOr[scala.Nothing],
    options: BackendOptions,
    debugMode: Boolean
  ): DndContextType = js.native
  @JSImport("react-dnd/lib/common", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: BackendFactory,
    context: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    debugMode: Boolean
  ): DndContextType = js.native
}
