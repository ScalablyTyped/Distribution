package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/distinct", JSImport.Namespace)
@js.native
object operatorDistinctMod extends js.Object {
  def distinct[T, K](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[T] = js.native
  def distinct[T, K](`this`: rxjsLib.rxjsMod.Observable[T], keySelector: js.Function1[/* value */ T, K]): rxjsLib.rxjsMod.Observable[T] = js.native
  def distinct[T, K](
    `this`: rxjsLib.rxjsMod.Observable[T],
    keySelector: js.Function1[/* value */ T, K],
    flushes: rxjsLib.rxjsMod.Observable[_]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

