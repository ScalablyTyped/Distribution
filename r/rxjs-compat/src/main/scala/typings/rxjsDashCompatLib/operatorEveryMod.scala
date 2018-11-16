package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/every", JSImport.Namespace)
@js.native
object operatorEveryMod extends js.Object {
  def every[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* source */ rxjsLib.rxjsMod.Observable[T], 
      scala.Boolean
    ]
  ): rxjsLib.rxjsMod.Observable[scala.Boolean] = js.native
  def every[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* source */ rxjsLib.rxjsMod.Observable[T], 
      scala.Boolean
    ],
    thisArg: js.Any
  ): rxjsLib.rxjsMod.Observable[scala.Boolean] = js.native
}

