package typings.reactNativeSqliteStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-sqlite-storage", "deleteDatabase")
@js.native
object deleteDatabase extends js.Object {
  
  def apply(params: DatabaseParams): Unit = js.native
  def apply(
    params: DatabaseParams,
    success: js.UndefOr[scala.Nothing],
    error: js.Function1[/* err */ SQLError, Unit]
  ): Unit = js.native
  def apply(params: DatabaseParams, success: js.Function0[Unit]): Unit = js.native
  def apply(params: DatabaseParams, success: js.Function0[Unit], error: js.Function1[/* err */ SQLError, Unit]): Unit = js.native
}
