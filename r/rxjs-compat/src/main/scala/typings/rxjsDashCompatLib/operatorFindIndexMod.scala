package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/findIndex", JSImport.Namespace)
@js.native
object operatorFindIndexMod extends js.Object {
  def findIndex[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* source */ rxjsLib.rxjsMod.Observable[T], 
      scala.Boolean
    ]
  ): rxjsLib.rxjsMod.Observable[scala.Double] = js.native
  def findIndex[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* source */ rxjsLib.rxjsMod.Observable[T], 
      scala.Boolean
    ],
    thisArg: js.Any
  ): rxjsLib.rxjsMod.Observable[scala.Double] = js.native
}

