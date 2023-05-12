package typings.stremioAddonSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subtitle extends StObject {
  
  /**
    * Unique identifier for each subtitle, if you have more than one subtitle with the same language, the id will differentiate them.
    */
  var id: String
  
  /**
    * Language code for the subtitle, if a valid ISO 639-2 code is not sent, the text of this value will be used instead.
    */
  var lang: String
  
  /**
    * Url to the subtitle file.
    */
  var url: String
}
object Subtitle {
  
  inline def apply(id: String, lang: String, url: String): Subtitle = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subtitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subtitle] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
