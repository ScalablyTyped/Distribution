package typings
package reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-sqlite-storage", JSImport.Namespace)
@js.native
object reactDashNativeDashSqliteDashStorageModMembers extends js.Object {
  def DEBUG(isDebug: scala.Boolean): scala.Unit = js.native
  def deleteDatabase(params: DatabaseParams): scala.Unit = js.native
  def deleteDatabase(params: DatabaseParams, success: js.Function0[scala.Unit]): scala.Unit = js.native
  def deleteDatabase(
    params: DatabaseParams,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* err */ SQLError, scala.Unit]
  ): scala.Unit = js.native
  @JSName("deleteDatabase")
  def deleteDatabase_Promise(params: DatabaseParams): stdLib.Promise[scala.Unit] = js.native
  def enablePromise(enablePromise: scala.Boolean): scala.Unit = js.native
  def openDatabase(params: DatabaseParams): SQLiteDatabase = js.native
  def openDatabase(params: DatabaseParams, success: js.Function0[scala.Unit]): SQLiteDatabase = js.native
  def openDatabase(
    params: DatabaseParams,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* e */ SQLError, scala.Unit]
  ): SQLiteDatabase = js.native
  @JSName("openDatabase")
  def openDatabase_Promise(params: DatabaseParams): stdLib.Promise[SQLiteDatabase] = js.native
}

