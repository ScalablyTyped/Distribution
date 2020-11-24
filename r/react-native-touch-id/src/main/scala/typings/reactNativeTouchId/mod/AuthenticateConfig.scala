package typings.reactNativeTouchId.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticateConfig extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var fallbackTitle: String = js.native
  
  var title: js.UndefOr[String] = js.native
}
object AuthenticateConfig {
  
  @scala.inline
  def apply(fallbackTitle: String): AuthenticateConfig = {
    val __obj = js.Dynamic.literal(fallbackTitle = fallbackTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateConfig]
  }
  
  @scala.inline
  implicit class AuthenticateConfigOps[Self <: AuthenticateConfig] (val x: Self) extends AnyVal {
    
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
    def setFallbackTitle(value: String): Self = this.set("fallbackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
