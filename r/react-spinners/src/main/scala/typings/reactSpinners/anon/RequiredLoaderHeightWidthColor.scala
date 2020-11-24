package typings.reactSpinners.anon

import typings.reactSpinners.interfacesMod.LengthType
import typings.reactSpinners.interfacesMod.PrecompiledCss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<react-spinners.react-spinners/interfaces.LoaderHeightWidthRadiusProps> */
@js.native
trait RequiredLoaderHeightWidthColor extends js.Object {
  
  var color: String = js.native
  
  var css: String | PrecompiledCss = js.native
  
  var height: LengthType = js.native
  
  var loading: Boolean = js.native
  
  var margin: LengthType = js.native
  
  var radius: LengthType = js.native
  
  var width: LengthType = js.native
}
object RequiredLoaderHeightWidthColor {
  
  @scala.inline
  def apply(
    color: String,
    css: String | PrecompiledCss,
    height: LengthType,
    loading: Boolean,
    margin: LengthType,
    radius: LengthType,
    width: LengthType
  ): RequiredLoaderHeightWidthColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredLoaderHeightWidthColor]
  }
  
  @scala.inline
  implicit class RequiredLoaderHeightWidthColorOps[Self <: RequiredLoaderHeightWidthColor] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCss(value: String | PrecompiledCss): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: LengthType): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: LengthType): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: LengthType): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: LengthType): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
