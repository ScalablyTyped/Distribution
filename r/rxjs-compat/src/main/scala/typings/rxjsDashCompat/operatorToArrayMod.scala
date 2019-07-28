package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/toArray", JSImport.Namespace)
@js.native
object operatorToArrayMod extends js.Object {
  def toArray[T](`this`: Observable[T]): Observable[js.Array[T]] = js.native
}

