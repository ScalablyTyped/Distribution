package typings.reactDashIntl

import typings.react.reactMod.ReactElement
import typings.std.Date
import typings.std.Intl.DateTimeFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var value: js.UndefOr[String | Double | Date] = js.undefined
  def children(`val`: js.Array[DateTimeFormatPart]): ReactElement | Null
}

object Anon_Children {
  @scala.inline
  def apply(
    children: js.Array[DateTimeFormatPart] => ReactElement | Null,
    value: String | Double | Date = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

