package typings
package reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-sqlite-storage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def DEBUG(isDebug: scala.Boolean): scala.Unit = js.native
  def deleteDatabase(
    params: reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.DatabaseParams
  ): js.Promise[scala.Unit] = js.native
  def deleteDatabase(
    params: reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.DatabaseParams,
    success: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def deleteDatabase(
    params: reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.DatabaseParams,
    success: js.Function0[scala.Unit],
    error: js.Function1[
      /* err */ reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.SQLError, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("deleteDatabase")
  def deleteDatabase_Unit(
    params: reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.DatabaseParams
  ): scala.Unit = js.native
  def enablePromise(enablePromise: scala.Boolean): scala.Unit = js.native
  def openDatabase(
    params: reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.DatabaseParams
  ): js.Promise[
    reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.SQLiteDatabase
  ] = js.native
  def openDatabase(
    params: reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.DatabaseParams,
    success: js.Function0[scala.Unit]
  ): reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.SQLiteDatabase = js.native
  def openDatabase(
    params: reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.DatabaseParams,
    success: js.Function0[scala.Unit],
    error: js.Function1[
      /* e */ reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.SQLError, 
      scala.Unit
    ]
  ): reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.SQLiteDatabase = js.native
  @JSName("openDatabase")
  def openDatabase_SQLiteDatabase(
    params: reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.DatabaseParams
  ): reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.SQLiteDatabase = js.native
}

