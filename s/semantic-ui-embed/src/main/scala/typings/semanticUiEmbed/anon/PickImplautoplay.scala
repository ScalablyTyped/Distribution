package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.semanticUiEmbedStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'autoplay'> */
@js.native
trait PickImplautoplay extends js.Object {
  
  var autoplay: auto | Boolean = js.native
}
object PickImplautoplay {
  
  @scala.inline
  def apply(autoplay: auto | Boolean): PickImplautoplay = {
    val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplautoplay]
  }
  
  @scala.inline
  implicit class PickImplautoplayOps[Self <: PickImplautoplay] (val x: Self) extends AnyVal {
    
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
    def setAutoplay(value: auto | Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
  }
}
