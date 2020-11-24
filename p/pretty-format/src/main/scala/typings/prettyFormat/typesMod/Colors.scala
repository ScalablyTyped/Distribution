package typings.prettyFormat.typesMod

import typings.prettyFormat.anon.Close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Colors extends js.Object {
  
  var comment: Close = js.native
  
  var content: Close = js.native
  
  var prop: Close = js.native
  
  var tag: Close = js.native
  
  var value: Close = js.native
}
object Colors {
  
  @scala.inline
  def apply(comment: Close, content: Close, prop: Close, tag: Close, value: Close): Colors = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  
  @scala.inline
  implicit class ColorsOps[Self <: Colors] (val x: Self) extends AnyVal {
    
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
    def setComment(value: Close): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Close): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProp(value: Close): Self = this.set("prop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Close): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Close): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
