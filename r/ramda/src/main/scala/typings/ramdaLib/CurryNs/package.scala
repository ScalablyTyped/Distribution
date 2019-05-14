package typings
package ramdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CurryNs {
  type CleanedGaps[T /* <: js.Array[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: std.NonNullable<T[K]>}
    */ ramdaLib.ramdaLibStrings.CleanedGaps with T
  type Curry[F /* <: js.Function1[/* args */ js.Any, _] */] = js.Function1[
    /* args */ ramdaLib.ToolsNs.Cast[
      ramdaLib.ToolsNs.Cast[js.Array[js.Any], Gaps[stdLib.Parameters[F]]], 
      js.Array[js.Any]
    ], 
    stdLib.ReturnType[F]
  ]
  type GapOf[T1 /* <: js.Array[_] */, T2 /* <: js.Array[_] */, TN /* <: js.Array[_] */, I /* <: js.Array[_] */] = TN | (ramdaLib.ToolsNs.Append[
    /* import warning: ImportType.apply Failed type conversion: T2[ramda.Tools.Pos<I>] */ js.Any, 
    TN
  ])
  type Gaps[T /* <: js.Array[_] */] = CleanedGaps[PartialGaps[T]]
  type GapsOf[T1 /* <: js.Array[_] */, T2 /* <: js.Array[_] */, TN /* <: js.Array[_] */, I /* <: js.Array[_] */] = /* import warning: ImportType.apply Failed type conversion: ramda.Anon_01Any<TN, I, T2>[ramda.Tools.Pos<I> extends ramda.Tools.Length<T1> ? 1 : 0] */ js.Any
  type PartialGaps[T /* <: js.Array[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] | ramda.ramda.Placeholder}
    */ ramdaLib.ramdaLibStrings.PartialGaps with T
}
