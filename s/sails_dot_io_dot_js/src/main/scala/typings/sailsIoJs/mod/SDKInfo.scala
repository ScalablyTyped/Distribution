package typings.sailsIoJs.mod

import typings.sailsIoJs.sailsIoJsStrings.browser
import typings.sailsIoJs.sailsIoJsStrings.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDKInfo extends js.Object {
  
  var language: js.UndefOr[String] = js.native
  
  var platform: js.UndefOr[browser | node] = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var versionString: js.UndefOr[String] = js.native
}
object SDKInfo {
  
  @scala.inline
  def apply(): SDKInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SDKInfo]
  }
  
  @scala.inline
  implicit class SDKInfoOps[Self <: SDKInfo] (val x: Self) extends AnyVal {
    
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setPlatform(value: browser | node): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersionString(value: String): Self = this.set("versionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionString: Self = this.set("versionString", js.undefined)
  }
}
