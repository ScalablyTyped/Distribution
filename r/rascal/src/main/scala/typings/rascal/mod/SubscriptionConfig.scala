package typings.rascal.mod

import typings.amqplib.propertiesMod.Options.Consume
import typings.rascal.AnonLimit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionConfig extends js.Object {
  var autoCreated: js.UndefOr[Boolean] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var deferCloseChannel: js.UndefOr[Double] = js.undefined
  var encryption: js.UndefOr[String] = js.undefined
  var handler: js.UndefOr[String] = js.undefined
  var handlers: js.UndefOr[js.Array[String]] = js.undefined
  var options: js.UndefOr[Consume] = js.undefined
  var prefetch: js.UndefOr[Double] = js.undefined
  var queue: js.UndefOr[String] = js.undefined
  var recovery: js.UndefOr[js.Any] = js.undefined
  var redeliveries: js.UndefOr[AnonLimit] = js.undefined
  var retry: js.UndefOr[RetryConfig | Boolean] = js.undefined
  var vhost: js.UndefOr[String] = js.undefined
}

object SubscriptionConfig {
  @scala.inline
  def apply(
    autoCreated: js.UndefOr[Boolean] = js.undefined,
    contentType: String = null,
    deferCloseChannel: Int | Double = null,
    encryption: String = null,
    handler: String = null,
    handlers: js.Array[String] = null,
    options: Consume = null,
    prefetch: Int | Double = null,
    queue: String = null,
    recovery: js.Any = null,
    redeliveries: AnonLimit = null,
    retry: RetryConfig | Boolean = null,
    vhost: String = null
  ): SubscriptionConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreated)) __obj.updateDynamic("autoCreated")(autoCreated.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (deferCloseChannel != null) __obj.updateDynamic("deferCloseChannel")(deferCloseChannel.asInstanceOf[js.Any])
    if (encryption != null) __obj.updateDynamic("encryption")(encryption.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (prefetch != null) __obj.updateDynamic("prefetch")(prefetch.asInstanceOf[js.Any])
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (recovery != null) __obj.updateDynamic("recovery")(recovery.asInstanceOf[js.Any])
    if (redeliveries != null) __obj.updateDynamic("redeliveries")(redeliveries.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (vhost != null) __obj.updateDynamic("vhost")(vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionConfig]
  }
}

