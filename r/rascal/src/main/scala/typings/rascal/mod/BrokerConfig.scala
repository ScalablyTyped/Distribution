package typings.rascal.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerConfig extends js.Object {
  var defaults: js.UndefOr[VhostConfig] = js.undefined
  var encryption: js.UndefOr[StringDictionary[Encryption]] = js.undefined
  var publications: js.UndefOr[StringDictionary[PublicationConfig]] = js.undefined
  var recovery: js.UndefOr[StringDictionary[Recovery | js.Array[Recovery]]] = js.undefined
  var redeliveries: js.UndefOr[Redelivery] = js.undefined
  var subscriptions: js.UndefOr[StringDictionary[SubscriptionConfig]] = js.undefined
  var vhosts: js.UndefOr[StringDictionary[VhostConfig]] = js.undefined
}

object BrokerConfig {
  @scala.inline
  def apply(
    defaults: VhostConfig = null,
    encryption: StringDictionary[Encryption] = null,
    publications: StringDictionary[PublicationConfig] = null,
    recovery: StringDictionary[Recovery | js.Array[Recovery]] = null,
    redeliveries: Redelivery = null,
    subscriptions: StringDictionary[SubscriptionConfig] = null,
    vhosts: StringDictionary[VhostConfig] = null
  ): BrokerConfig = {
    val __obj = js.Dynamic.literal()
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (encryption != null) __obj.updateDynamic("encryption")(encryption.asInstanceOf[js.Any])
    if (publications != null) __obj.updateDynamic("publications")(publications.asInstanceOf[js.Any])
    if (recovery != null) __obj.updateDynamic("recovery")(recovery.asInstanceOf[js.Any])
    if (redeliveries != null) __obj.updateDynamic("redeliveries")(redeliveries.asInstanceOf[js.Any])
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    if (vhosts != null) __obj.updateDynamic("vhosts")(vhosts.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerConfig]
  }
}

