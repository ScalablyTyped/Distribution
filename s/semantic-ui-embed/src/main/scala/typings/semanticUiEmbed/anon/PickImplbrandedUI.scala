package typings.semanticUiEmbed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'brandedUI'> */
@js.native
trait PickImplbrandedUI extends js.Object {
  var brandedUI: Boolean = js.native
}

object PickImplbrandedUI {
  @scala.inline
  def apply(brandedUI: Boolean): PickImplbrandedUI = {
    val __obj = js.Dynamic.literal(brandedUI = brandedUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbrandedUI]
  }
  @scala.inline
  implicit class PickImplbrandedUIOps[Self <: PickImplbrandedUI] (val x: Self) extends AnyVal {
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
    def setBrandedUI(value: Boolean): Self = this.set("brandedUI", value.asInstanceOf[js.Any])
  }
  
}

