package typings.semanticDashUiDashEmbed.SemanticUI.Embed.TemplatesSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * returns html for iframe
    */
  def iframe(url: String, parameters: String): String
  /**
    * returns html for placeholder element
    */
  def placeholder(image: String, icon: String): String
}

object _Impl {
  @scala.inline
  def apply(iframe: (String, String) => String, placeholder: (String, String) => String): _Impl = {
    val __obj = js.Dynamic.literal(iframe = js.Any.fromFunction2(iframe), placeholder = js.Any.fromFunction2(placeholder))
  
    __obj.asInstanceOf[_Impl]
  }
}

