package typings.rabbitJs.mod

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
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (persistent != null) __obj.updateDynamic("persistent")(persistent.asInstanceOf[js.Any])
    if (prefetch != null) __obj.updateDynamic("prefetch")(prefetch.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (task != null) __obj.updateDynamic("task")(task.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketOptions]
  }
}

