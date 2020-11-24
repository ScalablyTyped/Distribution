package typings.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceOptions extends js.Object {
  
  var contextPrefix: js.UndefOr[String] = js.native
  
  var default: js.UndefOr[js.Any] = js.native
  
  var functions: js.UndefOr[Boolean] = js.native
  
  var separator: js.UndefOr[String] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
}
object ReferenceOptions {
  
  @scala.inline
  def apply(): ReferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceOptions]
  }
  
  @scala.inline
  implicit class ReferenceOptionsOps[Self <: ReferenceOptions] (val x: Self) extends AnyVal {
    
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
    def setContextPrefix(value: String): Self = this.set("contextPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextPrefix: Self = this.set("contextPrefix", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setFunctions(value: Boolean): Self = this.set("functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
