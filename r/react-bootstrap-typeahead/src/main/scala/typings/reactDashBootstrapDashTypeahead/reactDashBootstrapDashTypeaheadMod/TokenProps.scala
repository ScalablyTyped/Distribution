package typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod

import typings.react.reactMod.HTMLProps
import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenProps extends HTMLProps[div] {
  var active: js.UndefOr[Boolean] = js.undefined
  var onRemove: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object TokenProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[div] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    onRemove: () => Unit = null
  ): TokenProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction0(onRemove))
    __obj.asInstanceOf[TokenProps]
  }
}

