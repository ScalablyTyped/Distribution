package typings
package realmLib.RealmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpdateMode extends js.Object

@JSGlobal("Realm.UpdateMode")
@js.native
object UpdateMode extends js.Object {
  @js.native
  sealed trait All
    extends realmLib.RealmNs.UpdateMode
  
  @js.native
  sealed trait Modified
    extends realmLib.RealmNs.UpdateMode
  
  @js.native
  sealed trait Never
    extends realmLib.RealmNs.UpdateMode
  
  /* "all" */ val All: All with java.lang.String = js.native
  /* "modified" */ val Modified: Modified with java.lang.String = js.native
  /* "never" */ val Never: Never with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[realmLib.RealmNs.UpdateMode with java.lang.String] = js.native
}

