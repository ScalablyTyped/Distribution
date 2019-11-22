package typings.reactDashIntl

import typings.react.reactMod.ReactElement
import typings.reactDashIntl.reactDashIntlStrings.formatDate
import typings.reactDashIntl.reactDashIntlStrings.formatTime
import typings.std.Intl.DateTimeFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0ChildrenVal[Name /* <: formatDate | formatTime */] extends js.Object {
  var value: /* import warning: ImportType.apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/types.IntlShape[Name]>[0] */ js.Any
  def children(`val`: js.Array[DateTimeFormatPart]): ReactElement | Null
}

object Anon_0ChildrenVal {
  @scala.inline
  def apply[Name /* <: formatDate | formatTime */](
    children: js.Array[DateTimeFormatPart] => ReactElement | Null,
    value: /* import warning: ImportType.apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/types.IntlShape[Name]>[0] */ js.Any
  ): Anon_0ChildrenVal[Name] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value)
  
    __obj.asInstanceOf[Anon_0ChildrenVal[Name]]
  }
}

