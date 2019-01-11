package typings
package recomposeLib.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val onlyUpdateForPropTypes: recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object] = js.native
  val renderNothing: recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object] = js.native
  val toClass: recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object] = js.native
  def branch[TOutter](
    test: recomposeLib.recomposeMod.predicate[TOutter],
    trueEnhancer: (recomposeLib.recomposeMod.ComponentEnhancer[_, _]) | recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object]
  ): recomposeLib.recomposeMod.ComponentEnhancer[_, TOutter] = js.native
  def branch[TOutter](
    test: recomposeLib.recomposeMod.predicate[TOutter],
    trueEnhancer: (recomposeLib.recomposeMod.ComponentEnhancer[_, _]) | recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object],
    falseEnhancer: (recomposeLib.recomposeMod.ComponentEnhancer[_, _]) | recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object]
  ): recomposeLib.recomposeMod.ComponentEnhancer[_, TOutter] = js.native
  def componentFromProp(propName: java.lang.String): reactLib.reactMod.ReactNs.StatelessComponent[_] = js.native
  def componentFromStream[TProps](
    propsToReactNode: recomposeLib.recomposeMod.mapper[
      recomposeLib.recomposeMod.Subscribable[TProps], 
      recomposeLib.recomposeMod.Subscribable[reactLib.reactMod.ReactNs.ReactNode]
    ]
  ): reactLib.reactMod.ReactNs.ComponentType[TProps] = js.native
  def componentFromStreamWithConfig(config: recomposeLib.recomposeMod.ObservableConfig): js.Function1[
    /* propsToReactNode */ recomposeLib.recomposeMod.mapper[
      recomposeLib.recomposeMod.Subscribable[_], 
      recomposeLib.recomposeMod.Subscribable[reactLib.reactMod.ReactNs.ReactNode]
    ], 
    reactLib.reactMod.ReactNs.ComponentType[_]
  ] = js.native
  def compose[TInner, TOutter](functions: js.Function*): recomposeLib.recomposeMod.ComponentEnhancer[TInner, TOutter] = js.native
  def createEagerElement(`type`: java.lang.String): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def createEagerElement(`type`: java.lang.String, props: js.Object): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def createEagerElement(`type`: java.lang.String, props: js.Object, children: reactLib.reactMod.ReactNs.ReactNode): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def createEagerElement(`type`: reactLib.reactMod.ReactNs.ComponentType[_]): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def createEagerElement(`type`: reactLib.reactMod.ReactNs.ComponentType[_], props: js.Object): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def createEagerElement(
    `type`: reactLib.reactMod.ReactNs.ComponentType[_],
    props: js.Object,
    children: reactLib.reactMod.ReactNs.ReactNode
  ): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def createEagerFactory(`type`: java.lang.String): recomposeLib.recomposeMod.componentFactory = js.native
  def createEagerFactory(`type`: reactLib.reactMod.ReactNs.ComponentType[_]): recomposeLib.recomposeMod.componentFactory = js.native
  def createEventHandler[T, TSubs /* <: recomposeLib.recomposeMod.Subscribable[T] */](): recomposeLib.recomposeMod.EventHandlerOf[T, TSubs] = js.native
  def createEventHandlerWithConfig(config: recomposeLib.recomposeMod.ObservableConfig): js.Function0[
    recomposeLib.recomposeMod.EventHandlerOf[_, recomposeLib.recomposeMod.Subscribable[_]]
  ] = js.native
  def createSink(callback: js.Function1[/* props */ js.Object, scala.Unit]): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def defaultProps[T](props: T): recomposeLib.recomposeMod.DefaultingInferableComponentEnhancer[T] = js.native
  def flattenProp(propName: java.lang.String): recomposeLib.recomposeMod.ComponentEnhancer[_, _] = js.native
  def fromRenderProps[TInner, TOutter, TRenderProps](
    RenderPropsComponent: reactLib.reactMod.ReactNs.ComponentType[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner]
  ): recomposeLib.recomposeMod.ComponentEnhancer[TInner with TOutter, TOutter] = js.native
  def fromRenderProps[TInner, TOutter, TRenderProps](
    RenderPropsComponent: reactLib.reactMod.ReactNs.ComponentType[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner],
    renderPropName: java.lang.String
  ): recomposeLib.recomposeMod.ComponentEnhancer[TInner with TOutter, TOutter] = js.native
  def getContext[TContext](contextTypes: reactLib.reactMod.ReactNs.ValidationMap[TContext]): recomposeLib.recomposeMod.InferableComponentEnhancer[TContext] = js.native
  def getDisplayName(component: reactLib.reactMod.ReactNs.ComponentType[_]): java.lang.String = js.native
  def hoistStatics[TProps](hoc: recomposeLib.recomposeMod.InferableComponentEnhancer[TProps]): recomposeLib.recomposeMod.InferableComponentEnhancer[TProps] = js.native
  def isClassComponent(value: js.Any): scala.Boolean = js.native
  def lifecycle[TProps, TState, TInstance](
    spec: (recomposeLib.recomposeMod.ReactLifeCycleFunctions[TProps, TState, TInstance]) with TInstance
  ): recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object] = js.native
  def mapProps[TInner, TOutter](propsMapper: recomposeLib.recomposeMod.mapper[TOutter, TInner]): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TInner, TOutter] = js.native
  def mapPropsStream[TInner, TOutter](
    transform: recomposeLib.recomposeMod.mapper[
      recomposeLib.recomposeMod.Subscribable[TOutter], 
      recomposeLib.recomposeMod.Subscribable[TInner]
    ]
  ): recomposeLib.recomposeMod.ComponentEnhancer[TInner, TOutter] = js.native
  def mapPropsStreamWithConfig(config: recomposeLib.recomposeMod.ObservableConfig): js.Function1[
    /* transform */ recomposeLib.recomposeMod.mapper[
      recomposeLib.recomposeMod.Subscribable[_], 
      recomposeLib.recomposeMod.Subscribable[_]
    ], 
    recomposeLib.recomposeMod.ComponentEnhancer[_, _]
  ] = js.native
  def nest(Components: (java.lang.String | reactLib.reactMod.ReactNs.ComponentType[_])*): reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def onlyUpdateForKeys(propKeys: js.Array[java.lang.String]): recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object] = js.native
  @JSName("onlyUpdateForKeys")
  def onlyUpdateForKeys_T[T](propKeys: js.Array[java.lang.String]): recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object] = js.native
  def pure[TProps](component: reactLib.reactMod.ReactNs.ComponentType[TProps]): reactLib.reactMod.ReactNs.ComponentType[TProps] = js.native
  def renameProp(outterName: java.lang.String, innerName: java.lang.String): recomposeLib.recomposeMod.ComponentEnhancer[_, _] = js.native
  def renameProps(nameMap: recomposeLib.recomposeMod.NameMap): recomposeLib.recomposeMod.ComponentEnhancer[_, _] = js.native
  def renderComponent[TProps](component: java.lang.String): recomposeLib.recomposeMod.ComponentEnhancer[_, _] = js.native
  def renderComponent[TProps](component: reactLib.reactMod.ReactNs.ComponentType[TProps]): recomposeLib.recomposeMod.ComponentEnhancer[_, _] = js.native
  def setDisplayName(displayName: java.lang.String): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[js.Object], 
    reactLib.reactMod.ReactNs.ComponentType[js.Object]
  ] = js.native
  def setObservableConfig(config: recomposeLib.recomposeMod.ObservableConfig): scala.Unit = js.native
  def setPropTypes[P](propTypes: reactLib.reactMod.ReactNs.ValidationMap[P]): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[P], 
    reactLib.reactMod.ReactNs.ComponentType[P]
  ] = js.native
  def setStatic(key: java.lang.String, value: js.Any): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[js.Object], 
    reactLib.reactMod.ReactNs.ComponentType[js.Object]
  ] = js.native
  def shallowEqual(a: js.Object, b: js.Object): scala.Boolean = js.native
  def shouldUpdate[TProps](test: recomposeLib.recomposeMod.predicateDiff[TProps]): recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object] = js.native
  def toRenderProps[TInner, TOutter](hoc: recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): reactLib.reactMod.ReactNs.StatelessComponent[TOutter with recomposeLib.Anon_Children[TInner]] = js.native
  def withContext[TContext, TProps](
    childContextTypes: reactLib.reactMod.ReactNs.ValidationMap[TContext],
    getChildContext: recomposeLib.recomposeMod.mapper[TProps, _]
  ): recomposeLib.recomposeMod.InferableComponentEnhancer[js.Object] = js.native
  def withHandlers[TOutter, THandlers](handlerCreators: recomposeLib.recomposeMod.HandleCreators[TOutter, THandlers]): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
  def withHandlers[TOutter, THandlers](handlerCreators: recomposeLib.recomposeMod.HandleCreatorsFactory[TOutter, THandlers]): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
  def withProps[TInner, TOutter](createProps: TInner): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def withProps[TInner, TOutter](createProps: recomposeLib.recomposeMod.mapper[TOutter, TInner]): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def withPropsOnChange[TInner, TOutter](
    shouldMapOrKeys: js.Array[java.lang.String],
    createProps: recomposeLib.recomposeMod.mapper[TOutter, TInner]
  ): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def withPropsOnChange[TInner, TOutter](
    shouldMapOrKeys: recomposeLib.recomposeMod.predicateDiff[TOutter],
    createProps: recomposeLib.recomposeMod.mapper[TOutter, TInner]
  ): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def withReducer[TOutter, TState, TAction, TStateName /* <: java.lang.String */, TDispatchName /* <: java.lang.String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: recomposeLib.recomposeMod.reducer[TState, TAction],
    initialState: TState
  ): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[
    recomposeLib.recomposeMod.reducerProps[TState, TAction, TStateName, TDispatchName], 
    TOutter
  ] = js.native
  def withReducer[TOutter, TState, TAction, TStateName /* <: java.lang.String */, TDispatchName /* <: java.lang.String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: recomposeLib.recomposeMod.reducer[TState, TAction],
    initialState: recomposeLib.recomposeMod.mapper[TOutter, TState]
  ): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[
    recomposeLib.recomposeMod.reducerProps[TState, TAction, TStateName, TDispatchName], 
    TOutter
  ] = js.native
  def withState[TOutter, TState, TStateName /* <: java.lang.String */, TStateUpdaterName /* <: java.lang.String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: TState): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[
    recomposeLib.recomposeMod.stateProps[TState, TStateName, TStateUpdaterName], 
    TOutter
  ] = js.native
  def withState[TOutter, TState, TStateName /* <: java.lang.String */, TStateUpdaterName /* <: java.lang.String */](
    stateName: TStateName,
    stateUpdaterName: TStateUpdaterName,
    initialState: recomposeLib.recomposeMod.mapper[TOutter, TState]
  ): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[
    recomposeLib.recomposeMod.stateProps[TState, TStateName, TStateUpdaterName], 
    TOutter
  ] = js.native
  def withStateHandlers[TState, TUpdaters /* <: recomposeLib.recomposeMod.StateHandlerMap[TState] */, TOutter](
    createProps: TState,
    stateUpdaters: recomposeLib.recomposeMod.StateUpdaters[TOutter, TState, TUpdaters]
  ): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TOutter with TState with TUpdaters, TOutter] = js.native
  def withStateHandlers[TState, TUpdaters /* <: recomposeLib.recomposeMod.StateHandlerMap[TState] */, TOutter](
    createProps: recomposeLib.recomposeMod.mapper[TOutter, TState],
    stateUpdaters: recomposeLib.recomposeMod.StateUpdaters[TOutter, TState, TUpdaters]
  ): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TOutter with TState with TUpdaters, TOutter] = js.native
  def wrapDisplayName(component: reactLib.reactMod.ReactNs.ComponentType[_], wrapperName: java.lang.String): java.lang.String = js.native
}

