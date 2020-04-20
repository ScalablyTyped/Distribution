package typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default '.embed'
    */
  var embed: String
  /**
    * @default '.placeholder'
    */
  var placeholder: String
  /**
    * @default '.play'
    */
  var play: String
}

object Impl {
  @scala.inline
  def apply(embed: String, placeholder: String, play: String): Impl = {
    val __obj = js.Dynamic.literal(embed = embed.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

