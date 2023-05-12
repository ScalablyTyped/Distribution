package typings.reflux

import org.scalablytyped.runtime.Instantiable0
import typings.reflux.mod.ActionDefinition
import typings.reflux.mod.ActionObjectDefinition
import typings.reflux.mod.StoreDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Reflux {
    
    @JSGlobal("Reflux")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Reflux.ActionMethods")
    @js.native
    val ActionMethods: Any = js.native
    
    @JSGlobal("Reflux.Component")
    @js.native
    open class Component[TOfStore /* <: Instantiable0[typings.reflux.mod.Store] */, P, S] protected ()
      extends typings.reflux.mod.Component[TOfStore, P, S] {
      def this(props: P) = this()
      /**
        * @deprecated
        * @see https://legacy.reactjs.org/docs/legacy-context.html
        */
      def this(props: P, context: Any) = this()
    }
    
    inline def ListenerMixin(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListenerMixin")().asInstanceOf[Any]
    
    @JSGlobal("Reflux.PureComponent")
    @js.native
    open class PureComponent[TOfStore /* <: Instantiable0[typings.reflux.mod.Store] */, P, S, SS] protected ()
      extends typings.reflux.mod.PureComponent[TOfStore, P, S, SS] {
      def this(props: P) = this()
      /**
        * @deprecated
        * @see https://legacy.reactjs.org/docs/legacy-context.html
        */
      def this(props: P, context: Any) = this()
    }
    
    @JSGlobal("Reflux.Store")
    @js.native
    open class Store ()
      extends typings.reflux.mod.Store
    
    inline def connect(store: typings.reflux.mod.Store): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(store.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def connect(store: typings.reflux.mod.Store, key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(store.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def createAction(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")().asInstanceOf[Any]
    inline def createAction(definition: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(definition.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def createAction(definition: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(definition.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def createAction(definition: ActionDefinition): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(definition.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def createActions(definitions: js.Array[ActionDefinition | String]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(definitions.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def createActions(definitions: ActionObjectDefinition): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(definitions.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def createStore(definition: StoreDefinition): typings.reflux.mod.Store = ^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(definition.asInstanceOf[js.Any]).asInstanceOf[typings.reflux.mod.Store]
    
    inline def initStore(typeOfStore: Instantiable0[typings.reflux.mod.Store]): typings.reflux.mod.Store = ^.asInstanceOf[js.Dynamic].applyDynamic("initStore")(typeOfStore.asInstanceOf[js.Any]).asInstanceOf[typings.reflux.mod.Store]
    
    inline def listenTo(store: typings.reflux.mod.Store, handler: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listenTo")(store.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setState(state: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setState")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
