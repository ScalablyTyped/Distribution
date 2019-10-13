package typings.reactDashAriaDashMenubutton.reactDashAriaDashMenubuttonMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps[T /* <: HTMLElement */]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  /**
  	 * The HTML tag for this element. Default: 'span'.
  	 */
  var tag: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.undefined
  /**
  	 * If `text` has a value, its first letter will be the letter a user can
  	 * type to navigate to that item.
  	 */
  var text: js.UndefOr[String] = js.undefined
  /**
  	 * If value has a value, it will be passed to the onSelection handler
  	 * when the `MenuItem` is selected
  	 */
  @JSName("value")
  var value_MenuItemProps: js.UndefOr[js.Any] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply[T /* <: HTMLElement */](
    AllHTMLAttributes: AllHTMLAttributes[T] = null,
    ClassAttributes: ClassAttributes[T] = null,
    tag: /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.Any = null,
    text: String = null,
    value: js.Any = null
  ): MenuItemProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (text != null) __obj.updateDynamic("text")(text)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MenuItemProps[T]]
  }
}

