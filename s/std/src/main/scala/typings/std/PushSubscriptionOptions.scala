package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushSubscriptionOptions extends js.Object {
  val applicationServerKey: ArrayBuffer | Null
  val userVisibleOnly: scala.Boolean
}

object PushSubscriptionOptions {
  @scala.inline
  def apply(userVisibleOnly: scala.Boolean, applicationServerKey: ArrayBuffer = null): PushSubscriptionOptions = {
    val __obj = js.Dynamic.literal(userVisibleOnly = userVisibleOnly.asInstanceOf[js.Any], applicationServerKey = applicationServerKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushSubscriptionOptions]
  }
}

