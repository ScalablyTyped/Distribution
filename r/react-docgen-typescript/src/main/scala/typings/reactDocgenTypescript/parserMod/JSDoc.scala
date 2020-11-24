package typings.reactDocgenTypescript.parserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSDoc extends js.Object {
  
  var description: String = js.native
  
  var fullComment: String = js.native
  
  var tags: StringIndexedObject[String] = js.native
}
object JSDoc {
  
  @scala.inline
  def apply(description: String, fullComment: String, tags: StringIndexedObject[String]): JSDoc = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fullComment = fullComment.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSDoc]
  }
  
  @scala.inline
  implicit class JSDocOps[Self <: JSDoc] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullComment(value: String): Self = this.set("fullComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringIndexedObject[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
