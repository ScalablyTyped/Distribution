package typings.sketchapp

import typings.sketchapp.sketchappStrings.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyle extends js.Object {
  var _class: style
  var blur: js.UndefOr[SketchMSStyleBlur] = js.undefined
  var borderOptions: js.UndefOr[SketchMSStyleBorderOptions] = js.undefined
  var borders: js.UndefOr[js.Array[SketchMSStyleBorder]] = js.undefined
  var colorControls: js.UndefOr[SketchMSStyleColorControls] = js.undefined
  var contextSettings: js.UndefOr[SketchMSGraphicsContextSettings] = js.undefined
  var do_objectID: String
  var endDecorationType: js.UndefOr[Double] = js.undefined
  var endMarkerType: Double
  var fills: js.UndefOr[js.Array[SketchMSStyleFill]] = js.undefined
  var innerShadows: js.UndefOr[js.Array[SketchMSStyleShadow]] = js.undefined
  var miterLimit: Double
  var reflection: js.UndefOr[SketchMSStyleReflection] = js.undefined
  var shadows: js.UndefOr[js.Array[SketchMSStyleShadow]] = js.undefined
  var startDecorationType: js.UndefOr[Double] = js.undefined
  var startMarkerType: Double
  var textStyle: js.UndefOr[SketchMSTextStyle] = js.undefined
  var windingRule: Double
}

object SketchMSStyle {
  @scala.inline
  def apply(
    _class: style,
    do_objectID: String,
    endMarkerType: Double,
    miterLimit: Double,
    startMarkerType: Double,
    windingRule: Double,
    blur: SketchMSStyleBlur = null,
    borderOptions: SketchMSStyleBorderOptions = null,
    borders: js.Array[SketchMSStyleBorder] = null,
    colorControls: SketchMSStyleColorControls = null,
    contextSettings: SketchMSGraphicsContextSettings = null,
    endDecorationType: Int | Double = null,
    fills: js.Array[SketchMSStyleFill] = null,
    innerShadows: js.Array[SketchMSStyleShadow] = null,
    reflection: SketchMSStyleReflection = null,
    shadows: js.Array[SketchMSStyleShadow] = null,
    startDecorationType: Int | Double = null,
    textStyle: SketchMSTextStyle = null
  ): SketchMSStyle = {
    val __obj = js.Dynamic.literal(_class = _class, do_objectID = do_objectID, endMarkerType = endMarkerType, miterLimit = miterLimit, startMarkerType = startMarkerType, windingRule = windingRule)
    if (blur != null) __obj.updateDynamic("blur")(blur)
    if (borderOptions != null) __obj.updateDynamic("borderOptions")(borderOptions)
    if (borders != null) __obj.updateDynamic("borders")(borders)
    if (colorControls != null) __obj.updateDynamic("colorControls")(colorControls)
    if (contextSettings != null) __obj.updateDynamic("contextSettings")(contextSettings)
    if (endDecorationType != null) __obj.updateDynamic("endDecorationType")(endDecorationType.asInstanceOf[js.Any])
    if (fills != null) __obj.updateDynamic("fills")(fills)
    if (innerShadows != null) __obj.updateDynamic("innerShadows")(innerShadows)
    if (reflection != null) __obj.updateDynamic("reflection")(reflection)
    if (shadows != null) __obj.updateDynamic("shadows")(shadows)
    if (startDecorationType != null) __obj.updateDynamic("startDecorationType")(startDecorationType.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[SketchMSStyle]
  }
}

