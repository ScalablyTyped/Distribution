package typings.reactCssModules.mod

import typings.reactCssModules.reactCssModulesStrings.`throw`
import typings.reactCssModules.reactCssModulesStrings.ignore
import typings.reactCssModules.reactCssModulesStrings.log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeOptions extends js.Object {
  
  var allowMultiple: js.UndefOr[Boolean] = js.native
  
  var handleNotFoundStyleName: js.UndefOr[`throw` | log | ignore] = js.native
}
object TypeOptions {
  
  @scala.inline
  def apply(): TypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeOptions]
  }
  
  @scala.inline
  implicit class TypeOptionsOps[Self <: TypeOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowMultiple(value: Boolean): Self = this.set("allowMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultiple: Self = this.set("allowMultiple", js.undefined)
    
    @scala.inline
    def setHandleNotFoundStyleName(value: `throw` | log | ignore): Self = this.set("handleNotFoundStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleNotFoundStyleName: Self = this.set("handleNotFoundStyleName", js.undefined)
  }
}
