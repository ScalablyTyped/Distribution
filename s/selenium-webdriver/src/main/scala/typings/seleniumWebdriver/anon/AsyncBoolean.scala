package typings.seleniumWebdriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncBoolean extends js.Object {
  var async: Boolean = js.native
}

object AsyncBoolean {
  @scala.inline
  def apply(async: Boolean): AsyncBoolean = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncBoolean]
  }
  @scala.inline
  implicit class AsyncBooleanOps[Self <: AsyncBoolean] (val x: Self) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
  }
  
}

