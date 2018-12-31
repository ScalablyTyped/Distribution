package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rethinkdb", "Cursor")
@js.native
class Cursor () extends js.Object {
  def close(): js.Promise[scala.Unit] = js.native
  def close(cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def each(cb: js.Function2[/* err */ nodeLib.Error, /* row */ js.Any, scala.Boolean | scala.Unit]): scala.Unit = js.native
  def each(
    cb: js.Function2[/* err */ nodeLib.Error, /* row */ js.Any, scala.Boolean | scala.Unit],
    done: js.Function0[scala.Unit]
  ): scala.Unit = js.native
   // returning false stops iteration
  @JSName("each")
  def each_T[T](cb: js.Function2[/* err */ nodeLib.Error, /* row */ T, scala.Boolean | scala.Unit]): scala.Unit = js.native
  @JSName("each")
  def each_T[T](
    cb: js.Function2[/* err */ nodeLib.Error, /* row */ T, scala.Boolean | scala.Unit],
    done: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def hasNext(): scala.Boolean = js.native
   // returning false stops iteration
  def next(cb: js.Function2[/* err */ nodeLib.Error, /* row */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("next")
  def next_T[T](cb: js.Function2[/* err */ nodeLib.Error, /* row */ T, scala.Unit]): scala.Unit = js.native
  def toArray(): js.Promise[js.Array[_]] = js.native
  def toArray(cb: js.Function2[/* err */ nodeLib.Error, /* rows */ js.Array[_], scala.Unit]): scala.Unit = js.native
  @JSName("toArray")
  def toArray_T[T](): js.Promise[js.Array[T]] = js.native
  @JSName("toArray")
  def toArray_T[T](cb: js.Function2[/* err */ nodeLib.Error, /* rows */ js.Array[T], scala.Unit]): scala.Unit = js.native
}

