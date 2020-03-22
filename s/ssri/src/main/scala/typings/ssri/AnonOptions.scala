package typings.ssri

import typings.ssri.ssriBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var single: js.UndefOr[`false`] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object AnonOptions {
  @scala.inline
  def apply(
    options: js.Array[String] = null,
    single: `false` = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): AnonOptions = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (single != null) __obj.updateDynamic("single")(single.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions]
  }
}

