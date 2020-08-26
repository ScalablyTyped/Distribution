package typings.qlikVisualizationextensions.SelectionStateAPI

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQSelectionState extends js.Object {
  /**
    * Number of back steps available.
    */
  var backCount: Double = js.native
  /**
    * Number of forward steps available. OnData notification will be triggered after each update.
    */
  var forwardCount: Double = js.native
  /**
    * Selections
    */
  var selections: IQFieldSelections = js.native
  /**
    * State name. $ for default state.
    */
  var stateName: String = js.native
  /**
    * Cleara all selections in this state.
    * @param lockedAlso - Use to also clear locked fields.
    * @return - A promise of a Qlik engine reply.
    */
  def clearAll(lockedAlso: Boolean): IPromise[_] = js.native
  /**
    * Locks all selections in this state.
    * @return - A promise of a Qlik engine reply.
    */
  def lockAll(): IPromise[_] = js.native
  /**
    * Unlocks all selections in this state.
    * @return - A promise of a Qlik engine reply.
    */
  def unlockAll(): IPromise[_] = js.native
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
    val __obj = js.Dynamic.literal(backCount = backCount.asInstanceOf[js.Any], clearAll = js.Any.fromFunction1(clearAll), forwardCount = forwardCount.asInstanceOf[js.Any], lockAll = js.Any.fromFunction0(lockAll), selections = selections.asInstanceOf[js.Any], stateName = stateName.asInstanceOf[js.Any], unlockAll = js.Any.fromFunction0(unlockAll))
    __obj.asInstanceOf[IQSelectionState]
  }
  @scala.inline
  implicit class IQSelectionStateOps[Self <: IQSelectionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackCount(value: Double): Self = this.set("backCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearAll(value: Boolean => IPromise[_]): Self = this.set("clearAll", js.Any.fromFunction1(value))
    @scala.inline
    def setForwardCount(value: Double): Self = this.set("forwardCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockAll(value: () => IPromise[_]): Self = this.set("lockAll", js.Any.fromFunction0(value))
    @scala.inline
    def setSelections(value: IQFieldSelections): Self = this.set("selections", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateName(value: String): Self = this.set("stateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnlockAll(value: () => IPromise[_]): Self = this.set("unlockAll", js.Any.fromFunction0(value))
  }
  
}

