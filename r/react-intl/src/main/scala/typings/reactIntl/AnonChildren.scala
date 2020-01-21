package typings.reactIntl

import typings.react.mod.ReactElement
import typings.std.Date
import typings.std.Intl.DateTimeFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var value: js.UndefOr[String | Double | Date] = js.undefined
  def children(`val`: js.Array[DateTimeFormatPart]): ReactElement | Null
}

object AnonChildren {
  @scala.inline
  def apply(
    children: js.Array[DateTimeFormatPart] => ReactElement | Null,
    value: String | Double | Date = null
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

