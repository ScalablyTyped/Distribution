package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/groupBy", JSImport.Namespace)
@js.native
object operatorGroupByMod extends js.Object {
  def groupBy[T, K](`this`: rxjsLib.rxjsMod.Observable[T], keySelector: js.Function1[/* value */ T, K]): rxjsLib.rxjsMod.Observable[_] = js.native
  def groupBy[T, K](
    `this`: rxjsLib.rxjsMod.Observable[T],
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: scala.Unit,
    durationSelector: js.Function1[/* grouped */ js.Any, rxjsLib.rxjsMod.Observable[_]]
  ): rxjsLib.rxjsMod.Observable[_] = js.native
  def groupBy[T, K, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R]
  ): rxjsLib.rxjsMod.Observable[_] = js.native
  def groupBy[T, K, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[/* grouped */ js.Any, rxjsLib.rxjsMod.Observable[_]]
  ): rxjsLib.rxjsMod.Observable[_] = js.native
  def groupBy[T, K, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[/* grouped */ js.Any, rxjsLib.rxjsMod.Observable[_]],
    subjectSelector: js.Function0[rxjsLib.rxjsMod.Subject[R]]
  ): rxjsLib.rxjsMod.Observable[_] = js.native
  @JSName("groupBy")
  def groupBy_TKR[T, K, R](`this`: rxjsLib.rxjsMod.Observable[T], keySelector: js.Function1[/* value */ T, K]): rxjsLib.rxjsMod.Observable[_] = js.native
}

