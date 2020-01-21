package typings.reactLazylog.linePartMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactLazylog.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinePartProps extends js.Object {
  var format: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.undefined
  var part: AnonText
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LinePartProps {
  @scala.inline
  def apply(part: AnonText, format: /* text */ String => ReactNode = null, style: CSSProperties = null): LinePartProps = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinePartProps]
  }
}

