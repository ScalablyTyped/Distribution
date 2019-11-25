package typings.prettier.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportOptionChoice extends js.Object {
  var deprecated: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var redirect: js.UndefOr[SupportOptionValue] = js.undefined
  var since: js.UndefOr[String] = js.undefined
  var value: Boolean | String
}

object SupportOptionChoice {
  @scala.inline
  def apply(
    value: Boolean | String,
    deprecated: String = null,
    description: String = null,
    redirect: SupportOptionValue = null,
    since: String = null
  ): SupportOptionChoice = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportOptionChoice]
  }
}

