package typings.reactDashIntl

import typings.react.reactMod.ReactElement
import typings.std.IntlNs.DateTimeFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0ChildrenFormat extends js.Object {
  var value: /* import warning: ImportType.apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/dist/types.FormatNumberOptions): string>[0] */ js.Any
  def children(`val`: js.Array[DateTimeFormatPart]): ReactElement | Null
}

object Anon_0ChildrenFormat {
  @scala.inline
  def apply(
    children: js.Array[DateTimeFormatPart] => ReactElement | Null,
    value: /* import warning: ImportType.apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/dist/types.FormatNumberOptions): string>[0] */ js.Any
  ): Anon_0ChildrenFormat = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value)
  
    __obj.asInstanceOf[Anon_0ChildrenFormat]
  }
}

