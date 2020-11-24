package typings.realm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The type of a user.
  */
@JSImport("realm", "UserType")
@js.native
object UserType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.realm.Realm.UserType with String] = js.native
  
  /* "normal" */ val Normal: typings.realm.Realm.UserType.Normal with String = js.native
  
  /* "server" */ val Server: typings.realm.Realm.UserType.Server with String = js.native
}
