package typings.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportInfo extends js.Object {
  var languages: js.Array[SupportLanguage]
  var options: js.Array[SupportOption]
}

object SupportInfo {
  @scala.inline
  def apply(languages: js.Array[SupportLanguage], options: js.Array[SupportOption]): SupportInfo = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SupportInfo]
  }
}

