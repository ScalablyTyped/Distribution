package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/buffer", JSImport.Namespace)
@js.native
object operatorBufferMod extends js.Object {
  def buffer[T](`this`: Observable[T], closingNotifier: Observable[_]): Observable[js.Array[T]] = js.native
}

