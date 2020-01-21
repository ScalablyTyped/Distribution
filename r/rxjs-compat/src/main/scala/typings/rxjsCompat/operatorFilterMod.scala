package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/filter", JSImport.Namespace)
@js.native
object operatorFilterMod extends js.Object {
  def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Any = js.native
  def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): js.Any = js.native
  @JSName("filter")
  def filter_TS_T[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): js.Any = js.native
  @JSName("filter")
  def filter_TS_T[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: js.Any): js.Any = js.native
}

