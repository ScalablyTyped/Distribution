package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment
  extends StObject
     with Node {
  
  var author: CommentAuthor
  
  var content: String
  
  var contentHtml: String
}
object Comment {
  
  inline def apply(author: CommentAuthor, content: String, contentHtml: String, id: ID): Comment = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentHtml = contentHtml.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: CommentAuthor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentHtml(value: String): Self = StObject.set(x, "contentHtml", value.asInstanceOf[js.Any])
  }
}
