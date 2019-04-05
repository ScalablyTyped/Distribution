package typings
package realmLib.realmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("realm", "UpdateMode")
@js.native
object UpdateMode extends js.Object {
  /* "all" */ val All: realmLib.RealmNs.UpdateMode.All with java.lang.String = js.native
  /* "modified" */ val Modified: realmLib.RealmNs.UpdateMode.Modified with java.lang.String = js.native
  /* "never" */ val Never: realmLib.RealmNs.UpdateMode.Never with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[realmLib.RealmNs.UpdateMode with java.lang.String] = js.native
}

