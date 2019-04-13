package typings
package qlikDashVisualizationextensionsLib.SelectionStateAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQSelectionState extends js.Object {
  /**
    * Number of back steps available.
    */
  var backCount: scala.Double
  /**
    * Number of forward steps available. OnData notification will be triggered after each update.
    */
  var forwardCount: scala.Double
  /**
    * Selections
    */
  var selections: IQFieldSelections
  /**
    * State name. $ for default state.
    */
  var stateName: java.lang.String
  /**
    * Cleara all selections in this state.
    * @param lockedAlso - Use to also clear locked fields.
    * @return - A promise of a Qlik engine reply.
    */
  def clearAll(lockedAlso: scala.Boolean): angularLib.angularMod.IPromise[_]
  /**
    * Locks all selections in this state.
    * @return - A promise of a Qlik engine reply.
    */
  def lockAll(): angularLib.angularMod.IPromise[_]
  /**
    * Unlocks all selections in this state.
    * @return - A promise of a Qlik engine reply.
    */
  def unlockAll(): angularLib.angularMod.IPromise[_]
}

object IQSelectionState {
  @scala.inline
  def apply(
    backCount: scala.Double,
    clearAll: scala.Boolean => angularLib.angularMod.IPromise[_],
    forwardCount: scala.Double,
    lockAll: () => angularLib.angularMod.IPromise[_],
    selections: IQFieldSelections,
    stateName: java.lang.String,
    unlockAll: () => angularLib.angularMod.IPromise[_]
  ): IQSelectionState = {
    val __obj = js.Dynamic.literal(backCount = backCount, clearAll = js.Any.fromFunction1(clearAll), forwardCount = forwardCount, lockAll = js.Any.fromFunction0(lockAll), selections = selections, stateName = stateName, unlockAll = js.Any.fromFunction0(unlockAll))
  
    __obj.asInstanceOf[IQSelectionState]
  }
}

