package typings.reactColor.swatchesMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwatchesPickerStylesProps extends js.Object {
  var body: CSSProperties
  var clear: CSSProperties
  var overflow: CSSProperties
  var picker: CSSProperties
}

object SwatchesPickerStylesProps {
  @scala.inline
  def apply(body: CSSProperties, clear: CSSProperties, overflow: CSSProperties, picker: CSSProperties): SwatchesPickerStylesProps = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwatchesPickerStylesProps]
  }
}

