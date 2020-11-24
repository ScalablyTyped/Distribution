package typings.reactNavigationRouters.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router[State /* <: NavigationState[ParamListBase] */, Action /* <: NavigationAction */] extends js.Object {
  
  /**
    * Action creators for the router.
    */
  var actionCreators: js.UndefOr[ActionCreators[Action]] = js.native
  
  /**
    * Initialize the navigation state.
    *
    * @param options.routeNames List of valid route names as defined in the screen components.
    * @param options.routeParamsList Object containing params for each route.
    */
  def getInitialState(options: RouterConfigOptions): State = js.native
  
  def getRehydratedState(partialState: State, options: RouterConfigOptions): State = js.native
  /**
    * Rehydrate the full navigation state from a given partial state.
    *
    * @param partialState Navigation state to rehydrate from.
    * @param options.routeNames List of valid route names as defined in the screen components.
    * @param options.routeParamsList Object containing params for each route.
    */
  def getRehydratedState(partialState: PartialState[State], options: RouterConfigOptions): State = js.native
  
  /**
    * Take the current state and action, and return a new state.
    * If the action cannot be handled, return `null`.
    *
    * @param state State object to apply the action on.
    * @param action Action object to apply.
    * @param options.routeNames List of valid route names as defined in the screen components.
    * @param options.routeParamsList Object containing params for each route.
    */
  def getStateForAction(state: State, action: Action, options: RouterConfigOptions): State | PartialState[State] | Null = js.native
  
  /**
    * Take the current state and key of a route, and return a new state with the route focused
    *
    * @param state State object to apply the action on.
    * @param key Key of the route to focus.
    */
  def getStateForRouteFocus(state: State, key: String): State = js.native
  
  /**
    * Take the current state and updated list of route names, and return a new state.
    *
    * @param state State object to update.
    * @param options.routeNames New list of route names.
    * @param options.routeParamsList Object containing params for each route.
    */
  def getStateForRouteNamesChange(state: State, options: RouterConfigOptions): State = js.native
  
  /**
    * Whether the action should also change focus in parent navigator
    *
    * @param action Action object to check.
    */
  def shouldActionChangeFocus(action: NavigationAction): Boolean = js.native
  
  /**
    * Type of the router. Should match the `type` property in state.
    * If the type doesn't match, the state will be discarded during rehydration.
    */
  var `type`: /* import warning: importer.ImportType#apply Failed type conversion: State['type'] */ js.Any = js.native
}
