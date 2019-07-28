package typings.sketchapp

import typings.sketchapp.sketchappStrings.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyle extends js.Object {
  var _class: style
  var blur: SketchMSStyleBlur
  var borderOptions: SketchMSStyleBorderOptions
  var borders: js.Array[SketchMSStyleBorder]
  var colorControls: SketchMSStyleColorControls
  var contextSettings: SketchMSGraphicsContextSettings
  var do_objectID: js.UndefOr[String] = js.undefined
  var endDecorationType: Double
  var fills: js.Array[SketchMSStyleFill]
  var innerShadows: js.Array[SketchMSStyleShadow]
  var miterLimit: Double
  var reflection: SketchMSStyleReflection
  var shadows: js.Array[SketchMSStyleShadow]
  var startDecorationType: Double
  var textStyle: SketchMSTextStyle
}

object SketchMSStyle {
  @scala.inline
  def apply(
    _class: style,
    blur: SketchMSStyleBlur,
    borderOptions: SketchMSStyleBorderOptions,
    borders: js.Array[SketchMSStyleBorder],
    colorControls: SketchMSStyleColorControls,
    contextSettings: SketchMSGraphicsContextSettings,
    endDecorationType: Double,
    fills: js.Array[SketchMSStyleFill],
    innerShadows: js.Array[SketchMSStyleShadow],
    miterLimit: Double,
    reflection: SketchMSStyleReflection,
    shadows: js.Array[SketchMSStyleShadow],
    startDecorationType: Double,
    textStyle: SketchMSTextStyle,
    do_objectID: String = null
  ): SketchMSStyle = {
    val __obj = js.Dynamic.literal(_class = _class, blur = blur, borderOptions = borderOptions, borders = borders, colorControls = colorControls, contextSettings = contextSettings, endDecorationType = endDecorationType, fills = fills, innerShadows = innerShadows, miterLimit = miterLimit, reflection = reflection, shadows = shadows, startDecorationType = startDecorationType, textStyle = textStyle)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyle]
  }
}

