package typings
package reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SQLiteDatabase extends js.Object {
  def attach(nameToAttach: java.lang.String, alias: java.lang.String): scala.Unit = js.native
  def attach(nameToAttach: java.lang.String, alias: java.lang.String, success: js.Function0[scala.Unit]): scala.Unit = js.native
  def attach(
    nameToAttach: java.lang.String,
    alias: java.lang.String,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* err */ SQLError, scala.Unit]
  ): scala.Unit = js.native
  @JSName("attach")
  def attach_Promise(nameToAttach: java.lang.String, alias: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def close(): stdLib.Promise[scala.Unit] = js.native
  def close(success: js.Function0[scala.Unit], error: js.Function1[/* err */ SQLError, scala.Unit]): scala.Unit = js.native
  def dettach(alias: java.lang.String): scala.Unit = js.native
  def dettach(alias: java.lang.String, success: js.Function0[scala.Unit]): scala.Unit = js.native
  def dettach(
    alias: java.lang.String,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* err */ SQLError, scala.Unit]
  ): scala.Unit = js.native
  @JSName("dettach")
  def dettach_Promise(alias: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def executeSql(statement: java.lang.String): scala.Unit = js.native
  def executeSql(statement: java.lang.String, params: js.Array[_]): scala.Unit = js.native
  def executeSql(statement: java.lang.String, params: js.Array[_], success: StatementCallback): scala.Unit = js.native
  def executeSql(
    statement: java.lang.String,
    params: js.Array[_],
    success: StatementCallback,
    error: StatementErrorCallback
  ): scala.Unit = js.native
  @JSName("executeSql")
  def executeSql_Promise(statement: java.lang.String): stdLib.Promise[js.Array[ResultSet]] = js.native
  @JSName("executeSql")
  def executeSql_Promise(statement: java.lang.String, params: js.Array[_]): stdLib.Promise[js.Array[ResultSet]] = js.native
  def readTransaction(scope: js.Function1[/* tx */ Transaction, scala.Unit]): scala.Unit = js.native
  def readTransaction(scope: js.Function1[/* tx */ Transaction, scala.Unit], error: TransactionErrorCallback): scala.Unit = js.native
  def readTransaction(
    scope: js.Function1[/* tx */ Transaction, scala.Unit],
    error: TransactionErrorCallback,
    success: TransactionCallback
  ): scala.Unit = js.native
  @JSName("readTransaction")
  def readTransaction_Promise(scope: js.Function1[/* tx */ Transaction, scala.Unit]): stdLib.Promise[TransactionCallback] = js.native
  def transaction(scope: js.Function1[/* tx */ Transaction, scala.Unit]): scala.Unit = js.native
  def transaction(scope: js.Function1[/* tx */ Transaction, scala.Unit], error: TransactionErrorCallback): scala.Unit = js.native
  def transaction(
    scope: js.Function1[/* tx */ Transaction, scala.Unit],
    error: TransactionErrorCallback,
    success: TransactionCallback
  ): scala.Unit = js.native
  @JSName("transaction")
  def transaction_Promise(scope: js.Function1[/* tx */ Transaction, scala.Unit]): stdLib.Promise[Transaction] = js.native
}

