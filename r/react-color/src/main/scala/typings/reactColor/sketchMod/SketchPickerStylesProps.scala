package typings.reactColor.sketchMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchPickerStylesProps extends js.Object {
  var Alpha: CSSProperties
  var Hue: CSSProperties
  var Saturation: CSSProperties
  var activeColor: CSSProperties
  var alpha: CSSProperties
  var color: CSSProperties
  var controls: CSSProperties
  var hue: CSSProperties
  var picker: CSSProperties
  var saturation: CSSProperties
  var sliders: CSSProperties
}

object SketchPickerStylesProps {
  @scala.inline
  def apply(
    Alpha: CSSProperties,
    Hue: CSSProperties,
    Saturation: CSSProperties,
    activeColor: CSSProperties,
    alpha: CSSProperties,
    color: CSSProperties,
    controls: CSSProperties,
    hue: CSSProperties,
    picker: CSSProperties,
    saturation: CSSProperties,
    sliders: CSSProperties
  ): SketchPickerStylesProps = {
    val __obj = js.Dynamic.literal(Alpha = Alpha.asInstanceOf[js.Any], Hue = Hue.asInstanceOf[js.Any], Saturation = Saturation.asInstanceOf[js.Any], activeColor = activeColor.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], sliders = sliders.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchPickerStylesProps]
  }
}

