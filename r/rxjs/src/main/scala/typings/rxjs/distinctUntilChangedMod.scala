package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/distinctUntilChanged", JSImport.Namespace)
@js.native
object distinctUntilChangedMod extends js.Object {
  def distinctUntilChanged[T](): MonoTypeOperatorFunction[T] = js.native
  def distinctUntilChanged[T](compare: js.Function2[/* x */ T, /* y */ T, Boolean]): MonoTypeOperatorFunction[T] = js.native
  def distinctUntilChanged[T, K](compare: js.Function2[/* x */ K, /* y */ K, Boolean], keySelector: js.Function1[/* x */ T, K]): MonoTypeOperatorFunction[T] = js.native
}

