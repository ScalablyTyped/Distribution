package typings.simplebarDashReact.simplebarDashReactMod

import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends HTMLAttributes[HTMLElement] {
  var options: js.UndefOr[js.Object] = js.undefined
  var scrollableNodeProps: js.UndefOr[js.Object] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    options: js.Object = null,
    scrollableNodeProps: js.Object = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (options != null) __obj.updateDynamic("options")(options)
    if (scrollableNodeProps != null) __obj.updateDynamic("scrollableNodeProps")(scrollableNodeProps)
    __obj.asInstanceOf[Props]
  }
}

