package typings.sawtoothSdk.protobufMod.ChangeLogEntry

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Successor. */
trait ISuccessor extends js.Object {
  /** Successor deletions */
  var deletions: js.UndefOr[js.Array[Uint8Array] | Null] = js.undefined
  /** Successor successor */
  var successor: js.UndefOr[Uint8Array | Null] = js.undefined
}

object ISuccessor {
  @scala.inline
  def apply(
    deletions: js.UndefOr[Null | js.Array[Uint8Array]] = js.undefined,
    successor: js.UndefOr[Null | Uint8Array] = js.undefined
  ): ISuccessor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deletions)) __obj.updateDynamic("deletions")(deletions.asInstanceOf[js.Any])
    if (!js.isUndefined(successor)) __obj.updateDynamic("successor")(successor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuccessor]
  }
}

