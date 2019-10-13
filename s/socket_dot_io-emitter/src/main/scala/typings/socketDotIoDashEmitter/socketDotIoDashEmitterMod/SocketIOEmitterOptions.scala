package typings.socketDotIoDashEmitter.socketDotIoDashEmitterMod

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
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[SocketIOEmitterOptions]
  }
}

