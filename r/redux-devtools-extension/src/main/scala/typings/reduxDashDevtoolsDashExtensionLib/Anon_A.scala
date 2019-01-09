package typings
package reduxDashDevtoolsDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_A extends js.Object {
  def apply(): js.Function1[/* a */ js.Any, _] = js.native
  def apply[R](f1: js.Function1[/* b */ js.Any, R], funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
  def apply[F /* <: js.Function */](f: F): F = js.native
  def apply[R](funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
  def apply[A, R](f1: js.Function1[/* b */ A, R], f2: reduxLib.Func0[A]): reduxLib.Func0[R] = js.native
  def apply[A, B, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: reduxLib.Func0[A]): reduxLib.Func0[R] = js.native
  def apply[A, T1, R](f1: js.Function1[/* b */ A, R], f2: reduxLib.Func1[T1, A]): reduxLib.Func1[T1, R] = js.native
  def apply[A, B, C, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: reduxLib.Func0[A]
  ): reduxLib.Func0[R] = js.native
  def apply[A, B, T1, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: reduxLib.Func1[T1, A]): reduxLib.Func1[T1, R] = js.native
  def apply[A, T1, T2, R](f1: js.Function1[/* b */ A, R], f2: reduxLib.Func2[T1, T2, A]): reduxLib.Func2[T1, T2, R] = js.native
  def apply[A, B, C, T1, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: reduxLib.Func1[T1, A]
  ): reduxLib.Func1[T1, R] = js.native
  def apply[A, B, T1, T2, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: reduxLib.Func2[T1, T2, A]): reduxLib.Func2[T1, T2, R] = js.native
  def apply[A, T1, T2, T3, R](f1: js.Function1[/* b */ A, R], f2: reduxLib.Func3[T1, T2, T3, A]): reduxLib.Func3[T1, T2, T3, R] = js.native
  def apply[A, B, C, T1, T2, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: reduxLib.Func2[T1, T2, A]
  ): reduxLib.Func2[T1, T2, R] = js.native
  def apply[A, B, T1, T2, T3, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: reduxLib.Func3[T1, T2, T3, A]): reduxLib.Func3[T1, T2, T3, R] = js.native
  def apply[A, B, C, T1, T2, T3, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: reduxLib.Func3[T1, T2, T3, A]
  ): reduxLib.Func3[T1, T2, T3, R] = js.native
}

