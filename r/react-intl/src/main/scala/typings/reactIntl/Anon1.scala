package typings.reactIntl

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var children: js.UndefOr[js.Function1[/* val */ String, ReactElement | Null]] = js.undefined
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.FnCall>[0] */ js.Any
}

object Anon1 {
  @scala.inline
  def apply(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.FnCall>[0] */ js.Any,
    children: /* val */ String => ReactElement | Null = null
  ): Anon1 = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    __obj.asInstanceOf[Anon1]
  }
}

