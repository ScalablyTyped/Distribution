package typings.storybookAddonKnobs.knobManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnobManagerOptions extends js.Object {
  var disableDebounce: js.UndefOr[Boolean] = js.native
  var escapeHTML: js.UndefOr[Boolean] = js.native
}

object KnobManagerOptions {
  @scala.inline
  def apply(): KnobManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnobManagerOptions]
  }
  @scala.inline
  implicit class KnobManagerOptionsOps[Self <: KnobManagerOptions] (val x: Self) extends AnyVal {
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
    def setDisableDebounce(value: Boolean): Self = this.set("disableDebounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDebounce: Self = this.set("disableDebounce", js.undefined)
    @scala.inline
    def setEscapeHTML(value: Boolean): Self = this.set("escapeHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscapeHTML: Self = this.set("escapeHTML", js.undefined)
  }
  
}

