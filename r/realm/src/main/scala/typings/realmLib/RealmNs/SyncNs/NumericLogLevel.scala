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
  
  val All: All with java.lang.String = js.native
  val Debug: Debug with java.lang.String = js.native
  val Detail: Detail with java.lang.String = js.native
  val Error: Error with java.lang.String = js.native
  val Fatal: Fatal with java.lang.String = js.native
  val Info: Info with java.lang.String = js.native
  val Off: Off with java.lang.String = js.native
  val Trace: Trace with java.lang.String = js.native
  val Warn: Warn with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[realmLib.RealmNs.SyncNs.NumericLogLevel with java.lang.String] = js.native
}

