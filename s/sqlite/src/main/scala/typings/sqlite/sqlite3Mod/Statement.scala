package typings.sqlite.sqlite3Mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqlite3", "Statement")
@js.native
class Statement () extends js.Object {
  def all(): this.type = js.native
  def all(callback: js.Function2[/* err */ Error | Null, /* rows */ js.Array[_], Unit]): this.type = js.native
  def all(params: js.Any*): this.type = js.native
  def all(params: js.Any): this.type = js.native
  def all(
    params: js.Any,
    callback: js.ThisFunction2[/* this */ RunResult, /* err */ Error | Null, /* rows */ js.Array[_], Unit]
  ): this.type = js.native
  def bind(): this.type = js.native
  def bind(callback: js.Function1[/* err */ Error | Null, Unit]): this.type = js.native
  def bind(params: js.Any*): this.type = js.native
  def each(): this.type = js.native
  def each(callback: js.Function2[/* err */ Error | Null, /* row */ js.Any, Unit]): this.type = js.native
  def each(
    callback: js.Function2[/* err */ Error | Null, /* row */ js.Any, Unit],
    complete: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]
  ): this.type = js.native
  def each(params: js.Any*): this.type = js.native
  def each(params: js.Any): this.type = js.native
  def each(
    params: js.Any,
    callback: js.ThisFunction2[/* this */ RunResult, /* err */ Error | Null, /* row */ js.Any, Unit]
  ): this.type = js.native
  def each(
    params: js.Any,
    callback: js.ThisFunction2[/* this */ RunResult, /* err */ Error | Null, /* row */ js.Any, Unit],
    complete: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]
  ): this.type = js.native
  def finalize(callback: js.Function1[/* err */ Error, Unit]): Database = js.native
  def get(): this.type = js.native
  def get(callback: js.Function2[/* err */ Error | Null, /* row */ js.UndefOr[js.Any], Unit]): this.type = js.native
  def get(params: js.Any*): this.type = js.native
  def get(params: js.Any): this.type = js.native
  def get(
    params: js.Any,
    callback: js.ThisFunction2[/* this */ RunResult, /* err */ Error | Null, /* row */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  def reset(): this.type = js.native
  def reset(callback: js.Function1[/* err */ Null, Unit]): this.type = js.native
  def run(): this.type = js.native
  def run(callback: js.Function1[/* err */ Error | Null, Unit]): this.type = js.native
  def run(params: js.Any*): this.type = js.native
  def run(params: js.Any): this.type = js.native
  def run(params: js.Any, callback: js.ThisFunction1[/* this */ RunResult, /* err */ Error | Null, Unit]): this.type = js.native
}

