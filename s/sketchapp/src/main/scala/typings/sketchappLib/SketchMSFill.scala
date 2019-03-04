package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSFill extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.fill
  var color: js.UndefOr[SketchMSColor] = js.undefined
  var fillType: SketchMSFillTypeEnum
  var image: js.UndefOr[SketchMSImageDataReference] = js.undefined
  var isEnabled: scala.Boolean
  var noiseIndex: scala.Double
  var noiseIntensity: scala.Double
  var patternFillType: SketchMSPatternFillTypeEnum
  var patternTileScale: scala.Double
}

object SketchMSFill {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.fill,
    fillType: SketchMSFillTypeEnum,
    isEnabled: scala.Boolean,
    noiseIndex: scala.Double,
    noiseIntensity: scala.Double,
    patternFillType: SketchMSPatternFillTypeEnum,
    patternTileScale: scala.Double,
    color: SketchMSColor = null,
    image: SketchMSImageDataReference = null
  ): SketchMSFill = {
    val __obj = js.Dynamic.literal(_class = _class, fillType = fillType, isEnabled = isEnabled, noiseIndex = noiseIndex, noiseIntensity = noiseIntensity, patternFillType = patternFillType, patternTileScale = patternTileScale)
    if (color != null) __obj.updateDynamic("color")(color)
    if (image != null) __obj.updateDynamic("image")(image)
    __obj.asInstanceOf[SketchMSFill]
  }
}

