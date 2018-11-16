package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/partition", JSImport.Namespace)
@js.native
object operatorPartitionMod extends js.Object {
  def partition[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): js.Tuple2[rxjsLib.rxjsMod.Observable[T], rxjsLib.rxjsMod.Observable[T]] = js.native
  def partition[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    thisArg: js.Any
  ): js.Tuple2[rxjsLib.rxjsMod.Observable[T], rxjsLib.rxjsMod.Observable[T]] = js.native
}

