package typings.reduxSagaTester.mod

import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SagaTester[StateType /* <: js.Object */] extends js.Object {
  
  /**
    * Dispatches an action to the redux store.
    */
  def dispatch(action: AnyAction): Unit = js.native
  
  /**
    * Returns an array of all actions dispatched.
    */
  def getCalledActions(): js.Array[AnyAction] = js.native
  
  /**
    * Returns the last action dispatched to the store.
    */
  def getLatestCalledAction(): AnyAction = js.native
  
  /**
    * Returns the state of the redux store.
    */
  def getState(): StateType = js.native
  
  /**
    * Returns the number of times an action with the given type was dispatched.
    */
  def numCalled(actionType: String): Double = js.native
  
  /**
    * Reset the store state back to initialState
    * @param clearActionList Clears the history of past actions (defaults to false).
    */
  def reset(): Unit = js.native
  def reset(clearActionList: Boolean): Unit = js.native
  
  /**
    * Starts execution of the provided saga.
    */
  def start(saga: SagaFunction, args: js.Any*): js.Any = js.native
  
  /**
    * Assigns the newState into the current state. (Only works with the default reducer.)
    */
  def updateState(state: StateType): Unit = js.native
  
  /**
    * Returns a promise that will resolve if the specified action is dispatched to the store.
    * @param actionType Action name.
    * @param futureOnly Causes waitFor to only resolve if the action is called in the future.
    */
  def waitFor(actionType: String): js.Thenable[AnyAction] = js.native
  def waitFor(actionType: String, futureOnly: Boolean): js.Thenable[AnyAction] = js.native
  
  /**
    * Returns whether the specified was dispatched in the past.
    */
  def wasCalled(actionType: String): Boolean = js.native
}
