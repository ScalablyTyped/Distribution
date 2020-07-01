package typings.reactColor.hueHueMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HuePickerStylesProps extends js.Object {
  var hue: CSSProperties
  var picker: CSSProperties
}

object HuePickerStylesProps {
  @scala.inline
  def apply(hue: CSSProperties, picker: CSSProperties): HuePickerStylesProps = {
    val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[HuePickerStylesProps]
  }
}

