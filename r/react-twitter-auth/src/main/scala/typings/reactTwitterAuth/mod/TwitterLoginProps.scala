package typings.reactTwitterAuth.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.reactTwitterAuth.reactTwitterAuthStrings.`same-origin`
import typings.reactTwitterAuth.reactTwitterAuthStrings.include
import typings.reactTwitterAuth.reactTwitterAuthStrings.omit
import typings.std.HeadersInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TwitterLoginProps extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var credentials: js.UndefOr[omit | `same-origin` | include] = js.native
  
  var customHeaders: js.UndefOr[HeadersInit] = js.native
  
  var dialogHeight: js.UndefOr[Double] = js.native
  
  var dialogWidth: js.UndefOr[Double] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var forceLogin: js.UndefOr[Boolean] = js.native
  
  var loginUrl: String = js.native
  
  def onFailure(msg: String): Unit = js.native
  
  def onSuccess(response: String): Unit = js.native
  
  var requestTokenUrl: String = js.native
  
  var showIcon: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tag: js.UndefOr[ReactType[_]] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object TwitterLoginProps {
  
  @scala.inline
  def apply(loginUrl: String, onFailure: String => Unit, onSuccess: String => Unit, requestTokenUrl: String): TwitterLoginProps = {
    val __obj = js.Dynamic.literal(loginUrl = loginUrl.asInstanceOf[js.Any], onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess), requestTokenUrl = requestTokenUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterLoginProps]
  }
  
  @scala.inline
  implicit class TwitterLoginPropsOps[Self <: TwitterLoginProps] (val x: Self) extends AnyVal {
    
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
    def setLoginUrl(value: String): Self = this.set("loginUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFailure(value: String => Unit): Self = this.set("onFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSuccess(value: String => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestTokenUrl(value: String): Self = this.set("requestTokenUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCredentials(value: omit | `same-origin` | include): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setCustomHeadersVarargs(value: js.Array[String]*): Self = this.set("customHeaders", js.Array(value :_*))
    
    @scala.inline
    def setCustomHeaders(value: HeadersInit): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomHeaders: Self = this.set("customHeaders", js.undefined)
    
    @scala.inline
    def setDialogHeight(value: Double): Self = this.set("dialogHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogHeight: Self = this.set("dialogHeight", js.undefined)
    
    @scala.inline
    def setDialogWidth(value: Double): Self = this.set("dialogWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogWidth: Self = this.set("dialogWidth", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setForceLogin(value: Boolean): Self = this.set("forceLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceLogin: Self = this.set("forceLogin", js.undefined)
    
    @scala.inline
    def setShowIcon(value: Boolean): Self = this.set("showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIcon: Self = this.set("showIcon", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTag(value: ReactType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
