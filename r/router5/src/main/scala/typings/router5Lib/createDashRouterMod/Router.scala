package typings
package router5Lib.createDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  def add(routes: js.Array[Route]): Router = js.native
  def add(routes: js.Array[Route], finalSort: scala.Boolean): Router = js.native
  def add(routes: Route): Router = js.native
  def add(routes: Route, finalSort: scala.Boolean): Router = js.native
  def addNode(name: java.lang.String, path: java.lang.String): Router = js.native
  def addNode(
    name: java.lang.String,
    path: java.lang.String,
    canActivateHandler: router5Lib.coreRouteDashLifecycleMod.ActivationFnFactory
  ): Router = js.native
  def areStatesDescendants(parentState: State, childState: State): scala.Boolean = js.native
  def areStatesEqual(state1: State, state2: State): scala.Boolean = js.native
  def areStatesEqual(state1: State, state2: State, ignoreQueryParams: scala.Boolean): scala.Boolean = js.native
  def buildPath(route: java.lang.String, params: Params): java.lang.String = js.native
  def buildUrl(route: java.lang.String, params: Params): java.lang.String = js.native
  def canActivate(
    name: java.lang.String,
    canActivateHandler: router5Lib.coreRouteDashLifecycleMod.ActivationFnFactory
  ): router5Lib.coreRouteDashLifecycleMod.createDashRouterMod.Router = js.native
  def canActivate(name: java.lang.String, canActivateHandler: scala.Boolean): router5Lib.coreRouteDashLifecycleMod.createDashRouterMod.Router = js.native
  def canDeactivate(
    name: java.lang.String,
    canDeactivateHandler: router5Lib.coreRouteDashLifecycleMod.ActivationFnFactory
  ): router5Lib.coreRouteDashLifecycleMod.createDashRouterMod.Router = js.native
  def canDeactivate(name: java.lang.String, canDeactivateHandler: scala.Boolean): router5Lib.coreRouteDashLifecycleMod.createDashRouterMod.Router = js.native
  def cancel(): router5Lib.coreNavigationMod.createDashRouterMod.Router = js.native
  def clearCanDeactivate(name: java.lang.String): router5Lib.coreRouteDashLifecycleMod.createDashRouterMod.Router = js.native
  def clearMiddleware(): router5Lib.coreMiddlewareMod.createDashRouterMod.Router = js.native
  def clone(deps: Dependencies): router5Lib.coreCloneMod.createDashRouterMod.Router = js.native
  def forward(fromRoute: java.lang.String, toRoute: java.lang.String): router5Lib.coreNavigationMod.createDashRouterMod.Router = js.native
  def getDependencies(): Dependencies = js.native
  def getOptions(): Options = js.native
  def getState(): State = js.native
  def hasPlugin(pluginName: java.lang.String): scala.Boolean = js.native
  def isActive(name: java.lang.String): scala.Boolean = js.native
  def isActive(name: java.lang.String, params: Params): scala.Boolean = js.native
  def isActive(name: java.lang.String, params: Params, strictEquality: scala.Boolean): scala.Boolean = js.native
  def isActive(
    name: java.lang.String,
    params: Params,
    strictEquality: scala.Boolean,
    ignoreQueryParams: scala.Boolean
  ): scala.Boolean = js.native
  def isStarted(): scala.Boolean = js.native
  def makeNotFoundState(path: java.lang.String): State = js.native
  def makeState(name: java.lang.String, params: Params, path: java.lang.String): State = js.native
  def makeState(name: java.lang.String, params: Params, path: java.lang.String, metaParams: Params): State = js.native
  def makeState(
    name: java.lang.String,
    params: Params,
    path: java.lang.String,
    metaParams: Params,
    source: java.lang.String
  ): State = js.native
  def makeState(
    name: java.lang.String,
    params: Params,
    path: java.lang.String,
    metaParams: Params,
    source: java.lang.String,
    forceId: scala.Double
  ): State = js.native
  def matchPath(path: java.lang.String): State | scala.Null = js.native
  def matchPath(path: java.lang.String, source: java.lang.String): State | scala.Null = js.native
  def matchUrl(url: java.lang.String): State | scala.Null = js.native
  def navigate(routeName: java.lang.String): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigate(routeName: java.lang.String, done: router5Lib.router5Mod.DoneFn): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigate(routeName: java.lang.String, routeParams: Params): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigate(routeName: java.lang.String, routeParams: Params, done: router5Lib.router5Mod.DoneFn): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigate(routeName: java.lang.String, routeParams: Params, options: router5Lib.coreNavigationMod.Options): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigate(
    routeName: java.lang.String,
    routeParams: Params,
    options: router5Lib.coreNavigationMod.Options,
    done: router5Lib.router5Mod.DoneFn
  ): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigateToDefault(): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigateToDefault(done: router5Lib.router5Mod.DoneFn): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigateToDefault(opts: router5Lib.coreNavigationMod.Options): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigateToDefault(opts: router5Lib.coreNavigationMod.Options, done: router5Lib.router5Mod.DoneFn): router5Lib.coreNavigationMod.CancelFn = js.native
  def setDependencies(deps: Dependencies): Router = js.native
  def setDependency(dependencyName: java.lang.String, dependency: js.Any): Router = js.native
  def setOption(option: java.lang.String, value: js.Any): Router = js.native
  def setRootPath(rootPath: java.lang.String): scala.Unit = js.native
  def setState(state: State): scala.Unit = js.native
  def start(): router5Lib.coreRouterDashLifecycleMod.createDashRouterMod.Router = js.native
  def start(done: router5Lib.router5Mod.DoneFn): router5Lib.coreRouterDashLifecycleMod.createDashRouterMod.Router = js.native
  def start(startPathOrState: java.lang.String): router5Lib.coreRouterDashLifecycleMod.createDashRouterMod.Router = js.native
  def start(startPathOrState: java.lang.String, done: router5Lib.router5Mod.DoneFn): router5Lib.coreRouterDashLifecycleMod.createDashRouterMod.Router = js.native
  def start(startPathOrState: State): router5Lib.coreRouterDashLifecycleMod.createDashRouterMod.Router = js.native
  def start(startPathOrState: State, done: router5Lib.router5Mod.DoneFn): router5Lib.coreRouterDashLifecycleMod.createDashRouterMod.Router = js.native
  def stop(): router5Lib.coreRouterDashLifecycleMod.createDashRouterMod.Router = js.native
  def subscribe(cb: router5Lib.coreObservableMod.SubscribeFn): router5Lib.coreObservableMod.UnsubscribeFn = js.native
  def urlToPath(url: java.lang.String): java.lang.String = js.native
  def useMiddleware(middlewares: router5Lib.coreMiddlewareMod.MiddlewareFactory*): router5Lib.coreMiddlewareMod.createDashRouterMod.Router = js.native
  def usePlugin(plugins: router5Lib.corePluginsMod.PluginFactory*): router5Lib.corePluginsMod.createDashRouterMod.Router = js.native
}

