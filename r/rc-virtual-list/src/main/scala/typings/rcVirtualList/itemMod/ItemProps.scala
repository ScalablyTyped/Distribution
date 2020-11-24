package typings.rcVirtualList.itemMod

import typings.react.mod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemProps extends js.Object {
  
  var children: ReactElement = js.native
  
  def setRef(element: HTMLElement): Unit = js.native
}
object ItemProps {
  
  @scala.inline
  def apply(children: ReactElement, setRef: HTMLElement => Unit): ItemProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], setRef = js.Any.fromFunction1(setRef))
    __obj.asInstanceOf[ItemProps]
  }
  
  @scala.inline
  implicit class ItemPropsOps[Self <: ItemProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRef(value: HTMLElement => Unit): Self = this.set("setRef", js.Any.fromFunction1(value))
  }
}
