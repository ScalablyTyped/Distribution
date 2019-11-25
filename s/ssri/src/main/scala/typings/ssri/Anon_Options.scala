package typings.ssri

import typings.ssri.ssriNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var single: `true`
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Anon_Options {
  @scala.inline
  def apply(single: `true`, options: js.Array[String] = null, strict: js.UndefOr[Boolean] = js.undefined): Anon_Options = {
    val __obj = js.Dynamic.literal(single = single.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Options]
  }
}

