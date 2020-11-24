package typings.reactColor.sketchMod

import typings.reactColor.anon.PartialClassesSketchPicke
import typings.reactColor.mod.ColorPickerProps
import typings.reactColor.mod.ColorResult
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchPickerProps extends ColorPickerProps[SketchPicker] {
  
  var disableAlpha: js.UndefOr[Boolean] = js.native
  
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.native
  
  var presetColors: js.UndefOr[js.Array[PresetColor]] = js.native
  
  @JSName("styles")
  var styles_SketchPickerProps: js.UndefOr[PartialClassesSketchPicke] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object SketchPickerProps {
  
  @scala.inline
  def apply(): SketchPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchPickerProps]
  }
  
  @scala.inline
  implicit class SketchPickerPropsOps[Self <: SketchPickerProps] (val x: Self) extends AnyVal {
    
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
    def setDisableAlpha(value: Boolean): Self = this.set("disableAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAlpha: Self = this.set("disableAlpha", js.undefined)
    
    @scala.inline
    def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Unit): Self = this.set("onSwatchHover", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSwatchHover: Self = this.set("onSwatchHover", js.undefined)
    
    @scala.inline
    def setPresetColorsVarargs(value: PresetColor*): Self = this.set("presetColors", js.Array(value :_*))
    
    @scala.inline
    def setPresetColors(value: js.Array[PresetColor]): Self = this.set("presetColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresetColors: Self = this.set("presetColors", js.undefined)
    
    @scala.inline
    def setStyles(value: PartialClassesSketchPicke): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
