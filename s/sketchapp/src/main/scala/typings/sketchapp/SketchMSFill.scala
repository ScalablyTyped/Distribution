package typings.sketchapp

import typings.sketchapp.sketchappStrings.fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSFill extends js.Object {
  var _class: fill
  var color: js.UndefOr[SketchMSColor] = js.undefined
  var fillType: SketchMSFillTypeEnum
  var image: js.UndefOr[SketchMSImageDataReference] = js.undefined
  var isEnabled: Boolean
  var noiseIndex: Double
  var noiseIntensity: Double
  var patternFillType: SketchMSPatternFillTypeEnum
  var patternTileScale: Double
}

object SketchMSFill {
  @scala.inline
  def apply(
    _class: fill,
    fillType: SketchMSFillTypeEnum,
    isEnabled: Boolean,
    noiseIndex: Double,
    noiseIntensity: Double,
    patternFillType: SketchMSPatternFillTypeEnum,
    patternTileScale: Double,
    color: SketchMSColor = null,
    image: SketchMSImageDataReference = null
  ): SketchMSFill = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], noiseIndex = noiseIndex.asInstanceOf[js.Any], noiseIntensity = noiseIntensity.asInstanceOf[js.Any], patternFillType = patternFillType.asInstanceOf[js.Any], patternTileScale = patternTileScale.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSFill]
  }
}

