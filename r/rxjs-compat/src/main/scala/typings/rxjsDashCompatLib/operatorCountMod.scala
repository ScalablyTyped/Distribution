package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/count", JSImport.Namespace)
@js.native
object operatorCountMod extends js.Object {
  def count[T](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[scala.Double] = js.native
  def count[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* source */ rxjsLib.rxjsMod.Observable[T], 
      scala.Boolean
    ]
  ): rxjsLib.rxjsMod.Observable[scala.Double] = js.native
}

