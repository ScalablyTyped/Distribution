package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleFill extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.styleFill
  var color: SketchMSColor
  var contextSettings: SketchMSGraphicsContextSettings
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var fillType: scala.Double
  var gradient: SketchMSGradient
  var isEnabled: scala.Double
  var noiseIndex: scala.Double
  var noiseIntensity: scala.Double
  var patternFillType: scala.Double
  var patternTileScale: scala.Double
}

object SketchMSStyleFill {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.styleFill,
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    fillType: scala.Double,
    gradient: SketchMSGradient,
    isEnabled: scala.Double,
    noiseIndex: scala.Double,
    noiseIntensity: scala.Double,
    patternFillType: scala.Double,
    patternTileScale: scala.Double,
    do_objectID: java.lang.String = null
  ): SketchMSStyleFill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("contextSettings")(contextSettings)
    __obj.updateDynamic("fillType")(fillType)
    __obj.updateDynamic("gradient")(gradient)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("noiseIndex")(noiseIndex)
    __obj.updateDynamic("noiseIntensity")(noiseIntensity)
    __obj.updateDynamic("patternFillType")(patternFillType)
    __obj.updateDynamic("patternTileScale")(patternTileScale)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyleFill]
  }
}

