package typings.sqlite.sqlite3Mod

import typings.node.eventsMod.EventEmitter
import typings.sqlite.sqliteStrings.busyTimeout
import typings.sqlite.sqliteStrings.close
import typings.sqlite.sqliteStrings.error
import typings.sqlite.sqliteStrings.open
import typings.sqlite.sqliteStrings.profile
import typings.sqlite.sqliteStrings.trace
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sqlite3", "Database")
@js.native
class Database protected () extends EventEmitter {
  def this(filename: String) = this()
  def this(filename: String, callback: js.Function1[/* err */ Error | Null, Unit]) = this()
  def this(filename: String, mode: Double) = this()
  def this(
    filename: String,
    mode: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ Error | Null, Unit]
  ) = this()
  def this(filename: String, mode: Double, callback: js.Function1[/* err */ Error | Null, Unit]) = this()
  
  def all(sql: String): this.type = js.native
  def all(
    sql: String,
    callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* rows */ js.Array[_], Unit]
  ): this.type = js.native
  def all(sql: String, params: js.Any*): this.type = js.native
  def all(sql: String, params: js.Any): this.type = js.native
  def all(
    sql: String,
    params: js.Any,
    callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* rows */ js.Array[_], Unit]
  ): this.type = js.native
  
  def close(): Unit = js.native
  def close(callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  @JSName("configure")
  def configure_busyTimeout(option: busyTimeout, value: Double): Unit = js.native
  
  def each(sql: String): this.type = js.native
  def each(
    sql: String,
    callback: js.UndefOr[scala.Nothing],
    complete: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]
  ): this.type = js.native
  def each(
    sql: String,
    callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* row */ js.Any, Unit]
  ): this.type = js.native
  def each(
    sql: String,
    callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* row */ js.Any, Unit],
    complete: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]
  ): this.type = js.native
  def each(sql: String, params: js.Any*): this.type = js.native
  def each(sql: String, params: js.Any): this.type = js.native
  def each(
    sql: String,
    params: js.Any,
    callback: js.UndefOr[scala.Nothing],
    complete: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]
  ): this.type = js.native
  def each(
    sql: String,
    params: js.Any,
    callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* row */ js.Any, Unit]
  ): this.type = js.native
  def each(
    sql: String,
    params: js.Any,
    callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* row */ js.Any, Unit],
    complete: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]
  ): this.type = js.native
  
  def exec(sql: String): this.type = js.native
  def exec(sql: String, callback: js.ThisFunction1[/* this */ Statement, /* err */ Error | Null, Unit]): this.type = js.native
  
  def get(sql: String): this.type = js.native
  def get(
    sql: String,
    callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* row */ js.Any, Unit]
  ): this.type = js.native
  def get(sql: String, params: js.Any*): this.type = js.native
  def get(sql: String, params: js.Any): this.type = js.native
  def get(
    sql: String,
    params: js.Any,
    callback: js.ThisFunction2[/* this */ Statement, /* err */ Error | Null, /* row */ js.Any, Unit]
  ): this.type = js.native
  
  def interrupt(): Unit = js.native
  
  def loadExtension(path: String): Unit = js.native
  def loadExtension(path: String, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_open(event: open, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_profile(event: profile, listener: js.Function2[/* sql */ String, /* time */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_trace(event: trace, listener: js.Function1[/* sql */ String, Unit]): this.type = js.native
  
  def parallelize(): Unit = js.native
  def parallelize(callback: js.Function0[Unit]): Unit = js.native
  
  def prepare(sql: String): Statement = js.native
  def prepare(sql: String, callback: js.ThisFunction1[/* this */ Statement, /* err */ Error | Null, Unit]): Statement = js.native
  def prepare(sql: String, params: js.Any*): Statement = js.native
  def prepare(sql: String, params: js.Any): Statement = js.native
  def prepare(
    sql: String,
    params: js.Any,
    callback: js.ThisFunction1[/* this */ Statement, /* err */ Error | Null, Unit]
  ): Statement = js.native
  
  def run(sql: String): this.type = js.native
  def run(sql: String, callback: js.ThisFunction1[/* this */ RunResult, /* err */ Error | Null, Unit]): this.type = js.native
  def run(sql: String, params: js.Any*): this.type = js.native
  def run(sql: String, params: js.Any): this.type = js.native
  def run(
    sql: String,
    params: js.Any,
    callback: js.ThisFunction1[/* this */ RunResult, /* err */ Error | Null, Unit]
  ): this.type = js.native
  
  def serialize(): Unit = js.native
  def serialize(callback: js.Function0[Unit]): Unit = js.native
}
