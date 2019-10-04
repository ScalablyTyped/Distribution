package typings.serverless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Required extends js.Object {
  var required: js.UndefOr[Boolean] = js.undefined
  var shortcut: js.UndefOr[String] = js.undefined
  var usage: js.UndefOr[String] = js.undefined
}

object Anon_Required {
  @scala.inline
  def apply(required: js.UndefOr[Boolean] = js.undefined, shortcut: String = null, usage: String = null): Anon_Required = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut)
    if (usage != null) __obj.updateDynamic("usage")(usage)
    __obj.asInstanceOf[Anon_Required]
  }
}

