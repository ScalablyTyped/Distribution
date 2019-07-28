package typings.reactDashTagDashAutocomplete.reactDashTagDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: String | Double
  var name: String
}

object Tag {
  @scala.inline
  def apply(id: String | Double, name: String, disabled: js.UndefOr[Boolean] = js.undefined): Tag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[Tag]
  }
}

