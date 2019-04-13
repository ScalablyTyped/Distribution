package typings
package reactDashLazylogLib.buildLinePartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinePartProps extends js.Object {
  var format: js.UndefOr[js.Function1[/* text */ java.lang.String, reactLib.reactMod.ReactNode]] = js.undefined
  var part: reactDashLazylogLib.Anon_Text
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object LinePartProps {
  @scala.inline
  def apply(
    part: reactDashLazylogLib.Anon_Text,
    format: /* text */ java.lang.String => reactLib.reactMod.ReactNode = null,
    style: reactLib.reactMod.CSSProperties = null
  ): LinePartProps = {
    val __obj = js.Dynamic.literal(part = part)
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LinePartProps]
  }
}

