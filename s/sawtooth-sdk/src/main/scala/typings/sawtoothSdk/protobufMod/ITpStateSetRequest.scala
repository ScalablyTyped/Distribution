package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITpStateSetRequest extends js.Object {
  /** TpStateSetRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.undefined
  /** TpStateSetRequest entries */
  var entries: js.UndefOr[js.Array[ITpStateEntry] | Null] = js.undefined
}

object ITpStateSetRequest {
  @scala.inline
  def apply(contextId: String = null, entries: js.Array[ITpStateEntry] = null): ITpStateSetRequest = {
    val __obj = js.Dynamic.literal()
    if (contextId != null) __obj.updateDynamic("contextId")(contextId.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpStateSetRequest]
  }
}

