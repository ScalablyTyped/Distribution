package typings
package redisLib.redisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RetryStrategyOptions extends js.Object {
  var attempt: scala.Double
  var error: nodeLib.NodeJSNs.ErrnoException
  var times_connected: scala.Double
  var total_retry_time: scala.Double
}

