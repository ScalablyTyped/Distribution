package typings.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: String
  /**
    * @default 'embed'
    */
  var embed: String
}

object Impl {
  @scala.inline
  def apply(active: String, embed: String): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

