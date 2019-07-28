package typings.ssri

import typings.ssri.ssriNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseOptions extends js.Object {
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var single: js.UndefOr[`false`] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Anon_FalseOptions {
  @scala.inline
  def apply(
    options: js.Array[String] = null,
    single: `false` = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Anon_FalseOptions = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (single != null) __obj.updateDynamic("single")(single)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_FalseOptions]
  }
}

