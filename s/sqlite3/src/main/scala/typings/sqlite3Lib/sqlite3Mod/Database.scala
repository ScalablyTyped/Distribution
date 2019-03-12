package typings
package sqlite3Lib.sqlite3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqlite3", "Database")
@js.native
class Database protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(filename: java.lang.String) = this()
  def this(filename: java.lang.String, callback: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]) = this()
  def this(filename: java.lang.String, mode: scala.Double) = this()
  def this(filename: java.lang.String, mode: scala.Double, callback: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]) = this()
  def all(sql: java.lang.String): this.type = js.native
  def all(
    sql: java.lang.String,
    callback: js.ThisFunction2[
      /* this */ Statement, 
      /* err */ stdLib.Error | scala.Null, 
      /* rows */ js.Array[_], 
      scala.Unit
    ]
  ): this.type = js.native
  def all(sql: java.lang.String, params: js.Any*): this.type = js.native
  def all(sql: java.lang.String, params: js.Any): this.type = js.native
  def all(
    sql: java.lang.String,
    params: js.Any,
    callback: js.ThisFunction2[
      /* this */ Statement, 
      /* err */ stdLib.Error | scala.Null, 
      /* rows */ js.Array[_], 
      scala.Unit
    ]
  ): this.type = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]): scala.Unit = js.native
  @JSName("configure")
  def configure_busyTimeout(option: sqlite3Lib.sqlite3LibStrings.busyTimeout, value: scala.Double): scala.Unit = js.native
  def each(sql: java.lang.String): this.type = js.native
  def each(
    sql: java.lang.String,
    callback: js.ThisFunction2[
      /* this */ Statement, 
      /* err */ stdLib.Error | scala.Null, 
      /* row */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  def each(
    sql: java.lang.String,
    callback: js.ThisFunction2[
      /* this */ Statement, 
      /* err */ stdLib.Error | scala.Null, 
      /* row */ js.Any, 
      scala.Unit
    ],
    complete: js.Function2[/* err */ stdLib.Error | scala.Null, /* count */ scala.Double, scala.Unit]
  ): this.type = js.native
  def each(sql: java.lang.String, params: js.Any*): this.type = js.native
  def each(sql: java.lang.String, params: js.Any): this.type = js.native
  def each(
    sql: java.lang.String,
    params: js.Any,
    callback: js.ThisFunction2[
      /* this */ Statement, 
      /* err */ stdLib.Error | scala.Null, 
      /* row */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  def each(
    sql: java.lang.String,
    params: js.Any,
    callback: js.ThisFunction2[
      /* this */ Statement, 
      /* err */ stdLib.Error | scala.Null, 
      /* row */ js.Any, 
      scala.Unit
    ],
    complete: js.Function2[/* err */ stdLib.Error | scala.Null, /* count */ scala.Double, scala.Unit]
  ): this.type = js.native
  def exec(sql: java.lang.String): this.type = js.native
  def exec(
    sql: java.lang.String,
    callback: js.ThisFunction1[/* this */ Statement, /* err */ stdLib.Error | scala.Null, scala.Unit]
  ): this.type = js.native
  def get(sql: java.lang.String): this.type = js.native
  def get(
    sql: java.lang.String,
    callback: js.ThisFunction2[
      /* this */ Statement, 
      /* err */ stdLib.Error | scala.Null, 
      /* row */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  def get(sql: java.lang.String, params: js.Any*): this.type = js.native
  def get(sql: java.lang.String, params: js.Any): this.type = js.native
  def get(
    sql: java.lang.String,
    params: js.Any,
    callback: js.ThisFunction2[
      /* this */ Statement, 
      /* err */ stdLib.Error | scala.Null, 
      /* row */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_close(event: sqlite3Lib.sqlite3LibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: sqlite3Lib.sqlite3LibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_open(event: sqlite3Lib.sqlite3LibStrings.open, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_profile(
    event: sqlite3Lib.sqlite3LibStrings.profile,
    listener: js.Function2[/* sql */ java.lang.String, /* time */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_trace(
    event: sqlite3Lib.sqlite3LibStrings.trace,
    listener: js.Function1[/* sql */ java.lang.String, scala.Unit]
  ): this.type = js.native
  def parallelize(): scala.Unit = js.native
  def parallelize(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def prepare(sql: java.lang.String): Statement = js.native
  def prepare(
    sql: java.lang.String,
    callback: js.ThisFunction1[/* this */ Statement, /* err */ stdLib.Error | scala.Null, scala.Unit]
  ): Statement = js.native
  def prepare(sql: java.lang.String, params: js.Any*): Statement = js.native
  def prepare(sql: java.lang.String, params: js.Any): Statement = js.native
  def prepare(
    sql: java.lang.String,
    params: js.Any,
    callback: js.ThisFunction1[/* this */ Statement, /* err */ stdLib.Error | scala.Null, scala.Unit]
  ): Statement = js.native
  def run(sql: java.lang.String): this.type = js.native
  def run(
    sql: java.lang.String,
    callback: js.ThisFunction1[/* this */ RunResult, /* err */ stdLib.Error | scala.Null, scala.Unit]
  ): this.type = js.native
  def run(sql: java.lang.String, params: js.Any*): this.type = js.native
  def run(sql: java.lang.String, params: js.Any): this.type = js.native
  def run(
    sql: java.lang.String,
    params: js.Any,
    callback: js.ThisFunction1[/* this */ RunResult, /* err */ stdLib.Error | scala.Null, scala.Unit]
  ): this.type = js.native
  def serialize(): scala.Unit = js.native
  def serialize(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

