package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/let", JSImport.Namespace)
@js.native
object operatorLetMod extends js.Object {
  def letProto[T, R](`this`: Observable[T], func: js.Function1[/* selector */ Observable[T], Observable[R]]): Observable[R] = js.native
}

