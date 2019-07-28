package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01[T /* <: js.Array[_] */] extends js.Object {
  var `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias ramda.Tools.Drop<N, ramda.Tools.Tail<T>, ramda.Tools.Prepend<any, I>> */ js.Object
  var `1`: T
}

object Anon_01 {
  @scala.inline
  def apply[T /* <: js.Array[_] */](
    `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias ramda.Tools.Drop<N, ramda.Tools.Tail<T>, ramda.Tools.Prepend<any, I>> */ js.Object,
    `1`: T
  ): Anon_01[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`)
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_01[T]]
  }
}

