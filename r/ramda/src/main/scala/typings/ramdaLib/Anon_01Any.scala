package typings
package ramdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01Any[TN /* <: js.Array[_] */, I /* <: js.Array[_] */, T2 /* <: js.Array[_] */] extends js.Object {
  var `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias ramda.Curry.GapsOf<T1, T2, ramda.Curry.GapOf<T1, T2, TN, I> extends infer G ? ramda.Tools.Cast<G, std.Array<any>> : never, ramda.Tools.Next<I>> */ js.Object
  var `1`: ramdaLib.ToolsNs.Concat[TN, ramdaLib.ToolsNs.Cast[_, js.Array[_]]]
}

object Anon_01Any {
  @scala.inline
  def apply[TN /* <: js.Array[_] */, I /* <: js.Array[_] */, T2 /* <: js.Array[_] */](
    `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias ramda.Curry.GapsOf<T1, T2, ramda.Curry.GapOf<T1, T2, TN, I> extends infer G ? ramda.Tools.Cast<G, std.Array<any>> : never, ramda.Tools.Next<I>> */ js.Object,
    `1`: ramdaLib.ToolsNs.Concat[TN, ramdaLib.ToolsNs.Cast[_, js.Array[_]]]
  ): Anon_01Any[TN, I, T2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`)
    __obj.updateDynamic("1")(`1`)
    __obj.asInstanceOf[Anon_01Any[TN, I, T2]]
  }
}

