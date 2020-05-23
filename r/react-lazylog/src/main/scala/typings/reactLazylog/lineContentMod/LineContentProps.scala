package typings.reactLazylog.lineContentMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactLazylog.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineContentProps extends js.Object {
  var data: js.Array[Text]
  var formatPart: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.undefined
  var number: Double
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LineContentProps {
  @scala.inline
  def apply(
    data: js.Array[Text],
    number: Double,
    formatPart: /* text */ String => ReactNode = null,
    style: CSSProperties = null
  ): LineContentProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1(formatPart))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineContentProps]
  }
}

