package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateChangeList extends js.Object {
  /** StateChangeList stateChanges */
  var stateChanges: js.UndefOr[js.Array[IStateChange] | Null] = js.undefined
}

object IStateChangeList {
  @scala.inline
  def apply(stateChanges: js.Array[IStateChange] = null): IStateChangeList = {
    val __obj = js.Dynamic.literal()
    if (stateChanges != null) __obj.updateDynamic("stateChanges")(stateChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateChangeList]
  }
}

