package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/util/pipe", JSImport.Namespace)
@js.native
object internalUtilPipeMod extends js.Object {
  def pipe[T](): rxjsLib.internalTypesMod.UnaryFunction[T, T] = js.native
  def pipe[T, A](fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A]): rxjsLib.internalTypesMod.UnaryFunction[T, A] = js.native
  def pipe[T, A, B](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, B] = js.native
  def pipe[T, A, B, C](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, C] = js.native
  def pipe[T, A, B, C, D](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, D] = js.native
  def pipe[T, A, B, C, D, E](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, E] = js.native
  def pipe[T, A, B, C, D, E, F](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E],
    fn6: rxjsLib.internalTypesMod.UnaryFunction[E, F]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, F] = js.native
  def pipe[T, A, B, C, D, E, F, G](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E],
    fn6: rxjsLib.internalTypesMod.UnaryFunction[E, F],
    fn7: rxjsLib.internalTypesMod.UnaryFunction[F, G]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, G] = js.native
  def pipe[T, A, B, C, D, E, F, G, H](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E],
    fn6: rxjsLib.internalTypesMod.UnaryFunction[E, F],
    fn7: rxjsLib.internalTypesMod.UnaryFunction[F, G],
    fn8: rxjsLib.internalTypesMod.UnaryFunction[G, H]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, H] = js.native
  def pipe[T, A, B, C, D, E, F, G, H, I](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E],
    fn6: rxjsLib.internalTypesMod.UnaryFunction[E, F],
    fn7: rxjsLib.internalTypesMod.UnaryFunction[F, G],
    fn8: rxjsLib.internalTypesMod.UnaryFunction[G, H],
    fn9: rxjsLib.internalTypesMod.UnaryFunction[H, I]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, I] = js.native
  def pipe[T, A, B, C, D, E, F, G, H, I](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E],
    fn6: rxjsLib.internalTypesMod.UnaryFunction[E, F],
    fn7: rxjsLib.internalTypesMod.UnaryFunction[F, G],
    fn8: rxjsLib.internalTypesMod.UnaryFunction[G, H],
    fn9: rxjsLib.internalTypesMod.UnaryFunction[H, I],
    fns: (rxjsLib.internalTypesMod.UnaryFunction[_, _])*
  ): rxjsLib.internalTypesMod.UnaryFunction[T, js.Object] = js.native
  def pipeFromArray[T, R](fns: js.Array[rxjsLib.internalTypesMod.UnaryFunction[T, R]]): rxjsLib.internalTypesMod.UnaryFunction[T, R] = js.native
}

