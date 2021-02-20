package typings.reduxAuthWrapper

import typings.reduxAuthWrapper.authWrapperMod.AuthWrapperConfig
import typings.reduxAuthWrapper.authWrapperMod.InjectedAuthProps
import typings.reduxAuthWrapper.mod.AuthBaseConfig
import typings.reduxAuthWrapper.mod.AuthWrapperDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectedAuthWrapperMod {
  
  @JSImport("redux-auth-wrapper/connectedAuthWrapper", JSImport.Default)
  @js.native
  def default[OwnProps, State](config: ConnectedAuthWrapperConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps with InjectedAuthProps] = js.native
  
  type ConnectedAuthWrapperConfig[OwnProps, State] = AuthWrapperConfig with (AuthBaseConfig[OwnProps, State])
}
