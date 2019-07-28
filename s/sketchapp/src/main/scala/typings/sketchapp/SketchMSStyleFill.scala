package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleFill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleFill extends js.Object {
  var _class: styleFill
  var color: SketchMSColor
  var contextSettings: SketchMSGraphicsContextSettings
  var do_objectID: js.UndefOr[String] = js.undefined
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
    patternTileScale: Double,
    do_objectID: String = null
  ): SketchMSStyleFill = {
    val __obj = js.Dynamic.literal(_class = _class, color = color, contextSettings = contextSettings, fillType = fillType, gradient = gradient, isEnabled = isEnabled, noiseIndex = noiseIndex, noiseIntensity = noiseIntensity, patternFillType = patternFillType, patternTileScale = patternTileScale)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyleFill]
  }
}

