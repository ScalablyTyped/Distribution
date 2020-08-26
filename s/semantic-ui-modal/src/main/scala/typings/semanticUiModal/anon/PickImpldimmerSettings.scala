package typings.semanticUiModal.anon

import typings.semanticUiDimmer.SemanticUI.DimmerSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'dimmerSettings'> */
@js.native
trait PickImpldimmerSettings extends js.Object {
  var dimmerSettings: DimmerSettings = js.native
}

object PickImpldimmerSettings {
  @scala.inline
  def apply(dimmerSettings: DimmerSettings): PickImpldimmerSettings = {
    val __obj = js.Dynamic.literal(dimmerSettings = dimmerSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmerSettings]
  }
  @scala.inline
  implicit class PickImpldimmerSettingsOps[Self <: PickImpldimmerSettings] (val x: Self) extends AnyVal {
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
    def setDimmerSettings(value: DimmerSettings): Self = this.set("dimmerSettings", value.asInstanceOf[js.Any])
  }
  
}

