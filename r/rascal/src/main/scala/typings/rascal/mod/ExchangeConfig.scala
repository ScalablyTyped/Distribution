package typings.rascal.mod

import typings.amqplib.propertiesMod.Options.AssertExchange
import typings.rascal.rascalStrings.direct
import typings.rascal.rascalStrings.fanout
import typings.rascal.rascalStrings.headers
import typings.rascal.rascalStrings.topic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExchangeConfig extends js.Object {
  var assert: js.UndefOr[Boolean] = js.undefined
  var check: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[AssertExchange] = js.undefined
  var `type`: js.UndefOr[direct | fanout | headers | topic] = js.undefined
}

object ExchangeConfig {
  @scala.inline
  def apply(
    assert: js.UndefOr[Boolean] = js.undefined,
    check: js.UndefOr[Boolean] = js.undefined,
    options: AssertExchange = null,
    `type`: direct | fanout | headers | topic = null
  ): ExchangeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assert)) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeConfig]
  }
}

