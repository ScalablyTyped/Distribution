package typings.rascal.mod

import typings.amqplib.propertiesMod.Options.Publish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicationConfig extends js.Object {
  var autoCreated: js.UndefOr[Boolean] = js.undefined
  var confirm: js.UndefOr[Boolean] = js.undefined
  var deprecated: js.UndefOr[Boolean] = js.undefined
  var encryption: js.UndefOr[String] = js.undefined
  var exchange: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[Publish] = js.undefined
  var queue: js.UndefOr[String] = js.undefined
  var routingKey: js.UndefOr[String] = js.undefined
  var vhost: js.UndefOr[String] = js.undefined
}

object PublicationConfig {
  @scala.inline
  def apply(
    autoCreated: js.UndefOr[Boolean] = js.undefined,
    confirm: js.UndefOr[Boolean] = js.undefined,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    encryption: String = null,
    exchange: String = null,
    options: Publish = null,
    queue: String = null,
    routingKey: String = null,
    vhost: String = null
  ): PublicationConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreated)) __obj.updateDynamic("autoCreated")(autoCreated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(confirm)) __obj.updateDynamic("confirm")(confirm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.get.asInstanceOf[js.Any])
    if (encryption != null) __obj.updateDynamic("encryption")(encryption.asInstanceOf[js.Any])
    if (exchange != null) __obj.updateDynamic("exchange")(exchange.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (routingKey != null) __obj.updateDynamic("routingKey")(routingKey.asInstanceOf[js.Any])
    if (vhost != null) __obj.updateDynamic("vhost")(vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicationConfig]
  }
}

