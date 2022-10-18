package typings.rxjs

import typings.rxjs.anon.FnCall
import typings.rxjs.distTypesInternalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalUtilPipeMod {
  
  @JSImport("rxjs/internal/util/pipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pipe(): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")().asInstanceOf[FnCall]
  inline def pipe[T, A](fn1: UnaryFunction[T, A]): UnaryFunction[T, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[T, A]]
  inline def pipe[T, A, B](fn1: UnaryFunction[T, A], fn2: UnaryFunction[A, B]): UnaryFunction[T, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, B]]
  inline def pipe[T, A, B, C](fn1: UnaryFunction[T, A], fn2: UnaryFunction[A, B], fn3: UnaryFunction[B, C]): UnaryFunction[T, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, C]]
  inline def pipe[T, A, B, C, D](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D]
  ): UnaryFunction[T, D] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, D]]
  inline def pipe[T, A, B, C, D, E](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E]
  ): UnaryFunction[T, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, E]]
  inline def pipe[T, A, B, C, D, E, F](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F]
  ): UnaryFunction[T, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any], fn6.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, F]]
  inline def pipe[T, A, B, C, D, E, F, G](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G]
  ): UnaryFunction[T, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any], fn6.asInstanceOf[js.Any], fn7.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, G]]
  inline def pipe[T, A, B, C, D, E, F, G, H](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G],
    fn8: UnaryFunction[G, H]
  ): UnaryFunction[T, H] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any], fn6.asInstanceOf[js.Any], fn7.asInstanceOf[js.Any], fn8.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, H]]
  inline def pipe[T, A, B, C, D, E, F, G, H, I](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G],
    fn8: UnaryFunction[G, H],
    fn9: UnaryFunction[H, I]
  ): UnaryFunction[T, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any], fn6.asInstanceOf[js.Any], fn7.asInstanceOf[js.Any], fn8.asInstanceOf[js.Any], fn9.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[T, I]]
  inline def pipe[T, A, B, C, D, E, F, G, H, I](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G],
    fn8: UnaryFunction[G, H],
    fn9: UnaryFunction[H, I],
    fns: (UnaryFunction[Any, Any])*
  ): UnaryFunction[T, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")((scala.List(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], fn3.asInstanceOf[js.Any], fn4.asInstanceOf[js.Any], fn5.asInstanceOf[js.Any], fn6.asInstanceOf[js.Any], fn7.asInstanceOf[js.Any], fn8.asInstanceOf[js.Any], fn9.asInstanceOf[js.Any])).`++`(fns.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[UnaryFunction[T, Any]]
}
