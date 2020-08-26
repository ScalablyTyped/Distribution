package typings.reactAriaMenubutton.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemProps[T /* <: HTMLElement */]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  /**
    * The HTML tag for this element. Default: 'span'.
    */
  var tag: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.native
  /**
    * If `text` has a value, its first letter will be the letter a user can
    * type to navigate to that item.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * If value has a value, it will be passed to the onSelection handler
    * when the `MenuItem` is selected
    */
  @JSName("value")
  var value_MenuItemProps: js.UndefOr[js.Any] = js.native
}

object MenuItemProps {
  @scala.inline
  def apply[/* <: typings.std.HTMLElement */ T](): MenuItemProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemProps[T]]
  }
  @scala.inline
  implicit class MenuItemPropsOps[Self <: MenuItemProps[_], /* <: typings.std.HTMLElement */ T] (val x: Self with MenuItemProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTag(value: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

