package typings.reactIntl

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenValue extends js.Object {
  var children: js.UndefOr[js.Function1[/* val */ String, ReactElement | Null]] = js.undefined
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any
}

object AnonChildrenValue {
  @scala.inline
  def apply(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any,
    children: /* val */ String => ReactElement | Null = null
  ): AnonChildrenValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    __obj.asInstanceOf[AnonChildrenValue]
  }
}

