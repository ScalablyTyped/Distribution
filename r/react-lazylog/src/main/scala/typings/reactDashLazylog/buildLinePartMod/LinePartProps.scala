package typings.reactDashLazylog.buildLinePartMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.reactDashLazylog.Anon_Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinePartProps extends js.Object {
  var format: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.undefined
  var part: Anon_Text
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LinePartProps {
  @scala.inline
  def apply(part: Anon_Text, format: /* text */ String => ReactNode = null, style: CSSProperties = null): LinePartProps = {
    val __obj = js.Dynamic.literal(part = part)
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LinePartProps]
  }
}

