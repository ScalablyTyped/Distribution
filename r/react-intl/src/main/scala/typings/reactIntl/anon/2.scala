package typings.reactIntl.anon

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2` extends js.Object {
  var children: js.UndefOr[js.Function1[/* val */ String, ReactElement | Null]] = js.undefined
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames * / any['of']>[0], opts ? : react-intl.react-intl/lib/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any
}

object `2` {
  @scala.inline
  def apply(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames * / any['of']>[0], opts ? : react-intl.react-intl/lib/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any,
    children: /* val */ String => ReactElement | Null = null
  ): `2` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    __obj.asInstanceOf[`2`]
  }
}

