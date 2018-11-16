package typings
package rsmqDashWorkerLib.rsmqDashWorkerMod.RSMQWorkerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var autostart: js.UndefOr[scala.Boolean] = js.undefined
  var customExceedCheck: js.UndefOr[CustomExceedCheckCallback] = js.undefined
  var defaultDelay: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
  var invisibletime: js.UndefOr[scala.Double] = js.undefined
  var maxReceiveCount: js.UndefOr[scala.Double] = js.undefined
  var options: js.UndefOr[redisLib.redisMod.ClientOpts] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var redis: js.UndefOr[redisLib.redisMod.RedisClient] = js.undefined
  var redisPrefix: js.UndefOr[java.lang.String] = js.undefined
  var rsmq: js.UndefOr[rsmqLib.rsmqMod.Client] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

