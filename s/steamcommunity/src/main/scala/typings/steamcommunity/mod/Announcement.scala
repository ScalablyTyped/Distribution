package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Announcement extends StObject {
  
  /** The ID of the announcement. */
  var aid: String
  
  /** The Steam profile name of the author. */
  var author: String
  
  /** The content of the announcement. */
  var content: String
  
  /** A Date object for when this was posted. */
  var date: js.Date
  
  /** The announcement's title. */
  var headline: String
}
object Announcement {
  
  inline def apply(aid: String, author: String, content: String, date: js.Date, headline: String): Announcement = {
    val __obj = js.Dynamic.literal(aid = aid.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], headline = headline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Announcement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Announcement] (val x: Self) extends AnyVal {
    
    inline def setAid(value: String): Self = StObject.set(x, "aid", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
  }
}
