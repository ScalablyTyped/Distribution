package typings
package ramdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ToolsNs {
  type Append[E, T /* <: js.Array[_] */] = Concat[T, js.Array[E]]
  type Cast[X, Y] = Y | X
  type Concat[T1 /* <: js.Array[_] */, T2 /* <: js.Array[_] */] = Reverse[Cast[js.Any, js.Array[js.Any]], T2, js.Array[js.Any]]
  type Drop[N /* <: scala.Double */, T /* <: js.Array[_] */, I /* <: js.Array[_] */] = /* import warning: ImportType.apply Failed type conversion: ramda.Anon_01<T>[0 | 1] */ js.Any
  type Head[T /* <: js.Array[_] */] = /* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any
  type Iterator[Index /* <: scala.Double */, From /* <: js.Array[_] */, I /* <: js.Array[_] */] = /* import warning: ImportType.apply Failed type conversion: ramda.Anon_01From<From>[0 | 1] */ js.Any
  type Last[T /* <: js.Array[_] */] = /* import warning: ImportType.apply Failed type conversion: ramda.Anon_0<T>[1 | 0] */ js.Any
  type Length[T /* <: js.Array[_] */] = /* import warning: ImportType.apply Failed type conversion: T['length'] */ js.Any
  type Next[I /* <: js.Array[_] */] = Prepend[js.Any, I]
  type Pos[I /* <: js.Array[_] */] = Length[I]
  type Prepend[E, T /* <: js.Array[_] */] = T
  type Prev[I /* <: js.Array[_] */] = Tail[I]
  type Reverse[T /* <: js.Array[_] */, R /* <: js.Array[_] */, I /* <: js.Array[_] */] = /* import warning: ImportType.apply Failed type conversion: ramda.Anon_01Object<R>[0 | 1] */ js.Any
  type Tail[T /* <: js.Array[_] */] = js.Array[js.Any]
}
