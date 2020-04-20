package typings.reactIntl

import typings.react.mod.ReactElement
import typings.std.Intl.NumberFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any
  def children(`val`: js.Array[NumberFormatPart]): ReactElement | Null
}

object AnonChildren {
  @scala.inline
  def apply(
    children: js.Array[NumberFormatPart] => ReactElement | Null,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

