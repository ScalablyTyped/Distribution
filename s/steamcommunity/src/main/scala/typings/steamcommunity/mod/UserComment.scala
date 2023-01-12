package typings.steamcommunity.mod

import typings.steamcommunity.anon.Avatar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserComment extends StObject {
  
  var author: Avatar
  
  /** A Date object. */
  var date: js.Date
  
  /** The rendered HTML of the comment. */
  var html: Any
  
  /** The ID of the comment. */
  var id: Any
  
  /** The text of the comment. May contain special characters like newlines or tabs. */
  var text: Any
}
object UserComment {
  
  inline def apply(author: Avatar, date: js.Date, html: Any, id: Any, text: Any): UserComment = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserComment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserComment] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: Avatar): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: Any): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
