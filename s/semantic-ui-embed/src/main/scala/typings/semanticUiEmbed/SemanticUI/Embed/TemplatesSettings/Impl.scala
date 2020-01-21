package typings.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * returns html for iframe
    */
  def iframe(url: String, parameters: String): String
  /**
    * returns html for placeholder element
    */
  def placeholder(image: String, icon: String): String
}

object Impl {
  @scala.inline
  def apply(iframe: (String, String) => String, placeholder: (String, String) => String): Impl = {
    val __obj = js.Dynamic.literal(iframe = js.Any.fromFunction2(iframe), placeholder = js.Any.fromFunction2(placeholder))
  
    __obj.asInstanceOf[Impl]
  }
}

