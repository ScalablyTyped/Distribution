package typings.semanticUiEmbed.SemanticUI.Embed.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'The method you called is not defined'
    */
  var method: String
  /**
    * @default 'No URL specified'
    */
  var noURL: String
}

object Impl {
  @scala.inline
  def apply(method: String, noURL: String): Impl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noURL = noURL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

