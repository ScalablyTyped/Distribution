package typings.smoothScrollbar.scrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollbarSize extends js.Object {
  
  var container: Metrics = js.native
  
  var content: Metrics = js.native
}
object ScrollbarSize {
  
  @scala.inline
  def apply(container: Metrics, content: Metrics): ScrollbarSize = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarSize]
  }
  
  @scala.inline
  implicit class ScrollbarSizeOps[Self <: ScrollbarSize] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: Metrics): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Metrics): Self = this.set("content", value.asInstanceOf[js.Any])
  }
}
