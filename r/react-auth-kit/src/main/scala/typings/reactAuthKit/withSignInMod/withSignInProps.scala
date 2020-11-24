package typings.reactAuthKit.withSignInMod

import typings.reactAuthKit.typesMod.signInFunctionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait withSignInProps extends js.Object {
  
  def signIn(params: signInFunctionParams): Boolean = js.native
}
object withSignInProps {
  
  @scala.inline
  def apply(signIn: signInFunctionParams => Boolean): withSignInProps = {
    val __obj = js.Dynamic.literal(signIn = js.Any.fromFunction1(signIn))
    __obj.asInstanceOf[withSignInProps]
  }
  
  @scala.inline
  implicit class withSignInPropsOps[Self <: withSignInProps] (val x: Self) extends AnyVal {
    
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
    def setSignIn(value: signInFunctionParams => Boolean): Self = this.set("signIn", js.Any.fromFunction1(value))
  }
}
