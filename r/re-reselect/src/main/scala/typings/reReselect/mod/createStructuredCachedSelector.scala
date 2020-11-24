package typings.reReselect.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("re-reselect", "createStructuredCachedSelector")
@js.native
object createStructuredCachedSelector extends js.Object {
  
  def apply[T /* <: StringDictionary[js.Function1[/* state */ js.Any, _]] */, S, R](selectors: T): OutputCachedSelector[S, R, js.Function1[/* repeated */ Values[R], R], js.Array[Selector[S, Values[R]]]] = js.native
}
