package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/takeWhile", JSImport.Namespace)
@js.native
object operatorTakeWhileMod extends js.Object {
  def takeWhile[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

