package typings.ramda

import typings.ramda.ToolsNs.Append
import typings.ramda.ToolsNs.Cast
import typings.std.Parameters
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CurryNs {
  type CleanedGaps[T /* <: js.Array[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: std.NonNullable<T[K]>}
    */ typings.ramda.ramdaStrings.CleanedGaps with T
  type Curry[F /* <: js.Function1[/* args */ js.Any, _] */] = js.Function1[
    /* args */ Cast[Cast[js.Array[js.Any], Gaps[Parameters[F]]], js.Array[js.Any]], 
    ReturnType[F]
  ]
  type GapOf[T1 /* <: js.Array[_] */, T2 /* <: js.Array[_] */, TN /* <: js.Array[_] */, I /* <: js.Array[_] */] = TN | (Append[
    /* import warning: ImportType.apply Failed type conversion: T2[ramda.Tools.Pos<I>] */ js.Any, 
    TN
  ])
  type Gaps[T /* <: js.Array[_] */] = CleanedGaps[PartialGaps[T]]
  type GapsOf[T1 /* <: js.Array[_] */, T2 /* <: js.Array[_] */, TN /* <: js.Array[_] */, I /* <: js.Array[_] */] = /* import warning: ImportType.apply Failed type conversion: ramda.Anon_01Any<TN, I, T2>[ramda.Tools.Pos<I> extends ramda.Tools.Length<T1> ? 1 : 0] */ js.Any
  type PartialGaps[T /* <: js.Array[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] | ramda.ramda.Placeholder}
    */ typings.ramda.ramdaStrings.PartialGaps with T
}
