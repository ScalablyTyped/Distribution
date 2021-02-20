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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-redux", "Provider")
  @js.native
  class Provider[A /* <: Action[_] */] protected ()
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
  
  @JSImport("react-redux", "batch")
  @js.native
  def batch(cb: js.Function0[Unit]): Unit = js.native
  
  @JSImport("react-redux", "connect")
  @js.native
  val connect: Connect_[DefaultRootState] = js.native
  
  @JSImport("react-redux", "connectAdvanced")
  @js.native
  def connectAdvanced[S, TProps, TOwnProps, TFactoryOptions](
    // tslint:disable-next-line no-unnecessary-generics
  selectorFactory: SelectorFactory[S, TProps, TOwnProps, TFactoryOptions]
  ): AdvancedComponentDecorator[TProps, TOwnProps] = js.native
  @JSImport("react-redux", "connectAdvanced")
  @js.native
  def connectAdvanced[S, TProps, TOwnProps, TFactoryOptions](
    // tslint:disable-next-line no-unnecessary-generics
  selectorFactory: SelectorFactory[S, TProps, TOwnProps, TFactoryOptions],
    connectOptions: ConnectOptions with TFactoryOptions
  ): AdvancedComponentDecorator[TProps, TOwnProps] = js.native
  
  @JSImport("react-redux", "createDispatchHook")
  @js.native
  def createDispatchHook[S, A /* <: Action[_] */](): js.Function0[Dispatch[A]] = js.native
  @JSImport("react-redux", "createDispatchHook")
  @js.native
  def createDispatchHook[S, A /* <: Action[_] */](context: Context[ReactReduxContextValue[S, A]]): js.Function0[Dispatch[A]] = js.native
  
  @JSImport("react-redux", "createSelectorHook")
  @js.native
  def createSelectorHook[S, A /* <: Action[_] */](): js.Function2[
    /* selector */ js.Function1[/* state */ S, _], 
    /* equalityFn */ js.UndefOr[js.Function2[/* previous */ js.Any, /* next */ js.Any, Boolean]], 
    _
  ] = js.native
  @JSImport("react-redux", "createSelectorHook")
  @js.native
  def createSelectorHook[S, A /* <: Action[_] */](context: Context[ReactReduxContextValue[S, A]]): js.Function2[
    /* selector */ js.Function1[/* state */ S, _], 
    /* equalityFn */ js.UndefOr[js.Function2[/* previous */ js.Any, /* next */ js.Any, Boolean]], 
    _
  ] = js.native
  
  @JSImport("react-redux", "createStoreHook")
  @js.native
  def createStoreHook[S, A /* <: Action[_] */](): js.Function0[Store[S, A]] = js.native
  @JSImport("react-redux", "createStoreHook")
  @js.native
  def createStoreHook[S, A /* <: Action[_] */](context: Context[ReactReduxContextValue[S, A]]): js.Function0[Store[S, A]] = js.native
  
  @JSImport("react-redux", "shallowEqual")
  @js.native
  def shallowEqual[T](left: T, right: js.Any): Boolean = js.native
  
  @JSImport("react-redux", "useDispatch")
  @js.native
  def useDispatch[A /* <: Action[_] */](): Dispatch[A] = js.native
  @JSImport("react-redux", "useDispatch")
  @js.native
  def useDispatch_TDispatch_TDispatch[TDispatch](): TDispatch = js.native
  
  @JSImport("react-redux", "useSelector")
  @js.native
  def useSelector[TState, TSelected](selector: js.Function1[/* state */ TState, TSelected]): TSelected = js.native
  @JSImport("react-redux", "useSelector")
  @js.native
  def useSelector[TState, TSelected](
    selector: js.Function1[/* state */ TState, TSelected],
    equalityFn: js.Function2[/* left */ TSelected, /* right */ TSelected, Boolean]
  ): TSelected = js.native
  
  @JSImport("react-redux", "useStore")
  @js.native
  def useStore[S, A /* <: Action[_] */](): Store[S, A] = js.native
  
  type AdvancedComponentDecorator[TProps, TOwnProps] = js.Function1[/* component */ ComponentType[TProps], NamedExoticComponent[TOwnProps]]
  
  type AnyIfEmpty[T /* <: js.Object */] = T
  
  @js.native
  trait ConnectOptions extends StObject {
    
    /**
      * The react context to get the store from.
      *
      * @default ReactReduxContext
      */
    var context: js.UndefOr[Context[ReactReduxContextValue[_, AnyAction]]] = js.native
    
    /**
      * Computes the connector component's displayName property relative to that of the wrapped component. Usually
      * overridden by wrapper functions.
      *
      * @default name => 'ConnectAdvanced('+name+')'
      * @param componentName
      */
    var getDisplayName: js.UndefOr[js.Function1[/* componentName */ String, String]] = js.native
    
    /**
      * Shown in error messages. Usually overridden by wrapper functions.
      *
      * @default 'connectAdvanced'
      */
    var methodName: js.UndefOr[String] = js.native
    
    /**
      * If defined, a property named this value will be added to the props passed to the wrapped component. Its value
      * will be the number of times the component has been rendered, which can be useful for tracking down unnecessary
      * re-renders.
      *
      * @default undefined
      */
    var renderCountProp: js.UndefOr[String] = js.native
    
    /**
      * Controls whether the connector component subscribes to redux store state changes. If set to false, it will only
      * re-render on <code>componentWillReceiveProps</code>.
      *
      * @default true
      */
    var shouldHandleStateChanges: js.UndefOr[Boolean] = js.native
    
    /**
      * The key of props/context to get the store. You probably only need this if you are in the inadvisable position of
      * having multiple stores.
      *
      * @default 'store'
      */
    var storeKey: js.UndefOr[String] = js.native
    
    /**
      * @deprecated Use forwardRef
      *
      * @default false
      */
    var withRef: js.UndefOr[Boolean] = js.native
  }
  object ConnectOptions {
    
    @scala.inline
    def apply(): ConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOptions]
    }
    
    @scala.inline
    implicit class ConnectOptionsMutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: Context[ReactReduxContextValue[_, AnyAction]]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setGetDisplayName(value: /* componentName */ String => String): Self = StObject.set(x, "getDisplayName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDisplayNameUndefined: Self = StObject.set(x, "getDisplayName", js.undefined)
      
      @scala.inline
      def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
      
      @scala.inline
      def setRenderCountProp(value: String): Self = StObject.set(x, "renderCountProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderCountPropUndefined: Self = StObject.set(x, "renderCountProp", js.undefined)
      
      @scala.inline
      def setShouldHandleStateChanges(value: Boolean): Self = StObject.set(x, "shouldHandleStateChanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldHandleStateChangesUndefined: Self = StObject.set(x, "shouldHandleStateChanges", js.undefined)
      
      @scala.inline
      def setStoreKey(value: String): Self = StObject.set(x, "storeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreKeyUndefined: Self = StObject.set(x, "storeKey", js.undefined)
      
      @scala.inline
      def setWithRef(value: Boolean): Self = StObject.set(x, "withRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithRefUndefined: Self = StObject.set(x, "withRef", js.undefined)
    }
  }
  
  @js.native
  trait Connect_[DefaultState] extends StObject {
    
    // tslint:disable:no-unnecessary-generics
    def apply(): InferableComponentEnhancer[DispatchProp[AnyAction]] = js.native
    def apply[no_state, TDispatchProps, TOwnProps](
      mapStateToProps: js.UndefOr[scala.Nothing],
      mapDispatchToProps: (MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]) | (MapDispatchToPropsParam[TDispatchProps, TOwnProps])
    ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: js.UndefOr[scala.Nothing],
      mapDispatchToProps: (MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]) | (MapDispatchToPropsParam[TDispatchProps, TOwnProps]),
      mergeProps: js.UndefOr[scala.Nothing],
      options: Options[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: js.UndefOr[scala.Nothing],
      mapDispatchToProps: (MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]) | (MapDispatchToPropsParam[TDispatchProps, TOwnProps]),
      mergeProps: Null,
      options: Options[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[no_state, TDispatchProps, TOwnProps](
      mapStateToProps: Null,
      mapDispatchToProps: (MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]) | (MapDispatchToPropsParam[TDispatchProps, TOwnProps])
    ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Null,
      mapDispatchToProps: (MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]) | (MapDispatchToPropsParam[TDispatchProps, TOwnProps]),
      mergeProps: js.UndefOr[scala.Nothing],
      options: Options[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps](
      mapStateToProps: Null,
      mapDispatchToProps: (MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]) | (MapDispatchToPropsParam[TDispatchProps, TOwnProps]),
      mergeProps: Null,
      options: Options[js.Object, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
    def apply[no_state, no_dispatch, TOwnProps, TMergedProps](
      mapStateToProps: js.UndefOr[scala.Nothing],
      mapDispatchToProps: Null,
      mergeProps: MergeProps[js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing], TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[no_state, TDispatchProps, TOwnProps, TMergedProps](
      mapStateToProps: js.UndefOr[scala.Nothing],
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: MergeProps[js.UndefOr[scala.Nothing], TDispatchProps, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[no_state, no_dispatch, TOwnProps, TMergedProps](
      mapStateToProps: Null,
      mapDispatchToProps: Null,
      mergeProps: MergeProps[js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing], TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[no_state, TDispatchProps, TOwnProps, TMergedProps](
      mapStateToProps: Null,
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: MergeProps[js.UndefOr[scala.Nothing], TDispatchProps, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
    def apply[TStateProps, no_dispatch, TOwnProps, State](mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State]): InferableComponentEnhancerWithProps[TStateProps with DispatchProp[AnyAction], TOwnProps] = js.native
    def apply[TStateProps, no_dispatch, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: Null,
      mergeProps: js.UndefOr[scala.Nothing],
      options: Options[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[DispatchProp[AnyAction] with TStateProps, TOwnProps] = js.native
    def apply[TStateProps, no_dispatch, TOwnProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: Null,
      mergeProps: Null,
      options: Options[State, TStateProps, TOwnProps, js.Object]
    ): InferableComponentEnhancerWithProps[DispatchProp[AnyAction] with TStateProps, TOwnProps] = js.native
    def apply[TStateProps, TDispatchProps, TOwnProps, TMergedProps, State](
      mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
      mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
      mergeProps: MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps],
      options: Options[State, TStateProps, TOwnProps, TMergedProps]
    ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
  }
  
  type ConnectedComponent[C /* <: ComponentType[_] */, P] = (NamedExoticComponent[LibraryManagedAttributes[C, P]]) with (NonReactStatics[C, js.Object]) with WrappedComponent[C]
  
  type ConnectedProps[TConnector] = js.Any
  
  @js.native
  trait DefaultRootState extends StObject
  
  @js.native
  trait DispatchProp[A /* <: Action[_] */] extends StObject {
    
    var dispatch: Dispatch[A] = js.native
  }
  object DispatchProp {
    
    @scala.inline
    def apply[A /* <: Action[_] */](dispatch: A => A): DispatchProp[A] = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch))
      __obj.asInstanceOf[DispatchProp[A]]
    }
    
    @scala.inline
    implicit class DispatchPropMutableBuilder[Self <: DispatchProp[_], A /* <: Action[_] */] (val x: Self with DispatchProp[A]) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: A => A): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    }
  }
  
  type GetProps[C] = ClassAttributes[InstanceType[C]] with js.Any
  
  type HandleThunkActionCreator[TActionCreator] = TActionCreator | InferThunkActionCreatorType[TActionCreator]
  
  type InferThunkActionCreatorType[TActionCreator /* <: js.Function1[/* repeated */ js.Any, _] */] = TActionCreator | (js.Function1[/* args */ js.Any, js.Any])
  
  type InferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ js.Any, 
    ConnectedComponent[
      js.Any, 
      (Omit[
        GetProps[_], 
        /* keyof react-redux.react-redux.Shared<TInjectedProps, react-redux.react-redux.GetProps<any>> */ String
      ]) with TNeedsProps
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
    */ typings.reactRedux.reactReduxStrings.Matching with TopLevel[js.Any]
  
  type MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps] = js.Function3[
    /* stateProps */ TStateProps, 
    /* dispatchProps */ TDispatchProps, 
    /* ownProps */ TOwnProps, 
    TMergedProps
  ]
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  @js.native
  trait Options[State, TStateProps, TOwnProps, TMergedProps] extends ConnectOptions {
    
    /**
      * When pure, compares the result of mergeProps to its previous value.
      * @default shallowEqual
      */
    var areMergedPropsEqual: js.UndefOr[
        js.Function2[/* nextMergedProps */ TMergedProps, /* prevMergedProps */ TMergedProps, Boolean]
      ] = js.native
    
    /**
      * When pure, compares incoming props to its previous value.
      * @default shallowEqual
      */
    var areOwnPropsEqual: js.UndefOr[
        js.Function2[/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps, Boolean]
      ] = js.native
    
    /**
      * When pure, compares the result of mapStateToProps to its previous value.
      * @default shallowEqual
      */
    var areStatePropsEqual: js.UndefOr[
        js.Function2[/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps, Boolean]
      ] = js.native
    
    /**
      * When pure, compares incoming store state to its previous value.
      * @default strictEqual
      */
    var areStatesEqual: js.UndefOr[js.Function2[/* nextState */ State, /* prevState */ State, Boolean]] = js.native
    
    /**
      * If true, use React's forwardRef to expose a ref of the wrapped component
      *
      * @default false
      */
    var forwardRef: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, implements shouldComponentUpdate and shallowly compares the result of mergeProps,
      * preventing unnecessary updates, assuming that the component is a “pure” component
      * and does not rely on any input or state other than its props and the selected Redux store’s state.
      * Defaults to true.
      * @default true
      */
    var pure: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[State, TStateProps, TOwnProps, TMergedProps](): Options[State, TStateProps, TOwnProps, TMergedProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[State, TStateProps, TOwnProps, TMergedProps]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_, _, _, _], State, TStateProps, TOwnProps, TMergedProps] (val x: Self with (Options[State, TStateProps, TOwnProps, TMergedProps])) extends AnyVal {
      
      @scala.inline
      def setAreMergedPropsEqual(value: (/* nextMergedProps */ TMergedProps, /* prevMergedProps */ TMergedProps) => Boolean): Self = StObject.set(x, "areMergedPropsEqual", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAreMergedPropsEqualUndefined: Self = StObject.set(x, "areMergedPropsEqual", js.undefined)
      
      @scala.inline
      def setAreOwnPropsEqual(value: (/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps) => Boolean): Self = StObject.set(x, "areOwnPropsEqual", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAreOwnPropsEqualUndefined: Self = StObject.set(x, "areOwnPropsEqual", js.undefined)
      
      @scala.inline
      def setAreStatePropsEqual(value: (/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps) => Boolean): Self = StObject.set(x, "areStatePropsEqual", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAreStatePropsEqualUndefined: Self = StObject.set(x, "areStatePropsEqual", js.undefined)
      
      @scala.inline
      def setAreStatesEqual(value: (/* nextState */ State, /* prevState */ State) => Boolean): Self = StObject.set(x, "areStatesEqual", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAreStatesEqualUndefined: Self = StObject.set(x, "areStatesEqual", js.undefined)
      
      @scala.inline
      def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
      
      @scala.inline
      def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    }
  }
  
  @js.native
  trait ProviderProps[A /* <: Action[_] */] extends StObject {
    
    /**
      * Optional context to be used internally in react-redux. Use React.createContext() to create a context to be used.
      * If this is used, generate own connect HOC by using connectAdvanced, supplying the same context provided to the
      * Provider. Initial value doesn't matter, as it is overwritten with the internal state of Provider.
      */
    var context: js.UndefOr[Context[ReactReduxContextValue[_, AnyAction]]] = js.native
    
    /**
      * The single Redux store in your application.
      */
    var store: Store[_, A] = js.native
  }
  object ProviderProps {
    
    @scala.inline
    def apply[A /* <: Action[_] */](store: Store[_, A]): ProviderProps[A] = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderProps[A]]
    }
    
    @scala.inline
    implicit class ProviderPropsMutableBuilder[Self <: ProviderProps[_], A /* <: Action[_] */] (val x: Self with ProviderProps[A]) extends AnyVal {
      
      @scala.inline
      def setContext(value: Context[ReactReduxContextValue[_, AnyAction]]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setStore(value: Store[_, A]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReactReduxContextValue[SS, A /* <: Action[_] */] extends StObject {
    
    var store: Store[SS, A] = js.native
    
    var storeState: SS = js.native
  }
  object ReactReduxContextValue {
    
    @scala.inline
    def apply[SS, A /* <: Action[_] */](store: Store[SS, A], storeState: SS): ReactReduxContextValue[SS, A] = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], storeState = storeState.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactReduxContextValue[SS, A]]
    }
    
    @scala.inline
    implicit class ReactReduxContextValueMutableBuilder[Self <: ReactReduxContextValue[_, _], SS, A /* <: Action[_] */] (val x: Self with (ReactReduxContextValue[SS, A])) extends AnyVal {
      
      @scala.inline
      def setStore(value: Store[SS, A]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreState(value: SS): Self = StObject.set(x, "storeState", value.asInstanceOf[js.Any])
    }
  }
  
  type ResolveArrayThunks[TDispatchProps /* <: js.Array[_] */] = js.Array[HandleThunkActionCreator[js.Any]] | (js.Tuple2[HandleThunkActionCreator[js.Any], HandleThunkActionCreator[js.Any]]) | (js.Tuple3[
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
    */ typings.reactRedux.reactReduxStrings.ResolveThunks with TopLevel[TDispatchProps])
  
  type RootStateOrAny = AnyIfEmpty[DefaultRootState]
  
  type Selector[S, TProps, TOwnProps] = (js.Function2[/* state */ S, /* ownProps */ TOwnProps, TProps]) | (js.Function1[/* state */ S, TProps])
  
  type SelectorFactory[S, TProps, TOwnProps, TFactoryOptions] = js.Function2[
    /* dispatch */ Dispatch[Action[js.Any]], 
    /* factoryOptions */ TFactoryOptions, 
    Selector[S, TProps, TOwnProps]
  ]
  
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typings.reactRedux.reactReduxStrings.Shared with TopLevel[js.Any]
  
  type TypedUseSelectorHook[TState] = js.Function2[
    /* selector */ js.Function1[/* state */ TState, js.Any], 
    /* equalityFn */ js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean]], 
    js.Any
  ]
}
