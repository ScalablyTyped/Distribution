package typings
package splunkDashLoggingLib.splunkDashLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var batchInterval: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var level: js.UndefOr[java.lang.String] = js.undefined
  var maxBatchCount: js.UndefOr[scala.Double] = js.undefined
  var maxBatchSize: js.UndefOr[scala.Double] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[
    splunkDashLoggingLib.splunkDashLoggingLibStrings.http | splunkDashLoggingLib.splunkDashLoggingLibStrings.https
  ] = js.undefined
  var token: java.lang.String
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    token: java.lang.String,
    batchInterval: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    level: java.lang.String = null,
    maxBatchCount: scala.Int | scala.Double = null,
    maxBatchSize: scala.Int | scala.Double = null,
    maxRetries: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    protocol: splunkDashLoggingLib.splunkDashLoggingLibStrings.http | splunkDashLoggingLib.splunkDashLoggingLibStrings.https = null,
    url: java.lang.String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("token")(token)
    if (batchInterval != null) __obj.updateDynamic("batchInterval")(batchInterval.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (level != null) __obj.updateDynamic("level")(level)
    if (maxBatchCount != null) __obj.updateDynamic("maxBatchCount")(maxBatchCount.asInstanceOf[js.Any])
    if (maxBatchSize != null) __obj.updateDynamic("maxBatchSize")(maxBatchSize.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Config]
  }
}

