package typings.reactDashNativeDashSqliteDashStorage.reactDashNativeDashSqliteDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-sqlite-storage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def DEBUG(isDebug: Boolean): Unit = js.native
  def deleteDatabase(params: DatabaseParams): js.Promise[Unit] = js.native
  def deleteDatabase(params: DatabaseParams, success: js.Function0[Unit]): Unit = js.native
  def deleteDatabase(params: DatabaseParams, success: js.Function0[Unit], error: js.Function1[/* err */ SQLError, Unit]): Unit = js.native
  @JSName("deleteDatabase")
  def deleteDatabase_Unit(params: DatabaseParams): Unit = js.native
  def enablePromise(enablePromise: Boolean): Unit = js.native
  def openDatabase(params: DatabaseParams): SQLiteDatabase = js.native
  def openDatabase(params: DatabaseParams, success: js.Function0[Unit]): SQLiteDatabase = js.native
  def openDatabase(params: DatabaseParams, success: js.Function0[Unit], error: js.Function1[/* e */ SQLError, Unit]): SQLiteDatabase = js.native
  @JSName("openDatabase")
  def openDatabase_Promise(params: DatabaseParams): js.Promise[SQLiteDatabase] = js.native
}

