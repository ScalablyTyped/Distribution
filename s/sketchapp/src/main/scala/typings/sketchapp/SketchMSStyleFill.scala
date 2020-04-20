package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleFill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleFill extends js.Object {
  var _class: styleFill
  var color: SketchMSColor
  var contextSettings: SketchMSGraphicsContextSettings
  var fillType: Double
  var gradient: SketchMSGradient
  var isEnabled: Double
  var noiseIndex: Double
  var noiseIntensity: Double
  var patternFillType: Double
  var patternTileScale: Double
}

object SketchMSStyleFill {
  @scala.inline
  def apply(
    _class: styleFill,
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    fillType: Double,
    gradient: SketchMSGradient,
    isEnabled: Double,
    noiseIndex: Double,
    noiseIntensity: Double,
    patternFillType: Double,
    patternTileScale: Double
  ): SketchMSStyleFill = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], noiseIndex = noiseIndex.asInstanceOf[js.Any], noiseIntensity = noiseIntensity.asInstanceOf[js.Any], patternFillType = patternFillType.asInstanceOf[js.Any], patternTileScale = patternTileScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleFill]
  }
}

