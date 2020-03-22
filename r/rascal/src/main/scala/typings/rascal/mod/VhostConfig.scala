package typings.rascal.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rascal.AnonRegularPool
import typings.rascal.rascalStrings.fixed
import typings.rascal.rascalStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VhostConfig extends js.Object {
  var assert: js.UndefOr[Boolean] = js.undefined
  var bindings: js.UndefOr[StringDictionary[BindingConfig] | js.Array[String]] = js.undefined
  var check: js.UndefOr[Boolean] = js.undefined
  var connection: js.UndefOr[ConnectionConfig] = js.undefined
  var connectionStrategy: js.UndefOr[random | fixed] = js.undefined
  var connections: js.UndefOr[js.Array[ConnectionConfig]] = js.undefined
  var exchanges: js.UndefOr[StringDictionary[ExchangeConfig] | js.Array[String]] = js.undefined
  var namespace: js.UndefOr[String | Boolean] = js.undefined
  var publicationChannelPools: js.UndefOr[AnonRegularPool] = js.undefined
  var publications: js.UndefOr[StringDictionary[PublicationConfig]] = js.undefined
  var queues: js.UndefOr[StringDictionary[QueueConfig] | js.Array[String]] = js.undefined
  var subscriptions: js.UndefOr[StringDictionary[SubscriptionConfig]] = js.undefined
}

object VhostConfig {
  @scala.inline
  def apply(
    assert: js.UndefOr[Boolean] = js.undefined,
    bindings: StringDictionary[BindingConfig] | js.Array[String] = null,
    check: js.UndefOr[Boolean] = js.undefined,
    connection: ConnectionConfig = null,
    connectionStrategy: random | fixed = null,
    connections: js.Array[ConnectionConfig] = null,
    exchanges: StringDictionary[ExchangeConfig] | js.Array[String] = null,
    namespace: String | Boolean = null,
    publicationChannelPools: AnonRegularPool = null,
    publications: StringDictionary[PublicationConfig] = null,
    queues: StringDictionary[QueueConfig] | js.Array[String] = null,
    subscriptions: StringDictionary[SubscriptionConfig] = null
  ): VhostConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assert)) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (connectionStrategy != null) __obj.updateDynamic("connectionStrategy")(connectionStrategy.asInstanceOf[js.Any])
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    if (exchanges != null) __obj.updateDynamic("exchanges")(exchanges.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (publicationChannelPools != null) __obj.updateDynamic("publicationChannelPools")(publicationChannelPools.asInstanceOf[js.Any])
    if (publications != null) __obj.updateDynamic("publications")(publications.asInstanceOf[js.Any])
    if (queues != null) __obj.updateDynamic("queues")(queues.asInstanceOf[js.Any])
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[VhostConfig]
  }
}

