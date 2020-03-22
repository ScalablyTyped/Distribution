package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subtitles resource for the chosen media.
  */
trait Subtitle extends js.Object {
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
}

