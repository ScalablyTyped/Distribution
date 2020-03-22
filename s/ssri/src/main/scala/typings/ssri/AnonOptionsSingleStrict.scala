package typings.ssri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptionsSingleStrict extends js.Object {
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var single: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object AnonOptionsSingleStrict {
  @scala.inline
  def apply(
    options: js.Array[String] = null,
    single: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): AnonOptionsSingleStrict = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptionsSingleStrict]
  }
}

