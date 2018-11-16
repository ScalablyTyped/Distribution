package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/single", JSImport.Namespace)
@js.native
object operatorSingleMod extends js.Object {
  def single[T](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[T] = js.native
  def single[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* source */ rxjsLib.rxjsMod.Observable[T], 
      scala.Boolean
    ]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

