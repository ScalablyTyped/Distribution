package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/map", JSImport.Namespace)
@js.native
object operatorMapMod extends js.Object {
  def map[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    project: js.Function2[/* value */ T, /* index */ scala.Double, R]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  def map[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    project: js.Function2[/* value */ T, /* index */ scala.Double, R],
    thisArg: js.Any
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

