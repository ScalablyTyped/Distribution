package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SessionStopPolicy extends js.Object

@JSGlobal("Realm.Sync.SessionStopPolicy")
@js.native
object SessionStopPolicy extends js.Object {
  @js.native
  sealed trait AfterUpload
    extends realmLib.RealmNs.SyncNs.SessionStopPolicy
  
  @js.native
  sealed trait Immediately
    extends realmLib.RealmNs.SyncNs.SessionStopPolicy
  
  @js.native
  sealed trait Never
    extends realmLib.RealmNs.SyncNs.SessionStopPolicy
  
  /* "after-upload" */ val AfterUpload: AfterUpload with java.lang.String = js.native
  /* "immediately" */ val Immediately: Immediately with java.lang.String = js.native
  /* "never" */ val Never: Never with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[realmLib.RealmNs.SyncNs.SessionStopPolicy with java.lang.String] = js.native
}

