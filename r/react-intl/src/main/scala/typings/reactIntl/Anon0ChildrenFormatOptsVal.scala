package typings.reactIntl

import typings.react.mod.ReactElement
import typings.std.Intl.NumberFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0ChildrenFormatOptsVal extends js.Object {
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl.FormatNumberOptions): string>[0] */ js.Any
  def children(`val`: js.Array[NumberFormatPart]): ReactElement | Null
}

object Anon0ChildrenFormatOptsVal {
  @scala.inline
  def apply(
    children: js.Array[NumberFormatPart] => ReactElement | Null,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl.FormatNumberOptions): string>[0] */ js.Any
  ): Anon0ChildrenFormatOptsVal = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon0ChildrenFormatOptsVal]
  }
}

