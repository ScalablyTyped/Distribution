package typings.relayDashRuntime.relayDashRuntimeMod

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
    force: js.UndefOr[Boolean] = js.undefined,
    liveConfigId: String = null,
    metadata: StringDictionary[js.Any] = null,
    poll: Int | Double = null,
    transactionId: String = null
  ): CacheConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (liveConfigId != null) __obj.updateDynamic("liveConfigId")(liveConfigId)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (poll != null) __obj.updateDynamic("poll")(poll.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId)
    __obj.asInstanceOf[CacheConfig]
  }
}

