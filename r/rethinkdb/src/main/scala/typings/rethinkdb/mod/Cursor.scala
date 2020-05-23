package typings.rethinkdb.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rethinkdb", "Cursor")
@js.native
class Cursor () extends js.Object {
  def close(): js.Promise[Unit] = js.native
  def close(cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def each(cb: js.Function2[/* err */ Error, /* row */ js.Any, Boolean | Unit]): Unit = js.native
  def each(cb: js.Function2[/* err */ Error, /* row */ js.Any, Boolean | Unit], done: js.Function0[Unit]): Unit = js.native
   // returning false stops iteration
  @JSName("each")
  def each_T[T](cb: js.Function2[/* err */ Error, /* row */ T, Boolean | Unit]): Unit = js.native
  @JSName("each")
  def each_T[T](cb: js.Function2[/* err */ Error, /* row */ T, Boolean | Unit], done: js.Function0[Unit]): Unit = js.native
  def hasNext(): Boolean = js.native
   // returning false stops iteration
  def next(cb: js.Function2[/* err */ Error, /* row */ js.Any, Unit]): Unit = js.native
  @JSName("next")
  def next_T[T](cb: js.Function2[/* err */ Error, /* row */ T, Unit]): Unit = js.native
  def toArray(): js.Promise[js.Array[_]] = js.native
  def toArray(cb: js.Function2[/* err */ Error, /* rows */ js.Array[_], Unit]): Unit = js.native
  @JSName("toArray")
  def toArray_T[T](): js.Promise[js.Array[T]] = js.native
  @JSName("toArray")
  def toArray_T[T](cb: js.Function2[/* err */ Error, /* rows */ js.Array[T], Unit]): Unit = js.native
}

