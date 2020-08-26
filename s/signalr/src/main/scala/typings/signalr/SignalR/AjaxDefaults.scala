package typings.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxDefaults extends js.Object {
  var async: Boolean = js.native
  var cache: Boolean = js.native
  var global: Boolean = js.native
  var processData: Boolean = js.native
  var timeout: Double = js.native
}

object AjaxDefaults {
  @scala.inline
  def apply(async: Boolean, cache: Boolean, global: Boolean, processData: Boolean, timeout: Double): AjaxDefaults = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], processData = processData.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxDefaults]
  }
  @scala.inline
  implicit class AjaxDefaultsOps[Self <: AjaxDefaults] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessData(value: Boolean): Self = this.set("processData", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
  
}

