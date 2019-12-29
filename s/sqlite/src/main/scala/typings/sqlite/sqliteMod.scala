package typings.sqlite

import typings.sqlDashTemplateDashStrings.sqlDashTemplateDashStringsMod.SQLStatement
import typings.sqlite.sqliteStrings.busyTimeout
import typings.sqlite.sqliteStrings.close
import typings.sqlite.sqliteStrings.error
import typings.sqlite.sqliteStrings.open
import typings.sqlite.sqliteStrings.profile
import typings.sqlite.sqliteStrings.trace
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqlite", JSImport.Namespace)
@js.native
object sqliteMod extends js.Object {
  @js.native
  trait Database extends js.Object {
    def all(sql: String): js.Promise[js.Array[_]] = js.native
    def all(sql: String, params: js.Any*): js.Promise[js.Array[_]] = js.native
    def all(sql: SQLStatement): js.Promise[js.Array[_]] = js.native
    def all(sql: SQLStatement, params: js.Any*): js.Promise[js.Array[_]] = js.native
    @JSName("all")
    def all_T[T](sql: String): js.Promise[js.Array[T]] = js.native
    @JSName("all")
    def all_T[T](sql: String, params: js.Any*): js.Promise[js.Array[T]] = js.native
    @JSName("all")
    def all_T[T](sql: SQLStatement): js.Promise[js.Array[T]] = js.native
    @JSName("all")
    def all_T[T](sql: SQLStatement, params: js.Any*): js.Promise[js.Array[T]] = js.native
    def close(): js.Promise[Unit] = js.native
    def configure(option: String, value: js.Any): Unit = js.native
    @JSName("configure")
    def configure_busyTimeout(option: busyTimeout, value: Double): Unit = js.native
    def each(sql: String): js.Promise[Double] = js.native
    def each(sql: String, callback: js.Function2[/* err */ Error, /* row */ js.Any, Unit]): js.Promise[Double] = js.native
    def each(sql: String, params: js.Any*): js.Promise[Double] = js.native
    def each(sql: SQLStatement): js.Promise[Double] = js.native
    def each(sql: SQLStatement, callback: js.Function2[/* err */ Error, /* row */ js.Any, Unit]): js.Promise[Double] = js.native
    def each(sql: SQLStatement, params: js.Any*): js.Promise[Double] = js.native
    def exec(sql: String): js.Promise[Database] = js.native
    def get(sql: String): js.Promise[_] = js.native
    def get(sql: String, params: js.Any*): js.Promise[_] = js.native
    def get(sql: SQLStatement): js.Promise[_] = js.native
    def get(sql: SQLStatement, params: js.Any*): js.Promise[_] = js.native
    @JSName("get")
    def get_T[T](sql: String): js.Promise[T] = js.native
    @JSName("get")
    def get_T[T](sql: String, params: js.Any*): js.Promise[T] = js.native
    @JSName("get")
    def get_T[T](sql: SQLStatement): js.Promise[T] = js.native
    @JSName("get")
    def get_T[T](sql: SQLStatement, params: js.Any*): js.Promise[T] = js.native
    def migrate(options: Anon_Force): js.Promise[Database] = js.native
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): Unit = js.native
    @JSName("on")
    def on_open(event: open, listener: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_profile(event: profile, listener: js.Function2[/* sql */ String, /* time */ Double, Unit]): Unit = js.native
    @JSName("on")
    def on_trace(event: trace, listener: js.Function1[/* sql */ String, Unit]): Unit = js.native
    def prepare(sql: String): js.Promise[Statement] = js.native
    def prepare(sql: String, params: js.Any*): js.Promise[Statement] = js.native
    def prepare(sql: SQLStatement): js.Promise[Statement] = js.native
    def prepare(sql: SQLStatement, params: js.Any*): js.Promise[Statement] = js.native
    def run(sql: String): js.Promise[Statement] = js.native
    def run(sql: String, params: js.Any*): js.Promise[Statement] = js.native
    def run(sql: SQLStatement): js.Promise[Statement] = js.native
    def run(sql: SQLStatement, params: js.Any*): js.Promise[Statement] = js.native
  }
  
  @js.native
  trait Statement extends js.Object {
    val changes: Double = js.native
    val lastID: Double = js.native
    val sql: String = js.native
    def all(): js.Promise[js.Array[_]] = js.native
    def all(params: js.Any*): js.Promise[js.Array[_]] = js.native
    @JSName("all")
    def all_T[T](): js.Promise[js.Array[T]] = js.native
    @JSName("all")
    def all_T[T](params: js.Any*): js.Promise[js.Array[T]] = js.native
    def bind(): js.Promise[Statement] = js.native
    def bind(params: js.Any*): js.Promise[Statement] = js.native
    def each(): js.Promise[Double] = js.native
    def each(callback: js.Function2[/* err */ Error, /* row */ js.Any, Unit]): js.Promise[Double] = js.native
    def each(params: js.Any*): js.Promise[Double] = js.native
    def get(): js.Promise[_] = js.native
    def get(params: js.Any*): js.Promise[_] = js.native
    @JSName("get")
    def get_T[T](): js.Promise[T] = js.native
    @JSName("get")
    def get_T[T](params: js.Any*): js.Promise[T] = js.native
    def reset(): js.Promise[Statement] = js.native
    def run(): js.Promise[Statement] = js.native
    def run(params: js.Any*): js.Promise[Statement] = js.native
  }
  
  def open(filename: String): js.Promise[Database] = js.native
  def open(filename: String, options: Anon_Cached): js.Promise[Database] = js.native
}

