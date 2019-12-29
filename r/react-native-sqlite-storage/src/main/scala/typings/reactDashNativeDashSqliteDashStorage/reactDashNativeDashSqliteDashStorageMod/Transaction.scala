package typings.reactDashNativeDashSqliteDashStorage.reactDashNativeDashSqliteDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  def executeSql(sqlStatement: String): Unit = js.native
  def executeSql(sqlStatement: String, arguments: js.Array[_]): Unit = js.native
  def executeSql(sqlStatement: String, arguments: js.Array[_], callback: StatementCallback): Unit = js.native
  def executeSql(
    sqlStatement: String,
    arguments: js.Array[_],
    callback: StatementCallback,
    errorCallback: StatementErrorCallback
  ): Unit = js.native
  @JSName("executeSql")
  def executeSql_Promise(sqlStatement: String): js.Promise[js.Tuple2[Transaction, ResultSet]] = js.native
  @JSName("executeSql")
  def executeSql_Promise(sqlStatement: String, arguments: js.Array[_]): js.Promise[js.Tuple2[Transaction, ResultSet]] = js.native
}

