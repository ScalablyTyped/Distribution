package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupComment extends StObject {
  
  /** Either the comment author's 64-bit Steam ID, or their vanity URL. */
  var authorId: String
  
  /** The comment author's persona name. */
  var authorName: String
  
  /** The ID of this comment. */
  var commentId: String
  
  /** A Date object of when this comment was submitted. */
  var date: js.Date
  
  /** The HTML content of this comment. */
  var text: String
}
object GroupComment {
  
  inline def apply(authorId: String, authorName: String, commentId: String, date: js.Date, text: String): GroupComment = {
    val __obj = js.Dynamic.literal(authorId = authorId.asInstanceOf[js.Any], authorName = authorName.asInstanceOf[js.Any], commentId = commentId.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupComment]
  }
  
  extension [Self <: GroupComment](x: Self) {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "authorId", value.asInstanceOf[js.Any])
    
    inline def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    inline def setCommentId(value: String): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
