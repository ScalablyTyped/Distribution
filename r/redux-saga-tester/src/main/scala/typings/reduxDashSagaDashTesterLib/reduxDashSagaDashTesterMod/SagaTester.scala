package typings
package reduxDashSagaDashTesterLib.reduxDashSagaDashTesterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SagaTester[StateType /* <: js.Object */] extends js.Object {
  /**
       * Dispatches an action to the redux store.
       */
  def dispatch(action: AnyAction): scala.Unit = js.native
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
  def numCalled(actionType: java.lang.String): scala.Double = js.native
  /**
       * Reset the store state back to initialState
       * @param clearActionList Clears the history of past actions (defaults to false).
       */
  def reset(): scala.Unit = js.native
  /**
       * Reset the store state back to initialState
       * @param clearActionList Clears the history of past actions (defaults to false).
       */
  def reset(clearActionList: scala.Boolean): scala.Unit = js.native
  /**
       * Starts execution of the provided saga.
       */
  def start(saga: SagaFunction): scala.Unit = js.native
  /**
       * Assigns the newState into the current state. (Only works with the default reducer.)
       */
  def updateState(state: StateType): scala.Unit = js.native
  /**
       * Returns a promise that will resolve if the specified action is dispatched to the store.
       * @param futureOnly Causes waitFor to only resolve if the action is called in the future.
       */
  def waitFor(actionType: java.lang.String): stdLib.PromiseLike[scala.Unit] = js.native
  /**
       * Returns a promise that will resolve if the specified action is dispatched to the store.
       * @param futureOnly Causes waitFor to only resolve if the action is called in the future.
       */
  def waitFor(actionType: java.lang.String, futureOnly: scala.Boolean): stdLib.PromiseLike[scala.Unit] = js.native
  /**
       * Returns whether the specified was dispatched in the past.
       */
  def wasCalled(actionType: java.lang.String): scala.Boolean = js.native
}

