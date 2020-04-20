package typings.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxDefaults extends js.Object {
  var async: Boolean
  var cache: Boolean
  var global: Boolean
  var processData: Boolean
  var timeout: Double
}

object AjaxDefaults {
  @scala.inline
  def apply(async: Boolean, cache: Boolean, global: Boolean, processData: Boolean, timeout: Double): AjaxDefaults = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], processData = processData.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxDefaults]
  }
}

