package typings.reactable.reactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TdProperties extends js.Object {
  var column: String
  var data: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object TdProperties {
  @scala.inline
  def apply(column: String, data: js.Any = null, value: js.Any = null): TdProperties = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TdProperties]
  }
}

