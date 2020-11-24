package typings.reactNativeSqliteStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-sqlite-storage", "openDatabase")
@js.native
object openDatabase extends js.Object {
  
  def apply(params: DatabaseParams): SQLiteDatabase = js.native
  def apply(
    params: DatabaseParams,
    success: js.UndefOr[scala.Nothing],
    error: js.Function1[/* e */ SQLError, Unit]
  ): SQLiteDatabase = js.native
  def apply(params: DatabaseParams, success: js.Function0[Unit]): SQLiteDatabase = js.native
  def apply(params: DatabaseParams, success: js.Function0[Unit], error: js.Function1[/* e */ SQLError, Unit]): SQLiteDatabase = js.native
}
