package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionMetadata extends js.Object {
  var count: js.UndefOr[java.lang.String | scala.Null] = js.undefined
   // 'forward' | 'backward' | 'bidirectional' | null | undefined;
  var cursor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var direction: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var path: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
}

object ConnectionMetadata {
  @scala.inline
  def apply(
    count: java.lang.String = null,
    cursor: java.lang.String = null,
    direction: java.lang.String = null,
    path: js.Array[java.lang.String] = null
  ): ConnectionMetadata = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[ConnectionMetadata]
  }
}

