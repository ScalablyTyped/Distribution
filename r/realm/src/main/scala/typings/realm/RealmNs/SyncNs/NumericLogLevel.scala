package typings.realm.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NumericLogLevel extends js.Object

@JSGlobal("Realm.Sync.NumericLogLevel")
@js.native
object NumericLogLevel extends js.Object {
  @js.native
  sealed trait All extends NumericLogLevel
  
  @js.native
  sealed trait Debug extends NumericLogLevel
  
  @js.native
  sealed trait Detail extends NumericLogLevel
  
  @js.native
  sealed trait Error extends NumericLogLevel
  
  @js.native
  sealed trait Fatal extends NumericLogLevel
  
  @js.native
  sealed trait Info extends NumericLogLevel
  
  @js.native
  sealed trait Off extends NumericLogLevel
  
  @js.native
  sealed trait Trace extends NumericLogLevel
  
  @js.native
  sealed trait Warn extends NumericLogLevel
  
  /* 0 */ val All: typings.realm.RealmNs.SyncNs.NumericLogLevel.All with Double = js.native
  /* 2 */ val Debug: typings.realm.RealmNs.SyncNs.NumericLogLevel.Debug with Double = js.native
  /* 3 */ val Detail: typings.realm.RealmNs.SyncNs.NumericLogLevel.Detail with Double = js.native
  /* 6 */ val Error: typings.realm.RealmNs.SyncNs.NumericLogLevel.Error with Double = js.native
  /* 7 */ val Fatal: typings.realm.RealmNs.SyncNs.NumericLogLevel.Fatal with Double = js.native
  /* 4 */ val Info: typings.realm.RealmNs.SyncNs.NumericLogLevel.Info with Double = js.native
  /* 8 */ val Off: typings.realm.RealmNs.SyncNs.NumericLogLevel.Off with Double = js.native
  /* 1 */ val Trace: typings.realm.RealmNs.SyncNs.NumericLogLevel.Trace with Double = js.native
  /* 5 */ val Warn: typings.realm.RealmNs.SyncNs.NumericLogLevel.Warn with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NumericLogLevel with Double] = js.native
}

