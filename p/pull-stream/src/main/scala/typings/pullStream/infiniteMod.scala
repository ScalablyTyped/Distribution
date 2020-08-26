package typings.pullStream

import typings.pullStream.mod.Source
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sources/infinite", JSImport.Namespace)
@js.native
object infiniteMod extends js.Object {
  /**
    * Create an unending stream by repeatedly calling a generator function (by default, `Math.random`).
    */
  def apply[T](): Source[T] = js.native
  def apply[T](generator: js.UndefOr[scala.Nothing], onAbort: js.Function1[/* err */ js.UndefOr[Error | Null], _]): Source[T] = js.native
  def apply[T](generator: js.Function0[T]): Source[T] = js.native
  def apply[T](generator: js.Function0[T], onAbort: js.Function1[/* err */ js.UndefOr[Error | Null], _]): Source[T] = js.native
}

