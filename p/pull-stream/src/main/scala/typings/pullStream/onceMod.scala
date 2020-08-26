package typings.pullStream

import typings.pullStream.mod.Source
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sources/once", JSImport.Namespace)
@js.native
object onceMod extends js.Object {
  /**
    * Create a stream with a single value.
    */
  def apply[T](): Source[T] = js.native
  def apply[T](value: T): Source[T] = js.native
  def apply[T](value: T, onAbort: js.Function1[/* err */ js.UndefOr[Error | Null], _]): Source[T] = js.native
  def apply[T](value: js.UndefOr[scala.Nothing], onAbort: js.Function1[/* err */ js.UndefOr[Error | Null], _]): Source[T] = js.native
}

