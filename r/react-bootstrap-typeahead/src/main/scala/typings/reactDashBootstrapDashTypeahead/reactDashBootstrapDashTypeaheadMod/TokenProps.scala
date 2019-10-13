package typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.div
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
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction0(onRemove))
    __obj.asInstanceOf[TokenProps]
  }
}

