package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserState extends js.Object
/**
  * The state of a user.
  */
@JSGlobal("Realm.UserState")
@js.native
object UserState extends js.Object {
  
  /** Authenticated and available to communicate with services. */
  @js.native
  sealed trait Active extends UserState
  
  /** Logged out, but ready to be logged in. */
  @js.native
  sealed trait LoggedOut extends UserState
  
  /** Removed from the app entirely. */
  @js.native
  sealed trait Removed extends UserState
}
