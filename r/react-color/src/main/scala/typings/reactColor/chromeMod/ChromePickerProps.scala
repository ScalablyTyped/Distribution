package typings.reactColor.chromeMod

import typings.reactColor.anon.PartialClassesChromePicke
import typings.reactColor.mod.ColorPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromePickerProps extends ColorPickerProps[ChromePicker] {
  var disableAlpha: js.UndefOr[Boolean] = js.native
  @JSName("styles")
  var styles_ChromePickerProps: js.UndefOr[PartialClassesChromePicke] = js.native
}

object ChromePickerProps {
  @scala.inline
  def apply(): ChromePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromePickerProps]
  }
  @scala.inline
  implicit class ChromePickerPropsOps[Self <: ChromePickerProps] (val x: Self) extends AnyVal {
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
    def setDisableAlpha(value: Boolean): Self = this.set("disableAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAlpha: Self = this.set("disableAlpha", js.undefined)
    @scala.inline
    def setStyles(value: PartialClassesChromePicke): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

