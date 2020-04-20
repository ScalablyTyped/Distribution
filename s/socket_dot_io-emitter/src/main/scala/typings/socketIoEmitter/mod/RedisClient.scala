package typings.socketIoEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Redis client passed to `socket.io-emitter` only requires the `publish`
  * method, so accept any client that implements this.
  */
trait RedisClient extends js.Object {
  def publish(channel: String, message: String): js.Promise[_]
}

object RedisClient {
  @scala.inline
  def apply(publish: (String, String) => js.Promise[_]): RedisClient = {
    val __obj = js.Dynamic.literal(publish = js.Any.fromFunction2(publish))
    __obj.asInstanceOf[RedisClient]
  }
}

