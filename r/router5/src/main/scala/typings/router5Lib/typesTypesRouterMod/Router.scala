package typings
package router5Lib.typesTypesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  var config: Config = js.native
  var rootNode: routeDashNodeLib.routeDashNodeMod.default = js.native
  def add(routes: js.Array[Route]): Router = js.native
  def add(routes: js.Array[Route], finalSort: scala.Boolean): Router = js.native
  def add(routes: Route): Router = js.native
  def add(routes: Route, finalSort: scala.Boolean): Router = js.native
  def addEventListener(eventName: js.Any, cb: js.Any): router5Lib.typesTypesBaseMod.Unsubscribe = js.native
  def addNode(name: java.lang.String, path: java.lang.String): Router = js.native
  def addNode(name: java.lang.String, path: java.lang.String, canActivateHandler: ActivationFnFactory): Router = js.native
  def addPlugin(plugin: Plugin): Router = js.native
  def areStatesDescendants(parentState: router5Lib.typesTypesBaseMod.State, childState: router5Lib.typesTypesBaseMod.State): scala.Boolean = js.native
  def areStatesEqual(state1: router5Lib.typesTypesBaseMod.State, state2: router5Lib.typesTypesBaseMod.State): scala.Boolean = js.native
  def areStatesEqual(
    state1: router5Lib.typesTypesBaseMod.State,
    state2: router5Lib.typesTypesBaseMod.State,
    ignoreQueryParams: scala.Boolean
  ): scala.Boolean = js.native
  def buildPath(route: java.lang.String): java.lang.String = js.native
  def buildPath(route: java.lang.String, params: router5Lib.typesTypesBaseMod.Params): java.lang.String = js.native
  def buildState(routeName: java.lang.String, routeParams: router5Lib.typesTypesBaseMod.Params): routeDashNodeLib.routeDashNodeMod.RouteNodeState | scala.Null = js.native
  def canActivate(name: java.lang.String, canActivateHandler: ActivationFnFactory): Router = js.native
  def canActivate(name: java.lang.String, canActivateHandler: scala.Boolean): Router = js.native
  def canDeactivate(name: java.lang.String, canDeactivateHandler: ActivationFnFactory): Router = js.native
  def canDeactivate(name: java.lang.String, canDeactivateHandler: scala.Boolean): Router = js.native
  def cancel(): Router = js.native
  def clearCanDeactivate(name: java.lang.String): Router = js.native
  def clearMiddleware(): Router = js.native
  def executeFactory(
    factory: js.Function2[/* router */ js.UndefOr[this.type], /* dependencies */ js.UndefOr[Dependencies], _]
  ): js.Any = js.native
  def forward(fromRoute: java.lang.String, toRoute: java.lang.String): Router = js.native
  def forwardState(routeName: java.lang.String, routeParams: router5Lib.typesTypesBaseMod.Params): router5Lib.typesTypesBaseMod.SimpleState = js.native
  def getDependencies(): Dependencies = js.native
  def getInjectables(): js.Tuple2[Router, Dependencies] = js.native
  def getLifecycleFactories(): js.Tuple2[
    org.scalablytyped.runtime.StringDictionary[ActivationFnFactory], 
    org.scalablytyped.runtime.StringDictionary[ActivationFnFactory]
  ] = js.native
  def getLifecycleFunctions(): js.Tuple2[
    org.scalablytyped.runtime.StringDictionary[ActivationFn], 
    org.scalablytyped.runtime.StringDictionary[ActivationFn]
  ] = js.native
  def getMiddlewareFactories(): js.Array[MiddlewareFactory] = js.native
  def getMiddlewareFunctions(): js.Array[Middleware] = js.native
  def getOptions(): Options = js.native
  def getPlugins(): js.Array[PluginFactory] = js.native
  def getState(): router5Lib.typesTypesBaseMod.State = js.native
  def invokeEventListeners(eventName: js.Any, args: js.Any*): scala.Unit = js.native
  def isActive(name: java.lang.String): scala.Boolean = js.native
  def isActive(name: java.lang.String, params: router5Lib.typesTypesBaseMod.Params): scala.Boolean = js.native
  def isActive(name: java.lang.String, params: router5Lib.typesTypesBaseMod.Params, strictEquality: scala.Boolean): scala.Boolean = js.native
  def isActive(
    name: java.lang.String,
    params: router5Lib.typesTypesBaseMod.Params,
    strictEquality: scala.Boolean,
    ignoreQueryParams: scala.Boolean
  ): scala.Boolean = js.native
  def isStarted(): scala.Boolean = js.native
  def makeNotFoundState(path: java.lang.String): router5Lib.typesTypesBaseMod.State = js.native
  def makeNotFoundState(path: java.lang.String, options: router5Lib.typesTypesBaseMod.NavigationOptions): router5Lib.typesTypesBaseMod.State = js.native
  def makeState(name: java.lang.String): router5Lib.typesTypesBaseMod.State = js.native
  def makeState(name: java.lang.String, params: router5Lib.typesTypesBaseMod.Params): router5Lib.typesTypesBaseMod.State = js.native
  def makeState(name: java.lang.String, params: router5Lib.typesTypesBaseMod.Params, path: java.lang.String): router5Lib.typesTypesBaseMod.State = js.native
  def makeState(
    name: java.lang.String,
    params: router5Lib.typesTypesBaseMod.Params,
    path: java.lang.String,
    meta: js.Any
  ): router5Lib.typesTypesBaseMod.State = js.native
  def makeState(
    name: java.lang.String,
    params: router5Lib.typesTypesBaseMod.Params,
    path: java.lang.String,
    meta: js.Any,
    forceId: scala.Double
  ): router5Lib.typesTypesBaseMod.State = js.native
  def matchPath(path: java.lang.String): router5Lib.typesTypesBaseMod.State | scala.Null = js.native
  def matchPath(path: java.lang.String, source: java.lang.String): router5Lib.typesTypesBaseMod.State | scala.Null = js.native
  def navigate(routeName: java.lang.String): router5Lib.typesTypesBaseMod.CancelFn = js.native
  def navigate(routeName: java.lang.String, done: router5Lib.typesTypesBaseMod.DoneFn): router5Lib.typesTypesBaseMod.CancelFn = js.native
  def navigate(routeName: java.lang.String, routeParams: router5Lib.typesTypesBaseMod.Params): router5Lib.typesTypesBaseMod.CancelFn = js.native
  def navigate(
    routeName: java.lang.String,
    routeParams: router5Lib.typesTypesBaseMod.Params,
    done: router5Lib.typesTypesBaseMod.DoneFn
  ): router5Lib.typesTypesBaseMod.CancelFn = js.native
  def navigate(
    routeName: java.lang.String,
    routeParams: router5Lib.typesTypesBaseMod.Params,
    options: router5Lib.typesTypesBaseMod.NavigationOptions
  ): router5Lib.typesTypesBaseMod.CancelFn = js.native
  def navigate(
    routeName: java.lang.String,
    routeParams: router5Lib.typesTypesBaseMod.Params,
    options: router5Lib.typesTypesBaseMod.NavigationOptions,
    done: router5Lib.typesTypesBaseMod.DoneFn
  ): router5Lib.typesTypesBaseMod.CancelFn = js.native
  def navigateToDefault(): router5Lib.typesTypesBaseMod.CancelFn = js.native
  def navigateToDefault(done: router5Lib.typesTypesBaseMod.DoneFn): router5Lib.typesTypesBaseMod.CancelFn = js.native
  def navigateToDefault(opts: router5Lib.typesTypesBaseMod.NavigationOptions): router5Lib.typesTypesBaseMod.CancelFn = js.native
  def navigateToDefault(opts: router5Lib.typesTypesBaseMod.NavigationOptions, done: router5Lib.typesTypesBaseMod.DoneFn): router5Lib.typesTypesBaseMod.CancelFn = js.native
  def removeEventListener(eventName: js.Any, cb: js.Any): scala.Unit = js.native
  def setDependencies(deps: Dependencies): Router = js.native
  def setDependency(dependencyName: java.lang.String, dependency: js.Any): Router = js.native
  def setOption(option: java.lang.String, value: js.Any): Router = js.native
  def setRootPath(rootPath: java.lang.String): scala.Unit = js.native
  def setState(state: router5Lib.typesTypesBaseMod.State): scala.Unit = js.native
  def start(): Router = js.native
  def start(done: router5Lib.typesTypesBaseMod.DoneFn): Router = js.native
  def start(startPathOrState: java.lang.String): Router = js.native
  def start(startPathOrState: java.lang.String, done: router5Lib.typesTypesBaseMod.DoneFn): Router = js.native
  def start(startPathOrState: router5Lib.typesTypesBaseMod.State): Router = js.native
  def start(startPathOrState: router5Lib.typesTypesBaseMod.State, done: router5Lib.typesTypesBaseMod.DoneFn): Router = js.native
  def stop(): scala.Unit = js.native
  def subscribe(listener: Listener): router5Lib.typesTypesBaseMod.Unsubscribe | Subscription = js.native
  def subscribe(listener: SubscribeFn): router5Lib.typesTypesBaseMod.Unsubscribe | Subscription = js.native
  def transitionToState(
    toState: router5Lib.typesTypesBaseMod.State,
    fromState: router5Lib.typesTypesBaseMod.State,
    opts: router5Lib.typesTypesBaseMod.NavigationOptions,
    done: router5Lib.typesTypesBaseMod.DoneFn
  ): js.Any = js.native
  def useMiddleware(middlewares: MiddlewareFactory*): router5Lib.typesTypesBaseMod.Unsubscribe = js.native
  def usePlugin(plugins: PluginFactory*): router5Lib.typesTypesBaseMod.Unsubscribe = js.native
}

