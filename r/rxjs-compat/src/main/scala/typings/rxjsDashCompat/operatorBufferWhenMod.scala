package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/bufferWhen", JSImport.Namespace)
@js.native
object operatorBufferWhenMod extends js.Object {
  def bufferWhen[T](`this`: Observable[T], closingSelector: js.Function0[Observable[_]]): Observable[js.Array[T]] = js.native
}

