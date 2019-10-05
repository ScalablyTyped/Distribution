package typings.pullDashStream

import typings.pullDashStream.pullDashStreamMod.Sink
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sinks/find", JSImport.Namespace)
@js.native
object sinksFindMod extends js.Object {
  def apply[T](): Sink[T] = js.native
  def apply[T](cb: js.Function2[/* err */ Error | Null, /* results */ js.Array[T], _]): Sink[T] = js.native
  def apply[T](test: String): Sink[T] = js.native
  def apply[T](test: String, cb: js.Function2[/* err */ Error | Null, /* result */ T, _]): Sink[T] = js.native
  def apply[T](test: js.Function1[/* data */ T, Boolean]): Sink[T] = js.native
  def apply[T](
    test: js.Function1[/* data */ T, Boolean],
    cb: js.Function2[/* err */ Error | Null, /* result */ T, _]
  ): Sink[T] = js.native
}

