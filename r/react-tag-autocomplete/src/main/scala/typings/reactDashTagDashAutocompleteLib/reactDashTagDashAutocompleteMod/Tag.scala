package typings
package reactDashTagDashAutocompleteLib.reactDashTagDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: java.lang.String | scala.Double
  var name: java.lang.String
}

object Tag {
  @scala.inline
  def apply(
    id: java.lang.String | scala.Double,
    name: java.lang.String,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Tag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[Tag]
  }
}

