package typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod

import typings.react.reactMod.HTMLProps
import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.li
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMenuItemProps extends HTMLProps[li] {
  var active: js.UndefOr[Boolean] = js.undefined
}

object BaseMenuItemProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[li] = null, active: js.UndefOr[Boolean] = js.undefined): BaseMenuItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    __obj.asInstanceOf[BaseMenuItemProps]
  }
}

