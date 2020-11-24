package typings.reactNativeVersionCheck.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppID extends js.Object {
  
  /**
    * App ID
    */
  var appID: js.UndefOr[String] = js.native
  
  /**
    * @default true
    */
  var ignoreErrors: js.UndefOr[Boolean] = js.native
  
  var packageName: js.UndefOr[String] = js.native
}
object AppID {
  
  @scala.inline
  def apply(): AppID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppID]
  }
  
  @scala.inline
  implicit class AppIDOps[Self <: AppID] (val x: Self) extends AnyVal {
    
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
    def setAppID(value: String): Self = this.set("appID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppID: Self = this.set("appID", js.undefined)
    
    @scala.inline
    def setIgnoreErrors(value: Boolean): Self = this.set("ignoreErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreErrors: Self = this.set("ignoreErrors", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
  }
}
