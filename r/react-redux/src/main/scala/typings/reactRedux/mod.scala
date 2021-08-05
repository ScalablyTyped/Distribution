package typings.reactRedux

import org.scalablytyped.runtime.TopLevel
import typings.hoistNonReactStatics.mod.NonReactStatics
import typings.react.mod.ClassAttributes
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.NamedExoticComponent
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.reactRedux.anon.WrappedComponent
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Store
import typings.std.Exclude
import typings.std.InstanceType
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-redux", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-redux", "Provider")
  @js.native
  class Provider[A /* <: Action[js.Any] */] protected ()
    extends Component[ProviderProps[A], js.Object, js.Any] {
    def this(props: ProviderProps[A]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ProviderProps[A], context: js.Any) = this()
  }
  
  @JSImport("react-redux", "ReactReduxContext")
  @js.native
  val ReactReduxContext: Context[ReactReduxContextValue[js.Any, AnyAction]] = js.native
  
  inline def batch(cb: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("batch")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("react-redux", "connect")
  @js.native
  val connect: Connect_[DefaultRootState] = js.native
  
  inline def connectAdvanced[S, TProps, TOwnProps, TFactoryOptions](
    // tslint:disable-next-line no-unnecessary-generics
  selectorFactory: SelectorFactory[S, TProps, TOwnProps, TFactoryOptions]
  ): AdvancedComponentDecorator[TProps, TOwnProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectAdvanced")(selectorFactory.asInstanceOf[js.Any]).asInstanceOf[AdvancedComponentDecorator[TProps, TOwnProps]]
  inline def connectAdvanced[S, TProps, TOwnProps, TFactoryOptions](
    // tslint:disable-next-line no-unnecessary-generics
  selectorFactory: SelectorFactory[S, TProps, TOwnProps, TFactoryOptions],
    connectOptions: ConnectOptions & TFactoryOptions
  ): AdvancedComponentDecorator[TProps, TOwnProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("connectAdvanced")(selectorFactory.asInstanceOf[js.Any], connectOptions.asInstanceOf[js.Any])).asInstanceOf[AdvancedComponentDecorator[TProps, TOwnProps]]
  
  inline def createDispatchHook[S, A /* <: Action[js.Any] */](): js.Function0[Dispatch[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDispatchHook")().asInstanceOf[js.Function0[Dispatch[A]]]
  inline def createDispatchHook[S, A /* <: Action[js.Any] */](context: Context[ReactReduxContextValue[S, A]]): js.Function0[Dispatch[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDispatchHook")(context.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Dispatch[A]]]
  
  inline def createSelectorHook[S, A /* <: Action[js.Any] */](): js.Function2[
    /* selector */ js.Function1[/* state */ S, js.Any], 
    /* equalityFn */ js.UndefOr[js.Function2[/* previous */ js.Any, /* next */ js.Any, Boolean]], 
    js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSelectorHook")().asInstanceOf[js.Function2[
    /* selector */ js.Function1[/* state */ S, js.Any], 
    /* equalityFn */ js.UndefOr[js.Function2[/* previous */ js.Any, /* next */ js.Any, Boolean]], 
    js.Any
  ]]
  inline def createSelectorHook[S, A /* <: Action[js.Any] */](context: Context[ReactReduxContextValue[S, A]]): js.Function2[
    /* selector */ js.Function1[/* state */ S, js.Any], 
    /* equalityFn */ js.UndefOr[js.Function2[/* previous */ js.Any, /* next */ js.Any, Boolean]], 
    js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSelectorHook")(context.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* selector */ js.Function1[/* state */ S, js.Any], 
    /* equalityFn */ js.UndefOr[js.Function2[/* previous */ js.Any, /* next */ js.Any, Boolean]], 
    js.Any
  ]]
  
  inline def createStoreHook[S, A /* <: Action[js.Any] */](): js.Function0[Store[S, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStoreHook")().asInstanceOf[js.Function0[Store[S, A]]]
  inline def createStoreHook[S, A /* <: Action[js.Any] */](context: Context[ReactReduxContextValue[S, A]]): js.Function0[Store[S, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStoreHook")(context.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Store[S, A]]]
  
  inline def shallowEqual[T](left: T, right: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useDispatch[A /* <: Action[js.Any] */](): Dispatch[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDispatch")().asInstanceOf[Dispatch[A]]
  
  inline def useDispatch_TDispatch_TDispatch[TDispatch](): TDispatch = ^.asInstanceOf[js.Dynamic].applyDynamic("useDispatch")().asInstanceOf[TDispatch]
  
  inline def useSelector[TState, TSelected](selector: js.Function1[/* state */ TState, TSelected]): TSelected = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[TSelected]
  inline def useSelector[TState, TSelected](
    selector: js.Function1[/* state */ TState, TSelected],
    equalityFn: js.Function2[/* left */ TSelected, /* right */ TSelected, Boolean]
  ): TSelected = (^.asInstanceOf[js.Dynamic].applyDynamic("useSelector")(selector.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[TSelected]
  
  inline def useStore[S, A /* <: Action[js.Any] */](): Store[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")().asInstanceOf[Store[S, A]]
  
  type AdvancedComponentDecorator[TProps, TOwnProps] = js.Function1[/* component */ ComponentType[TProps], NamedExoticComponent[TOwnProps]]
  
  type AnyIfEmpty[T /* <: js.Object */] = T
  
  trait ConnectOptions extends StObject {
    
    /**
      * The react context to get the store from.
      *
      * @default ReactReduxContext
      */
    var context: js.UndefOr[Context[ReactReduxContextValue[js.Any, AnyAction]]] = js.undefined
    
    /**
      * Computes the connector component's displayName property relative to that of the wrapped component. Usually
      * overridden by wrapper functions.
      *
      * @default name => 'ConnectAdvanced('+name+')'
      * @param componentName
      */
    var getDisplayName: js.UndefOr[js.Function1[/* componentName */ String, String]] = js.undefined
    
    /**
      * Shown in error messages. Usually overridden by wrapper functions.
      *
      * @default 'connectAdvanced'
      */
    var methodName: js.UndefOr[String] = js.undefined
    
    /**
      * If defined, a property named this value will be added to the props passed to the wrapped component. Its value
      * will be the number of times the component has been rendered, which can be useful for tracking down unnecessary
      * re-renders.
      *
      * @default undefined
      */
    var renderCountProp: js.UndefOr[String] = js.undefined
    
    /**
      * Controls whether the connector component subscribes to redux store state changes. If set to false, it will only
      * re-render on <code>componentWillReceiveProps</code>.
      *
      * @default true
      */
    var shouldHandleStateChanges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The key of props/context to get the store. You probably only need this if you are in the inadvisable position of
      * having multiple stores.
      *
      * @default 'store'
      */
    var storeKey: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated Use forwardRef
      *
      * @default false
      */
    var withRef: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectOptions {
    
    inline def apply(): ConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOptions]
    }
    
    extension [Self <: ConnectOptions](x: Self) {
      
      inline def setContext(value: Context[ReactReduxContextValue[js.Any, AnyAction]]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setGetDisplayName(value: /* componentName */ String => String): Self = StObject.set(x, "getDisplayName", js.Any.fromFunction1(value))
      
      inline def setGetDisplayNameUndefined: Self = StObject.set(x, "getDisplayName", js.undefined)
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
      
      inline def setRenderCountProp(value: String): Self = StObject.set(x, "renderCountProp", value.asInstanceOf[js.Any])
      
      inline def setRenderCountPropUndefined: Self = StObject.set(x, "renderCountProp", js.undefined)
      
      inline def setShouldHandleStateChanges(value: Boolean): Self = StObject.set(x, "shouldHandleStateChanges", value.asInstanceOf[js.Any])
      
      inline def setShouldHandleStateChangesUndefined: Self = StObject.set(x, "shouldHandleStateChanges", js.undefined)
      
      inline def setStoreKey(value: String): Self = StObject.set(x, "storeKey", value.asInstanceOf[js.Any])
      
      inline def setStoreKeyUndefined: Self = StObject.set(x, "storeKey", js.undefined)
      
      inline def setWithRef(value: Boolean): Self = StObject.set(x, "withRef", value.asInstanceOf[js.Any])
      
      inline def setWithRefUndefined: Self = StObject.set(x, "withRef", js.undefined)
    }
  }
  
  @js.native
  trait Connect_[DefaultState] extends StObject {
    
    // tslint:disable:no-unnecessary-generics
    def apply(): InferableComponentEnhancer[DispatchProp[AnyAction]] = js.native
    def apply[no_state, TDispatchProps, TOwnProps](mapStateToProps: Null, mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Null,
      mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
      mergeProps: Null,
      options: Options[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Null,
      mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
      mergeProps: Unit,
      options: Options[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[no_state, TDispatchProps, TOwnProps](mapStateToProps: Null, mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps]): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Null,
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: Null,
      options: Options[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Null,
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: Unit,
      options: Options[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
    def apply[no_state, TDispatchProps, TOwnProps](mapStateToProps: Unit, mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Unit,
      mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
      mergeProps: Null,
      options: Options[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Unit,
      mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
      mergeProps: Unit,
      options: Options[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[no_state, TDispatchProps, TOwnProps](mapStateToProps: Unit, mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps]): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Unit,
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: Null,
      options: Options[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Unit,
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: Unit,
      options: Options[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
    def apply[no_state, no_dispatch, TOwnProps, TMergedProps](
      mapStateToProps: Null,
      mapDispatchToProps: Null,
      mergeProps: MergeProps[Unit, Unit, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[no_state, no_dispatch, TOwnProps, TMergedProps](
      mapStateToProps: Null,
      mapDispatchToProps: Unit,
      mergeProps: MergeProps[Unit, Unit, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[no_state, TDispatchProps, TOwnProps, TMergedProps](
      mapStateToProps: Null,
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: MergeProps[Unit, TDispatchProps, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[no_state, no_dispatch, TOwnProps, TMergedProps](
      mapStateToProps: Unit,
      mapDispatchToProps: Null,
      mergeProps: MergeProps[Unit, Unit, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[no_state, no_dispatch, TOwnProps, TMergedProps](
      mapStateToProps: Unit,
      mapDispatchToProps: Unit,
      mergeProps: MergeProps[Unit, Unit, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[no_state, TDispatchProps, TOwnProps, TMergedProps](
      mapStateToProps: Unit,
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: MergeProps[Unit, TDispatchProps, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[TStateProps, no_dispatch, TOwnProps, State](mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State]): InferableComponentEnhancerWithProps[TStateProps & DispatchProp[AnyAction], TOwnProps] = js.native
    def apply[TStateProps, no_dispatch, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: Null,
      mergeProps: Null,
      options: Options[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[DispatchProp[AnyAction] & TStateProps, TOwnProps] = js.native
    def apply[TStateProps, no_dispatch, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: Null,
      mergeProps: Unit,
      options: Options[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[DispatchProp[AnyAction] & TStateProps, TOwnProps] = js.native
    def apply[TStateProps, no_dispatch, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: Unit,
      mergeProps: Null,
      options: Options[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[DispatchProp[AnyAction] & TStateProps, TOwnProps] = js.native
    def apply[TStateProps, no_dispatch, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: Unit,
      mergeProps: Unit,
      options: Options[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[DispatchProp[AnyAction] & TStateProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]
    ): InferableComponentEnhancerWithProps[TStateProps & TDispatchProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
      mergeProps: Null,
      options: Options[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TStateProps & TDispatchProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
      mergeProps: Unit,
      options: Options[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TStateProps & TDispatchProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps]
    ): InferableComponentEnhancerWithProps[TStateProps & ResolveThunks[TDispatchProps], TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: Null,
      options: Options[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TStateProps & ResolveThunks[TDispatchProps], TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: Unit,
      options: Options[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TStateProps & ResolveThunks[TDispatchProps], TOwnProps] = js.native
    def apply[TStateProps, no_dispatch, TOwnProps, TMergedProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: Null,
      mergeProps: MergeProps[TStateProps, Unit, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[TStateProps, no_dispatch, TOwnProps, TMergedProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: Unit,
      mergeProps: MergeProps[TStateProps, Unit, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps, TMergedProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps, TMergedProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps],
      options: Options[State, TStateProps, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
  }
  
  type ConnectedComponent[C /* <: ComponentType[js.Any] */, P] = (NamedExoticComponent[LibraryManagedAttributes[C, P]]) & (NonReactStatics[C, js.Object]) & WrappedComponent[C]
  
  type ConnectedProps[TConnector] = js.Any
  
  trait DefaultRootState extends StObject
  
  trait DispatchProp[A /* <: Action[js.Any] */] extends StObject {
    
    var dispatch: Dispatch[A]
  }
  object DispatchProp {
    
    inline def apply[A /* <: Action[js.Any] */](dispatch: A => A): DispatchProp[A] = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch))
      __obj.asInstanceOf[DispatchProp[A]]
    }
    
    extension [Self <: DispatchProp[?], A /* <: Action[js.Any] */](x: Self & DispatchProp[A]) {
      
      inline def setDispatch(value: A => A): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    }
  }
  
  type GetProps[C] = ClassAttributes[InstanceType[C]] & js.Any
  
  type HandleThunkActionCreator[TActionCreator] = TActionCreator | InferThunkActionCreatorType[TActionCreator]
  
  type InferThunkActionCreatorType[TActionCreator /* <: js.Function1[/* repeated */ js.Any, js.Any] */] = TActionCreator | (js.Function1[/* args */ js.Any, js.Any])
  
  type InferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ js.Any, 
    ConnectedComponent[
      js.Any, 
      (Omit[
        GetProps[js.Any], 
        /* keyof react-redux.react-redux.Shared<TInjectedProps, react-redux.react-redux.GetProps<any>> */ String
      ]) & TNeedsProps
    ]
  ]
  
  type MapDispatchToProps[TDispatchProps, TOwnProps] = (MapDispatchToPropsFunction[TDispatchProps, TOwnProps]) | TDispatchProps
  
  type MapDispatchToPropsFactory[TDispatchProps, TOwnProps] = js.Function2[
    /* dispatch */ Dispatch[Action[js.Any]], 
    /* ownProps */ TOwnProps, 
    MapDispatchToPropsFunction[TDispatchProps, TOwnProps]
  ]
  
  type MapDispatchToPropsFunction[TDispatchProps, TOwnProps] = js.Function2[/* dispatch */ Dispatch[Action[js.Any]], /* ownProps */ TOwnProps, TDispatchProps]
  
  type MapDispatchToPropsNonObject[TDispatchProps, TOwnProps] = (MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (MapDispatchToPropsFunction[TDispatchProps, TOwnProps])
  
  type MapDispatchToPropsParam[TDispatchProps, TOwnProps] = (MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (MapDispatchToProps[TDispatchProps, TOwnProps])
  
  type MapStateToProps[TStateProps, TOwnProps, State] = js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps]
  
  type MapStateToPropsFactory[TStateProps, TOwnProps, State] = js.Function2[
    /* initialState */ State, 
    /* ownProps */ TOwnProps, 
    MapStateToProps[TStateProps, TOwnProps, State]
  ]
  
  type MapStateToPropsParam[TStateProps, TOwnProps, State] = js.UndefOr[
    (MapStateToPropsFactory[TStateProps, TOwnProps, State]) | (MapStateToProps[TStateProps, TOwnProps, State]) | Null
  ]
  
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.reactRedux.reactReduxStrings.Matching & TopLevel[js.Any]
  
  type MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps] = js.Function3[
    /* stateProps */ TStateProps, 
    /* dispatchProps */ TDispatchProps, 
    /* ownProps */ TOwnProps, 
    TMergedProps
  ]
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  trait Options[State, TStateProps, TOwnProps, TMergedProps]
    extends StObject
       with ConnectOptions {
    
    /**
      * When pure, compares the result of mergeProps to its previous value.
      * @default shallowEqual
      */
    var areMergedPropsEqual: js.UndefOr[
        js.Function2[/* nextMergedProps */ TMergedProps, /* prevMergedProps */ TMergedProps, Boolean]
      ] = js.undefined
    
    /**
      * When pure, compares incoming props to its previous value.
      * @default shallowEqual
      */
    var areOwnPropsEqual: js.UndefOr[
        js.Function2[/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps, Boolean]
      ] = js.undefined
    
    /**
      * When pure, compares the result of mapStateToProps to its previous value.
      * @default shallowEqual
      */
    var areStatePropsEqual: js.UndefOr[
        js.Function2[/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps, Boolean]
      ] = js.undefined
    
    /**
      * When pure, compares incoming store state to its previous value.
      * @default strictEqual
      */
    var areStatesEqual: js.UndefOr[js.Function2[/* nextState */ State, /* prevState */ State, Boolean]] = js.undefined
    
    /**
      * If true, use React's forwardRef to expose a ref of the wrapped component
      *
      * @default false
      */
    var forwardRef: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, implements shouldComponentUpdate and shallowly compares the result of mergeProps,
      * preventing unnecessary updates, assuming that the component is a “pure” component
      * and does not rely on any input or state other than its props and the selected Redux store’s state.
      * Defaults to true.
      * @default true
      */
    var pure: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply[State, TStateProps, TOwnProps, TMergedProps](): Options[State, TStateProps, TOwnProps, TMergedProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[State, TStateProps, TOwnProps, TMergedProps]]
    }
    
    extension [Self <: Options[?, ?, ?, ?], State, TStateProps, TOwnProps, TMergedProps](x: Self & (Options[State, TStateProps, TOwnProps, TMergedProps])) {
      
      inline def setAreMergedPropsEqual(value: (/* nextMergedProps */ TMergedProps, /* prevMergedProps */ TMergedProps) => Boolean): Self = StObject.set(x, "areMergedPropsEqual", js.Any.fromFunction2(value))
      
      inline def setAreMergedPropsEqualUndefined: Self = StObject.set(x, "areMergedPropsEqual", js.undefined)
      
      inline def setAreOwnPropsEqual(value: (/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps) => Boolean): Self = StObject.set(x, "areOwnPropsEqual", js.Any.fromFunction2(value))
      
      inline def setAreOwnPropsEqualUndefined: Self = StObject.set(x, "areOwnPropsEqual", js.undefined)
      
      inline def setAreStatePropsEqual(value: (/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps) => Boolean): Self = StObject.set(x, "areStatePropsEqual", js.Any.fromFunction2(value))
      
      inline def setAreStatePropsEqualUndefined: Self = StObject.set(x, "areStatePropsEqual", js.undefined)
      
      inline def setAreStatesEqual(value: (/* nextState */ State, /* prevState */ State) => Boolean): Self = StObject.set(x, "areStatesEqual", js.Any.fromFunction2(value))
      
      inline def setAreStatesEqualUndefined: Self = StObject.set(x, "areStatesEqual", js.undefined)
      
      inline def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      inline def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
      
      inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
      
      inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    }
  }
  
  trait ProviderProps[A /* <: Action[js.Any] */] extends StObject {
    
    /**
      * Optional context to be used internally in react-redux. Use React.createContext() to create a context to be used.
      * If this is used, generate own connect HOC by using connectAdvanced, supplying the same context provided to the
      * Provider. Initial value doesn't matter, as it is overwritten with the internal state of Provider.
      */
    var context: js.UndefOr[Context[ReactReduxContextValue[js.Any, AnyAction]]] = js.undefined
    
    /**
      * The single Redux store in your application.
      */
    var store: Store[js.Any, A]
  }
  object ProviderProps {
    
    inline def apply[A /* <: Action[js.Any] */](store: Store[js.Any, A]): ProviderProps[A] = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderProps[A]]
    }
    
    extension [Self <: ProviderProps[?], A /* <: Action[js.Any] */](x: Self & ProviderProps[A]) {
      
      inline def setContext(value: Context[ReactReduxContextValue[js.Any, AnyAction]]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setStore(value: Store[js.Any, A]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReactReduxContextValue[SS, A /* <: Action[js.Any] */] extends StObject {
    
    var store: Store[SS, A]
    
    var storeState: SS
  }
  object ReactReduxContextValue {
    
    inline def apply[SS, A /* <: Action[js.Any] */](store: Store[SS, A], storeState: SS): ReactReduxContextValue[SS, A] = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], storeState = storeState.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactReduxContextValue[SS, A]]
    }
    
    extension [Self <: ReactReduxContextValue[?, ?], SS, A /* <: Action[js.Any] */](x: Self & (ReactReduxContextValue[SS, A])) {
      
      inline def setStore(value: Store[SS, A]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreState(value: SS): Self = StObject.set(x, "storeState", value.asInstanceOf[js.Any])
    }
  }
  
  type ResolveArrayThunks[TDispatchProps /* <: js.Array[js.Any] */] = js.Array[HandleThunkActionCreator[js.Any]] | (js.Tuple2[HandleThunkActionCreator[js.Any], HandleThunkActionCreator[js.Any]]) | (js.Tuple3[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple4[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple5[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple6[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple7[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple8[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple9[
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any], 
    HandleThunkActionCreator[js.Any]
  ])
  
  type ResolveThunks[TDispatchProps] = TDispatchProps | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ C in keyof TDispatchProps ]: react-redux.react-redux.HandleThunkActionCreator<TDispatchProps[C]>}
    */ typings.reactRedux.reactReduxStrings.ResolveThunks & TopLevel[TDispatchProps])
  
  type RootStateOrAny = AnyIfEmpty[DefaultRootState]
  
  type Selector[S, TProps, TOwnProps] = (js.Function2[/* state */ S, /* ownProps */ TOwnProps, TProps]) | (js.Function1[/* state */ S, TProps])
  
  type SelectorFactory[S, TProps, TOwnProps, TFactoryOptions] = js.Function2[
    /* dispatch */ Dispatch[Action[js.Any]], 
    /* factoryOptions */ TFactoryOptions, 
    Selector[S, TProps, TOwnProps]
  ]
  
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typings.reactRedux.reactReduxStrings.Shared & TopLevel[js.Any]
  
  type TypedUseSelectorHook[TState] = js.Function2[
    /* selector */ js.Function1[/* state */ TState, js.Any], 
    /* equalityFn */ js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean]], 
    js.Any
  ]
}
