package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-auth0", "Users")
@js.native
open class Users_ protected () extends StObject {
  def this(options: UsersOptions) = this()
  
  /* eslint-disable-next-line no-unnecessary-generics */
  def getUser[T](parameters: GetUserParams): js.Promise[Auth0User[T]] = js.native
  
  def patchUser[T](parameters: PatchUserParams[T]): js.Promise[Auth0User[T]] = js.native
}
