package typings.router5.typesTypesRouterMod

import org.scalablytyped.runtime.StringDictionary
import typings.routeDashNode.routeDashNodeMod.RouteNodeState
import typings.routeDashNode.routeDashNodeMod.default
import typings.router5.typesTypesBaseMod.CancelFn
import typings.router5.typesTypesBaseMod.DoneFn
import typings.router5.typesTypesBaseMod.NavigationOptions
import typings.router5.typesTypesBaseMod.Params
import typings.router5.typesTypesBaseMod.SimpleState
import typings.router5.typesTypesBaseMod.State
import typings.router5.typesTypesBaseMod.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  var config: Config = js.native
  var rootNode: default = js.native
  def add(routes: js.Array[Route]): Router = js.native
  def add(routes: js.Array[Route], finalSort: Boolean): Router = js.native
  def add(routes: Route): Router = js.native
  def add(routes: Route, finalSort: Boolean): Router = js.native
  def addEventListener(eventName: js.Any, cb: js.Any): Unsubscribe = js.native
  def addNode(name: String, path: String): Router = js.native
  def addNode(name: String, path: String, canActivateHandler: ActivationFnFactory): Router = js.native
  def addPlugin(plugin: Plugin): Router = js.native
  def areStatesDescendants(parentState: State, childState: State): Boolean = js.native
  def areStatesEqual(state1: State, state2: State): Boolean = js.native
  def areStatesEqual(state1: State, state2: State, ignoreQueryParams: Boolean): Boolean = js.native
  def buildPath(route: String): String = js.native
  def buildPath(route: String, params: Params): String = js.native
  def buildState(routeName: String, routeParams: Params): RouteNodeState | Null = js.native
  def canActivate(name: String, canActivateHandler: Boolean): Router = js.native
  def canActivate(name: String, canActivateHandler: ActivationFnFactory): Router = js.native
  def canDeactivate(name: String, canDeactivateHandler: Boolean): Router = js.native
  def canDeactivate(name: String, canDeactivateHandler: ActivationFnFactory): Router = js.native
  def cancel(): Router = js.native
  def clearCanDeactivate(name: String): Router = js.native
  def clearMiddleware(): Router = js.native
  def executeFactory(
    factory: js.Function2[/* router */ js.UndefOr[this.type], /* dependencies */ js.UndefOr[Dependencies], _]
  ): js.Any = js.native
  def forward(fromRoute: String, toRoute: String): Router = js.native
  def forwardState(routeName: String, routeParams: Params): SimpleState = js.native
  def getDependencies(): Dependencies = js.native
  def getInjectables(): js.Tuple2[Router, Dependencies] = js.native
  def getLifecycleFactories(): js.Tuple2[StringDictionary[ActivationFnFactory], StringDictionary[ActivationFnFactory]] = js.native
  def getLifecycleFunctions(): js.Tuple2[StringDictionary[ActivationFn], StringDictionary[ActivationFn]] = js.native
  def getMiddlewareFactories(): js.Array[MiddlewareFactory] = js.native
  def getMiddlewareFunctions(): js.Array[Middleware] = js.native
  def getOptions(): Options = js.native
  def getPlugins(): js.Array[PluginFactory] = js.native
  def getState(): State = js.native
  def invokeEventListeners(eventName: js.Any, args: js.Any*): Unit = js.native
  def isActive(name: String): Boolean = js.native
  def isActive(name: String, params: Params): Boolean = js.native
  def isActive(name: String, params: Params, strictEquality: Boolean): Boolean = js.native
  def isActive(name: String, params: Params, strictEquality: Boolean, ignoreQueryParams: Boolean): Boolean = js.native
  def isStarted(): Boolean = js.native
  def makeNotFoundState(path: String): State = js.native
  def makeNotFoundState(path: String, options: NavigationOptions): State = js.native
  def makeState(name: String): State = js.native
  def makeState(name: String, params: Params): State = js.native
  def makeState(name: String, params: Params, path: String): State = js.native
  def makeState(name: String, params: Params, path: String, meta: js.Any): State = js.native
  def makeState(name: String, params: Params, path: String, meta: js.Any, forceId: Double): State = js.native
  def matchPath(path: String): State | Null = js.native
  def matchPath(path: String, source: String): State | Null = js.native
  def navigate(routeName: String): CancelFn = js.native
  def navigate(routeName: String, done: DoneFn): CancelFn = js.native
  def navigate(routeName: String, routeParams: Params): CancelFn = js.native
  def navigate(routeName: String, routeParams: Params, done: DoneFn): CancelFn = js.native
  def navigate(routeName: String, routeParams: Params, options: NavigationOptions): CancelFn = js.native
  def navigate(routeName: String, routeParams: Params, options: NavigationOptions, done: DoneFn): CancelFn = js.native
  def navigateToDefault(): CancelFn = js.native
  def navigateToDefault(done: DoneFn): CancelFn = js.native
  def navigateToDefault(opts: NavigationOptions): CancelFn = js.native
  def navigateToDefault(opts: NavigationOptions, done: DoneFn): CancelFn = js.native
  def removeEventListener(eventName: js.Any, cb: js.Any): Unit = js.native
  def setDependencies(deps: Dependencies): Router = js.native
  def setDependency(dependencyName: String, dependency: js.Any): Router = js.native
  def setOption(option: String, value: js.Any): Router = js.native
  def setRootPath(rootPath: String): Unit = js.native
  def setState(state: State): Unit = js.native
  def start(): Router = js.native
  def start(done: DoneFn): Router = js.native
  def start(startPathOrState: String): Router = js.native
  def start(startPathOrState: String, done: DoneFn): Router = js.native
  def start(startPathOrState: State): Router = js.native
  def start(startPathOrState: State, done: DoneFn): Router = js.native
  def stop(): Unit = js.native
  def subscribe(listener: Listener): Unsubscribe | Subscription = js.native
  def subscribe(listener: SubscribeFn): Unsubscribe | Subscription = js.native
  def transitionToState(toState: State, fromState: State, opts: NavigationOptions, done: DoneFn): js.Any = js.native
  def useMiddleware(middlewares: MiddlewareFactory*): Unsubscribe = js.native
  def usePlugin(plugins: PluginFactory*): Unsubscribe = js.native
}

