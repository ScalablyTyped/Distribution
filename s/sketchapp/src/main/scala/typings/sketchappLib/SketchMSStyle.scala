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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("blur")(blur)
    __obj.updateDynamic("borderOptions")(borderOptions)
    __obj.updateDynamic("borders")(borders)
    __obj.updateDynamic("colorControls")(colorControls)
    __obj.updateDynamic("contextSettings")(contextSettings)
    __obj.updateDynamic("endDecorationType")(endDecorationType)
    __obj.updateDynamic("fills")(fills)
    __obj.updateDynamic("innerShadows")(innerShadows)
    __obj.updateDynamic("miterLimit")(miterLimit)
    __obj.updateDynamic("reflection")(reflection)
    __obj.updateDynamic("shadows")(shadows)
    __obj.updateDynamic("startDecorationType")(startDecorationType)
    __obj.updateDynamic("textStyle")(textStyle)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSStyle]
  }
}

