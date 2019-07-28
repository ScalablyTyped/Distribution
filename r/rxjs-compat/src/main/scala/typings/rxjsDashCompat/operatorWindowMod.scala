package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/window", JSImport.Namespace)
@js.native
object operatorWindowMod extends js.Object {
  def window[T](`this`: Observable[T], windowBoundaries: Observable[_]): Observable[Observable[T]] = js.native
}

