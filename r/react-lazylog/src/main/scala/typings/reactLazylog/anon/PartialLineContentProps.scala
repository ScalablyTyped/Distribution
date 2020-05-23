package typings.reactLazylog.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-lazylog.react-lazylog/build/LineContent.LineContentProps> */
trait PartialLineContentProps extends js.Object {
  var data: js.UndefOr[js.Array[Text]] = js.undefined
  var formatPart: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialLineContentProps {
  @scala.inline
  def apply(
    data: js.Array[Text] = null,
    formatPart: /* text */ String => ReactNode = null,
    number: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null
  ): PartialLineContentProps = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1(formatPart))
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLineContentProps]
  }
}

