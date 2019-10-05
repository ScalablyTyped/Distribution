package typings.qlikDashVisualizationextensions.SelectionStateAPI

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQSelectionState extends js.Object {
  /**
    * Number of back steps available.
    */
  var backCount: Double
  /**
    * Number of forward steps available. OnData notification will be triggered after each update.
    */
  var forwardCount: Double
  /**
    * Selections
    */
  var selections: IQFieldSelections
  /**
    * State name. $ for default state.
    */
  var stateName: String
  /**
    * Cleara all selections in this state.
    * @param lockedAlso - Use to also clear locked fields.
    * @return - A promise of a Qlik engine reply.
    */
  def clearAll(lockedAlso: Boolean): IPromise[_]
  /**
    * Locks all selections in this state.
    * @return - A promise of a Qlik engine reply.
    */
  def lockAll(): IPromise[_]
  /**
    * Unlocks all selections in this state.
    * @return - A promise of a Qlik engine reply.
    */
  def unlockAll(): IPromise[_]
}

object IQSelectionState {
  @scala.inline
  def apply(
    backCount: Double,
    clearAll: Boolean => IPromise[_],
    forwardCount: Double,
    lockAll: () => IPromise[_],
    selections: IQFieldSelections,
    stateName: String,
    unlockAll: () => IPromise[_]
  ): IQSelectionState = {
    val __obj = js.Dynamic.literal(backCount = backCount, clearAll = js.Any.fromFunction1(clearAll), forwardCount = forwardCount, lockAll = js.Any.fromFunction0(lockAll), selections = selections, stateName = stateName, unlockAll = js.Any.fromFunction0(unlockAll))
  
    __obj.asInstanceOf[IQSelectionState]
  }
}

