package typings.realm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The state of a user.
  */
@JSImport("realm", "UserState")
@js.native
object UserState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.realm.Realm.UserState with String] = js.native
  
  /* "active" */ val Active: typings.realm.Realm.UserState.Active with String = js.native
  
  /* "logged-out" */ val LoggedOut: typings.realm.Realm.UserState.LoggedOut with String = js.native
  
  /* "removed" */ val Removed: typings.realm.Realm.UserState.Removed with String = js.native
}
