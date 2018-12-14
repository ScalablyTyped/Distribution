package typings
package redisLib.redisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClientOpts extends js.Object {
  var auth_pass: js.UndefOr[java.lang.String] = js.undefined
  var connect_timeout: js.UndefOr[scala.Double] = js.undefined
  var db: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var detect_buffers: js.UndefOr[scala.Boolean] = js.undefined
  var enable_offline_queue: js.UndefOr[scala.Boolean] = js.undefined
  var family: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var max_attempts: js.UndefOr[scala.Double] = js.undefined
  var no_ready_check: js.UndefOr[scala.Boolean] = js.undefined
  var parser: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var rename_commands: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
  var retry_max_delay: js.UndefOr[scala.Double] = js.undefined
  var retry_strategy: js.UndefOr[RetryStrategy] = js.undefined
  var retry_unfulfilled_commands: js.UndefOr[scala.Boolean] = js.undefined
  var return_buffers: js.UndefOr[scala.Boolean] = js.undefined
  var socket_keepalive: js.UndefOr[scala.Boolean] = js.undefined
  var string_numbers: js.UndefOr[scala.Boolean] = js.undefined
  var tls: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

