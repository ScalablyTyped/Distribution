package typings.socketIoEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketIOEmitterOptions extends js.Object {
  var key: js.UndefOr[String] = js.undefined
}

object SocketIOEmitterOptions {
  @scala.inline
  def apply(key: String = null): SocketIOEmitterOptions = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketIOEmitterOptions]
  }
}

