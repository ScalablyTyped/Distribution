package typings.reactDnd

import typings.dndCore.interfacesMod.BackendFactory
import typings.react.mod.Context
import typings.react.mod.FC
import typings.reactDnd.dndContextMod.DndContextType
import typings.reactDnd.dndProviderMod.DndProviderProps
import typings.reactDnd.dragPreviewImageMod.DragPreviewImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("react-dnd/lib/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-dnd/lib/common", "DndContext")
  @js.native
  val DndContext: Context[DndContextType] = js.native
  
  @JSImport("react-dnd/lib/common", "DndProvider")
  @js.native
  val DndProvider: FC[DndProviderProps[js.Any, js.Any]] = js.native
  
  @JSImport("react-dnd/lib/common", "DragPreviewImage")
  @js.native
  val DragPreviewImage: FC[DragPreviewImageProps] = js.native
  
  inline def createDndContext[BackendContext, BackendOptions](backend: BackendFactory): DndContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any]).asInstanceOf[DndContextType]
  inline def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  inline def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  inline def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  inline def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: Unit, debugMode: Boolean): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  inline def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: Unit, options: BackendOptions): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  inline def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: Unit, options: BackendOptions, debugMode: Boolean): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  inline def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: Unit, options: Unit, debugMode: Boolean): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
}
