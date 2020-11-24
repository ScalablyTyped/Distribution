package typings.sololearn.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Answer extends js.Object {
  
  /** The author's SoloLearn ID */
  var author: Double = js.native
  
  /** The content of the answer */
  var content: String = js.native
  
  /** The date the answer was written */
  var date: Date = js.native
  
  /** The amount of upvotes the answer has */
  var upvotes: Double = js.native
}
object Answer {
  
  @scala.inline
  def apply(author: Double, content: String, date: Date, upvotes: Double): Answer = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], upvotes = upvotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Answer]
  }
  
  @scala.inline
  implicit class AnswerOps[Self <: Answer] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: Double): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpvotes(value: Double): Self = this.set("upvotes", value.asInstanceOf[js.Any])
  }
}
