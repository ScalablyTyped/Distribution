package typings.reactIntl.anon

import typings.react.mod.ReactElement
import typings.reactIntl.reactIntlStrings.formatDate
import typings.reactIntl.reactIntlStrings.formatTime
import typings.std.Intl.DateTimeFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value[Name /* <: formatDate | formatTime */] extends js.Object {
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/types.IntlShape[Name]>[0] */ js.Any
  def children(`val`: js.Array[DateTimeFormatPart]): ReactElement | Null
}

object Value {
  @scala.inline
  def apply[Name](
    children: js.Array[DateTimeFormatPart] => ReactElement | Null,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/types.IntlShape[Name]>[0] */ js.Any
  ): Value[Name] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[Name]]
  }
}

