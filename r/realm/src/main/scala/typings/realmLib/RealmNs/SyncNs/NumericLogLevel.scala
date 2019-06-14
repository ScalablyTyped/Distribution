package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NumericLogLevel extends js.Object

@JSGlobal("Realm.Sync.NumericLogLevel")
@js.native
object NumericLogLevel extends js.Object {
  @js.native
  sealed trait All
    extends realmLib.RealmNs.SyncNs.NumericLogLevel
  
  @js.native
  sealed trait Debug
    extends realmLib.RealmNs.SyncNs.NumericLogLevel
  
  @js.native
  sealed trait Detail
    extends realmLib.RealmNs.SyncNs.NumericLogLevel
  
  @js.native
  sealed trait Error
    extends realmLib.RealmNs.SyncNs.NumericLogLevel
  
  @js.native
  sealed trait Fatal
    extends realmLib.RealmNs.SyncNs.NumericLogLevel
  
  @js.native
  sealed trait Info
    extends realmLib.RealmNs.SyncNs.NumericLogLevel
  
  @js.native
  sealed trait Off
    extends realmLib.RealmNs.SyncNs.NumericLogLevel
  
  @js.native
  sealed trait Trace
    extends realmLib.RealmNs.SyncNs.NumericLogLevel
  
  @js.native
  sealed trait Warn
    extends realmLib.RealmNs.SyncNs.NumericLogLevel
  
  /* 0 */ val All: All with scala.Double = js.native
  /* 2 */ val Debug: Debug with scala.Double = js.native
  /* 3 */ val Detail: Detail with scala.Double = js.native
  /* 6 */ val Error: Error with scala.Double = js.native
  /* 7 */ val Fatal: Fatal with scala.Double = js.native
  /* 4 */ val Info: Info with scala.Double = js.native
  /* 8 */ val Off: Off with scala.Double = js.native
  /* 1 */ val Trace: Trace with scala.Double = js.native
  /* 5 */ val Warn: Warn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[realmLib.RealmNs.SyncNs.NumericLogLevel with scala.Double] = js.native
}

