package typings.splunkLogging.mod

import typings.splunkLogging.splunkLoggingStrings.http
import typings.splunkLogging.splunkLoggingStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var batchInterval: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var maxBatchCount: js.UndefOr[Double] = js.undefined
  var maxBatchSize: js.UndefOr[Double] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[http | https] = js.undefined
  var token: String
  var url: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    token: String,
    batchInterval: js.UndefOr[Double] = js.undefined,
    host: String = null,
    level: String = null,
    maxBatchCount: js.UndefOr[Double] = js.undefined,
    maxBatchSize: js.UndefOr[Double] = js.undefined,
    maxRetries: js.UndefOr[Double] = js.undefined,
    name: String = null,
    path: String = null,
    port: js.UndefOr[Double] = js.undefined,
    protocol: http | https = null,
    url: String = null
  ): Config = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    if (!js.isUndefined(batchInterval)) __obj.updateDynamic("batchInterval")(batchInterval.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBatchCount)) __obj.updateDynamic("maxBatchCount")(maxBatchCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBatchSize)) __obj.updateDynamic("maxBatchSize")(maxBatchSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

