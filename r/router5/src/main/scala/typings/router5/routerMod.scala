package typings.router5

import org.scalablytyped.runtime.StringDictionary
import typings.pathParser.encodingMod.URLParamsEncodingType
import typings.routeNode.mod.RouteNode
import typings.routeNode.routeNodeMod.QueryParamsMode
import typings.routeNode.routeNodeMod.RouteNodeState
import typings.routeNode.routeNodeMod.TrailingSlashMode
import typings.router5.baseMod.CancelFn
import typings.router5.baseMod.DoneFn
import typings.router5.baseMod.NavigationOptions
import typings.router5.baseMod.Params
import typings.router5.baseMod.SimpleState
import typings.router5.baseMod.State
import typings.router5.baseMod.Unsubscribe
import typings.searchParams.encodeMod.IOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  type ActivationFn = js.Function3[
    /* toState */ State, 
    /* fromState */ State, 
    /* done */ DoneFn, 
    Boolean | js.Promise[Boolean] | Unit
  ]
  
  type ActivationFnFactory[Dependencies /* <: DefaultDependencies */] = js.Function2[
    /* router */ Router[DefaultDependencies], 
    /* dependencies */ js.UndefOr[Dependencies], 
    ActivationFn
  ]
  
  trait Config extends StObject {
    
    var decoders: Record[String, js.Any]
    
    var defaultParams: Record[String, js.Any]
    
    var encoders: Record[String, js.Any]
    
    var forwardMap: Record[String, js.Any]
  }
  object Config {
    
    @scala.inline
    def apply(
      decoders: Record[String, js.Any],
      defaultParams: Record[String, js.Any],
      encoders: Record[String, js.Any],
      forwardMap: Record[String, js.Any]
    ): Config = {
      val __obj = js.Dynamic.literal(decoders = decoders.asInstanceOf[js.Any], defaultParams = defaultParams.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], forwardMap = forwardMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecoders(value: Record[String, js.Any]): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultParams(value: Record[String, js.Any]): Self = StObject.set(x, "defaultParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoders(value: Record[String, js.Any]): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardMap(value: Record[String, js.Any]): Self = StObject.set(x, "forwardMap", value.asInstanceOf[js.Any])
    }
  }
  
  type DefaultDependencies = Record[String, js.Any]
  
  trait Listener
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    def next(`val`: js.Any): js.Object
  }
  object Listener {
    
    @scala.inline
    def apply(next: js.Any => js.Object): Listener = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Listener]
    }
    
    @scala.inline
    implicit class ListenerMutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: js.Any => js.Object): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  type Middleware = js.Function3[
    /* toState */ State, 
    /* fromState */ State, 
    /* done */ DoneFn, 
    Boolean | js.Promise[js.Any] | Unit
  ]
  
  type MiddlewareFactory[Dependencies /* <: DefaultDependencies */] = js.Function2[
    /* router */ Router[DefaultDependencies], 
    /* dependencies */ Dependencies, 
    Middleware
  ]
  
  trait Options extends StObject {
    
    var allowNotFound: Boolean
    
    var autoCleanUp: Boolean
    
    var caseSensitive: Boolean
    
    var defaultParams: js.UndefOr[Params] = js.undefined
    
    var defaultRoute: js.UndefOr[String] = js.undefined
    
    var queryParams: js.UndefOr[IOptions] = js.undefined
    
    var queryParamsMode: QueryParamsMode
    
    var rewritePathOnMatch: Boolean
    
    var strictTrailingSlash: Boolean
    
    var strongMatching: Boolean
    
    var trailingSlashMode: TrailingSlashMode
    
    var urlParamsEncoding: js.UndefOr[URLParamsEncodingType] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(
      allowNotFound: Boolean,
      autoCleanUp: Boolean,
      caseSensitive: Boolean,
      queryParamsMode: QueryParamsMode,
      rewritePathOnMatch: Boolean,
      strictTrailingSlash: Boolean,
      strongMatching: Boolean,
      trailingSlashMode: TrailingSlashMode
    ): Options = {
      val __obj = js.Dynamic.literal(allowNotFound = allowNotFound.asInstanceOf[js.Any], autoCleanUp = autoCleanUp.asInstanceOf[js.Any], caseSensitive = caseSensitive.asInstanceOf[js.Any], queryParamsMode = queryParamsMode.asInstanceOf[js.Any], rewritePathOnMatch = rewritePathOnMatch.asInstanceOf[js.Any], strictTrailingSlash = strictTrailingSlash.asInstanceOf[js.Any], strongMatching = strongMatching.asInstanceOf[js.Any], trailingSlashMode = trailingSlashMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNotFound(value: Boolean): Self = StObject.set(x, "allowNotFound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCleanUp(value: Boolean): Self = StObject.set(x, "autoCleanUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultParams(value: Params): Self = StObject.set(x, "defaultParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultParamsUndefined: Self = StObject.set(x, "defaultParams", js.undefined)
      
      @scala.inline
      def setDefaultRoute(value: String): Self = StObject.set(x, "defaultRoute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRouteUndefined: Self = StObject.set(x, "defaultRoute", js.undefined)
      
      @scala.inline
      def setQueryParams(value: IOptions): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsMode(value: QueryParamsMode): Self = StObject.set(x, "queryParamsMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setRewritePathOnMatch(value: Boolean): Self = StObject.set(x, "rewritePathOnMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictTrailingSlash(value: Boolean): Self = StObject.set(x, "strictTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongMatching(value: Boolean): Self = StObject.set(x, "strongMatching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingSlashMode(value: TrailingSlashMode): Self = StObject.set(x, "trailingSlashMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlParamsEncoding(value: URLParamsEncodingType): Self = StObject.set(x, "urlParamsEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlParamsEncodingUndefined: Self = StObject.set(x, "urlParamsEncoding", js.undefined)
    }
  }
  
  trait Plugin extends StObject {
    
    var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onStop: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onTransitionCancel: js.UndefOr[
        js.Function2[/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], Unit]
      ] = js.undefined
    
    var onTransitionError: js.UndefOr[
        js.Function3[
          /* toState */ js.UndefOr[State], 
          /* fromState */ js.UndefOr[State], 
          /* err */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
    
    var onTransitionStart: js.UndefOr[
        js.Function2[/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], Unit]
      ] = js.undefined
    
    var onTransitionSuccess: js.UndefOr[
        js.Function3[
          /* toState */ js.UndefOr[State], 
          /* fromState */ js.UndefOr[State], 
          /* opts */ js.UndefOr[NavigationOptions], 
          Unit
        ]
      ] = js.undefined
    
    var teardown: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Plugin {
    
    @scala.inline
    def apply(): Plugin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugin]
    }
    
    @scala.inline
    implicit class PluginMutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOnStop(value: () => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      @scala.inline
      def setOnTransitionCancel(value: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State]) => Unit): Self = StObject.set(x, "onTransitionCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTransitionCancelUndefined: Self = StObject.set(x, "onTransitionCancel", js.undefined)
      
      @scala.inline
      def setOnTransitionError(
        value: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], /* err */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onTransitionError", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnTransitionErrorUndefined: Self = StObject.set(x, "onTransitionError", js.undefined)
      
      @scala.inline
      def setOnTransitionStart(value: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State]) => Unit): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTransitionStartUndefined: Self = StObject.set(x, "onTransitionStart", js.undefined)
      
      @scala.inline
      def setOnTransitionSuccess(
        value: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], /* opts */ js.UndefOr[NavigationOptions]) => Unit
      ): Self = StObject.set(x, "onTransitionSuccess", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnTransitionSuccessUndefined: Self = StObject.set(x, "onTransitionSuccess", js.undefined)
      
      @scala.inline
      def setTeardown(value: () => Unit): Self = StObject.set(x, "teardown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
    }
  }
  
  type PluginFactory[Dependencies /* <: DefaultDependencies */] = js.Function2[
    /* router */ js.UndefOr[Router[DefaultDependencies]], 
    /* dependencies */ js.UndefOr[Dependencies], 
    Plugin
  ]
  
  trait Route[Dependencies /* <: DefaultDependencies */] extends StObject {
    
    var canActivate: js.UndefOr[ActivationFnFactory[Dependencies]] = js.undefined
    
    var children: js.UndefOr[js.Array[Route[Dependencies]]] = js.undefined
    
    var decodeParams: js.UndefOr[js.Function1[/* pathParams */ Params, Params]] = js.undefined
    
    var defaultParams: js.UndefOr[Params] = js.undefined
    
    var encodeParams: js.UndefOr[js.Function1[/* stateParams */ Params, Params]] = js.undefined
    
    var forwardTo: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var path: String
  }
  object Route {
    
    @scala.inline
    def apply[Dependencies /* <: DefaultDependencies */](name: String, path: String): Route[Dependencies] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route[Dependencies]]
    }
    
    @scala.inline
    implicit class RouteMutableBuilder[Self <: Route[?], Dependencies /* <: DefaultDependencies */] (val x: Self & Route[Dependencies]) extends AnyVal {
      
      @scala.inline
      def setCanActivate(
        value: (/* router */ Router[DefaultDependencies], /* dependencies */ js.UndefOr[Dependencies]) => ActivationFn
      ): Self = StObject.set(x, "canActivate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanActivateUndefined: Self = StObject.set(x, "canActivate", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[Route[Dependencies]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: Route[Dependencies]*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDecodeParams(value: /* pathParams */ Params => Params): Self = StObject.set(x, "decodeParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecodeParamsUndefined: Self = StObject.set(x, "decodeParams", js.undefined)
      
      @scala.inline
      def setDefaultParams(value: Params): Self = StObject.set(x, "defaultParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultParamsUndefined: Self = StObject.set(x, "defaultParams", js.undefined)
      
      @scala.inline
      def setEncodeParams(value: /* stateParams */ Params => Params): Self = StObject.set(x, "encodeParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeParamsUndefined: Self = StObject.set(x, "encodeParams", js.undefined)
      
      @scala.inline
      def setForwardTo(value: String): Self = StObject.set(x, "forwardTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardToUndefined: Self = StObject.set(x, "forwardTo", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Router[Dependencies /* <: DefaultDependencies */] extends StObject {
    
    def add(routes: js.Array[Route[Dependencies]]): Router[Dependencies] = js.native
    def add(routes: js.Array[Route[Dependencies]], finalSort: Boolean): Router[Dependencies] = js.native
    def add(routes: Route[Dependencies]): Router[Dependencies] = js.native
    def add(routes: Route[Dependencies], finalSort: Boolean): Router[Dependencies] = js.native
    
    def addEventListener(eventName: js.Any, cb: js.Any): Unsubscribe = js.native
    
    def addNode(name: String, path: String): Router[Dependencies] = js.native
    def addNode(name: String, path: String, canActivateHandler: ActivationFnFactory[Dependencies]): Router[Dependencies] = js.native
    
    def addPlugin(plugin: Plugin): Router[Dependencies] = js.native
    
    def areStatesDescendants(parentState: State, childState: State): Boolean = js.native
    
    def areStatesEqual(state1: State, state2: State): Boolean = js.native
    def areStatesEqual(state1: State, state2: State, ignoreQueryParams: Boolean): Boolean = js.native
    
    def buildPath(route: String): String = js.native
    def buildPath(route: String, params: Params): String = js.native
    
    def buildState(routeName: String, routeParams: Params): RouteNodeState | Null = js.native
    
    def canActivate(name: String, canActivateHandler: Boolean): Router[Dependencies] = js.native
    def canActivate(name: String, canActivateHandler: ActivationFnFactory[Dependencies]): Router[Dependencies] = js.native
    
    def canDeactivate(name: String, canDeactivateHandler: Boolean): Router[Dependencies] = js.native
    def canDeactivate(name: String, canDeactivateHandler: ActivationFnFactory[Dependencies]): Router[Dependencies] = js.native
    
    def cancel(): Router[Dependencies] = js.native
    
    def clearCanDeactivate(name: String): Router[DefaultDependencies] = js.native
    
    def clearMiddleware(): Router[DefaultDependencies] = js.native
    
    var config: Config = js.native
    
    def executeFactory(
      factory: js.Function2[
          /* router */ js.UndefOr[Router[Dependencies]], 
          /* dependencies */ js.UndefOr[Dependencies], 
          js.Any
        ]
    ): js.Any = js.native
    
    def forward(fromRoute: String, toRoute: String): Router[Dependencies] = js.native
    
    def forwardState(routeName: String, routeParams: Params): SimpleState = js.native
    
    def getDependencies(): Dependencies = js.native
    
    def getInjectables(): js.Tuple2[Router[Dependencies], Dependencies] = js.native
    
    def getLifecycleFactories(): js.Tuple2[
        StringDictionary[ActivationFnFactory[Dependencies]], 
        StringDictionary[ActivationFnFactory[Dependencies]]
      ] = js.native
    
    def getLifecycleFunctions(): js.Tuple2[StringDictionary[ActivationFn], StringDictionary[ActivationFn]] = js.native
    
    def getMiddlewareFactories(): js.Array[MiddlewareFactory[Dependencies]] = js.native
    
    def getMiddlewareFunctions(): js.Array[Middleware] = js.native
    
    def getOptions(): Options = js.native
    
    def getPlugins(): js.Array[PluginFactory[Dependencies]] = js.native
    
    def getState(): State = js.native
    
    def invokeEventListeners(eventName: js.Any, args: js.Any*): Unit = js.native
    
    def isActive(name: String): Boolean = js.native
    def isActive(name: String, params: Unit, strictEquality: Boolean): Boolean = js.native
    def isActive(name: String, params: Unit, strictEquality: Boolean, ignoreQueryParams: Boolean): Boolean = js.native
    def isActive(name: String, params: Unit, strictEquality: Unit, ignoreQueryParams: Boolean): Boolean = js.native
    def isActive(name: String, params: Params): Boolean = js.native
    def isActive(name: String, params: Params, strictEquality: Boolean): Boolean = js.native
    def isActive(name: String, params: Params, strictEquality: Boolean, ignoreQueryParams: Boolean): Boolean = js.native
    def isActive(name: String, params: Params, strictEquality: Unit, ignoreQueryParams: Boolean): Boolean = js.native
    
    def isStarted(): Boolean = js.native
    
    def makeNotFoundState(path: String): State = js.native
    def makeNotFoundState(path: String, options: NavigationOptions): State = js.native
    
    def makeState(name: String): State = js.native
    def makeState(name: String, params: Unit, path: String): State = js.native
    def makeState(name: String, params: Unit, path: String, meta: js.Any): State = js.native
    def makeState(name: String, params: Unit, path: String, meta: js.Any, forceId: Double): State = js.native
    def makeState(name: String, params: Unit, path: String, meta: Unit, forceId: Double): State = js.native
    def makeState(name: String, params: Unit, path: Unit, meta: js.Any): State = js.native
    def makeState(name: String, params: Unit, path: Unit, meta: js.Any, forceId: Double): State = js.native
    def makeState(name: String, params: Unit, path: Unit, meta: Unit, forceId: Double): State = js.native
    def makeState(name: String, params: Params): State = js.native
    def makeState(name: String, params: Params, path: String): State = js.native
    def makeState(name: String, params: Params, path: String, meta: js.Any): State = js.native
    def makeState(name: String, params: Params, path: String, meta: js.Any, forceId: Double): State = js.native
    def makeState(name: String, params: Params, path: String, meta: Unit, forceId: Double): State = js.native
    def makeState(name: String, params: Params, path: Unit, meta: js.Any): State = js.native
    def makeState(name: String, params: Params, path: Unit, meta: js.Any, forceId: Double): State = js.native
    def makeState(name: String, params: Params, path: Unit, meta: Unit, forceId: Double): State = js.native
    
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
    
    var rootNode: RouteNode = js.native
    
    def setDependencies(deps: Dependencies): Router[DefaultDependencies] = js.native
    
    def setDependency(dependencyName: String, dependency: js.Any): Router[DefaultDependencies] = js.native
    
    def setOption(option: String, value: js.Any): Router[Dependencies] = js.native
    
    def setRootPath(rootPath: String): Unit = js.native
    
    def setState(state: State): Unit = js.native
    
    def start(): Router[Dependencies] = js.native
    def start(done: DoneFn): Router[Dependencies] = js.native
    def start(startPathOrState: String): Router[Dependencies] = js.native
    def start(startPathOrState: String, done: DoneFn): Router[Dependencies] = js.native
    def start(startPathOrState: State): Router[Dependencies] = js.native
    def start(startPathOrState: State, done: DoneFn): Router[Dependencies] = js.native
    
    def stop(): Unit = js.native
    
    def subscribe(listener: Listener): Unsubscribe | Subscription = js.native
    def subscribe(listener: SubscribeFn): Unsubscribe | Subscription = js.native
    
    def transitionToState(toState: State, fromState: State, opts: NavigationOptions, done: DoneFn): js.Any = js.native
    
    def useMiddleware(middlewares: MiddlewareFactory[Dependencies]*): Unsubscribe = js.native
    
    def usePlugin(plugins: PluginFactory[Dependencies]*): Unsubscribe = js.native
  }
  
  type SubscribeFn = js.Function1[/* state */ SubscribeState, Unit]
  
  trait SubscribeState extends StObject {
    
    var previousRoute: State
    
    var route: State
  }
  object SubscribeState {
    
    @scala.inline
    def apply(previousRoute: State, route: State): SubscribeState = {
      val __obj = js.Dynamic.literal(previousRoute = previousRoute.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeState]
    }
    
    @scala.inline
    implicit class SubscribeStateMutableBuilder[Self <: SubscribeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreviousRoute(value: State): Self = StObject.set(x, "previousRoute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: State): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait Subscription extends StObject {
    
    def unsubscribe(): Unit
    @JSName("unsubscribe")
    var unsubscribe_Original: Unsubscribe
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
}
