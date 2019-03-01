package typings
package reactDashGeosuggestLib.reactDashGeosuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Styles extends js.Object {
  var input: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var suggestItem: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var suggests: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

object Styles {
  @scala.inline
  def apply(
    input: stdLib.Record[java.lang.String, _] = null,
    suggestItem: stdLib.Record[java.lang.String, _] = null,
    suggests: stdLib.Record[java.lang.String, _] = null
  ): Styles = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    if (suggestItem != null) __obj.updateDynamic("suggestItem")(suggestItem)
    if (suggests != null) __obj.updateDynamic("suggests")(suggests)
    __obj.asInstanceOf[Styles]
  }
}

