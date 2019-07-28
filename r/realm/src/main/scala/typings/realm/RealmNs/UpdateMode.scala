package typings.realm.RealmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpdateMode extends js.Object

@JSGlobal("Realm.UpdateMode")
@js.native
object UpdateMode extends js.Object {
  @js.native
  sealed trait All extends UpdateMode
  
  @js.native
  sealed trait Modified extends UpdateMode
  
  @js.native
  sealed trait Never extends UpdateMode
  
  /* "all" */ val All: typings.realm.RealmNs.UpdateMode.All with String = js.native
  /* "modified" */ val Modified: typings.realm.RealmNs.UpdateMode.Modified with String = js.native
  /* "never" */ val Never: typings.realm.RealmNs.UpdateMode.Never with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UpdateMode with String] = js.native
}

