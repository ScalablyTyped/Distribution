package typings.relayRuntime.connectionHandlerMod

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
    count: js.UndefOr[Null | String] = js.undefined,
    cursor: js.UndefOr[Null | String] = js.undefined,
    direction: js.UndefOr[Null | String] = js.undefined,
    path: js.UndefOr[Null | js.Array[String]] = js.undefined
  ): ConnectionMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(cursor)) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionMetadata]
  }
}

