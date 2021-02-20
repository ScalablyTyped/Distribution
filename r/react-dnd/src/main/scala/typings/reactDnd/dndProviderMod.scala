package typings.reactDnd

import typings.dndCore.interfacesMod.DragDropManager
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dndProviderMod {
  
  @JSImport("react-dnd/lib/common/DndProvider", "DndProvider")
  @js.native
  val DndProvider: FC[DndProviderProps[js.Any, js.Any]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDnd.anon.Manager
    - typings.reactDnd.anon.Backend[BackendContext, BackendOptions]
  */
  trait DndProviderProps[BackendContext, BackendOptions] extends StObject
  object DndProviderProps {
    
    @scala.inline
    def Backend[BackendContext, BackendOptions](
      backend: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => typings.dndCore.interfacesMod.Backend
    ): typings.reactDnd.anon.Backend[BackendContext, BackendOptions] = {
      val __obj = js.Dynamic.literal(backend = js.Any.fromFunction3(backend))
      __obj.asInstanceOf[typings.reactDnd.anon.Backend[BackendContext, BackendOptions]]
    }
    
    @scala.inline
    def Manager(manager: DragDropManager): typings.reactDnd.anon.Manager = {
      val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDnd.anon.Manager]
    }
  }
}
