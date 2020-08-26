package typings.reactColor.swatchesMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwatchesPickerStylesProps extends js.Object {
  var body: CSSProperties = js.native
  var clear: CSSProperties = js.native
  var overflow: CSSProperties = js.native
  var picker: CSSProperties = js.native
}

object SwatchesPickerStylesProps {
  @scala.inline
  def apply(body: CSSProperties, clear: CSSProperties, overflow: CSSProperties, picker: CSSProperties): SwatchesPickerStylesProps = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwatchesPickerStylesProps]
  }
  @scala.inline
  implicit class SwatchesPickerStylesPropsOps[Self <: SwatchesPickerStylesProps] (val x: Self) extends AnyVal {
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
    def setClear(value: CSSProperties): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverflow(value: CSSProperties): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPicker(value: CSSProperties): Self = this.set("picker", value.asInstanceOf[js.Any])
  }
  
}

