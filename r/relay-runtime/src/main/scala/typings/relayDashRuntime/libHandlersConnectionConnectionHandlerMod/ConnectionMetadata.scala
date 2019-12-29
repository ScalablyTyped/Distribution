package typings.relayDashRuntime.libHandlersConnectionConnectionHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionMetadata extends js.Object {
  var count: js.UndefOr[String | Null] = js.undefined
   // 'forward' | 'backward' | 'bidirectional' | null | undefined;
  var cursor: js.UndefOr[String | Null] = js.undefined
  var direction: js.UndefOr[String | Null] = js.undefined
  var path: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object ConnectionMetadata {
  @scala.inline
  def apply(
    count: String = null,
    cursor: String = null,
    direction: String = null,
    path: js.Array[String] = null
  ): ConnectionMetadata = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionMetadata]
  }
}

