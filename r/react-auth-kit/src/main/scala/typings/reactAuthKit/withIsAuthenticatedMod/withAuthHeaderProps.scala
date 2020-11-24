package typings.reactAuthKit.withIsAuthenticatedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait withAuthHeaderProps extends js.Object {
  
  var isAuth: String = js.native
}
object withAuthHeaderProps {
  
  @scala.inline
  def apply(isAuth: String): withAuthHeaderProps = {
    val __obj = js.Dynamic.literal(isAuth = isAuth.asInstanceOf[js.Any])
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
    def setIsAuth(value: String): Self = this.set("isAuth", value.asInstanceOf[js.Any])
  }
}
