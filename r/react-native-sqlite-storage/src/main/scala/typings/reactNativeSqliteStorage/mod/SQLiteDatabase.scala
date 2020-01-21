package typings.reactNativeSqliteStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SQLiteDatabase extends js.Object {
  def attach(nameToAttach: String, alias: String): Unit = js.native
  def attach(nameToAttach: String, alias: String, success: js.Function0[Unit]): Unit = js.native
  def attach(
    nameToAttach: String,
    alias: String,
    success: js.Function0[Unit],
    error: js.Function1[/* err */ SQLError, Unit]
  ): Unit = js.native
  @JSName("attach")
  def attach_Promise(nameToAttach: String, alias: String): js.Promise[Unit] = js.native
  def close(): js.Promise[Unit] = js.native
  def close(success: js.Function0[Unit], error: js.Function1[/* err */ SQLError, Unit]): Unit = js.native
  def dettach(alias: String): Unit = js.native
  def dettach(alias: String, success: js.Function0[Unit]): Unit = js.native
  def dettach(alias: String, success: js.Function0[Unit], error: js.Function1[/* err */ SQLError, Unit]): Unit = js.native
  @JSName("dettach")
  def dettach_Promise(alias: String): js.Promise[Unit] = js.native
  def executeSql(statement: String): Unit = js.native
  def executeSql(statement: String, params: js.Array[_]): Unit = js.native
  def executeSql(statement: String, params: js.Array[_], success: StatementCallback): Unit = js.native
  def executeSql(statement: String, params: js.Array[_], success: StatementCallback, error: StatementErrorCallback): Unit = js.native
  @JSName("executeSql")
  def executeSql_Promise(statement: String): js.Promise[js.Array[ResultSet]] = js.native
  @JSName("executeSql")
  def executeSql_Promise(statement: String, params: js.Array[_]): js.Promise[js.Array[ResultSet]] = js.native
  def readTransaction(scope: js.Function1[/* tx */ Transaction, Unit]): Unit = js.native
  def readTransaction(scope: js.Function1[/* tx */ Transaction, Unit], error: TransactionErrorCallback): Unit = js.native
  def readTransaction(
    scope: js.Function1[/* tx */ Transaction, Unit],
    error: TransactionErrorCallback,
    success: TransactionCallback
  ): Unit = js.native
  @JSName("readTransaction")
  def readTransaction_Promise(scope: js.Function1[/* tx */ Transaction, Unit]): js.Promise[TransactionCallback] = js.native
  def transaction(scope: js.Function1[/* tx */ Transaction, Unit]): Unit = js.native
  def transaction(scope: js.Function1[/* tx */ Transaction, Unit], error: TransactionErrorCallback): Unit = js.native
  def transaction(
    scope: js.Function1[/* tx */ Transaction, Unit],
    error: TransactionErrorCallback,
    success: TransactionCallback
  ): Unit = js.native
  @JSName("transaction")
  def transaction_Promise(scope: js.Function1[/* tx */ Transaction, Unit]): js.Promise[Transaction] = js.native
}

