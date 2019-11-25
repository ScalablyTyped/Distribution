package typings.reactDashGeosuggest.reactDashGeosuggestMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Styles extends js.Object {
  var input: js.UndefOr[Record[String, _]] = js.undefined
  var suggestItem: js.UndefOr[Record[String, _]] = js.undefined
  var suggests: js.UndefOr[Record[String, _]] = js.undefined
}

object Styles {
  @scala.inline
  def apply(
    input: Record[String, _] = null,
    suggestItem: Record[String, _] = null,
    suggests: Record[String, _] = null
  ): Styles = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (suggestItem != null) __obj.updateDynamic("suggestItem")(suggestItem.asInstanceOf[js.Any])
    if (suggests != null) __obj.updateDynamic("suggests")(suggests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styles]
  }
}

