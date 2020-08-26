package typings.rollingRateLimiter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompatibleRedisClient extends js.Object {
  def multi(): js.Any = js.native
}

object CompatibleRedisClient {
  @scala.inline
  def apply(multi: () => js.Any): CompatibleRedisClient = {
    val __obj = js.Dynamic.literal(multi = js.Any.fromFunction0(multi))
    __obj.asInstanceOf[CompatibleRedisClient]
  }
  @scala.inline
  implicit class CompatibleRedisClientOps[Self <: CompatibleRedisClient] (val x: Self) extends AnyVal {
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
    def setMulti(value: () => js.Any): Self = this.set("multi", js.Any.fromFunction0(value))
  }
  
}

