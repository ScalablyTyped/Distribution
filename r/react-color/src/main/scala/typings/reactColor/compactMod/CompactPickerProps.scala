package typings.reactColor.compactMod

import typings.reactColor.anon.PartialClassesCompactPick
import typings.reactColor.mod.ColorPickerProps
import typings.reactColor.mod.ColorResult
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompactPickerProps extends ColorPickerProps[CompactPicker] {
  
  var colors: js.UndefOr[js.Array[String]] = js.native
  
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.native
  
  @JSName("styles")
  var styles_CompactPickerProps: js.UndefOr[PartialClassesCompactPick] = js.native
}
object CompactPickerProps {
  
  @scala.inline
  def apply(): CompactPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompactPickerProps]
  }
  
  @scala.inline
  implicit class CompactPickerPropsOps[Self <: CompactPickerProps] (val x: Self) extends AnyVal {
    
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
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Unit): Self = this.set("onSwatchHover", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSwatchHover: Self = this.set("onSwatchHover", js.undefined)
    
    @scala.inline
    def setStyles(value: PartialClassesCompactPick): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
