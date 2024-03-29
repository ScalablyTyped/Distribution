package typings.reactDnd

import typings.dndCore.distInterfacesMod.BackendFactory
import typings.dndCore.distInterfacesMod.DragDropManager
import typings.dndCore.distInterfacesMod.Identifier
import typings.react.mod.ReactNode
import typings.reactDnd.distCoreDndProviderMod.DndProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var shallow: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    }
  }
  
  trait Backend[BackendContext, BackendOptions]
    extends StObject
       with DndProviderProps[BackendContext, BackendOptions] {
    
    var backend: BackendFactory
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var context: js.UndefOr[BackendContext] = js.undefined
    
    var debugMode: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[BackendOptions] = js.undefined
  }
  object Backend {
    
    inline def apply[BackendContext, BackendOptions](
      backend: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[Any], /* configuration */ js.UndefOr[Any]) => typings.dndCore.distInterfacesMod.Backend
    ): Backend[BackendContext, BackendOptions] = {
      val __obj = js.Dynamic.literal(backend = js.Any.fromFunction3(backend))
      __obj.asInstanceOf[Backend[BackendContext, BackendOptions]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Backend[?, ?], BackendContext, BackendOptions] (val x: Self & (Backend[BackendContext, BackendOptions])) extends AnyVal {
      
      inline def setBackend(
        value: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[Any], /* configuration */ js.UndefOr[Any]) => typings.dndCore.distInterfacesMod.Backend
      ): Self = StObject.set(x, "backend", js.Any.fromFunction3(value))
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContext(value: BackendContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
      
      inline def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
      
      inline def setOptions(value: BackendOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait Children
    extends StObject
       with DndProviderProps[Any, Any] {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var manager: DragDropManager
  }
  object Children {
    
    inline def apply(manager: DragDropManager): Children = {
      val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setManager(value: DragDropManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    }
  }
  
  trait HandlerIds extends StObject {
    
    var handlerIds: js.UndefOr[js.Array[Identifier]] = js.undefined
  }
  object HandlerIds {
    
    inline def apply(): HandlerIds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandlerIds]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HandlerIds] (val x: Self) extends AnyVal {
      
      inline def setHandlerIds(value: js.Array[Identifier]): Self = StObject.set(x, "handlerIds", value.asInstanceOf[js.Any])
      
      inline def setHandlerIdsUndefined: Self = StObject.set(x, "handlerIds", js.undefined)
      
      inline def setHandlerIdsVarargs(value: Identifier*): Self = StObject.set(x, "handlerIds", js.Array(value*))
    }
  }
  
  trait Shallow extends StObject {
    
    var shallow: Boolean
  }
  object Shallow {
    
    inline def apply(shallow: Boolean): Shallow = {
      val __obj = js.Dynamic.literal(shallow = shallow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shallow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Shallow] (val x: Self) extends AnyVal {
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    }
  }
}
