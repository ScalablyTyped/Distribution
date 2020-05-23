package typings.relayRuntime.relayRuntimeTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheConfig extends js.Object {
  var force: js.UndefOr[Boolean | Null] = js.undefined
  var liveConfigId: js.UndefOr[String | Null] = js.undefined
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var poll: js.UndefOr[Double | Null] = js.undefined
  var transactionId: js.UndefOr[String | Null] = js.undefined
}

object CacheConfig {
  @scala.inline
  def apply(
    force: js.UndefOr[Null | Boolean] = js.undefined,
    liveConfigId: js.UndefOr[Null | String] = js.undefined,
    metadata: StringDictionary[js.Any] = null,
    poll: js.UndefOr[Null | Double] = js.undefined,
    transactionId: js.UndefOr[Null | String] = js.undefined
  ): CacheConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(liveConfigId)) __obj.updateDynamic("liveConfigId")(liveConfigId.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(poll)) __obj.updateDynamic("poll")(poll.asInstanceOf[js.Any])
    if (!js.isUndefined(transactionId)) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheConfig]
  }
}

