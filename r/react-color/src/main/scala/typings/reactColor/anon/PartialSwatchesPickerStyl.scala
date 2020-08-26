package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/swatches/Swatches.SwatchesPickerStylesProps> */
@js.native
trait PartialSwatchesPickerStyl extends js.Object {
  var body: js.UndefOr[CSSProperties] = js.native
  var clear: js.UndefOr[CSSProperties] = js.native
  var overflow: js.UndefOr[CSSProperties] = js.native
  var picker: js.UndefOr[CSSProperties] = js.native
}

object PartialSwatchesPickerStyl {
  @scala.inline
  def apply(): PartialSwatchesPickerStyl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSwatchesPickerStyl]
  }
  @scala.inline
  implicit class PartialSwatchesPickerStylOps[Self <: PartialSwatchesPickerStyl] (val x: Self) extends AnyVal {
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
    def setBody(value: CSSProperties): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setClear(value: CSSProperties): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setOverflow(value: CSSProperties): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setPicker(value: CSSProperties): Self = this.set("picker", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePicker: Self = this.set("picker", js.undefined)
  }
  
}

