package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateChangeList extends js.Object {
  /** StateChangeList stateChanges */
  var stateChanges: js.UndefOr[js.Array[IStateChange] | Null] = js.native
}

object IStateChangeList {
  @scala.inline
  def apply(): IStateChangeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStateChangeList]
  }
  @scala.inline
  implicit class IStateChangeListOps[Self <: IStateChangeList] (val x: Self) extends AnyVal {
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
    def setStateChangesVarargs(value: IStateChange*): Self = this.set("stateChanges", js.Array(value :_*))
    @scala.inline
    def setStateChanges(value: js.Array[IStateChange]): Self = this.set("stateChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateChanges: Self = this.set("stateChanges", js.undefined)
    @scala.inline
    def setStateChangesNull: Self = this.set("stateChanges", null)
  }
  
}

