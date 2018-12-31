package typings
package reactDashColorLib.libComponentsSketchSketchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchPickerProps
  extends reactDashColorLib.reactDashColorMod.ColorPickerProps[SketchPicker] {
  var disableAlpha: js.UndefOr[scala.Boolean] = js.undefined
  var onSwatchHover: js.UndefOr[
    js.Function2[
      /* color */ reactDashColorLib.reactDashColorMod.Color, 
      /* event */ reactLib.MouseEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var presetColors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

