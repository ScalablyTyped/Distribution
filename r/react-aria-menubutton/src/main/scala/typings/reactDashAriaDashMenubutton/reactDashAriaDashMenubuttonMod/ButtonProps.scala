package typings.reactDashAriaDashMenubutton.reactDashAriaDashMenubuttonMod

import typings.react.reactMod.HTMLProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps[T /* <: HTMLElement */] extends HTMLProps[T] {
  /**
  	 * The HTML tag for this element. Default: 'span'.
  	 */
  var tag: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply[T /* <: HTMLElement */](
    HTMLProps: HTMLProps[T] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    tag: /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.Any = null
  ): ButtonProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[ButtonProps[T]]
  }
}

