package typings
package rabbitDotJsLib.rabbitDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  var expiration: js.UndefOr[js.Any] = js.undefined
  var persistent: js.UndefOr[js.Any] = js.undefined
  var prefetch: js.UndefOr[js.Any] = js.undefined
  var routing: js.UndefOr[js.Any] = js.undefined
  var task: js.UndefOr[js.Any] = js.undefined
  var topic: js.UndefOr[js.Any] = js.undefined
}

object SocketOptions {
  @scala.inline
  def apply(
    expiration: js.Any = null,
    persistent: js.Any = null,
    prefetch: js.Any = null,
    routing: js.Any = null,
    task: js.Any = null,
    topic: js.Any = null
  ): SocketOptions = {
    val __obj = js.Dynamic.literal()
    if (expiration != null) __obj.updateDynamic("expiration")(expiration)
    if (persistent != null) __obj.updateDynamic("persistent")(persistent)
    if (prefetch != null) __obj.updateDynamic("prefetch")(prefetch)
    if (routing != null) __obj.updateDynamic("routing")(routing)
    if (task != null) __obj.updateDynamic("task")(task)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[SocketOptions]
  }
}

