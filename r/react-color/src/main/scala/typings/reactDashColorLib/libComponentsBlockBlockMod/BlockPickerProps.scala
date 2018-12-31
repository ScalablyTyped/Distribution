package typings
package reactDashColorLib.libComponentsBlockBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockPickerProps
  extends reactDashColorLib.reactDashColorMod.ColorPickerProps[BlockPicker] {
  var colors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var onSwatchHover: js.UndefOr[
    js.Function2[
      /* color */ reactDashColorLib.reactDashColorMod.Color, 
      /* event */ reactLib.MouseEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var triangle: js.UndefOr[
    reactDashColorLib.reactDashColorLibStrings.hide | reactDashColorLib.reactDashColorLibStrings.top
  ] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

