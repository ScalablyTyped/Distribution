package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'id'> */
@js.native
trait PickImplid extends js.Object {
  var id: `false` | String = js.native
}

object PickImplid {
  @scala.inline
  def apply(id: `false` | String): PickImplid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplid]
  }
  @scala.inline
  implicit class PickImplidOps[Self <: PickImplid] (val x: Self) extends AnyVal {
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
    def setId(value: `false` | String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

