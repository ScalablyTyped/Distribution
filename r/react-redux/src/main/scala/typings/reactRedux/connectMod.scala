package typings.reactRedux

import typings.react.mod.Context
import typings.reactRedux.contextMod.ReactReduxContextInstance
import typings.reactRedux.contextMod.ReactReduxContextValue
import typings.reactRedux.selectorFactoryMod.MapDispatchToPropsNonObject
import typings.reactRedux.selectorFactoryMod.MapDispatchToPropsParam
import typings.reactRedux.selectorFactoryMod.MapStateToPropsParam
import typings.reactRedux.selectorFactoryMod.MergeProps
import typings.reactRedux.typesMod.DispatchProp
import typings.reactRedux.typesMod.InferableComponentEnhancer
import typings.reactRedux.typesMod.InferableComponentEnhancerWithProps
import typings.reactRedux.typesMod.ResolveThunks
import typings.reactRedux.useSyncExternalStoreMod.uSES
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectMod {
  
  @JSImport("react-redux/es/components/connect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-redux/es/components/connect", JSImport.Default)
  @js.native
  val default: Connect[Any] = js.native
  
  inline def initializeConnect(fn: uSES): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeConnect")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait Connect[DefaultState] extends StObject {
    
    def apply(): InferableComponentEnhancer[DispatchProp[AnyAction]] = js.native
    /** mapDispatch only (as a function) */
    def apply[no_state, TDispatchProps, TOwnProps](mapStateToProps: Null, mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    /** mapDispatch (as a function) and options */
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Null,
      mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
      mergeProps: Null,
      options: ConnectOptions[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Null,
      mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
      mergeProps: Unit,
      options: ConnectOptions[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    /** mapDispatch only (as an object) */
    def apply[no_state, TDispatchProps, TOwnProps](mapStateToProps: Null, mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps]): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
    /** mapDispatch (as an object) and options*/
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Null,
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: Null,
      options: ConnectOptions[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Null,
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: Unit,
      options: ConnectOptions[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
    def apply[no_state, TDispatchProps, TOwnProps](mapStateToProps: Unit, mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Unit,
      mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
      mergeProps: Null,
      options: ConnectOptions[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Unit,
      mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
      mergeProps: Unit,
      options: ConnectOptions[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[no_state, TDispatchProps, TOwnProps](mapStateToProps: Unit, mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps]): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Unit,
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: Null,
      options: ConnectOptions[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Unit,
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: Unit,
      options: ConnectOptions[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
    /** mergeProps only */
    def apply[no_state, no_dispatch, TOwnProps, TMergedProps](
      mapStateToProps: Null,
      mapDispatchToProps: Null,
      mergeProps: MergeProps[Unit, DispatchProp[AnyAction], TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[no_state, no_dispatch, TOwnProps, TMergedProps](
      mapStateToProps: Null,
      mapDispatchToProps: Unit,
      mergeProps: MergeProps[Unit, DispatchProp[AnyAction], TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    /** mapDispatch (as a object) and mergeProps */
    def apply[no_state, TDispatchProps, TOwnProps, TMergedProps](
      mapStateToProps: Null,
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: MergeProps[Unit, TDispatchProps, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[no_state, no_dispatch, TOwnProps, TMergedProps](
      mapStateToProps: Unit,
      mapDispatchToProps: Null,
      mergeProps: MergeProps[Unit, DispatchProp[AnyAction], TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[no_state, no_dispatch, TOwnProps, TMergedProps](
      mapStateToProps: Unit,
      mapDispatchToProps: Unit,
      mergeProps: MergeProps[Unit, DispatchProp[AnyAction], TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[no_state, TDispatchProps, TOwnProps, TMergedProps](
      mapStateToProps: Unit,
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: MergeProps[Unit, TDispatchProps, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    /** mapState only */
    def apply[TStateProps, no_dispatch, TOwnProps, State](mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State]): InferableComponentEnhancerWithProps[TStateProps & DispatchProp[AnyAction], TOwnProps] = js.native
    /** mapState and options */
    def apply[TStateProps, no_dispatch, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: Null,
      mergeProps: Null,
      options: ConnectOptions[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[DispatchProp[AnyAction] & TStateProps, TOwnProps] = js.native
    def apply[TStateProps, no_dispatch, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: Null,
      mergeProps: Unit,
      options: ConnectOptions[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[DispatchProp[AnyAction] & TStateProps, TOwnProps] = js.native
    def apply[TStateProps, no_dispatch, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: Unit,
      mergeProps: Null,
      options: ConnectOptions[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[DispatchProp[AnyAction] & TStateProps, TOwnProps] = js.native
    def apply[TStateProps, no_dispatch, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: Unit,
      mergeProps: Unit,
      options: ConnectOptions[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[DispatchProp[AnyAction] & TStateProps, TOwnProps] = js.native
    /** mapState and mapDispatch (as a function)*/
    def apply[TStateProps, TDispatchProps, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]
    ): InferableComponentEnhancerWithProps[TStateProps & TDispatchProps, TOwnProps] = js.native
    /** mapState,  mapDispatch (as a function), and options */
    def apply[TStateProps, TDispatchProps, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
      mergeProps: Null,
      options: ConnectOptions[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TStateProps & TDispatchProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
      mergeProps: Unit,
      options: ConnectOptions[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TStateProps & TDispatchProps, TOwnProps] = js.native
    /** mapState and mapDispatch (as an object) */
    def apply[TStateProps, TDispatchProps, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps]
    ): InferableComponentEnhancerWithProps[TStateProps & ResolveThunks[TDispatchProps], TOwnProps] = js.native
    /** mapState,  mapDispatch (as an object), and options */
    def apply[TStateProps, TDispatchProps, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: Null,
      options: ConnectOptions[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TStateProps & ResolveThunks[TDispatchProps], TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: Unit,
      options: ConnectOptions[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TStateProps & ResolveThunks[TDispatchProps], TOwnProps] = js.native
    /** mapState and mergeProps */
    def apply[TStateProps, no_dispatch, TOwnProps, TMergedProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: Null,
      mergeProps: MergeProps[TStateProps, DispatchProp[AnyAction], TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[TStateProps, no_dispatch, TOwnProps, TMergedProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: Unit,
      mergeProps: MergeProps[TStateProps, DispatchProp[AnyAction], TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    /** mapState, mapDispatch, mergeProps, and options */
    def apply[TStateProps, TDispatchProps, TOwnProps, TMergedProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps, TMergedProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps],
      options: ConnectOptions[State, TStateProps, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
  }
  
  trait ConnectOptions[State, TStateProps, TOwnProps, TMergedProps] extends StObject {
    
    var areMergedPropsEqual: js.UndefOr[
        js.Function2[/* nextMergedProps */ TMergedProps, /* prevMergedProps */ TMergedProps, Boolean]
      ] = js.undefined
    
    var areOwnPropsEqual: js.UndefOr[
        js.Function2[/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps, Boolean]
      ] = js.undefined
    
    var areStatePropsEqual: js.UndefOr[
        js.Function2[/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps, Boolean]
      ] = js.undefined
    
    var areStatesEqual: js.UndefOr[js.Function2[/* nextState */ State, /* prevState */ State, Boolean]] = js.undefined
    
    var context: js.UndefOr[Context[ReactReduxContextValue[Any, AnyAction]]] = js.undefined
    
    var forwardRef: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectOptions {
    
    inline def apply[State, TStateProps, TOwnProps, TMergedProps](): ConnectOptions[State, TStateProps, TOwnProps, TMergedProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOptions[State, TStateProps, TOwnProps, TMergedProps]]
    }
    
    extension [Self <: ConnectOptions[?, ?, ?, ?], State, TStateProps, TOwnProps, TMergedProps](x: Self & (ConnectOptions[State, TStateProps, TOwnProps, TMergedProps])) {
      
      inline def setAreMergedPropsEqual(value: (/* nextMergedProps */ TMergedProps, /* prevMergedProps */ TMergedProps) => Boolean): Self = StObject.set(x, "areMergedPropsEqual", js.Any.fromFunction2(value))
      
      inline def setAreMergedPropsEqualUndefined: Self = StObject.set(x, "areMergedPropsEqual", js.undefined)
      
      inline def setAreOwnPropsEqual(value: (/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps) => Boolean): Self = StObject.set(x, "areOwnPropsEqual", js.Any.fromFunction2(value))
      
      inline def setAreOwnPropsEqualUndefined: Self = StObject.set(x, "areOwnPropsEqual", js.undefined)
      
      inline def setAreStatePropsEqual(value: (/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps) => Boolean): Self = StObject.set(x, "areStatePropsEqual", js.Any.fromFunction2(value))
      
      inline def setAreStatePropsEqualUndefined: Self = StObject.set(x, "areStatePropsEqual", js.undefined)
      
      inline def setAreStatesEqual(value: (/* nextState */ State, /* prevState */ State) => Boolean): Self = StObject.set(x, "areStatesEqual", js.Any.fromFunction2(value))
      
      inline def setAreStatesEqualUndefined: Self = StObject.set(x, "areStatesEqual", js.undefined)
      
      inline def setContext(value: Context[ReactReduxContextValue[Any, AnyAction]]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      inline def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
    }
  }
  
  trait ConnectProps extends StObject {
    
    /** A custom Context instance that the component can use to access the store from an alternate Provider using that same Context instance */
    var context: js.UndefOr[ReactReduxContextInstance] = js.undefined
    
    /** A Redux store instance to be used for subscriptions instead of the store from a Provider */
    var store: js.UndefOr[Store[Any, AnyAction]] = js.undefined
  }
  object ConnectProps {
    
    inline def apply(): ConnectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectProps]
    }
    
    extension [Self <: ConnectProps](x: Self) {
      
      inline def setContext(value: ReactReduxContextInstance): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setStore(value: Store[Any, AnyAction]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  type ConnectedProps[TConnector] = Any
}
