package typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default '.embed'
    */
  var embed: String = js.native
  /**
    * @default '.placeholder'
    */
  var placeholder: String = js.native
  /**
    * @default '.play'
    */
  var play: String = js.native
}

object Impl {
  @scala.inline
  def apply(embed: String, placeholder: String, play: String): Impl = {
    val __obj = js.Dynamic.literal(embed = embed.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmbed(value: String): Self = this.set("embed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlay(value: String): Self = this.set("play", value.asInstanceOf[js.Any])
  }
  
}

