package typings.reactNativeSqliteStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends js.Object {
  
  def executeSql(sqlStatement: String): Unit = js.native
  def executeSql(
    sqlStatement: String,
    arguments: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    errorCallback: StatementErrorCallback
  ): Unit = js.native
  def executeSql(sqlStatement: String, arguments: js.UndefOr[scala.Nothing], callback: StatementCallback): Unit = js.native
  def executeSql(
    sqlStatement: String,
    arguments: js.UndefOr[scala.Nothing],
    callback: StatementCallback,
    errorCallback: StatementErrorCallback
  ): Unit = js.native
  def executeSql(sqlStatement: String, arguments: js.Array[_]): Unit = js.native
  def executeSql(
    sqlStatement: String,
    arguments: js.Array[_],
    callback: js.UndefOr[scala.Nothing],
    errorCallback: StatementErrorCallback
  ): Unit = js.native
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
