package typings.realm.realmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("realm", "UpdateMode")
@js.native
object UpdateMode extends js.Object {
  /* "all" */ val All: typings.realm.RealmNs.UpdateMode.All with String = js.native
  /* "modified" */ val Modified: typings.realm.RealmNs.UpdateMode.Modified with String = js.native
  /* "never" */ val Never: typings.realm.RealmNs.UpdateMode.Never with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.realm.RealmNs.UpdateMode with String] = js.native
}

