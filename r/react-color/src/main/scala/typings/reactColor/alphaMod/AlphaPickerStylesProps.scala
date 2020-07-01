package typings.reactColor.alphaMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlphaPickerStylesProps extends js.Object {
  var alpha: CSSProperties
  var picker: CSSProperties
}

object AlphaPickerStylesProps {
  @scala.inline
  def apply(alpha: CSSProperties, picker: CSSProperties): AlphaPickerStylesProps = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaPickerStylesProps]
  }
}

