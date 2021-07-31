package typings.reactDnd

import typings.dndCore.interfacesMod.BackendFactory
import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.Identifier
import typings.react.mod.ComponentType
import typings.reactDnd.dndProviderMod.DndProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var shallow: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    }
  }
  
  trait Backend[BackendContext, BackendOptions]
    extends StObject
       with DndProviderProps[BackendContext, BackendOptions] {
    
    var backend: BackendFactory
    
    var context: js.UndefOr[BackendContext] = js.undefined
    
    var debugMode: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[BackendOptions] = js.undefined
  }
  object Backend {
    
    @scala.inline
    def apply[BackendContext, BackendOptions](
      backend: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => typings.dndCore.interfacesMod.Backend
    ): Backend[BackendContext, BackendOptions] = {
      val __obj = js.Dynamic.literal(backend = js.Any.fromFunction3(backend))
      __obj.asInstanceOf[Backend[BackendContext, BackendOptions]]
    }
    
    @scala.inline
    implicit class BackendMutableBuilder[Self <: Backend[?, ?], BackendContext, BackendOptions] (val x: Self & (Backend[BackendContext, BackendOptions])) extends AnyVal {
      
      @scala.inline
      def setBackend(
        value: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => typings.dndCore.interfacesMod.Backend
      ): Self = StObject.set(x, "backend", js.Any.fromFunction3(value))
      
      @scala.inline
      def setContext(value: BackendContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
      
      @scala.inline
      def setOptions(value: BackendOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait DecoratedComponent[C /* <: ComponentType[js.Any] */] extends StObject {
    
    var DecoratedComponent: C
  }
  object DecoratedComponent {
    
    @scala.inline
    def apply[C /* <: ComponentType[js.Any] */](DecoratedComponent: C): DecoratedComponent[C] = {
      val __obj = js.Dynamic.literal(DecoratedComponent = DecoratedComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecoratedComponent[C]]
    }
    
    @scala.inline
    implicit class DecoratedComponentMutableBuilder[Self <: DecoratedComponent[?], C /* <: ComponentType[js.Any] */] (val x: Self & DecoratedComponent[C]) extends AnyVal {
      
      @scala.inline
      def setDecoratedComponent(value: C): Self = StObject.set(x, "DecoratedComponent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dispose extends StObject {
    
    var dispose: js.Function0[Unit]
  }
  object Dispose {
    
    @scala.inline
    def apply(dispose: () => Unit): Dispose = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[Dispose]
    }
    
    @scala.inline
    implicit class DisposeMutableBuilder[Self <: Dispose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  trait HandlerIds extends StObject {
    
    var handlerIds: js.UndefOr[js.Array[Identifier]] = js.undefined
  }
  object HandlerIds {
    
    @scala.inline
    def apply(): HandlerIds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandlerIds]
    }
    
    @scala.inline
    implicit class HandlerIdsMutableBuilder[Self <: HandlerIds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandlerIds(value: js.Array[Identifier]): Self = StObject.set(x, "handlerIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerIdsUndefined: Self = StObject.set(x, "handlerIds", js.undefined)
      
      @scala.inline
      def setHandlerIdsVarargs(value: Identifier*): Self = StObject.set(x, "handlerIds", js.Array(value :_*))
    }
  }
  
  trait Manager
    extends StObject
       with DndProviderProps[js.Any, js.Any] {
    
    var manager: DragDropManager
  }
  object Manager {
    
    @scala.inline
    def apply(manager: DragDropManager): Manager = {
      val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
      __obj.asInstanceOf[Manager]
    }
    
    @scala.inline
    implicit class ManagerMutableBuilder[Self <: Manager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setManager(value: DragDropManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    }
  }
  
  trait Shallow extends StObject {
    
    var shallow: Boolean
  }
  object Shallow {
    
    @scala.inline
    def apply(shallow: Boolean): Shallow = {
      val __obj = js.Dynamic.literal(shallow = shallow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shallow]
    }
    
    @scala.inline
    implicit class ShallowMutableBuilder[Self <: Shallow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    }
  }
}
