package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-auth0", "Users")
@js.native
class Users_ protected () extends js.Object {
  def this(options: UsersOptions) = this()
  
  /* tslint:disable-next-line no-unnecessary-generics */
  def getUser[T](parameters: GetUserParams): js.Promise[Auth0User[T]] = js.native
  
  def patchUser[T](parameters: PatchUserParams[T]): js.Promise[Auth0User[T]] = js.native
}
