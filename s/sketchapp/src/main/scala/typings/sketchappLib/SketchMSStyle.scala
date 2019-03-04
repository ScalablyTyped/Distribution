package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyle extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.style
  var blur: SketchMSStyleBlur
  var borderOptions: SketchMSStyleBorderOptions
  var borders: js.Array[SketchMSStyleBorder]
  var colorControls: SketchMSStyleColorControls
  var contextSettings: SketchMSGraphicsContextSettings
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var endDecorationType: scala.Double
  var fills: js.Array[SketchMSStyleFill]
  var innerShadows: js.Array[SketchMSStyleShadow]
  var miterLimit: scala.Double
  var reflection: SketchMSStyleReflection
  var shadows: js.Array[SketchMSStyleShadow]
  var startDecorationType: scala.Double
  var textStyle: SketchMSTextStyle
}

object SketchMSStyle {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.style,
    blur: SketchMSStyleBlur,
    borderOptions: SketchMSStyleBorderOptions,
    borders: js.Array[SketchMSStyleBorder],
    colorControls: SketchMSStyleColorControls,
    contextSettings: SketchMSGraphicsContextSettings,
    endDecorationType: scala.Double,
    fills: js.Array[SketchMSStyleFill],
    innerShadows: js.Array[SketchMSStyleShadow],
    miterLimit: scala.Double,
    reflection: SketchMSStyleReflection,
    shadows: js.Array[SketchMSStyleShadow],
    startDecorationType: scala.Double,
    textStyle: SketchMSTextStyle,
    do_objectID: java.lang.String = null
  ): SketchMSStyle = {
    val __obj = js.Dynamic.literal(_class = _class, blur = blur, borderOptions = borderOptions, borders = borders, colorControls = colorControls, contextSettings = contextSettings, endDecorationType = endDecorationType, fills = fills, innerShadows = innerShadows, miterLimit = miterLimit, reflection = reflection, shadows = shadows, startDecorationType = startDecorationType, textStyle = textStyle)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyle]
  }
}

