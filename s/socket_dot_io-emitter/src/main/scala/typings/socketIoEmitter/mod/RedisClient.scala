package typings.socketIoEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Redis client passed to `socket.io-emitter` only requires the `publish`
  * method, so accept any client that implements this.
  */
@js.native
trait RedisClient extends js.Object {
  
  def publish(channel: String, message: String): js.Promise[_] = js.native
}
object RedisClient {
  
  @scala.inline
  def apply(publish: (String, String) => js.Promise[_]): RedisClient = {
    val __obj = js.Dynamic.literal(publish = js.Any.fromFunction2(publish))
    __obj.asInstanceOf[RedisClient]
  }
  
  @scala.inline
  implicit class RedisClientOps[Self <: RedisClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPublish(value: (String, String) => js.Promise[_]): Self = this.set("publish", js.Any.fromFunction2(value))
  }
}
