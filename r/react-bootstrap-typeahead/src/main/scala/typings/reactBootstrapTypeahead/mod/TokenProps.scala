package typings.reactBootstrapTypeahead.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenProps
  extends AllHTMLAttributes[div]
     with ClassAttributes[div] {
  var active: js.UndefOr[Boolean] = js.undefined
  var onRemove: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object TokenProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[div] = null,
    ClassAttributes: ClassAttributes[div] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    onRemove: () => Unit = null
  ): TokenProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction0(onRemove))
    __obj.asInstanceOf[TokenProps]
  }
}

