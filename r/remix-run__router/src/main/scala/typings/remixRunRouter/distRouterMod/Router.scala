package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.distHistoryMod.Location
import typings.remixRunRouter.distHistoryMod.Path
import typings.remixRunRouter.distHistoryMod.To
import typings.remixRunRouter.distUtilsMod.AgnosticDataRouteObject
import typings.remixRunRouter.distUtilsMod.AgnosticRouteObject
import typings.remixRunRouter.distUtilsMod.DeferredData
import typings.std.AbortController
import typings.std.Map
import typings.std.Record
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * HMR needs to pass in-flight route updates to React Router
    * TODO: Replace this with granular route update APIs (addRoute, updateRoute, deleteRoute)
    */
  def _internalSetRoutes(routes: js.Array[AgnosticRouteObject]): Unit = js.native
  
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
    * Delete a navigation blocker
    * @param key The identifier for the blocker
    */
  def deleteBlocker(key: String): Unit = js.native
  
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
    * Utility function to URL encode a destination path according to the internal
    * history implementation
    * @param to
    */
  def encodeLocation(to: To): Path = js.native
  
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
  def fetch(key: String, routeId: String): Unit = js.native
  def fetch(key: String, routeId: String, href: String): Unit = js.native
  def fetch(key: String, routeId: String, href: String, opts: RouterFetchOptions): Unit = js.native
  def fetch(key: String, routeId: String, href: Null, opts: RouterFetchOptions): Unit = js.native
  
  /**
    * @internal
    * PRIVATE - DO NOT USE
    *
    * Get a navigation blocker
    * @param key The identifier for the blocker
    * @param fn The blocker function implementation
    */
  def getBlocker(key: String, fn: BlockerFunction): Blocker = js.native
  
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
    * Navigate to the given path
    * @param to Path to navigate to
    * @param opts Navigation options (method, submission, etc.)
    */
  def navigate(): js.Promise[Unit] = js.native
  /**
    * @internal
    * PRIVATE - DO NOT USE
    *
    * Navigate forward/backward in the history stack
    * @param to Delta to move in the history stack
    */
  def navigate(to: Double): js.Promise[Unit] = js.native
  def navigate(to: Null, opts: RouterNavigateOptions): js.Promise[Unit] = js.native
  def navigate(to: To): js.Promise[Unit] = js.native
  def navigate(to: To, opts: RouterNavigateOptions): js.Promise[Unit] = js.native
  
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
