package typings.reactDnd

import typings.dndCore.interfacesMod.BackendFactory
import typings.dndCore.interfacesMod.DragDropManager
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dndContextMod {
  
  @JSImport("react-dnd/lib/common/DndContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-dnd/lib/common/DndContext", "DndContext")
  @js.native
  val DndContext: Context[DndContextType] = js.native
  
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory): DndContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any]).asInstanceOf[DndContextType]
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: Unit, debugMode: Boolean): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: Unit, options: BackendOptions): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: Unit, options: BackendOptions, debugMode: Boolean): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: Unit, options: Unit, debugMode: Boolean): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  
  trait DndContextType extends StObject {
    
    var dragDropManager: js.UndefOr[DragDropManager] = js.undefined
  }
  object DndContextType {
    
    @scala.inline
    def apply(): DndContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DndContextType]
    }
    
    @scala.inline
    implicit class DndContextTypeMutableBuilder[Self <: DndContextType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDragDropManager(value: DragDropManager): Self = StObject.set(x, "dragDropManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragDropManagerUndefined: Self = StObject.set(x, "dragDropManager", js.undefined)
    }
  }
}
