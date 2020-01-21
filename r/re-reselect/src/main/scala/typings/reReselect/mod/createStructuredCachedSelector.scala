package typings.reReselect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("re-reselect", "createStructuredCachedSelector")
@js.native
object createStructuredCachedSelector extends js.Object {
  def apply[S, T](
    selectors: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: re-reselect.re-reselect.Selector<S, T[K]>}
    */ typings.reReselect.reReselectStrings.createStructuredCachedSelector with T
  ): OutputCachedSelector[S, T, js.Function1[/* repeated */ Values[T], T], js.Array[Selector[S, Values[T]]]] = js.native
}

