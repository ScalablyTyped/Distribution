package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/filter", JSImport.Namespace)
@js.native
object operatorFilterMod extends js.Object {
  def filter[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def filter[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    thisArg: js.Any
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  @JSName("filter")
  def filter_TST[T, S /* <: T */](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, /* is S */scala.Boolean]
  ): rxjsLib.rxjsMod.Observable[S] = js.native
  @JSName("filter")
  def filter_TST[T, S /* <: T */](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, /* is S */scala.Boolean],
    thisArg: js.Any
  ): rxjsLib.rxjsMod.Observable[S] = js.native
}

