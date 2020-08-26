package typings.pullStream

import typings.pullStream.mod.Source
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sources/values", JSImport.Namespace)
@js.native
object valuesMod extends js.Object {
  /**
    * Create a SourceStream that reads the values from an array or object and then stops.
    */
  def apply[T](): Source[T] = js.native
  def apply[T](
    arrayOrObject: js.UndefOr[scala.Nothing],
    onAbort: js.Function1[/* err */ js.UndefOr[Error | Null], _]
  ): Source[T] = js.native
  def apply[T](arrayOrObject: js.Array[T]): Source[T] = js.native
  def apply[T](arrayOrObject: js.Array[T], onAbort: js.Function1[/* err */ js.UndefOr[Error | Null], _]): Source[T] = js.native
  def apply[T](arrayOrObject: Record[_, T]): Source[T] = js.native
  def apply[T](arrayOrObject: Record[_, T], onAbort: js.Function1[/* err */ js.UndefOr[Error | Null], _]): Source[T] = js.native
}

