package typings.reactAuthKit.withAuthUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait withAuthProps extends js.Object {
  
  var authState: js.Object | Null = js.native
}
object withAuthProps {
  
  @scala.inline
  def apply(): withAuthProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[withAuthProps]
  }
  
  @scala.inline
  implicit class withAuthPropsOps[Self <: withAuthProps] (val x: Self) extends AnyVal {
    
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
    def setAuthState(value: js.Object): Self = this.set("authState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthStateNull: Self = this.set("authState", null)
  }
}
