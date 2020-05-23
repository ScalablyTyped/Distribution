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
  def apply(stateChanges: js.UndefOr[Null | js.Array[IStateChange]] = js.undefined): IStateChangeList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stateChanges)) __obj.updateDynamic("stateChanges")(stateChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateChangeList]
  }
}

