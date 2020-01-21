package typings.reactTruncate.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactNode
import typings.reactTruncate.reactTruncateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncateProps
  extends AllHTMLAttributes[Truncate]
     with ClassAttributes[Truncate] {
  var ellipsis: js.UndefOr[ReactNode] = js.undefined
  var lines: js.UndefOr[Double | `false`] = js.undefined
  var onTruncate: js.UndefOr[js.Function1[/* isTruncated */ Boolean, Unit]] = js.undefined
  var trimWhitespace: js.UndefOr[Boolean] = js.undefined
}

object TruncateProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Truncate] = null,
    ClassAttributes: ClassAttributes[Truncate] = null,
    ellipsis: ReactNode = null,
    lines: Double | `false` = null,
    onTruncate: /* isTruncated */ Boolean => Unit = null,
    trimWhitespace: js.UndefOr[Boolean] = js.undefined
  ): TruncateProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (onTruncate != null) __obj.updateDynamic("onTruncate")(js.Any.fromFunction1(onTruncate))
    if (!js.isUndefined(trimWhitespace)) __obj.updateDynamic("trimWhitespace")(trimWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncateProps]
  }
}

