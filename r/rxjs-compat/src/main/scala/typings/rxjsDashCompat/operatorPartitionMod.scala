package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/partition", JSImport.Namespace)
@js.native
object operatorPartitionMod extends js.Object {
  def partition[T](`this`: Observable[T], predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Tuple2[Observable[T], Observable[T]] = js.native
  def partition[T](
    `this`: Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ Double, Boolean],
    thisArg: js.Any
  ): js.Tuple2[Observable[T], Observable[T]] = js.native
}

