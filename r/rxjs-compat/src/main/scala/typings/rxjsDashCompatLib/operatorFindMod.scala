package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/find", JSImport.Namespace)
@js.native
object operatorFindMod extends js.Object {
  def find[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): rxjsLib.rxjsMod.Observable[js.UndefOr[T]] = js.native
  def find[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    thisArg: js.Any
  ): rxjsLib.rxjsMod.Observable[js.UndefOr[T]] = js.native
  @JSName("find")
  def find_TST[T, S /* <: T */](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, /* is S */scala.Boolean]
  ): rxjsLib.rxjsMod.Observable[js.UndefOr[S]] = js.native
  @JSName("find")
  def find_TST[T, S /* <: T */](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, /* is S */scala.Boolean],
    thisArg: js.Any
  ): rxjsLib.rxjsMod.Observable[js.UndefOr[S]] = js.native
}

