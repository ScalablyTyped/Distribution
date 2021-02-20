package typings.recompose

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.ErrorInfo
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.react.mod.ValidationMap
import typings.recompose.anon.Children
import typings.std.Error
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("recompose", "branch")
  @js.native
  def branch[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[_, TOutter] = js.native
  @JSImport("recompose", "branch")
  @js.native
  def branch[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object],
    falseEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[_, TOutter] = js.native
  
  @JSImport("recompose", "componentFromProp")
  @js.native
  def componentFromProp(propName: String): StatelessComponent[_] = js.native
  
  @JSImport("recompose", "componentFromStream")
  @js.native
  def componentFromStream[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[ReactNode]]): ComponentType[TProps] = js.native
  
  @JSImport("recompose", "componentFromStreamWithConfig")
  @js.native
  def componentFromStreamWithConfig(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[_], Subscribable[ReactNode]], 
    ComponentType[_]
  ] = js.native
  
  @JSImport("recompose", "compose")
  @js.native
  def compose[TInner, TOutter](functions: js.Function*): ComponentEnhancer[TInner, TOutter] = js.native
  
  @JSImport("recompose", "createEagerElement")
  @js.native
  def createEagerElement(`type`: String): ReactElement = js.native
  @JSImport("recompose", "createEagerElement")
  @js.native
  def createEagerElement(`type`: String, props: js.UndefOr[scala.Nothing], children: ReactNode): ReactElement = js.native
  @JSImport("recompose", "createEagerElement")
  @js.native
  def createEagerElement(`type`: String, props: js.Object): ReactElement = js.native
  @JSImport("recompose", "createEagerElement")
  @js.native
  def createEagerElement(`type`: String, props: js.Object, children: ReactNode): ReactElement = js.native
  @JSImport("recompose", "createEagerElement")
  @js.native
  def createEagerElement(`type`: ComponentType[_]): ReactElement = js.native
  @JSImport("recompose", "createEagerElement")
  @js.native
  def createEagerElement(`type`: ComponentType[_], props: js.UndefOr[scala.Nothing], children: ReactNode): ReactElement = js.native
  @JSImport("recompose", "createEagerElement")
  @js.native
  def createEagerElement(`type`: ComponentType[_], props: js.Object): ReactElement = js.native
  @JSImport("recompose", "createEagerElement")
  @js.native
  def createEagerElement(`type`: ComponentType[_], props: js.Object, children: ReactNode): ReactElement = js.native
  
  @JSImport("recompose", "createEagerFactory")
  @js.native
  def createEagerFactory(`type`: String): componentFactory = js.native
  @JSImport("recompose", "createEagerFactory")
  @js.native
  def createEagerFactory(`type`: ComponentType[_]): componentFactory = js.native
  
  @JSImport("recompose", "createEventHandler")
  @js.native
  def createEventHandler[T, TSubs /* <: Subscribable[T] */](): EventHandlerOf[T, TSubs] = js.native
  
  @JSImport("recompose", "createEventHandlerWithConfig")
  @js.native
  def createEventHandlerWithConfig(config: ObservableConfig): js.Function0[EventHandlerOf[_, Subscribable[_]]] = js.native
  
  @JSImport("recompose", "createSink")
  @js.native
  def createSink(callback: js.Function1[/* props */ js.Object, Unit]): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("recompose", "defaultProps")
  @js.native
  def defaultProps[T](props: T): DefaultingInferableComponentEnhancer[T] = js.native
  
  @JSImport("recompose", "flattenProp")
  @js.native
  def flattenProp(propName: String): ComponentEnhancer[_, _] = js.native
  
  @JSImport("recompose", "fromRenderProps")
  @js.native
  def fromRenderProps[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ComponentType[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner]
  ): ComponentEnhancer[TInner with TOutter, TOutter] = js.native
  @JSImport("recompose", "fromRenderProps")
  @js.native
  def fromRenderProps[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ComponentType[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner],
    renderPropName: String
  ): ComponentEnhancer[TInner with TOutter, TOutter] = js.native
  
  @JSImport("recompose", "getContext")
  @js.native
  def getContext[TContext](contextTypes: ValidationMap[TContext]): InferableComponentEnhancer[TContext] = js.native
  
  @JSImport("recompose", "getDisplayName")
  @js.native
  def getDisplayName(component: ComponentType[_]): String = js.native
  
  @JSImport("recompose", "hoistStatics")
  @js.native
  def hoistStatics[TProps](hoc: InferableComponentEnhancer[TProps]): InferableComponentEnhancer[TProps] = js.native
  @JSImport("recompose", "hoistStatics")
  @js.native
  def hoistStatics[TProps](hoc: InferableComponentEnhancer[TProps], blacklist: StringDictionary[Boolean]): InferableComponentEnhancer[TProps] = js.native
  
  @JSImport("recompose", "isClassComponent")
  @js.native
  def isClassComponent(value: js.Any): Boolean = js.native
  
  @JSImport("recompose", "lifecycle")
  @js.native
  def lifecycle[TProps, TState, TInstance](spec: (ReactLifeCycleFunctions[TProps, TState, TInstance]) with TInstance): InferableComponentEnhancer[js.Object] = js.native
  
  @JSImport("recompose", "mapProps")
  @js.native
  def mapProps[TInner, TOutter](propsMapper: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner, TOutter] = js.native
  
  @JSImport("recompose", "mapPropsStream")
  @js.native
  def mapPropsStream[TInner, TOutter](transform: mapper[Subscribable[TOutter], Subscribable[TInner]]): ComponentEnhancer[TInner, TOutter] = js.native
  
  @JSImport("recompose", "mapPropsStreamWithConfig")
  @js.native
  def mapPropsStreamWithConfig(config: ObservableConfig): js.Function1[/* transform */ mapper[Subscribable[_], Subscribable[_]], ComponentEnhancer[_, _]] = js.native
  
  @JSImport("recompose", "nest")
  @js.native
  def nest(Components: (String | ComponentType[_])*): ComponentClass[_, ComponentState] = js.native
  
  @JSImport("recompose", "onlyUpdateForKeys")
  @js.native
  def onlyUpdateForKeys(propKeys: js.Array[String]): InferableComponentEnhancer[js.Object] = js.native
  @JSImport("recompose", "onlyUpdateForKeys")
  @js.native
  def onlyUpdateForKeys_T[T](propKeys: js.Array[/* keyof T */ String]): InferableComponentEnhancer[js.Object] = js.native
  
  @JSImport("recompose", "onlyUpdateForPropTypes")
  @js.native
  val onlyUpdateForPropTypes: InferableComponentEnhancer[js.Object] = js.native
  
  @JSImport("recompose", "pure")
  @js.native
  def pure[TProps](component: ComponentType[TProps]): ComponentType[TProps] = js.native
  
  @JSImport("recompose", "renameProp")
  @js.native
  def renameProp(outterName: String, innerName: String): ComponentEnhancer[_, _] = js.native
  
  @JSImport("recompose", "renameProps")
  @js.native
  def renameProps(nameMap: NameMap): ComponentEnhancer[_, _] = js.native
  
  @JSImport("recompose", "renderComponent")
  @js.native
  def renderComponent[TProps](component: String): ComponentEnhancer[_, _] = js.native
  @JSImport("recompose", "renderComponent")
  @js.native
  def renderComponent[TProps](component: ComponentType[TProps]): ComponentEnhancer[_, _] = js.native
  
  @JSImport("recompose", "renderNothing")
  @js.native
  val renderNothing: InferableComponentEnhancer[js.Object] = js.native
  
  @JSImport("recompose", "setDisplayName")
  @js.native
  def setDisplayName(displayName: String): js.Function1[/* component */ ComponentType[_], ComponentType[_]] = js.native
  
  @JSImport("recompose", "setObservableConfig")
  @js.native
  def setObservableConfig(config: ObservableConfig): Unit = js.native
  
  @JSImport("recompose", "setPropTypes")
  @js.native
  def setPropTypes[P](propTypes: ValidationMap[P]): js.Function1[/* component */ ComponentType[P], ComponentType[P]] = js.native
  
  @JSImport("recompose", "setStatic")
  @js.native
  def setStatic(key: String, value: js.Any): js.Function1[/* component */ ComponentType[_], ComponentType[_]] = js.native
  
  @JSImport("recompose", "shallowEqual")
  @js.native
  def shallowEqual(a: js.Object, b: js.Object): Boolean = js.native
  
  @JSImport("recompose", "shouldUpdate")
  @js.native
  def shouldUpdate[TProps](test: predicateDiff[TProps]): InferableComponentEnhancer[js.Object] = js.native
  
  @JSImport("recompose", "toClass")
  @js.native
  val toClass: InferableComponentEnhancer[js.Object] = js.native
  
  @JSImport("recompose", "toRenderProps")
  @js.native
  def toRenderProps[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): StatelessComponent[TOutter with Children[TInner]] = js.native
  
  @JSImport("recompose", "withContext")
  @js.native
  def withContext[TContext, TProps](childContextTypes: ValidationMap[TContext], getChildContext: mapper[TProps, _]): InferableComponentEnhancer[js.Object] = js.native
  
  @JSImport("recompose", "withHandlers")
  @js.native
  def withHandlers[TOutter, THandlers](handlerCreators: HandleCreators[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
  @JSImport("recompose", "withHandlers")
  @js.native
  def withHandlers[TOutter, THandlers](handlerCreators: HandleCreatorsFactory[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
  
  @JSImport("recompose", "withProps")
  @js.native
  def withProps[TInner, TOutter](createProps: TInner): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  @JSImport("recompose", "withProps")
  @js.native
  def withProps[TInner, TOutter](createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  
  @JSImport("recompose", "withPropsOnChange")
  @js.native
  def withPropsOnChange[TInner, TOutter](shouldMapOrKeys: js.Array[String], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  @JSImport("recompose", "withPropsOnChange")
  @js.native
  def withPropsOnChange[TInner, TOutter](shouldMapOrKeys: predicateDiff[TOutter], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  
  @JSImport("recompose", "withReducer")
  @js.native
  def withReducer[TOutter, TState, TAction, TStateName /* <: String */, TDispatchName /* <: String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: TState
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = js.native
  @JSImport("recompose", "withReducer")
  @js.native
  def withReducer[TOutter, TState, TAction, TStateName /* <: String */, TDispatchName /* <: String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: mapper[TOutter, TState]
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = js.native
  
  @JSImport("recompose", "withState")
  @js.native
  def withState[TOutter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: TState): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = js.native
  @JSImport("recompose", "withState")
  @js.native
  def withState[TOutter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: mapper[TOutter, TState]): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = js.native
  
  @JSImport("recompose", "withStateHandlers")
  @js.native
  def withStateHandlers[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: TState, stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter with TState with TUpdaters, TOutter] = js.native
  @JSImport("recompose", "withStateHandlers")
  @js.native
  def withStateHandlers[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: mapper[TOutter, TState], stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter with TState with TUpdaters, TOutter] = js.native
  
  @JSImport("recompose", "wrapDisplayName")
  @js.native
  def wrapDisplayName(component: ComponentType[_], wrapperName: String): String = js.native
  
  type ComponentEnhancer[TInner, TOutter] = js.Function1[/* component */ ComponentType[TInner], ComponentClass[TOutter, ComponentState]]
  
  type DefaultingInferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, Partial[TInjectedProps]]
  
  // withHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withhandlers
  type EventHandler = js.Function
  
  // createEventHandler: https://github.com/acdlite/recompose/blob/master/docs/API.md#createEventHandler
  @js.native
  trait EventHandlerOf[T, TSubs /* <: Subscribable[T] */] extends StObject {
    
    def handler(value: T): Unit = js.native
    
    var stream: TSubs = js.native
  }
  object EventHandlerOf {
    
    @scala.inline
    def apply[T, TSubs /* <: Subscribable[T] */](handler: T => Unit, stream: TSubs): EventHandlerOf[T, TSubs] = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventHandlerOf[T, TSubs]]
    }
    
    @scala.inline
    implicit class EventHandlerOfMutableBuilder[Self <: EventHandlerOf[_, _], T, TSubs /* <: Subscribable[T] */] (val x: Self with (EventHandlerOf[T, TSubs])) extends AnyVal {
      
      @scala.inline
      def setHandler(value: T => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStream(value: TSubs): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  type HandleCreators[TOutter, THandlers] = HandleCreatorsStructure[TOutter] with (HandleCreatorsHandlers[TOutter, THandlers])
  
  type HandleCreatorsFactory[TOutter, THandlers] = js.Function1[/* initialProps */ TOutter, HandleCreators[TOutter, THandlers]]
  
  // This type is required to infer THandlers
  type HandleCreatorsHandlers[TOutter, THandlers] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof THandlers ]: (props : TOutter): THandlers[P]}
    */ typings.recompose.recomposeStrings.HandleCreatorsHandlers with TopLevel[THandlers]
  
  // This type is required to infer TOutter
  type HandleCreatorsStructure[TOutter] = StringDictionary[mapper[TOutter, EventHandler]]
  
  type InferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ ComponentType[TInjectedProps], 
    ComponentClass[
      (Omit[TInjectedProps, /* keyof TInjectedProps */ String]) with TNeedsProps, 
      ComponentState
    ]
  ]
  
  // renameProps: https://github.com/acdlite/recompose/blob/master/docs/API.md#renameProps
  type NameMap = StringDictionary[String]
  
  // setObservableConfig: https://github.com/acdlite/recompose/blob/master/docs/API.md#setObservableConfig
  @js.native
  trait ObservableConfig extends StObject {
    
    var fromESObservable: js.UndefOr[js.Function1[/* observable */ Subscribable[_], _]] = js.native
    
    var toESObservable: js.UndefOr[js.Function1[/* stream */ js.Any, Subscribable[_]]] = js.native
  }
  object ObservableConfig {
    
    @scala.inline
    def apply(): ObservableConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObservableConfig]
    }
    
    @scala.inline
    implicit class ObservableConfigMutableBuilder[Self <: ObservableConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromESObservable(value: /* observable */ Subscribable[_] => _): Self = StObject.set(x, "fromESObservable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromESObservableUndefined: Self = StObject.set(x, "fromESObservable", js.undefined)
      
      @scala.inline
      def setToESObservable(value: /* stream */ js.Any => Subscribable[_]): Self = StObject.set(x, "toESObservable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToESObservableUndefined: Self = StObject.set(x, "toESObservable", js.undefined)
    }
  }
  
  @js.native
  trait Observer[T] extends StObject {
    
    def complete(): Unit = js.native
    
    def next(props: T): Unit = js.native
  }
  object Observer {
    
    @scala.inline
    def apply[T](complete: () => Unit, next: T => Unit): Observer[T] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Observer[T]]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer[_], T] (val x: Self with Observer[T]) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  // Diff / Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  // lifecycle: https://github.com/acdlite/recompose/blob/master/docs/API.md#lifecycle
  @js.native
  trait ReactLifeCycleFunctions[TProps, TState, TInstance] extends StObject {
    
    var UNSAFE_componentWillMount: js.UndefOr[
        js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ] = js.native
    
    var UNSAFE_componentWillReceiveProps: js.UndefOr[
        js.ThisFunction1[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          Unit
        ]
      ] = js.native
    
    var UNSAFE_componentWillUpdate: js.UndefOr[
        js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          /* nextState */ TState, 
          Unit
        ]
      ] = js.native
    
    var componentDidCatch: js.UndefOr[
        js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* error */ Error, 
          /* info */ ErrorInfo, 
          Unit
        ]
      ] = js.native
    
    var componentDidMount: js.UndefOr[
        js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ] = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* prevProps */ TProps, 
          /* prevState */ TState, 
          Unit
        ]
      ] = js.native
    
    var componentWillMount: js.UndefOr[
        js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ] = js.native
    
    var componentWillReceiveProps: js.UndefOr[
        js.ThisFunction1[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          Unit
        ]
      ] = js.native
    
    var componentWillUnmount: js.UndefOr[
        js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ] = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          /* nextState */ TState, 
          Unit
        ]
      ] = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          /* nextState */ TState, 
          Boolean
        ]
      ] = js.native
  }
  object ReactLifeCycleFunctions {
    
    @scala.inline
    def apply[TProps, TState, TInstance](): ReactLifeCycleFunctions[TProps, TState, TInstance] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactLifeCycleFunctions[TProps, TState, TInstance]]
    }
    
    @scala.inline
    implicit class ReactLifeCycleFunctionsMutableBuilder[Self <: ReactLifeCycleFunctions[_, _, _], TProps, TState, TInstance] (val x: Self with (ReactLifeCycleFunctions[TProps, TState, TInstance])) extends AnyVal {
      
      @scala.inline
      def setComponentDidCatch(
        value: js.ThisFunction2[
              /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
              /* error */ Error, 
              /* info */ ErrorInfo, 
              Unit
            ]
      ): Self = StObject.set(x, "componentDidCatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentDidCatchUndefined: Self = StObject.set(x, "componentDidCatch", js.undefined)
      
      @scala.inline
      def setComponentDidMount(
        value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ): Self = StObject.set(x, "componentDidMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentDidMountUndefined: Self = StObject.set(x, "componentDidMount", js.undefined)
      
      @scala.inline
      def setComponentDidUpdate(
        value: js.ThisFunction2[
              /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
              /* prevProps */ TProps, 
              /* prevState */ TState, 
              Unit
            ]
      ): Self = StObject.set(x, "componentDidUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentDidUpdateUndefined: Self = StObject.set(x, "componentDidUpdate", js.undefined)
      
      @scala.inline
      def setComponentWillMount(
        value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ): Self = StObject.set(x, "componentWillMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentWillMountUndefined: Self = StObject.set(x, "componentWillMount", js.undefined)
      
      @scala.inline
      def setComponentWillReceiveProps(
        value: js.ThisFunction1[
              /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
              /* nextProps */ TProps, 
              Unit
            ]
      ): Self = StObject.set(x, "componentWillReceiveProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentWillReceivePropsUndefined: Self = StObject.set(x, "componentWillReceiveProps", js.undefined)
      
      @scala.inline
      def setComponentWillUnmount(
        value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ): Self = StObject.set(x, "componentWillUnmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentWillUnmountUndefined: Self = StObject.set(x, "componentWillUnmount", js.undefined)
      
      @scala.inline
      def setComponentWillUpdate(
        value: js.ThisFunction2[
              /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
              /* nextProps */ TProps, 
              /* nextState */ TState, 
              Unit
            ]
      ): Self = StObject.set(x, "componentWillUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentWillUpdateUndefined: Self = StObject.set(x, "componentWillUpdate", js.undefined)
      
      @scala.inline
      def setShouldComponentUpdate(
        value: js.ThisFunction2[
              /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
              /* nextProps */ TProps, 
              /* nextState */ TState, 
              Boolean
            ]
      ): Self = StObject.set(x, "shouldComponentUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldComponentUpdateUndefined: Self = StObject.set(x, "shouldComponentUpdate", js.undefined)
      
      @scala.inline
      def setUNSAFE_componentWillMount(
        value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ): Self = StObject.set(x, "UNSAFE_componentWillMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUNSAFE_componentWillMountUndefined: Self = StObject.set(x, "UNSAFE_componentWillMount", js.undefined)
      
      @scala.inline
      def setUNSAFE_componentWillReceiveProps(
        value: js.ThisFunction1[
              /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
              /* nextProps */ TProps, 
              Unit
            ]
      ): Self = StObject.set(x, "UNSAFE_componentWillReceiveProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUNSAFE_componentWillReceivePropsUndefined: Self = StObject.set(x, "UNSAFE_componentWillReceiveProps", js.undefined)
      
      @scala.inline
      def setUNSAFE_componentWillUpdate(
        value: js.ThisFunction2[
              /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
              /* nextProps */ TProps, 
              /* nextState */ TState, 
              Unit
            ]
      ): Self = StObject.set(x, "UNSAFE_componentWillUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUNSAFE_componentWillUpdateUndefined: Self = StObject.set(x, "UNSAFE_componentWillUpdate", js.undefined)
    }
  }
  
  type ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance] = (_ReactLifeCycleFunctionsThisArguments[TProps, TState]) with TInstance
  
  // withStateHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withstatehandlers
  type StateHandler[TState] = js.Function1[/* repeated */ js.Any, js.UndefOr[Partial[TState]]]
  
  type StateHandlerMap[TState] = StringDictionary[StateHandler[TState]]
  
  type StateUpdaters[TOutter, TState, TUpdaters] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ updaterName in keyof TUpdaters ]: (state : TState, props : TOutter): TUpdaters[updaterName]}
    */ typings.recompose.recomposeStrings.StateUpdaters with TopLevel[TUpdaters]
  
  @js.native
  trait Subscribable[T] extends StObject {
    
    def subscribe(observer: Observer[T]): Subscription = js.native
  }
  object Subscribable {
    
    @scala.inline
    def apply[T](subscribe: Observer[T] => Subscription): Subscribable[T] = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[Subscribable[T]]
    }
    
    @scala.inline
    implicit class SubscribableMutableBuilder[Self <: Subscribable[_], T] (val x: Self with Subscribable[T]) extends AnyVal {
      
      @scala.inline
      def setSubscribe(value: Observer[T] => Subscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Subscription extends StObject {
    
    def unsubscribe(): Unit = js.native
  }
  object Subscription {
    
    @scala.inline
    def apply(unsubscribe: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait _ReactLifeCycleFunctionsThisArguments[TProps, TState] extends StObject {
    
    var context: js.Any = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callBack: js.Function0[_]): Unit = js.native
    
    var props: TProps = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def setState[TKeyOfState /* <: /* keyof TState */ String */](f: js.Function2[/* prevState */ TState, /* props */ TProps, Pick[TState, TKeyOfState]]): Unit = js.native
    def setState[TKeyOfState /* <: /* keyof TState */ String */](
      f: js.Function2[/* prevState */ TState, /* props */ TProps, Pick[TState, TKeyOfState]],
      callback: js.Function0[_]
    ): Unit = js.native
    def setState[TKeyOfState /* <: /* keyof TState */ String */](state: Pick[TState, TKeyOfState]): Unit = js.native
    def setState[TKeyOfState /* <: /* keyof TState */ String */](state: Pick[TState, TKeyOfState], callback: js.Function0[_]): Unit = js.native
    
    var state: TState = js.native
  }
  
  // createEagerFactory: https://github.com/acdlite/recompose/blob/master/docs/API.md#createEagerFactory
  type componentFactory = js.Function2[
    /* props */ js.UndefOr[js.Object], 
    /* children */ js.UndefOr[ReactNode], 
    ReactElement
  ]
  
  type mapper[TInner, TOutter] = js.Function1[/* input */ TInner, TOutter]
  
  type predicate[T] = mapper[T, Boolean]
  
  type predicateDiff[T] = js.Function2[/* current */ T, /* next */ T, Boolean]
  
  // withReducer: https://github.com/acdlite/recompose/blob/master/docs/API.md#withReducer
  type reducer[TState, TAction] = js.Function2[/* s */ TState, /* a */ TAction, TState]
  
  @js.native
  trait reducerProps[TState, TAction, TStateName /* <: String */, TDispatchName /* <: String */] extends StObject
  
  // withState: https://github.com/acdlite/recompose/blob/master/docs/API.md#withState
  @js.native
  trait stateProps[TState, TStateName /* <: String */, TStateUpdaterName /* <: String */] extends StObject
}
