package typings.reactPointable.anon

import typings.reactPointable.reactPointableStrings.auto
import typings.reactPointable.reactPointableStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagName extends js.Object {
  
  var tagName: div = js.native
  
  var touchAction: auto = js.native
}
object TagName {
  
  @scala.inline
  def apply(tagName: div, touchAction: auto): TagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any], touchAction = touchAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagName]
  }
  
  @scala.inline
  implicit class TagNameOps[Self <: TagName] (val x: Self) extends AnyVal {
    
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
    def setTagName(value: div): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchAction(value: auto): Self = this.set("touchAction", value.asInstanceOf[js.Any])
  }
}
