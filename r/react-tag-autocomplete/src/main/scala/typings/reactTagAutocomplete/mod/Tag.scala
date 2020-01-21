package typings.reactTagAutocomplete.mod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

