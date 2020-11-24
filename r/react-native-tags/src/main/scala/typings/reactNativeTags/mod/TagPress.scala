package typings.reactNativeTags.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagPress extends js.Object {
  
  var deleted: Boolean = js.native
  
  def event(): Unit = js.native
  
  var index: Double = js.native
  
  var tagLabel: String = js.native
}
object TagPress {
  
  @scala.inline
  def apply(deleted: Boolean, event: () => Unit, index: Double, tagLabel: String): TagPress = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], event = js.Any.fromFunction0(event), index = index.asInstanceOf[js.Any], tagLabel = tagLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagPress]
  }
  
  @scala.inline
  implicit class TagPressOps[Self <: TagPress] (val x: Self) extends AnyVal {
    
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
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: () => Unit): Self = this.set("event", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagLabel(value: String): Self = this.set("tagLabel", value.asInstanceOf[js.Any])
  }
}
