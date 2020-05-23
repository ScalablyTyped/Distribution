package typings.rascal.mod

import typings.amqplib.propertiesMod.Options.AssertQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueConfig extends js.Object {
  var assert: js.UndefOr[Boolean] = js.undefined
  var check: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[AssertQueue] = js.undefined
}

object QueueConfig {
  @scala.inline
  def apply(
    assert: js.UndefOr[Boolean] = js.undefined,
    check: js.UndefOr[Boolean] = js.undefined,
    options: AssertQueue = null
  ): QueueConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assert)) __obj.updateDynamic("assert")(assert.get.asInstanceOf[js.Any])
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueConfig]
  }
}

