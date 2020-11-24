package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserType extends js.Object
/**
  * The type of a user.
  */
@JSGlobal("Realm.UserType")
@js.native
object UserType extends js.Object {
  
  /** A normal end-user created this user */
  @js.native
  sealed trait Normal extends UserType
  
  /** The user was created by the server */
  @js.native
  sealed trait Server extends UserType
}
