package typings.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/find", JSImport.Namespace)
@js.native
object operatorFindMod extends js.Object {
  def find[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Any = js.native
  def find[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): js.Any = js.native
  @JSName("find")
  def find_TS_T[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): js.Any = js.native
  @JSName("find")
  def find_TS_T[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: js.Any): js.Any = js.native
}

