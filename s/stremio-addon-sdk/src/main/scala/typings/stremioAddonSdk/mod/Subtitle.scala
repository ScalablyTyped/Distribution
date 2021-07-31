package typings.stremioAddonSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Subtitles resource for the chosen media.
  */
trait Subtitle extends StObject {
  
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
  
  @scala.inline
  def apply(lang: String, url: String): Subtitle = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subtitle]
  }
  
  @scala.inline
  implicit class SubtitleMutableBuilder[Self <: Subtitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
