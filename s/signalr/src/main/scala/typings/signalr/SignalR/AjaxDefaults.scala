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
    val __obj = js.Dynamic.literal(async = async, cache = cache, global = global, processData = processData, timeout = timeout)
  
    __obj.asInstanceOf[AjaxDefaults]
  }
}

