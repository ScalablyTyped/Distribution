package typings.reactDnd

import typings.dndCore.interfacesMod.BackendFactory
import typings.dndCore.interfacesMod.DragDropManager
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dndContextMod {
  
  @JSImport("react-dnd/lib/common/DndContext", "DndContext")
  @js.native
  val DndContext: Context[DndContextType] = js.native
  
  @JSImport("react-dnd/lib/common/DndContext", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory): DndContextType = js.native
  @JSImport("react-dnd/lib/common/DndContext", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): DndContextType = js.native
  @JSImport("react-dnd/lib/common/DndContext", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): DndContextType = js.native
  @JSImport("react-dnd/lib/common/DndContext", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): DndContextType = js.native
  @JSImport("react-dnd/lib/common/DndContext", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: BackendFactory,
    context: BackendContext,
    options: js.UndefOr[scala.Nothing],
    debugMode: Boolean
  ): DndContextType = js.native
  @JSImport("react-dnd/lib/common/DndContext", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: js.UndefOr[scala.Nothing], options: BackendOptions): DndContextType = js.native
  @JSImport("react-dnd/lib/common/DndContext", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: BackendFactory,
    context: js.UndefOr[scala.Nothing],
    options: BackendOptions,
    debugMode: Boolean
  ): DndContextType = js.native
  @JSImport("react-dnd/lib/common/DndContext", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: BackendFactory,
    context: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    debugMode: Boolean
  ): DndContextType = js.native
  
  @js.native
  trait DndContextType extends StObject {
    
    var dragDropManager: js.UndefOr[DragDropManager] = js.native
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
