package typings
package reactDashAriaDashMenubuttonLib.reactDashAriaDashMenubuttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps[T /* <: stdLib.HTMLElement */]
  extends reactLib.reactMod.HTMLAttributes[T] {
  /**
  	 * If true, the element is disabled
  	 * (aria-disabled='true', not in tab order, clicking has no effect).
  	 */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The HTML tag for this element. Default: 'span'.
  	 */
  var tag: /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply[T /* <: stdLib.HTMLElement */](
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[T] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    tag: /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.Any = null
  ): ButtonProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[ButtonProps[T]]
  }
}

