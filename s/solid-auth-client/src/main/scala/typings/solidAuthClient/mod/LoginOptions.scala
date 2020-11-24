package typings.solidAuthClient.mod

import typings.std.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginOptions extends js.Object {
  
  var callbackUri: js.UndefOr[String] = js.native
  
  var popupUri: js.UndefOr[String] = js.native
  
  var storage: js.UndefOr[Storage | AsyncStorage] = js.native
}
object LoginOptions {
  
  @scala.inline
  def apply(): LoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginOptions]
  }
  
  @scala.inline
  implicit class LoginOptionsOps[Self <: LoginOptions] (val x: Self) extends AnyVal {
    
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
    def setCallbackUri(value: String): Self = this.set("callbackUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackUri: Self = this.set("callbackUri", js.undefined)
    
    @scala.inline
    def setPopupUri(value: String): Self = this.set("popupUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupUri: Self = this.set("popupUri", js.undefined)
    
    @scala.inline
    def setStorage(value: Storage | AsyncStorage): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
}
