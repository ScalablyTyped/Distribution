package typings.semanticDashUiDashEmbed.SemanticUI.Embed.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
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

object _Impl {
  @scala.inline
  def apply(embed: String, placeholder: String, play: String): _Impl = {
    val __obj = js.Dynamic.literal(embed = embed.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

