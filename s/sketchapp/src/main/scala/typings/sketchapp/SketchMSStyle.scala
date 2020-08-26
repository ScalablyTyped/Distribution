package typings.sketchapp

import typings.sketchapp.sketchappStrings.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSStyle extends js.Object {
  var _class: style = js.native
  var blur: js.UndefOr[SketchMSStyleBlur] = js.native
  var borderOptions: js.UndefOr[SketchMSStyleBorderOptions] = js.native
  var borders: js.UndefOr[js.Array[SketchMSStyleBorder]] = js.native
  var colorControls: js.UndefOr[SketchMSStyleColorControls] = js.native
  var contextSettings: js.UndefOr[SketchMSGraphicsContextSettings] = js.native
  var do_objectID: String = js.native
  var endDecorationType: js.UndefOr[Double] = js.native
  var endMarkerType: Double = js.native
  var fills: js.UndefOr[js.Array[SketchMSStyleFill]] = js.native
  var innerShadows: js.UndefOr[js.Array[SketchMSStyleShadow]] = js.native
  var miterLimit: Double = js.native
  var reflection: js.UndefOr[SketchMSStyleReflection] = js.native
  var shadows: js.UndefOr[js.Array[SketchMSStyleShadow]] = js.native
  var startDecorationType: js.UndefOr[Double] = js.native
  var startMarkerType: Double = js.native
  var textStyle: js.UndefOr[SketchMSTextStyle] = js.native
  var windingRule: Double = js.native
}

object SketchMSStyle {
  @scala.inline
  def apply(
    _class: style,
    do_objectID: String,
    endMarkerType: Double,
    miterLimit: Double,
    startMarkerType: Double,
    windingRule: Double
  ): SketchMSStyle = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], endMarkerType = endMarkerType.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], startMarkerType = startMarkerType.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyle]
  }
  @scala.inline
  implicit class SketchMSStyleOps[Self <: SketchMSStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_class(value: style): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setDo_objectID(value: String): Self = this.set("do_objectID", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndMarkerType(value: Double): Self = this.set("endMarkerType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiterLimit(value: Double): Self = this.set("miterLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartMarkerType(value: Double): Self = this.set("startMarkerType", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindingRule(value: Double): Self = this.set("windingRule", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlur(value: SketchMSStyleBlur): Self = this.set("blur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    @scala.inline
    def setBorderOptions(value: SketchMSStyleBorderOptions): Self = this.set("borderOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderOptions: Self = this.set("borderOptions", js.undefined)
    @scala.inline
    def setBordersVarargs(value: SketchMSStyleBorder*): Self = this.set("borders", js.Array(value :_*))
    @scala.inline
    def setBorders(value: js.Array[SketchMSStyleBorder]): Self = this.set("borders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorders: Self = this.set("borders", js.undefined)
    @scala.inline
    def setColorControls(value: SketchMSStyleColorControls): Self = this.set("colorControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorControls: Self = this.set("colorControls", js.undefined)
    @scala.inline
    def setContextSettings(value: SketchMSGraphicsContextSettings): Self = this.set("contextSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextSettings: Self = this.set("contextSettings", js.undefined)
    @scala.inline
    def setEndDecorationType(value: Double): Self = this.set("endDecorationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDecorationType: Self = this.set("endDecorationType", js.undefined)
    @scala.inline
    def setFillsVarargs(value: SketchMSStyleFill*): Self = this.set("fills", js.Array(value :_*))
    @scala.inline
    def setFills(value: js.Array[SketchMSStyleFill]): Self = this.set("fills", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFills: Self = this.set("fills", js.undefined)
    @scala.inline
    def setInnerShadowsVarargs(value: SketchMSStyleShadow*): Self = this.set("innerShadows", js.Array(value :_*))
    @scala.inline
    def setInnerShadows(value: js.Array[SketchMSStyleShadow]): Self = this.set("innerShadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerShadows: Self = this.set("innerShadows", js.undefined)
    @scala.inline
    def setReflection(value: SketchMSStyleReflection): Self = this.set("reflection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReflection: Self = this.set("reflection", js.undefined)
    @scala.inline
    def setShadowsVarargs(value: SketchMSStyleShadow*): Self = this.set("shadows", js.Array(value :_*))
    @scala.inline
    def setShadows(value: js.Array[SketchMSStyleShadow]): Self = this.set("shadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    @scala.inline
    def setStartDecorationType(value: Double): Self = this.set("startDecorationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDecorationType: Self = this.set("startDecorationType", js.undefined)
    @scala.inline
    def setTextStyle(value: SketchMSTextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}

