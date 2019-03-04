package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportOptionChoice extends js.Object {
  var deprecated: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var redirect: js.UndefOr[SupportOptionValue] = js.undefined
  var since: js.UndefOr[java.lang.String] = js.undefined
  var value: scala.Boolean | java.lang.String
}

object SupportOptionChoice {
  @scala.inline
  def apply(
    value: scala.Boolean | java.lang.String,
    deprecated: java.lang.String = null,
    description: java.lang.String = null,
    redirect: SupportOptionValue = null,
    since: java.lang.String = null
  ): SupportOptionChoice = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated)
    if (description != null) __obj.updateDynamic("description")(description)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[SupportOptionChoice]
  }
}

