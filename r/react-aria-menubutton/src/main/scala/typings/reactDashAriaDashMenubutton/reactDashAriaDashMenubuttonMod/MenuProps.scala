package typings.reactDashAriaDashMenubutton.reactDashAriaDashMenubuttonMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashAriaDashMenubutton.Anon_IsOpen
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps[T /* <: HTMLElement */]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  @JSName("children")
  var children_MenuProps: Element | (js.Function1[/* hasIsOpen */ Anon_IsOpen, Element])
  /**
  	 * The HTML tag for this element. Default: 'span'.
  	 */
  var tag: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply[T /* <: HTMLElement */](
    children: Element | (js.Function1[/* hasIsOpen */ Anon_IsOpen, Element]),
    AllHTMLAttributes: AllHTMLAttributes[T] = null,
    ClassAttributes: ClassAttributes[T] = null,
    tag: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any = null
  ): MenuProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps[T]]
  }
}

