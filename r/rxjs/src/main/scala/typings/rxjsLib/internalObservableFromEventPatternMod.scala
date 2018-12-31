package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/fromEventPattern", JSImport.Namespace)
@js.native
object internalObservableFromEventPatternMod extends js.Object {
  def fromEventPattern[T](addHandler: js.Function1[/* handler */ js.Function, _]): rxjsLib.internalObservableMod.Observable[T] = js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ js.Function, _],
    removeHandler: js.Function2[/* handler */ js.Function, /* signal */ js.UndefOr[js.Any], scala.Unit]
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ js.Function, _],
    removeHandler: js.Function2[/* handler */ js.Function, /* signal */ js.UndefOr[js.Any], scala.Unit],
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
}

