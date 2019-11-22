package typings.reactDashIntl

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0ChildrenOpts extends js.Object {
  var children: js.UndefOr[js.Function1[/* val */ String, ReactElement | Null]] = js.undefined
  var value: /* import warning: ImportType.apply Failed type conversion: std.Parameters<(values : std.Array<string | react.react.ReactNode>, opts ? : react-intl.react-intl/dist/types.FormatListOptions): react.react.ReactNode>[0] */ js.Any
}

object Anon_0ChildrenOpts {
  @scala.inline
  def apply(
    value: /* import warning: ImportType.apply Failed type conversion: std.Parameters<(values : std.Array<string | react.react.ReactNode>, opts ? : react-intl.react-intl/dist/types.FormatListOptions): react.react.ReactNode>[0] */ js.Any,
    children: /* val */ String => ReactElement | Null = null
  ): Anon_0ChildrenOpts = {
    val __obj = js.Dynamic.literal(value = value)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    __obj.asInstanceOf[Anon_0ChildrenOpts]
  }
}

