package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'icon'> */
@js.native
trait PickImplicon extends js.Object {
  var icon: `false` | String = js.native
}

object PickImplicon {
  @scala.inline
  def apply(icon: `false` | String): PickImplicon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplicon]
  }
  @scala.inline
  implicit class PickImpliconOps[Self <: PickImplicon] (val x: Self) extends AnyVal {
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
    def setIcon(value: `false` | String): Self = this.set("icon", value.asInstanceOf[js.Any])
  }
  
}

