package typings.ssri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OptionsSingle extends js.Object {
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var single: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Anon_OptionsSingle {
  @scala.inline
  def apply(
    options: js.Array[String] = null,
    single: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Anon_OptionsSingle = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_OptionsSingle]
  }
}

