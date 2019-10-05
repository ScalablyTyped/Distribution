package typings.reactDashNativeDashAuth0.reactDashNativeDashAuth0Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-auth0", "Users")
@js.native
class Users protected () extends js.Object {
  def this(options: UsersOptions) = this()
  /* tslint:disable-next-line no-unnecessary-generics */
  def getUser[T](parameters: GetUserParams): js.Promise[Auth0User[T]] = js.native
  def patchUser[T](parameters: PatchUserParams[T]): js.Promise[Auth0User[T]] = js.native
}

@JSImport("react-native-auth0", "users")
@js.native
object users extends TopLevel[Users]

