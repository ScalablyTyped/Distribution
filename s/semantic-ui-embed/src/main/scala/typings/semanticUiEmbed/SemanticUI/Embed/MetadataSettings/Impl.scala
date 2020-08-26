package typings.semanticUiEmbed.SemanticUI.Embed.MetadataSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'icon'
    */
  var icon: String = js.native
  /**
    * @default 'id'
    */
  var id: String = js.native
  /**
    * @default 'placeholder'
    */
  var placeholder: String = js.native
  /**
    * @default 'source'
    */
  var source: String = js.native
  /**
    * @default 'url'
    */
  var url: String = js.native
}

object Impl {
  @scala.inline
  def apply(icon: String, id: String, placeholder: String, source: String, url: String): Impl = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

