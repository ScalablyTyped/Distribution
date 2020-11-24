package typings.reactNativeAppLink.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppLinkOptions extends js.Object {
  
  val appName: String = js.native
  
  val appStoreId: Double = js.native
  
  val appStoreLocale: String = js.native
  
  val playStoreId: String = js.native
}
object AppLinkOptions {
  
  @scala.inline
  def apply(appName: String, appStoreId: Double, appStoreLocale: String, playStoreId: String): AppLinkOptions = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], appStoreId = appStoreId.asInstanceOf[js.Any], appStoreLocale = appStoreLocale.asInstanceOf[js.Any], playStoreId = playStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppLinkOptions]
  }
  
  @scala.inline
  implicit class AppLinkOptionsOps[Self <: AppLinkOptions] (val x: Self) extends AnyVal {
    
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
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreId(value: Double): Self = this.set("appStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreLocale(value: String): Self = this.set("appStoreLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayStoreId(value: String): Self = this.set("playStoreId", value.asInstanceOf[js.Any])
  }
}
