package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name I18N is established convention
@js.native
trait I18N extends js.Object {
  
  var rendererFormattedStrings: RendererFormattedStrings = js.native
}
object I18N {
  
  @scala.inline
  def apply(rendererFormattedStrings: RendererFormattedStrings): I18N = {
    val __obj = js.Dynamic.literal(rendererFormattedStrings = rendererFormattedStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18N]
  }
  
  @scala.inline
  implicit class I18NOps[Self <: I18N] (val x: Self) extends AnyVal {
    
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
    def setRendererFormattedStrings(value: RendererFormattedStrings): Self = this.set("rendererFormattedStrings", value.asInstanceOf[js.Any])
  }
}
