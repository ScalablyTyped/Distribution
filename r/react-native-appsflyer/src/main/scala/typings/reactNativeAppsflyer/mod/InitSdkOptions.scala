package typings.reactNativeAppsflyer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitSdkOptions extends js.Object {
  
  var appId: String = js.native
  
  var devKey: String = js.native
  
  var isDebug: Boolean = js.native
}
object InitSdkOptions {
  
  @scala.inline
  def apply(appId: String, devKey: String, isDebug: Boolean): InitSdkOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], devKey = devKey.asInstanceOf[js.Any], isDebug = isDebug.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitSdkOptions]
  }
  
  @scala.inline
  implicit class InitSdkOptionsOps[Self <: InitSdkOptions] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevKey(value: String): Self = this.set("devKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDebug(value: Boolean): Self = this.set("isDebug", value.asInstanceOf[js.Any])
  }
}
