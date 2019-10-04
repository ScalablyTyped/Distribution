package typings.signalfx.signalfxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IngestOptions extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
  var dimensions: js.UndefOr[js.Object] = js.undefined
  var enableAmazonUniqueId: js.UndefOr[Boolean] = js.undefined
  var ingestEndpoint: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var userAgents: js.UndefOr[js.Array[String]] = js.undefined
}

object IngestOptions {
  @scala.inline
  def apply(
    batchSize: Int | Double = null,
    dimensions: js.Object = null,
    enableAmazonUniqueId: js.UndefOr[Boolean] = js.undefined,
    ingestEndpoint: String = null,
    proxy: String = null,
    timeout: Int | Double = null,
    userAgents: js.Array[String] = null
  ): IngestOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (!js.isUndefined(enableAmazonUniqueId)) __obj.updateDynamic("enableAmazonUniqueId")(enableAmazonUniqueId)
    if (ingestEndpoint != null) __obj.updateDynamic("ingestEndpoint")(ingestEndpoint)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userAgents != null) __obj.updateDynamic("userAgents")(userAgents)
    __obj.asInstanceOf[IngestOptions]
  }
}

