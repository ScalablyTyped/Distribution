package typings
package reactDashAriaDashMenubuttonLib.reactDashAriaDashMenubuttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps[T /* <: reactLib.HTMLElement */]
  extends reactLib.reactMod.ReactNs.HTMLAttributes[T] {
  /**
  	 * The HTML tag for this element. Default: 'span'.
  	 */
  var tag: /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply[T /* <: reactLib.HTMLElement */](
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[T] = null,
    tag: /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.Any = null
  ): MenuProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[MenuProps[T]]
  }
}

