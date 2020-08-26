package typings.semanticUiPopup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.MetadataSettings._Impl, 'variation'> */
@js.native
trait PickImplvariation extends js.Object {
  var variation: String = js.native
}

object PickImplvariation {
  @scala.inline
  def apply(variation: String): PickImplvariation = {
    val __obj = js.Dynamic.literal(variation = variation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvariation]
  }
  @scala.inline
  implicit class PickImplvariationOps[Self <: PickImplvariation] (val x: Self) extends AnyVal {
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
    def setVariation(value: String): Self = this.set("variation", value.asInstanceOf[js.Any])
  }
  
}

