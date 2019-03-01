package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxDefaults extends js.Object {
  var async: scala.Boolean
  var cache: scala.Boolean
  var global: scala.Boolean
  var processData: scala.Boolean
  var timeout: scala.Double
}

object AjaxDefaults {
  @scala.inline
  def apply(
    async: scala.Boolean,
    cache: scala.Boolean,
    global: scala.Boolean,
    processData: scala.Boolean,
    timeout: scala.Double
  ): AjaxDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("async")(async)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("global")(global)
    __obj.updateDynamic("processData")(processData)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[AjaxDefaults]
  }
}

