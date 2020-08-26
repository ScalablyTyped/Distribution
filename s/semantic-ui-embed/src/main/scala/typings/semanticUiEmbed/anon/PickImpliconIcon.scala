package typings.semanticUiEmbed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.MetadataSettings._Impl, 'icon'> */
@js.native
trait PickImpliconIcon extends js.Object {
  var icon: String = js.native
}

object PickImpliconIcon {
  @scala.inline
  def apply(icon: String): PickImpliconIcon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpliconIcon]
  }
  @scala.inline
  implicit class PickImpliconIconOps[Self <: PickImpliconIcon] (val x: Self) extends AnyVal {
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
  }
  
}

