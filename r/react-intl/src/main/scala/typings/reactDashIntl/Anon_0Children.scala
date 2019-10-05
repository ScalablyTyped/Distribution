package typings.reactDashIntl

import typings.react.reactMod.ReactElement
import typings.std.Intl.DateTimeFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0Children extends js.Object {
  var value: /* import warning: ImportType.apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/dist/types.FormatDateOptions): string>[0] */ js.Any
  def children(`val`: js.Array[DateTimeFormatPart]): ReactElement | Null
}

object Anon_0Children {
  @scala.inline
  def apply(
    children: js.Array[DateTimeFormatPart] => ReactElement | Null,
    value: /* import warning: ImportType.apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/dist/types.FormatDateOptions): string>[0] */ js.Any
  ): Anon_0Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value)
  
    __obj.asInstanceOf[Anon_0Children]
  }
}

