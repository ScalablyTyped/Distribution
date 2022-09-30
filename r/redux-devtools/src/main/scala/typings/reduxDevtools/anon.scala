package typings.reduxDevtools

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.Requireable
import typings.react.mod.Context
import typings.react.mod.ErrorInfo
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.redux.mod.Action
import typings.redux.mod.StoreEnhancer
import typings.reduxDevtools.createDevToolsMod.Props
import typings.reduxDevtoolsInstrument.mod.EnhancedStore
import typings.reduxDevtoolsInstrument.mod.InstrumentExt
import typings.reduxDevtoolsInstrument.mod.LiftedStore
import typings.reduxDevtoolsInstrument.mod.Options
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ComponentDidCatch[S, A /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */] extends StObject {
    
    var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var UNSAFE_componentWillReceiveProps: js.UndefOr[
        js.Function2[
          /* nextProps */ Props[S, A, MonitorState, MonitorAction], 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    var UNSAFE_componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ Props[S, A, MonitorState, MonitorAction], 
          /* nextState */ js.Object, 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
    
    var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.Function3[
          /* prevProps */ Props[S, A, MonitorState, MonitorAction], 
          /* prevState */ js.Object, 
          /* snapshot */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillReceiveProps: js.UndefOr[
        js.Function2[
          /* nextProps */ Props[S, A, MonitorState, MonitorAction], 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ Props[S, A, MonitorState, MonitorAction], 
          /* nextState */ js.Object, 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    var context: Any = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
    
    var getSnapshotBeforeUpdate: js.UndefOr[
        js.Function2[
          /* prevProps */ Props[S, A, MonitorState, MonitorAction], 
          /* prevState */ js.Object, 
          Any
        ]
      ] = js.native
    
    var liftedStore: js.UndefOr[LiftedStore[S, A, MonitorState]] = js.native
    
    val props: (Props[S, A, MonitorState, MonitorAction]) & ReadonlychildrenReactNode = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): Element | Null = js.native
    
    def setState[K /* <: scala.Nothing */](): Unit = js.native
    def setState[K /* <: scala.Nothing */](
      state: js.Function2[
          /* prevState */ js.Object, 
          /* props */ Props[S, A, MonitorState, MonitorAction], 
          js.Object | (Pick[js.Object, K]) | Null
        ]
    ): Unit = js.native
    def setState[K /* <: scala.Nothing */](
      state: js.Function2[
          /* prevState */ js.Object, 
          /* props */ Props[S, A, MonitorState, MonitorAction], 
          js.Object | (Pick[js.Object, K]) | Null
        ],
      callback: js.Function0[Unit]
    ): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: js.Object): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: js.Object, callback: js.Function0[Unit]): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: Null, callback: js.Function0[Unit]): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: Pick[js.Object, K]): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: Pick[js.Object, K], callback: js.Function0[Unit]): Unit = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ Props[S, A, MonitorState, MonitorAction], 
          /* nextState */ js.Object, 
          /* nextContext */ Any, 
          Boolean
        ]
      ] = js.native
  }
  
  @js.native
  trait Instantiable[S, A /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */]
    extends StObject
       with Instantiable2[
          /* props */ Props[S, A, MonitorState, MonitorAction], 
          /* context */ Store[S, A, MonitorState], 
          ComponentDidCatch[S, A, MonitorState, MonitorAction]
        ] {
    
    var contextType: js.UndefOr[Context[Any]] = js.native
    
    var contextTypes: StoreRequireable = js.native
    
    def instrument(): StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object] = js.native
    def instrument(options: Options[S, A, MonitorState, MonitorAction]): StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object] = js.native
    
    var propTypes: StoreRequireable = js.native
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> */
  trait ReadonlychildrenReactNode extends StObject {
    
    val children: js.UndefOr[ReactNode] = js.undefined
  }
  object ReadonlychildrenReactNode {
    
    inline def apply(): ReadonlychildrenReactNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlychildrenReactNode]
    }
    
    extension [Self <: ReadonlychildrenReactNode](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Store[S, A /* <: Action[Any] */, MonitorState] extends StObject {
    
    var store: js.UndefOr[EnhancedStore[S, A, MonitorState]] = js.undefined
  }
  object Store {
    
    inline def apply[S, A /* <: Action[Any] */, MonitorState](): Store[S, A, MonitorState] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Store[S, A, MonitorState]]
    }
    
    extension [Self <: Store[?, ?, ?], S, A /* <: Action[Any] */, MonitorState](x: Self & (Store[S, A, MonitorState])) {
      
      inline def setStore(value: EnhancedStore[S, A, MonitorState]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  trait StoreRequireable extends StObject {
    
    var store: Requireable[js.Object]
  }
  object StoreRequireable {
    
    inline def apply(store: Requireable[js.Object]): StoreRequireable = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreRequireable]
    }
    
    extension [Self <: StoreRequireable](x: Self) {
      
      inline def setStore(value: Requireable[js.Object]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
