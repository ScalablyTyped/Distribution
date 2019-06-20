package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheConfig extends js.Object {
  var force: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var liveConfigId: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var metadata: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var poll: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var transactionId: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object CacheConfig {
  @scala.inline
  def apply(
    force: js.UndefOr[scala.Boolean] = js.undefined,
    liveConfigId: java.lang.String = null,
    metadata: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    poll: scala.Int | scala.Double = null,
    transactionId: java.lang.String = null
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

