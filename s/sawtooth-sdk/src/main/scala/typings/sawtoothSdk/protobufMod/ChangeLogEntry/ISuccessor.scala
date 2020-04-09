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
  def apply(deletions: js.Array[Uint8Array] = null, successor: Uint8Array = null): ISuccessor = {
    val __obj = js.Dynamic.literal()
    if (deletions != null) __obj.updateDynamic("deletions")(deletions.asInstanceOf[js.Any])
    if (successor != null) __obj.updateDynamic("successor")(successor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuccessor]
  }
}

