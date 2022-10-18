package typings.recompose

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.ErrorInfo
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import typings.recompose.anon.Children
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("recompose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def branch[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[Any, Any]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[Any, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("branch")(test.asInstanceOf[js.Any], trueEnhancer.asInstanceOf[js.Any])).asInstanceOf[ComponentEnhancer[Any, TOutter]]
  inline def branch[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[Any, Any]) | InferableComponentEnhancer[js.Object],
    falseEnhancer: (ComponentEnhancer[Any, Any]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[Any, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("branch")(test.asInstanceOf[js.Any], trueEnhancer.asInstanceOf[js.Any], falseEnhancer.asInstanceOf[js.Any])).asInstanceOf[ComponentEnhancer[Any, TOutter]]
  
  inline def componentFromProp(propName: String): FunctionComponent[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFromProp")(propName.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[Any]]
  
  inline def componentFromStream[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[ReactNode]]): ComponentType[TProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFromStream")(propsToReactNode.asInstanceOf[js.Any]).asInstanceOf[ComponentType[TProps]]
  
  inline def componentFromStreamWithConfig(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[Any], Subscribable[ReactNode]], 
    ComponentType[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFromStreamWithConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* propsToReactNode */ mapper[Subscribable[Any], Subscribable[ReactNode]], 
    ComponentType[Any]
  ]]
  
  inline def compose[TInner, TOutter](functions: js.Function*): ComponentEnhancer[TInner, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(functions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ComponentEnhancer[TInner, TOutter]]
  
  inline def createEagerElement(`type`: String): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createEagerElement")(`type`.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  inline def createEagerElement(`type`: String, props: js.Object): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createEagerElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def createEagerElement(`type`: String, props: js.Object, children: ReactNode): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createEagerElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def createEagerElement(`type`: String, props: Unit, children: ReactNode): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createEagerElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def createEagerElement(`type`: ComponentType[Any]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createEagerElement")(`type`.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  inline def createEagerElement(`type`: ComponentType[Any], props: js.Object): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createEagerElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def createEagerElement(`type`: ComponentType[Any], props: js.Object, children: ReactNode): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createEagerElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def createEagerElement(`type`: ComponentType[Any], props: Unit, children: ReactNode): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createEagerElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  inline def createEagerFactory(`type`: String): componentFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("createEagerFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[componentFactory]
  inline def createEagerFactory(`type`: ComponentType[Any]): componentFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("createEagerFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[componentFactory]
  
  inline def createEventHandler[T, TSubs /* <: Subscribable[T] */](): EventHandlerOf[T, TSubs] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventHandler")().asInstanceOf[EventHandlerOf[T, TSubs]]
  
  inline def createEventHandlerWithConfig(config: ObservableConfig): js.Function0[EventHandlerOf[Any, Subscribable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventHandlerWithConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[EventHandlerOf[Any, Subscribable[Any]]]]
  
  inline def createSink(callback: js.Function1[/* props */ js.Object, Unit]): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSink")(callback.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Any, ComponentState]]
  
  inline def defaultProps[T](props: T): DefaultingInferableComponentEnhancer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultProps")(props.asInstanceOf[js.Any]).asInstanceOf[DefaultingInferableComponentEnhancer[T]]
  
  inline def flattenProp(propName: String): ComponentEnhancer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenProp")(propName.asInstanceOf[js.Any]).asInstanceOf[ComponentEnhancer[Any, Any]]
  
  inline def fromRenderProps[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ComponentType[Any],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner]
  ): ComponentEnhancer[TInner & TOutter, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRenderProps")(RenderPropsComponent.asInstanceOf[js.Any], propsMapper.asInstanceOf[js.Any])).asInstanceOf[ComponentEnhancer[TInner & TOutter, TOutter]]
  inline def fromRenderProps[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ComponentType[Any],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner],
    renderPropName: String
  ): ComponentEnhancer[TInner & TOutter, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRenderProps")(RenderPropsComponent.asInstanceOf[js.Any], propsMapper.asInstanceOf[js.Any], renderPropName.asInstanceOf[js.Any])).asInstanceOf[ComponentEnhancer[TInner & TOutter, TOutter]]
  
  inline def getContext[TContext](contextTypes: ValidationMap[TContext]): InferableComponentEnhancer[TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(contextTypes.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancer[TContext]]
  
  inline def getDisplayName(component: ComponentType[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(component.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hoistStatics[TProps](hoc: InferableComponentEnhancer[TProps]): InferableComponentEnhancer[TProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("hoistStatics")(hoc.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancer[TProps]]
  inline def hoistStatics[TProps](hoc: InferableComponentEnhancer[TProps], blacklist: StringDictionary[Boolean]): InferableComponentEnhancer[TProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("hoistStatics")(hoc.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancer[TProps]]
  
  inline def isClassComponent(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassComponent")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lifecycle[TProps, TState, TInstance](spec: (ReactLifeCycleFunctions[TProps, TState, TInstance]) & TInstance): InferableComponentEnhancer[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("lifecycle")(spec.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancer[js.Object]]
  
  inline def mapProps[TInner, TOutter](propsMapper: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapProps")(propsMapper.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[TInner, TOutter]]
  
  inline def mapPropsStream[TInner, TOutter](transform: mapper[Subscribable[TOutter], Subscribable[TInner]]): ComponentEnhancer[TInner, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapPropsStream")(transform.asInstanceOf[js.Any]).asInstanceOf[ComponentEnhancer[TInner, TOutter]]
  
  inline def mapPropsStreamWithConfig(config: ObservableConfig): js.Function1[
    /* transform */ mapper[Subscribable[Any], Subscribable[Any]], 
    ComponentEnhancer[Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapPropsStreamWithConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* transform */ mapper[Subscribable[Any], Subscribable[Any]], 
    ComponentEnhancer[Any, Any]
  ]]
  
  inline def nest(Components: (String | ComponentType[Any])*): ComponentClass[Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("nest")(Components.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ComponentClass[Any, ComponentState]]
  
  inline def onlyUpdateForKeys(propKeys: js.Array[String]): InferableComponentEnhancer[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("onlyUpdateForKeys")(propKeys.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancer[js.Object]]
  
  inline def onlyUpdateForKeys_T[T](propKeys: js.Array[/* keyof T */ String]): InferableComponentEnhancer[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("onlyUpdateForKeys")(propKeys.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancer[js.Object]]
  
  @JSImport("recompose", "onlyUpdateForPropTypes")
  @js.native
  val onlyUpdateForPropTypes: InferableComponentEnhancer[js.Object] = js.native
  
  inline def pure[TProps](component: ComponentType[TProps]): ComponentType[TProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("pure")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[TProps]]
  
  inline def renameProp(outterName: String, innerName: String): ComponentEnhancer[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("renameProp")(outterName.asInstanceOf[js.Any], innerName.asInstanceOf[js.Any])).asInstanceOf[ComponentEnhancer[Any, Any]]
  
  inline def renameProps(nameMap: NameMap): ComponentEnhancer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("renameProps")(nameMap.asInstanceOf[js.Any]).asInstanceOf[ComponentEnhancer[Any, Any]]
  
  inline def renderComponent[TProps](component: String): ComponentEnhancer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderComponent")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentEnhancer[Any, Any]]
  inline def renderComponent[TProps](component: ComponentType[TProps]): ComponentEnhancer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderComponent")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentEnhancer[Any, Any]]
  
  @JSImport("recompose", "renderNothing")
  @js.native
  val renderNothing: InferableComponentEnhancer[js.Object] = js.native
  
  inline def setDisplayName(displayName: String): js.Function1[/* component */ ComponentType[Any], ComponentType[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayName")(displayName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]]
  
  inline def setObservableConfig(config: ObservableConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setObservableConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setPropTypes[P](propTypes: ValidationMap[P]): js.Function1[/* component */ ComponentType[P], ComponentType[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPropTypes")(propTypes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[P], ComponentType[P]]]
  
  inline def setStatic(key: String, value: Any): js.Function1[/* component */ ComponentType[Any], ComponentType[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatic")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]]
  
  inline def shallowEqual(a: js.Object, b: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shouldUpdate[TProps](test: predicateDiff[TProps]): InferableComponentEnhancer[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldUpdate")(test.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancer[js.Object]]
  
  @JSImport("recompose", "toClass")
  @js.native
  val toClass: InferableComponentEnhancer[js.Object] = js.native
  
  inline def toRenderProps[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner & TOutter, TOutter]): FunctionComponent[TOutter & Children[TInner]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toRenderProps")(hoc.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[TOutter & Children[TInner]]]
  
  inline def withContext[TContext, TProps](childContextTypes: ValidationMap[TContext], getChildContext: mapper[TProps, Any]): InferableComponentEnhancer[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("withContext")(childContextTypes.asInstanceOf[js.Any], getChildContext.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancer[js.Object]]
  
  inline def withHandlers[TOutter, THandlers](handlerCreators: HandleCreators[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers & TOutter, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("withHandlers")(handlerCreators.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[THandlers & TOutter, TOutter]]
  inline def withHandlers[TOutter, THandlers](handlerCreators: HandleCreatorsFactory[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers & TOutter, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("withHandlers")(handlerCreators.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[THandlers & TOutter, TOutter]]
  
  inline def withProps[TInner, TOutter](createProps: TInner): InferableComponentEnhancerWithProps[TInner & TOutter, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("withProps")(createProps.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOutter, TOutter]]
  inline def withProps[TInner, TOutter](createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner & TOutter, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("withProps")(createProps.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOutter, TOutter]]
  
  inline def withPropsOnChange[TInner, TOutter](shouldMapOrKeys: js.Array[String], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner & TOutter, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withPropsOnChange")(shouldMapOrKeys.asInstanceOf[js.Any], createProps.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOutter, TOutter]]
  inline def withPropsOnChange[TInner, TOutter](shouldMapOrKeys: predicateDiff[TOutter], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner & TOutter, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withPropsOnChange")(shouldMapOrKeys.asInstanceOf[js.Any], createProps.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOutter, TOutter]]
  
  inline def withReducer[TOutter, TState, TAction, TStateName /* <: String */, TDispatchName /* <: String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: TState
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withReducer")(stateName.asInstanceOf[js.Any], dispatchName.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter]]
  inline def withReducer[TOutter, TState, TAction, TStateName /* <: String */, TDispatchName /* <: String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: mapper[TOutter, TState]
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withReducer")(stateName.asInstanceOf[js.Any], dispatchName.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter]]
  
  inline def withState[TOutter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: TState): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withState")(stateName.asInstanceOf[js.Any], stateUpdaterName.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter]]
  inline def withState[TOutter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: mapper[TOutter, TState]): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withState")(stateName.asInstanceOf[js.Any], stateUpdaterName.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter]]
  
  inline def withStateHandlers[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: TState, stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter & TState & TUpdaters, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStateHandlers")(createProps.asInstanceOf[js.Any], stateUpdaters.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TOutter & TState & TUpdaters, TOutter]]
  inline def withStateHandlers[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: mapper[TOutter, TState], stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter & TState & TUpdaters, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStateHandlers")(createProps.asInstanceOf[js.Any], stateUpdaters.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TOutter & TState & TUpdaters, TOutter]]
  
  inline def wrapDisplayName(component: ComponentType[Any], wrapperName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapDisplayName")(component.asInstanceOf[js.Any], wrapperName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type ComponentEnhancer[TInner, TOutter] = js.Function1[/* component */ ComponentType[TInner], ComponentClass[TOutter, ComponentState]]
  
  type DefaultingInferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, Partial[TInjectedProps]]
  
  // withHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withhandlers
  type EventHandler = js.Function
  
  // createEventHandler: https://github.com/acdlite/recompose/blob/master/docs/API.md#createEventHandler
  trait EventHandlerOf[T, TSubs /* <: Subscribable[T] */] extends StObject {
    
    def handler(value: T): Unit
    
    var stream: TSubs
  }
  object EventHandlerOf {
    
    inline def apply[T, TSubs /* <: Subscribable[T] */](handler: T => Unit, stream: TSubs): EventHandlerOf[T, TSubs] = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventHandlerOf[T, TSubs]]
    }
    
    extension [Self <: EventHandlerOf[?, ?], T, TSubs /* <: Subscribable[T] */](x: Self & (EventHandlerOf[T, TSubs])) {
      
      inline def setHandler(value: T => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      inline def setStream(value: TSubs): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  type HandleCreators[TOutter, THandlers] = HandleCreatorsStructure[TOutter] & (HandleCreatorsHandlers[TOutter, THandlers])
  
  type HandleCreatorsFactory[TOutter, THandlers] = js.Function1[/* initialProps */ TOutter, HandleCreators[TOutter, THandlers]]
  
  // This type is required to infer THandlers
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof THandlers ]: (props : TOutter): THandlers[P]}
    }}}
    */
  @js.native
  trait HandleCreatorsHandlers[TOutter, THandlers] extends StObject
  
  // This type is required to infer TOutter
  type HandleCreatorsStructure[TOutter] = StringDictionary[mapper[TOutter, EventHandler]]
  
  type InferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ ComponentType[TInjectedProps], 
    ComponentClass[
      (Omit[TInjectedProps, /* keyof TInjectedProps */ String]) & TNeedsProps, 
      ComponentState
    ]
  ]
  
  // renameProps: https://github.com/acdlite/recompose/blob/master/docs/API.md#renameProps
  type NameMap = StringDictionary[String]
  
  // setObservableConfig: https://github.com/acdlite/recompose/blob/master/docs/API.md#setObservableConfig
  trait ObservableConfig extends StObject {
    
    var fromESObservable: js.UndefOr[js.Function1[/* observable */ Subscribable[Any], Any]] = js.undefined
    
    var toESObservable: js.UndefOr[js.Function1[/* stream */ Any, Subscribable[Any]]] = js.undefined
  }
  object ObservableConfig {
    
    inline def apply(): ObservableConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObservableConfig]
    }
    
    extension [Self <: ObservableConfig](x: Self) {
      
      inline def setFromESObservable(value: /* observable */ Subscribable[Any] => Any): Self = StObject.set(x, "fromESObservable", js.Any.fromFunction1(value))
      
      inline def setFromESObservableUndefined: Self = StObject.set(x, "fromESObservable", js.undefined)
      
      inline def setToESObservable(value: /* stream */ Any => Subscribable[Any]): Self = StObject.set(x, "toESObservable", js.Any.fromFunction1(value))
      
      inline def setToESObservableUndefined: Self = StObject.set(x, "toESObservable", js.undefined)
    }
  }
  
  trait Observer[T] extends StObject {
    
    def complete(): Unit
    
    def next(props: T): Unit
  }
  object Observer {
    
    inline def apply[T](complete: () => Unit, next: T => Unit): Observer[T] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Observer[T]]
    }
    
    extension [Self <: Observer[?], T](x: Self & Observer[T]) {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  // Diff / Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  // lifecycle: https://github.com/acdlite/recompose/blob/master/docs/API.md#lifecycle
  trait ReactLifeCycleFunctions[TProps, TState, TInstance] extends StObject {
    
    var UNSAFE_componentWillMount: js.UndefOr[
        js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ] = js.undefined
    
    var UNSAFE_componentWillReceiveProps: js.UndefOr[
        js.ThisFunction1[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          Unit
        ]
      ] = js.undefined
    
    var UNSAFE_componentWillUpdate: js.UndefOr[
        js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          /* nextState */ TState, 
          Unit
        ]
      ] = js.undefined
    
    var componentDidCatch: js.UndefOr[
        js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* error */ js.Error, 
          /* info */ ErrorInfo, 
          Unit
        ]
      ] = js.undefined
    
    var componentDidMount: js.UndefOr[
        js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ] = js.undefined
    
    var componentDidUpdate: js.UndefOr[
        js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* prevProps */ TProps, 
          /* prevState */ TState, 
          Unit
        ]
      ] = js.undefined
    
    var componentWillMount: js.UndefOr[
        js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ] = js.undefined
    
    var componentWillReceiveProps: js.UndefOr[
        js.ThisFunction1[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          Unit
        ]
      ] = js.undefined
    
    var componentWillUnmount: js.UndefOr[
        js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ] = js.undefined
    
    var componentWillUpdate: js.UndefOr[
        js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          /* nextState */ TState, 
          Unit
        ]
      ] = js.undefined
    
    var shouldComponentUpdate: js.UndefOr[
        js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          /* nextState */ TState, 
          Boolean
        ]
      ] = js.undefined
  }
  object ReactLifeCycleFunctions {
    
    inline def apply[TProps, TState, TInstance](): ReactLifeCycleFunctions[TProps, TState, TInstance] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactLifeCycleFunctions[TProps, TState, TInstance]]
    }
    
    extension [Self <: ReactLifeCycleFunctions[?, ?, ?], TProps, TState, TInstance](x: Self & (ReactLifeCycleFunctions[TProps, TState, TInstance])) {
      
      inline def setComponentDidCatch(
        value: js.ThisFunction2[
              /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
              /* error */ js.Error, 
              /* info */ ErrorInfo, 
              Unit
            ]
      ): Self = StObject.set(x, "componentDidCatch", value.asInstanceOf[js.Any])
      
      inline def setComponentDidCatchUndefined: Self = StObject.set(x, "componentDidCatch", js.undefined)
      
      inline def setComponentDidMount(
        value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ): Self = StObject.set(x, "componentDidMount", value.asInstanceOf[js.Any])
      
      inline def setComponentDidMountUndefined: Self = StObject.set(x, "componentDidMount", js.undefined)
      
      inline def setComponentDidUpdate(
        value: js.ThisFunction2[
              /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
              /* prevProps */ TProps, 
              /* prevState */ TState, 
              Unit
            ]
      ): Self = StObject.set(x, "componentDidUpdate", value.asInstanceOf[js.Any])
      
      inline def setComponentDidUpdateUndefined: Self = StObject.set(x, "componentDidUpdate", js.undefined)
      
      inline def setComponentWillMount(
        value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ): Self = StObject.set(x, "componentWillMount", value.asInstanceOf[js.Any])
      
      inline def setComponentWillMountUndefined: Self = StObject.set(x, "componentWillMount", js.undefined)
      
      inline def setComponentWillReceiveProps(
        value: js.ThisFunction1[
              /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
              /* nextProps */ TProps, 
              Unit
            ]
      ): Self = StObject.set(x, "componentWillReceiveProps", value.asInstanceOf[js.Any])
      
      inline def setComponentWillReceivePropsUndefined: Self = StObject.set(x, "componentWillReceiveProps", js.undefined)
      
      inline def setComponentWillUnmount(
        value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ): Self = StObject.set(x, "componentWillUnmount", value.asInstanceOf[js.Any])
      
      inline def setComponentWillUnmountUndefined: Self = StObject.set(x, "componentWillUnmount", js.undefined)
      
      inline def setComponentWillUpdate(
        value: js.ThisFunction2[
              /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
              /* nextProps */ TProps, 
              /* nextState */ TState, 
              Unit
            ]
      ): Self = StObject.set(x, "componentWillUpdate", value.asInstanceOf[js.Any])
      
      inline def setComponentWillUpdateUndefined: Self = StObject.set(x, "componentWillUpdate", js.undefined)
      
      inline def setShouldComponentUpdate(
        value: js.ThisFunction2[
              /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
              /* nextProps */ TProps, 
              /* nextState */ TState, 
              Boolean
            ]
      ): Self = StObject.set(x, "shouldComponentUpdate", value.asInstanceOf[js.Any])
      
      inline def setShouldComponentUpdateUndefined: Self = StObject.set(x, "shouldComponentUpdate", js.undefined)
      
      inline def setUNSAFE_componentWillMount(
        value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
      ): Self = StObject.set(x, "UNSAFE_componentWillMount", value.asInstanceOf[js.Any])
      
      inline def setUNSAFE_componentWillMountUndefined: Self = StObject.set(x, "UNSAFE_componentWillMount", js.undefined)
      
      inline def setUNSAFE_componentWillReceiveProps(
        value: js.ThisFunction1[
              /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
              /* nextProps */ TProps, 
              Unit
            ]
      ): Self = StObject.set(x, "UNSAFE_componentWillReceiveProps", value.asInstanceOf[js.Any])
      
      inline def setUNSAFE_componentWillReceivePropsUndefined: Self = StObject.set(x, "UNSAFE_componentWillReceiveProps", js.undefined)
      
      inline def setUNSAFE_componentWillUpdate(
        value: js.ThisFunction2[
              /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
              /* nextProps */ TProps, 
              /* nextState */ TState, 
              Unit
            ]
      ): Self = StObject.set(x, "UNSAFE_componentWillUpdate", value.asInstanceOf[js.Any])
      
      inline def setUNSAFE_componentWillUpdateUndefined: Self = StObject.set(x, "UNSAFE_componentWillUpdate", js.undefined)
    }
  }
  
  type ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance] = (_ReactLifeCycleFunctionsThisArguments[TProps, TState]) & TInstance
  
  // withStateHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withstatehandlers
  @js.native
  trait StateHandler[TState] extends StObject {
    
    def apply(payload: Any*): js.UndefOr[Partial[TState]] = js.native
  }
  
  type StateHandlerMap[TState] = StringDictionary[StateHandler[TState]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ updaterName in keyof TUpdaters ]: (state : TState, props : TOutter): TUpdaters[updaterName]}
    }}}
    */
  @js.native
  trait StateUpdaters[TOutter, TState, TUpdaters] extends StObject
  
  trait Subscribable[T] extends StObject {
    
    def subscribe(observer: Observer[T]): Subscription
  }
  object Subscribable {
    
    inline def apply[T](subscribe: Observer[T] => Subscription): Subscribable[T] = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[Subscribable[T]]
    }
    
    extension [Self <: Subscribable[?], T](x: Self & Subscribable[T]) {
      
      inline def setSubscribe(value: Observer[T] => Subscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  trait Subscription extends StObject {
    
    def unsubscribe(): Unit
  }
  object Subscription {
    
    inline def apply(unsubscribe: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait _ReactLifeCycleFunctionsThisArguments[TProps, TState] extends StObject {
    
    var context: Any = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callBack: js.Function0[Any]): Unit = js.native
    
    var props: TProps = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def setState[TKeyOfState /* <: /* keyof TState */ String */](f: js.Function2[/* prevState */ TState, /* props */ TProps, Pick[TState, TKeyOfState]]): Unit = js.native
    def setState[TKeyOfState /* <: /* keyof TState */ String */](
      f: js.Function2[/* prevState */ TState, /* props */ TProps, Pick[TState, TKeyOfState]],
      callback: js.Function0[Any]
    ): Unit = js.native
    def setState[TKeyOfState /* <: /* keyof TState */ String */](state: Pick[TState, TKeyOfState]): Unit = js.native
    def setState[TKeyOfState /* <: /* keyof TState */ String */](state: Pick[TState, TKeyOfState], callback: js.Function0[Any]): Unit = js.native
    
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
