package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/distinctUntilChanged", JSImport.Namespace)
@js.native
object operatorDistinctUntilChangedMod extends js.Object {
  def distinctUntilChanged[T](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[T] = js.native
  def distinctUntilChanged[T](`this`: rxjsLib.rxjsMod.Observable[T], compare: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): rxjsLib.rxjsMod.Observable[T] = js.native
  def distinctUntilChanged[T, K](
    `this`: rxjsLib.rxjsMod.Observable[T],
    compare: js.Function2[/* x */ K, /* y */ K, scala.Boolean],
    keySelector: js.Function1[/* x */ T, K]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

