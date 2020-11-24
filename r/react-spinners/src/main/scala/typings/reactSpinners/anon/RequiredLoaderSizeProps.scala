package typings.reactSpinners.anon

import typings.reactSpinners.interfacesMod.LengthType
import typings.reactSpinners.interfacesMod.PrecompiledCss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<react-spinners.react-spinners/interfaces.LoaderSizeProps> */
@js.native
trait RequiredLoaderSizeProps extends js.Object {
  
  var color: String = js.native
  
  var css: String | PrecompiledCss = js.native
  
  var loading: Boolean = js.native
  
  var size: LengthType = js.native
}
object RequiredLoaderSizeProps {
  
  @scala.inline
  def apply(color: String, css: String | PrecompiledCss, loading: Boolean, size: LengthType): RequiredLoaderSizeProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredLoaderSizeProps]
  }
  
  @scala.inline
  implicit class RequiredLoaderSizePropsOps[Self <: RequiredLoaderSizeProps] (val x: Self) extends AnyVal {
    
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
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: LengthType): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
