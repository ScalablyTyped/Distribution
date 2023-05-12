package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.distHistoryMod.Action
import typings.remixRunRouter.distHistoryMod.Location
import typings.remixRunRouter.distUtilsMod.AgnosticDataRouteMatch
import typings.remixRunRouter.distUtilsMod.RouteData
import typings.remixRunRouter.remixRunRouterBooleans.`false`
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterState extends StObject {
  
  /**
    * Data from the action for the current matches
    */
  var actionData: RouteData | Null
  
  /**
    * Map of current blockers
    */
  var blockers: Map[String, Blocker]
  
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
    blockers: Map[String, Blocker],
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
    val __obj = js.Dynamic.literal(blockers = blockers.asInstanceOf[js.Any], fetchers = fetchers.asInstanceOf[js.Any], historyAction = historyAction.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], loaderData = loaderData.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], preventScrollReset = preventScrollReset.asInstanceOf[js.Any], revalidation = revalidation.asInstanceOf[js.Any], actionData = null, errors = null, restoreScrollPosition = null)
    __obj.asInstanceOf[RouterState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouterState] (val x: Self) extends AnyVal {
    
    inline def setActionData(value: RouteData): Self = StObject.set(x, "actionData", value.asInstanceOf[js.Any])
    
    inline def setActionDataNull: Self = StObject.set(x, "actionData", null)
    
    inline def setBlockers(value: Map[String, Blocker]): Self = StObject.set(x, "blockers", value.asInstanceOf[js.Any])
    
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
