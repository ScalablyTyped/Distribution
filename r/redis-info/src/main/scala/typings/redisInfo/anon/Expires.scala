package typings.redisInfo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expires extends js.Object {
  var expires: Double = js.native
  var keys: Double = js.native
}

object Expires {
  @scala.inline
  def apply(expires: Double, keys: Double): Expires = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expires]
  }
  @scala.inline
  implicit class ExpiresOps[Self <: Expires] (val x: Self) extends AnyVal {
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
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeys(value: Double): Self = this.set("keys", value.asInstanceOf[js.Any])
  }
  
}

