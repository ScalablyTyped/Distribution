package typings.recompose.recomposeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.StatelessComponent
import typings.react.reactMod.ValidationMap
import typings.recompose.Anon_Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val onlyUpdateForPropTypes: InferableComponentEnhancer[js.Object] = js.native
  val renderNothing: InferableComponentEnhancer[js.Object] = js.native
  val toClass: InferableComponentEnhancer[js.Object] = js.native
  def branch[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[_, TOutter] = js.native
  def branch[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object],
    falseEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[_, TOutter] = js.native
  def componentFromProp(propName: String): StatelessComponent[_] = js.native
  def componentFromStream[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[ReactNode]]): ComponentType[TProps] = js.native
  def componentFromStreamWithConfig(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[_], Subscribable[ReactNode]], 
    ComponentType[_]
  ] = js.native
  def compose[TInner, TOutter](functions: js.Function*): ComponentEnhancer[TInner, TOutter] = js.native
  def createEagerElement(`type`: String): ReactElement = js.native
  def createEagerElement(`type`: String, props: js.Object): ReactElement = js.native
  def createEagerElement(`type`: String, props: js.Object, children: ReactNode): ReactElement = js.native
  def createEagerElement(`type`: ComponentType[_]): ReactElement = js.native
  def createEagerElement(`type`: ComponentType[_], props: js.Object): ReactElement = js.native
  def createEagerElement(`type`: ComponentType[_], props: js.Object, children: ReactNode): ReactElement = js.native
  def createEagerFactory(`type`: String): componentFactory = js.native
  def createEagerFactory(`type`: ComponentType[_]): componentFactory = js.native
  def createEventHandler[T, TSubs /* <: Subscribable[T] */](): EventHandlerOf[T, TSubs] = js.native
  def createEventHandlerWithConfig(config: ObservableConfig): js.Function0[EventHandlerOf[_, Subscribable[_]]] = js.native
  def createSink(callback: js.Function1[/* props */ js.Object, Unit]): ComponentClass[_, ComponentState] = js.native
  def defaultProps[T](props: T): DefaultingInferableComponentEnhancer[T] = js.native
  def flattenProp(propName: String): ComponentEnhancer[_, _] = js.native
  def fromRenderProps[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ComponentType[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner]
  ): ComponentEnhancer[TInner with TOutter, TOutter] = js.native
  def fromRenderProps[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ComponentType[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner],
    renderPropName: String
  ): ComponentEnhancer[TInner with TOutter, TOutter] = js.native
  def getContext[TContext](contextTypes: ValidationMap[TContext]): InferableComponentEnhancer[TContext] = js.native
  def getDisplayName(component: ComponentType[_]): String = js.native
  def hoistStatics[TProps](hoc: InferableComponentEnhancer[TProps]): InferableComponentEnhancer[TProps] = js.native
  def hoistStatics[TProps](hoc: InferableComponentEnhancer[TProps], blacklist: StringDictionary[Boolean]): InferableComponentEnhancer[TProps] = js.native
  def isClassComponent(value: js.Any): Boolean = js.native
  def lifecycle[TProps, TState, TInstance](spec: (ReactLifeCycleFunctions[TProps, TState, TInstance]) with TInstance): InferableComponentEnhancer[js.Object] = js.native
  def mapProps[TInner, TOutter](propsMapper: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner, TOutter] = js.native
  def mapPropsStream[TInner, TOutter](transform: mapper[Subscribable[TOutter], Subscribable[TInner]]): ComponentEnhancer[TInner, TOutter] = js.native
  def mapPropsStreamWithConfig(config: ObservableConfig): js.Function1[/* transform */ mapper[Subscribable[_], Subscribable[_]], ComponentEnhancer[_, _]] = js.native
  def nest(Components: (String | ComponentType[_])*): ComponentClass[_, ComponentState] = js.native
  def onlyUpdateForKeys(propKeys: js.Array[String]): InferableComponentEnhancer[js.Object] = js.native
  @JSName("onlyUpdateForKeys")
  def onlyUpdateForKeys_T[T](propKeys: js.Array[String]): InferableComponentEnhancer[js.Object] = js.native
  def pure[TProps](component: ComponentType[TProps]): ComponentType[TProps] = js.native
  def renameProp(outterName: String, innerName: String): ComponentEnhancer[_, _] = js.native
  def renameProps(nameMap: NameMap): ComponentEnhancer[_, _] = js.native
  def renderComponent[TProps](component: String): ComponentEnhancer[_, _] = js.native
  def renderComponent[TProps](component: ComponentType[TProps]): ComponentEnhancer[_, _] = js.native
  def setDisplayName(displayName: String): js.Function1[/* component */ ComponentType[_], ComponentType[_]] = js.native
  def setObservableConfig(config: ObservableConfig): Unit = js.native
  def setPropTypes[P](propTypes: ValidationMap[P]): js.Function1[/* component */ ComponentType[P], ComponentType[P]] = js.native
  def setStatic(key: String, value: js.Any): js.Function1[/* component */ ComponentType[_], ComponentType[_]] = js.native
  def shallowEqual(a: js.Object, b: js.Object): Boolean = js.native
  def shouldUpdate[TProps](test: predicateDiff[TProps]): InferableComponentEnhancer[js.Object] = js.native
  def toRenderProps[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): StatelessComponent[TOutter with Anon_Children[TInner]] = js.native
  def withContext[TContext, TProps](childContextTypes: ValidationMap[TContext], getChildContext: mapper[TProps, _]): InferableComponentEnhancer[js.Object] = js.native
  def withHandlers[TOutter, THandlers](handlerCreators: HandleCreators[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
  def withHandlers[TOutter, THandlers](handlerCreators: HandleCreatorsFactory[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
  def withProps[TInner, TOutter](createProps: TInner): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def withProps[TInner, TOutter](createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def withPropsOnChange[TInner, TOutter](shouldMapOrKeys: js.Array[String], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def withPropsOnChange[TInner, TOutter](shouldMapOrKeys: predicateDiff[TOutter], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def withReducer[TOutter, TState, TAction, TStateName /* <: String */, TDispatchName /* <: String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: TState
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = js.native
  def withReducer[TOutter, TState, TAction, TStateName /* <: String */, TDispatchName /* <: String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: mapper[TOutter, TState]
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = js.native
  def withState[TOutter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: TState): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = js.native
  def withState[TOutter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: mapper[TOutter, TState]): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = js.native
  def withStateHandlers[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: TState, stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter with TState with TUpdaters, TOutter] = js.native
  def withStateHandlers[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: mapper[TOutter, TState], stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter with TState with TUpdaters, TOutter] = js.native
  def wrapDisplayName(component: ComponentType[_], wrapperName: String): String = js.native
}

