package typings.reactDashLazylog.buildLineContentMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.reactDashLazylog.Anon_Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineContentProps extends js.Object {
  var data: js.Array[Anon_Text]
  var formatPart: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.undefined
  var number: Double
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LineContentProps {
  @scala.inline
  def apply(
    data: js.Array[Anon_Text],
    number: Double,
    formatPart: /* text */ String => ReactNode = null,
    style: CSSProperties = null
  ): LineContentProps = {
    val __obj = js.Dynamic.literal(data = data, number = number)
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1(formatPart))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LineContentProps]
  }
}

