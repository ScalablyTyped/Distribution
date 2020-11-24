package typings.rcDialog.contentMod

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentRef extends js.Object {
  
  def changeActive(next: Boolean): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getDOM(): HTMLDivElement = js.native
}
object ContentRef {
  
  @scala.inline
  def apply(changeActive: Boolean => Unit, focus: () => Unit, getDOM: () => HTMLDivElement): ContentRef = {
    val __obj = js.Dynamic.literal(changeActive = js.Any.fromFunction1(changeActive), focus = js.Any.fromFunction0(focus), getDOM = js.Any.fromFunction0(getDOM))
    __obj.asInstanceOf[ContentRef]
  }
  
  @scala.inline
  implicit class ContentRefOps[Self <: ContentRef] (val x: Self) extends AnyVal {
    
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
    def setChangeActive(value: Boolean => Unit): Self = this.set("changeActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDOM(value: () => HTMLDivElement): Self = this.set("getDOM", js.Any.fromFunction0(value))
  }
}
