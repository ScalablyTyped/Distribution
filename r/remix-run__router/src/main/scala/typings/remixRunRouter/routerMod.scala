package typings.remixRunRouter

import typings.remixRunRouter.anon.Data
import typings.remixRunRouter.anon.FormAction
import typings.remixRunRouter.anon.FormData
import typings.remixRunRouter.anon.FormEncType
import typings.remixRunRouter.anon.FormMethod
import typings.remixRunRouter.historyMod.Action
import typings.remixRunRouter.historyMod.History
import typings.remixRunRouter.historyMod.Location
import typings.remixRunRouter.historyMod.To
import typings.remixRunRouter.remixRunRouterBooleans.`false`
import typings.remixRunRouter.remixRunRouterStrings.idle
import typings.remixRunRouter.utilsMod.AgnosticDataRouteMatch
import typings.remixRunRouter.utilsMod.AgnosticDataRouteObject
import typings.remixRunRouter.utilsMod.AgnosticRouteObject
import typings.remixRunRouter.utilsMod.DeferredData
import typings.remixRunRouter.utilsMod.Params
import typings.remixRunRouter.utilsMod.RouteData
import typings.std.AbortController
import typings.std.Headers
import typings.std.Map
import typings.std.Record
import typings.std.Request
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("@remix-run/router/dist/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object IDLE_FETCHER {
    
    @JSImport("@remix-run/router/dist/router", "IDLE_FETCHER")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@remix-run/router/dist/router", "IDLE_FETCHER.data")
    @js.native
    def data: js.UndefOr[Any] = js.native
    inline def data_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router/dist/router", "IDLE_FETCHER.formAction")
    @js.native
    def formAction: Unit = js.native
    inline def formAction_=(x: Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formAction")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router/dist/router", "IDLE_FETCHER.formData")
    @js.native
    def formData: Unit = js.native
    inline def formData_=(x: Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formData")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router/dist/router", "IDLE_FETCHER.formEncType")
    @js.native
    def formEncType: Unit = js.native
    inline def formEncType_=(x: Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formEncType")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router/dist/router", "IDLE_FETCHER.formMethod")
    @js.native
    def formMethod: Unit = js.native
    inline def formMethod_=(x: Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router/dist/router", "IDLE_FETCHER.state")
    @js.native
    def state: idle = js.native
    inline def state_=(x: idle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
  }
  
  object IDLE_NAVIGATION {
    
    @JSImport("@remix-run/router/dist/router", "IDLE_NAVIGATION")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@remix-run/router/dist/router", "IDLE_NAVIGATION.formAction")
    @js.native
    def formAction: Unit = js.native
    inline def formAction_=(x: Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formAction")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router/dist/router", "IDLE_NAVIGATION.formData")
    @js.native
    def formData: Unit = js.native
    inline def formData_=(x: Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formData")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router/dist/router", "IDLE_NAVIGATION.formEncType")
    @js.native
    def formEncType: Unit = js.native
    inline def formEncType_=(x: Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formEncType")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router/dist/router", "IDLE_NAVIGATION.formMethod")
    @js.native
    def formMethod: Unit = js.native
    inline def formMethod_=(x: Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router/dist/router", "IDLE_NAVIGATION.location")
    @js.native
    def location: Unit = js.native
    inline def location_=(x: Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
    
    @JSImport("@remix-run/router/dist/router", "IDLE_NAVIGATION.state")
    @js.native
    def state: idle = js.native
    inline def state_=(x: idle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
  }
  
  inline def createRouter(init: RouterInit): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(init.asInstanceOf[js.Any]).asInstanceOf[Router]
  
  inline def getStaticContextFromError(routes: js.Array[AgnosticDataRouteObject], context: StaticHandlerContext, error: Any): StaticHandlerContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getStaticContextFromError")(routes.asInstanceOf[js.Any], context.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[StaticHandlerContext]
  
  inline def unstableCreateStaticHandler(routes: js.Array[AgnosticRouteObject]): StaticHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createStaticHandler")(routes.asInstanceOf[js.Any]).asInstanceOf[StaticHandler]
  
  /* Inlined @remix-run/router.@remix-run/router/dist/router.FetcherStates<TData>[keyof @remix-run/router.@remix-run/router/dist/router.FetcherStates<TData>] */
  /* Rewritten from type alias, can be one of: 
    - typings.remixRunRouter.remixRunRouterStrings.formAction
    - typings.remixRunRouter.remixRunRouterStrings.data
    - typings.remixRunRouter.remixRunRouterStrings.formMethod
    - typings.remixRunRouter.remixRunRouterStrings.formEncType
    - typings.remixRunRouter.remixRunRouterStrings.formData
    - typings.remixRunRouter.remixRunRouterStrings.state
  */
  trait Fetcher[TData] extends StObject
  
  /**
    * Potential states for fetchers
    */
  trait FetcherStates[TData] extends StObject {
    
    var Idle: Data[TData]
    
    var Loading: FormAction[TData]
    
    var Submitting: FormData[TData]
  }
  object FetcherStates {
    
    inline def apply[TData](Idle: Data[TData], Loading: FormAction[TData], Submitting: FormData[TData]): FetcherStates[TData] = {
      val __obj = js.Dynamic.literal(Idle = Idle.asInstanceOf[js.Any], Loading = Loading.asInstanceOf[js.Any], Submitting = Submitting.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetcherStates[TData]]
    }
    
    extension [Self <: FetcherStates[?], TData](x: Self & FetcherStates[TData]) {
      
      inline def setIdle(value: Data[TData]): Self = StObject.set(x, "Idle", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: FormAction[TData]): Self = StObject.set(x, "Loading", value.asInstanceOf[js.Any])
      
      inline def setSubmitting(value: FormData[TData]): Self = StObject.set(x, "Submitting", value.asInstanceOf[js.Any])
    }
  }
  
  type GetScrollPositionFunction = js.Function0[Double]
  
  type GetScrollRestorationKeyFunction = js.Function2[/* location */ Location, /* matches */ js.Array[UseMatchesMatch], String | Null]
  
  /* Inlined std.Partial<std.Pick<@remix-run/router.@remix-run/router/dist/router.RouterState, 'loaderData' | 'actionData' | 'errors'>> */
  trait HydrationState extends StObject {
    
    var actionData: js.UndefOr[RouteData | Null] = js.undefined
    
    var errors: js.UndefOr[RouteData | Null] = js.undefined
    
    var loaderData: js.UndefOr[RouteData] = js.undefined
  }
  object HydrationState {
    
    inline def apply(): HydrationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HydrationState]
    }
    
    extension [Self <: HydrationState](x: Self) {
      
      inline def setActionData(value: RouteData): Self = StObject.set(x, "actionData", value.asInstanceOf[js.Any])
      
      inline def setActionDataNull: Self = StObject.set(x, "actionData", null)
      
      inline def setActionDataUndefined: Self = StObject.set(x, "actionData", js.undefined)
      
      inline def setErrors(value: RouteData): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsNull: Self = StObject.set(x, "errors", null)
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setLoaderData(value: RouteData): Self = StObject.set(x, "loaderData", value.asInstanceOf[js.Any])
      
      inline def setLoaderDataUndefined: Self = StObject.set(x, "loaderData", js.undefined)
    }
  }
  
  /**
    * Options for a navigate() call for a Link navigation
    */
  trait LinkNavigateOptions
    extends StObject
       with RouterNavigateOptions {
    
    var preventScrollReset: js.UndefOr[Boolean] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object LinkNavigateOptions {
    
    inline def apply(): LinkNavigateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkNavigateOptions]
    }
    
    extension [Self <: LinkNavigateOptions](x: Self) {
      
      inline def setPreventScrollReset(value: Boolean): Self = StObject.set(x, "preventScrollReset", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollResetUndefined: Self = StObject.set(x, "preventScrollReset", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  /* Inlined @remix-run/router.@remix-run/router/dist/router.NavigationStates[keyof @remix-run/router.@remix-run/router/dist/router.NavigationStates] */
  /* Rewritten from type alias, can be one of: 
    - typings.remixRunRouter.remixRunRouterStrings.formAction
    - typings.remixRunRouter.remixRunRouterStrings.location
    - typings.remixRunRouter.remixRunRouterStrings.formMethod
    - typings.remixRunRouter.remixRunRouterStrings.formEncType
    - typings.remixRunRouter.remixRunRouterStrings.formData
    - typings.remixRunRouter.remixRunRouterStrings.state
  */
  trait Navigation extends StObject
  object Navigation {
    
    inline def formAction: typings.remixRunRouter.remixRunRouterStrings.formAction = "formAction".asInstanceOf[typings.remixRunRouter.remixRunRouterStrings.formAction]
    
    inline def formData: typings.remixRunRouter.remixRunRouterStrings.formData = "formData".asInstanceOf[typings.remixRunRouter.remixRunRouterStrings.formData]
    
    inline def formEncType: typings.remixRunRouter.remixRunRouterStrings.formEncType = "formEncType".asInstanceOf[typings.remixRunRouter.remixRunRouterStrings.formEncType]
    
    inline def formMethod: typings.remixRunRouter.remixRunRouterStrings.formMethod = "formMethod".asInstanceOf[typings.remixRunRouter.remixRunRouterStrings.formMethod]
    
    inline def location: typings.remixRunRouter.remixRunRouterStrings.location = "location".asInstanceOf[typings.remixRunRouter.remixRunRouterStrings.location]
    
    inline def state: typings.remixRunRouter.remixRunRouterStrings.state = "state".asInstanceOf[typings.remixRunRouter.remixRunRouterStrings.state]
  }
  
  trait NavigationStates extends StObject {
    
    var Idle: FormEncType
    
    var Loading: FormMethod
    
    var Submitting: typings.remixRunRouter.anon.Location
  }
  object NavigationStates {
    
    inline def apply(Idle: FormEncType, Loading: FormMethod, Submitting: typings.remixRunRouter.anon.Location): NavigationStates = {
      val __obj = js.Dynamic.literal(Idle = Idle.asInstanceOf[js.Any], Loading = Loading.asInstanceOf[js.Any], Submitting = Submitting.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationStates]
    }
    
    extension [Self <: NavigationStates](x: Self) {
      
      inline def setIdle(value: FormEncType): Self = StObject.set(x, "Idle", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: FormMethod): Self = StObject.set(x, "Loading", value.asInstanceOf[js.Any])
      
      inline def setSubmitting(value: typings.remixRunRouter.anon.Location): Self = StObject.set(x, "Submitting", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.remixRunRouter.remixRunRouterStrings.idle
    - typings.remixRunRouter.remixRunRouterStrings.loading
  */
  trait RevalidationState extends StObject
  object RevalidationState {
    
    inline def idle: typings.remixRunRouter.remixRunRouterStrings.idle = "idle".asInstanceOf[typings.remixRunRouter.remixRunRouterStrings.idle]
    
    inline def loading: typings.remixRunRouter.remixRunRouterStrings.loading = "loading".asInstanceOf[typings.remixRunRouter.remixRunRouterStrings.loading]
  }
  
  @js.native
  trait Router extends StObject {
    
    /**
      * @internal
      * PRIVATE - DO NOT USE
      *
      * Internal pending DeferredData instances accessed by unit tests
      */
    var _internalActiveDeferreds: Map[String, DeferredData] = js.native
    
    /**
      * @internal
      * PRIVATE - DO NOT USE
      *
      * Internal fetch AbortControllers accessed by unit tests
      */
    var _internalFetchControllers: Map[String, AbortController] = js.native
    
    /**
      * @internal
      * PRIVATE - DO NOT USE
      *
      * Return the basename for the router
      */
    def basename: js.UndefOr[String] = js.native
    
    /**
      * @internal
      * PRIVATE - DO NOT USE
      *
      * Utility function to create an href for the given location
      * @param location
      */
    def createHref(location: Location): String = js.native
    def createHref(location: URL): String = js.native
    
    /**
      * @internal
      * PRIVATE - DO NOT USE
      *
      * Delete the fetcher for a given key
      * @param key
      */
    def deleteFetcher(): Unit = js.native
    def deleteFetcher(key: String): Unit = js.native
    
    /**
      * @internal
      * PRIVATE - DO NOT USE
      *
      * Cleanup listeners and abort any in-progress loads
      */
    def dispose(): Unit = js.native
    
    /**
      * @internal
      * PRIVATE - DO NOT USE
      *
      * Enable scroll restoration behavior in the router
      *
      * @param savedScrollPositions Object that will manage positions, in case
      *                             it's being restored from sessionStorage
      * @param getScrollPosition    Function to get the active Y scroll position
      * @param getKey               Function to get the key to use for restoration
      */
    def enableScrollRestoration(savedScrollPositions: Record[String, Double], getScrollPosition: GetScrollPositionFunction): js.Function0[Unit] = js.native
    def enableScrollRestoration(
      savedScrollPositions: Record[String, Double],
      getScrollPosition: GetScrollPositionFunction,
      getKey: GetScrollRestorationKeyFunction
    ): js.Function0[Unit] = js.native
    
    /**
      * @internal
      * PRIVATE - DO NOT USE
      *
      * Trigger a fetcher load/submission
      *
      * @param key     Fetcher key
      * @param routeId Route that owns the fetcher
      * @param href    href to fetch
      * @param opts    Fetcher options, (method, submission, etc.)
      */
    def fetch(key: String, routeId: String, href: String): Unit = js.native
    def fetch(key: String, routeId: String, href: String, opts: RouterNavigateOptions): Unit = js.native
    
    /**
      * @internal
      * PRIVATE - DO NOT USE
      *
      * Get/create a fetcher for the given key
      * @param key
      */
    def getFetcher[TData](): Fetcher[TData] = js.native
    def getFetcher[TData](key: String): Fetcher[TData] = js.native
    
    /**
      * @internal
      * PRIVATE - DO NOT USE
      *
      * Initialize the router, including adding history listeners and kicking off
      * initial data fetches.  Returns a function to cleanup listeners and abort
      * any in-progress loads
      */
    def initialize(): Router = js.native
    
    /**
      * @internal
      * PRIVATE - DO NOT USE
      *
      * Navigate forward/backward in the history stack
      * @param to Delta to move in the history stack
      */
    def navigate(to: Double): Unit = js.native
    /**
      * Navigate to the given path
      * @param to Path to navigate to
      * @param opts Navigation options (method, submission, etc.)
      */
    def navigate(to: To): Unit = js.native
    def navigate(to: To, opts: RouterNavigateOptions): Unit = js.native
    
    /**
      * @internal
      * PRIVATE - DO NOT USE
      *
      * Trigger a revalidation of all current route loaders and fetcher loads
      */
    def revalidate(): Unit = js.native
    
    /**
      * @internal
      * PRIVATE - DO NOT USE
      *
      * Return the routes for this router instance
      */
    def routes: js.Array[AgnosticDataRouteObject] = js.native
    
    /**
      * @internal
      * PRIVATE - DO NOT USE
      *
      * Return the current state of the router
      */
    def state: RouterState = js.native
    
    /**
      * @internal
      * PRIVATE - DO NOT USE
      *
      * Subscribe to router.state updates
      *
      * @param fn function to call with the new state
      */
    def subscribe(fn: RouterSubscriber): js.Function0[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.remixRunRouter.anon.OmitLinkNavigateOptionsre
    - typings.remixRunRouter.anon.OmitSubmissionNavigateOpt
  */
  trait RouterFetchOptions extends StObject
  object RouterFetchOptions {
    
    inline def OmitLinkNavigateOptionsre(): typings.remixRunRouter.anon.OmitLinkNavigateOptionsre = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.remixRunRouter.anon.OmitLinkNavigateOptionsre]
    }
    
    inline def OmitSubmissionNavigateOpt(formData: typings.std.FormData): typings.remixRunRouter.anon.OmitSubmissionNavigateOpt = {
      val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.remixRunRouter.anon.OmitSubmissionNavigateOpt]
    }
  }
  
  trait RouterInit extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var history: History
    
    var hydrationData: js.UndefOr[HydrationState] = js.undefined
    
    var routes: js.Array[AgnosticRouteObject]
  }
  object RouterInit {
    
    inline def apply(history: History, routes: js.Array[AgnosticRouteObject]): RouterInit = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterInit]
    }
    
    extension [Self <: RouterInit](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHydrationData(value: HydrationState): Self = StObject.set(x, "hydrationData", value.asInstanceOf[js.Any])
      
      inline def setHydrationDataUndefined: Self = StObject.set(x, "hydrationData", js.undefined)
      
      inline def setRoutes(value: js.Array[AgnosticRouteObject]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: AgnosticRouteObject*): Self = StObject.set(x, "routes", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.remixRunRouter.routerMod.LinkNavigateOptions
    - typings.remixRunRouter.routerMod.SubmissionNavigateOptions
  */
  trait RouterNavigateOptions extends StObject
  object RouterNavigateOptions {
    
    inline def LinkNavigateOptions(): typings.remixRunRouter.routerMod.LinkNavigateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.remixRunRouter.routerMod.LinkNavigateOptions]
    }
    
    inline def SubmissionNavigateOptions(formData: typings.std.FormData): typings.remixRunRouter.routerMod.SubmissionNavigateOptions = {
      val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.remixRunRouter.routerMod.SubmissionNavigateOptions]
    }
  }
  
  trait RouterState extends StObject {
    
    /**
      * Data from the action for the current matches
      */
    var actionData: RouteData | Null
    
    /**
      * Errors caught from loaders for the current matches
      */
    var errors: RouteData | Null
    
    /**
      * Map of current fetchers
      */
    var fetchers: Map[String, Fetcher[Any]]
    
    /**
      * The action of the most recent navigation
      */
    var historyAction: Action
    
    /**
      * Tracks whether we've completed our initial data load
      */
    var initialized: Boolean
    
    /**
      * Data from the loaders for the current matches
      */
    var loaderData: RouteData
    
    /**
      * The current location reflected by the router
      */
    var location: Location
    
    /**
      * The current set of route matches
      */
    var matches: js.Array[AgnosticDataRouteMatch]
    
    /**
      * Tracks the state of the current navigation
      */
    var navigation: Navigation
    
    /**
      * Indicate whether this navigation should skip resetting the scroll position
      * if we are unable to restore the scroll position
      */
    var preventScrollReset: Boolean
    
    /**
      * Current scroll position we should start at for a new view
      *  - number -> scroll position to restore to
      *  - false -> do not restore scroll at all (used during submissions)
      *  - null -> don't have a saved position, scroll to hash or top of page
      */
    var restoreScrollPosition: Double | `false` | Null
    
    /**
      * Tracks any in-progress revalidations
      */
    var revalidation: RevalidationState
  }
  object RouterState {
    
    inline def apply(
      fetchers: Map[String, Fetcher[Any]],
      historyAction: Action,
      initialized: Boolean,
      loaderData: RouteData,
      location: Location,
      matches: js.Array[AgnosticDataRouteMatch],
      navigation: Navigation,
      preventScrollReset: Boolean,
      revalidation: RevalidationState
    ): RouterState = {
      val __obj = js.Dynamic.literal(fetchers = fetchers.asInstanceOf[js.Any], historyAction = historyAction.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], loaderData = loaderData.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], preventScrollReset = preventScrollReset.asInstanceOf[js.Any], revalidation = revalidation.asInstanceOf[js.Any], actionData = null, errors = null, restoreScrollPosition = null)
      __obj.asInstanceOf[RouterState]
    }
    
    extension [Self <: RouterState](x: Self) {
      
      inline def setActionData(value: RouteData): Self = StObject.set(x, "actionData", value.asInstanceOf[js.Any])
      
      inline def setActionDataNull: Self = StObject.set(x, "actionData", null)
      
      inline def setErrors(value: RouteData): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsNull: Self = StObject.set(x, "errors", null)
      
      inline def setFetchers(value: Map[String, Fetcher[Any]]): Self = StObject.set(x, "fetchers", value.asInstanceOf[js.Any])
      
      inline def setHistoryAction(value: Action): Self = StObject.set(x, "historyAction", value.asInstanceOf[js.Any])
      
      inline def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      inline def setLoaderData(value: RouteData): Self = StObject.set(x, "loaderData", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: js.Array[AgnosticDataRouteMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: AgnosticDataRouteMatch*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setNavigation(value: Navigation): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollReset(value: Boolean): Self = StObject.set(x, "preventScrollReset", value.asInstanceOf[js.Any])
      
      inline def setRestoreScrollPosition(value: Double | `false`): Self = StObject.set(x, "restoreScrollPosition", value.asInstanceOf[js.Any])
      
      inline def setRestoreScrollPositionNull: Self = StObject.set(x, "restoreScrollPosition", null)
      
      inline def setRevalidation(value: RevalidationState): Self = StObject.set(x, "revalidation", value.asInstanceOf[js.Any])
    }
  }
  
  type RouterSubscriber = js.Function1[/* state */ RouterState, Unit]
  
  @js.native
  trait StaticHandler extends StObject {
    
    var dataRoutes: js.Array[AgnosticDataRouteObject] = js.native
    
    def query(request: Request): js.Promise[StaticHandlerContext | Response] = js.native
    
    def queryRoute(request: Request): js.Promise[Any] = js.native
    def queryRoute(request: Request, routeId: String): js.Promise[Any] = js.native
  }
  
  trait StaticHandlerContext extends StObject {
    
    var _deepestRenderedBoundaryId: js.UndefOr[String | Null] = js.undefined
    
    var actionData: RouteData | Null
    
    var actionHeaders: Record[String, Headers]
    
    var errors: RouteData | Null
    
    var loaderData: RouteData
    
    var loaderHeaders: Record[String, Headers]
    
    var location: Location
    
    var matches: js.Array[AgnosticDataRouteMatch]
    
    var statusCode: Double
  }
  object StaticHandlerContext {
    
    inline def apply(
      actionHeaders: Record[String, Headers],
      loaderData: RouteData,
      loaderHeaders: Record[String, Headers],
      location: Location,
      matches: js.Array[AgnosticDataRouteMatch],
      statusCode: Double
    ): StaticHandlerContext = {
      val __obj = js.Dynamic.literal(actionHeaders = actionHeaders.asInstanceOf[js.Any], loaderData = loaderData.asInstanceOf[js.Any], loaderHeaders = loaderHeaders.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], actionData = null, errors = null)
      __obj.asInstanceOf[StaticHandlerContext]
    }
    
    extension [Self <: StaticHandlerContext](x: Self) {
      
      inline def setActionData(value: RouteData): Self = StObject.set(x, "actionData", value.asInstanceOf[js.Any])
      
      inline def setActionDataNull: Self = StObject.set(x, "actionData", null)
      
      inline def setActionHeaders(value: Record[String, Headers]): Self = StObject.set(x, "actionHeaders", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: RouteData): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsNull: Self = StObject.set(x, "errors", null)
      
      inline def setLoaderData(value: RouteData): Self = StObject.set(x, "loaderData", value.asInstanceOf[js.Any])
      
      inline def setLoaderHeaders(value: Record[String, Headers]): Self = StObject.set(x, "loaderHeaders", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: js.Array[AgnosticDataRouteMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: AgnosticDataRouteMatch*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def set_deepestRenderedBoundaryId(value: String): Self = StObject.set(x, "_deepestRenderedBoundaryId", value.asInstanceOf[js.Any])
      
      inline def set_deepestRenderedBoundaryIdNull: Self = StObject.set(x, "_deepestRenderedBoundaryId", null)
      
      inline def set_deepestRenderedBoundaryIdUndefined: Self = StObject.set(x, "_deepestRenderedBoundaryId", js.undefined)
    }
  }
  
  /**
    * Options for a navigate() call for a Form navigation
    */
  trait SubmissionNavigateOptions
    extends StObject
       with RouterNavigateOptions {
    
    var formData: typings.std.FormData
    
    var formEncType: js.UndefOr[typings.remixRunRouter.utilsMod.FormEncType] = js.undefined
    
    var formMethod: js.UndefOr[typings.remixRunRouter.utilsMod.FormMethod] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object SubmissionNavigateOptions {
    
    inline def apply(formData: typings.std.FormData): SubmissionNavigateOptions = {
      val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubmissionNavigateOptions]
    }
    
    extension [Self <: SubmissionNavigateOptions](x: Self) {
      
      inline def setFormData(value: typings.std.FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormEncType(value: typings.remixRunRouter.utilsMod.FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: typings.remixRunRouter.utilsMod.FormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait UseMatchesMatch extends StObject {
    
    var data: Any
    
    var handle: Any
    
    var id: String
    
    var params: Params[String]
    
    var pathname: String
  }
  object UseMatchesMatch {
    
    inline def apply(data: Any, handle: Any, id: String, params: Params[String], pathname: String): UseMatchesMatch = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseMatchesMatch]
    }
    
    extension [Self <: UseMatchesMatch](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHandle(value: Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Params[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    }
  }
}
