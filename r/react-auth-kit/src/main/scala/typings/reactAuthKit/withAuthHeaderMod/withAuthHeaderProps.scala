package typings.reactAuthKit.withAuthHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait withAuthHeaderProps extends js.Object {
  
  var authHeader: String = js.native
}
object withAuthHeaderProps {
  
  @scala.inline
  def apply(authHeader: String): withAuthHeaderProps = {
    val __obj = js.Dynamic.literal(authHeader = authHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[withAuthHeaderProps]
  }
  
  @scala.inline
  implicit class withAuthHeaderPropsOps[Self <: withAuthHeaderProps] (val x: Self) extends AnyVal {
    
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
    def setAuthHeader(value: String): Self = this.set("authHeader", value.asInstanceOf[js.Any])
  }
}
