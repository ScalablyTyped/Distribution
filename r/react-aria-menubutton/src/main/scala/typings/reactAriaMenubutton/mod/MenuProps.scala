package typings.reactAriaMenubutton.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.global.JSX.Element
import typings.reactAriaMenubutton.anon.IsOpen
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuProps[T /* <: HTMLElement */]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  
  @JSName("children")
  var children_MenuProps: Element | (js.Function1[/* hasIsOpen */ IsOpen, Element]) = js.native
  
  /**
    * The HTML tag for this element. Default: 'div'.
    */
  var tag: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.native
}
object MenuProps {
  
  @scala.inline
  def apply[T /* <: HTMLElement */](children: Element | (js.Function1[/* hasIsOpen */ IsOpen, Element])): MenuProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps[T]]
  }
  
  @scala.inline
  implicit class MenuPropsOps[Self <: MenuProps[_], T /* <: HTMLElement */] (val x: Self with MenuProps[T]) extends AnyVal {
    
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
    def setChildrenFunction1(value: /* hasIsOpen */ IsOpen => Element): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: Element | (js.Function1[/* hasIsOpen */ IsOpen, Element])): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
