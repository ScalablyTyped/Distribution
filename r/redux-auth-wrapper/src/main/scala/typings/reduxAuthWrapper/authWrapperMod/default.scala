package typings.reduxAuthWrapper.authWrapperMod

import typings.reduxAuthWrapper.mod.AuthWrapperDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-auth-wrapper/authWrapper", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[OwnProps](config: AuthWrapperConfig): AuthWrapperDecorator[OwnProps with InjectedAuthProps] = js.native
}
