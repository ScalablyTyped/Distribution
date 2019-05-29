package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/fromEventPattern", JSImport.Namespace)
@js.native
object internalObservableFromEventPatternMod extends js.Object {
  def fromEventPattern[T](addHandler: js.Function1[/* handler */ rxjsLib.internalObservableFromEventMod.NodeEventHandler, _]): rxjsLib.internalObservableMod.Observable[T] = js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ rxjsLib.internalObservableFromEventMod.NodeEventHandler, _],
    removeHandler: js.Function2[
      /* handler */ rxjsLib.internalObservableFromEventMod.NodeEventHandler, 
      js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ rxjsLib.internalObservableFromEventMod.NodeEventHandler, _],
    removeHandler: js.Function2[
      /* handler */ rxjsLib.internalObservableFromEventMod.NodeEventHandler, 
      /* signal */ js.UndefOr[js.Any], 
      scala.Unit
    ],
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
}

