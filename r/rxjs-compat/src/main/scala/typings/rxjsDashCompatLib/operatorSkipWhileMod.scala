package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/skipWhile", JSImport.Namespace)
@js.native
object operatorSkipWhileMod extends js.Object {
  def skipWhile[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

