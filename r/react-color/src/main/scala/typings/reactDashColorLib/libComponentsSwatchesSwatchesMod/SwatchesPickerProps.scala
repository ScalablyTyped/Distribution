package typings
package reactDashColorLib.libComponentsSwatchesSwatchesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SwatchesPickerProps
  extends reactDashColorLib.reactDashColorMod.ColorPickerProps[SwatchesPicker] {
  var colors: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var onSwatchHover: js.UndefOr[
    js.Function2[
      /* color */ reactDashColorLib.reactDashColorMod.Color, 
      /* event */ reactLib.MouseEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

