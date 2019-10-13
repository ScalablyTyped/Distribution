package typings.reactDashAriaDashMenubutton.reactDashAriaDashMenubuttonMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps[T /* <: HTMLElement */]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  /**
  	 * The HTML tag for this element. Default: 'span'.
  	 */
  var tag: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply[T /* <: HTMLElement */](
    AllHTMLAttributes: AllHTMLAttributes[T] = null,
    ClassAttributes: ClassAttributes[T] = null,
    tag: /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.Any = null
  ): MenuProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[MenuProps[T]]
  }
}

