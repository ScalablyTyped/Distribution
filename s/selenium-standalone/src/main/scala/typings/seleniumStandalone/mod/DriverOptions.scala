package typings.seleniumStandalone.mod

import typings.seleniumStandalone.seleniumStandaloneStrings.ia32
import typings.seleniumStandalone.seleniumStandaloneStrings.x64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriverOptions extends js.Object {
  
  var arch: js.UndefOr[String | ia32 | x64] = js.native
  
  var baseURL: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object DriverOptions {
  
  @scala.inline
  def apply(): DriverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriverOptions]
  }
  
  @scala.inline
  implicit class DriverOptionsOps[Self <: DriverOptions] (val x: Self) extends AnyVal {
    
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
    def setArch(value: String | ia32 | x64): Self = this.set("arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArch: Self = this.set("arch", js.undefined)
    
    @scala.inline
    def setBaseURL(value: String): Self = this.set("baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseURL: Self = this.set("baseURL", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
