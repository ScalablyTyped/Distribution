package typings.rxjs

import typings.rxjs.fromEventMod.NodeEventHandler
import typings.rxjs.internalObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromEventPatternMod {
  
  @JSImport("rxjs/internal/observable/fromEventPattern", "fromEventPattern")
  @js.native
  def fromEventPattern[T](addHandler: js.Function1[/* handler */ NodeEventHandler, _]): Observable[T] = js.native
  @JSImport("rxjs/internal/observable/fromEventPattern", "fromEventPattern")
  @js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, _],
    removeHandler: js.UndefOr[scala.Nothing],
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
  @JSImport("rxjs/internal/observable/fromEventPattern", "fromEventPattern")
  @js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, _],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, js.UndefOr[js.Any], Unit]
  ): Observable[T] = js.native
  @JSImport("rxjs/internal/observable/fromEventPattern", "fromEventPattern")
  @js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, _],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, /* signal */ js.UndefOr[js.Any], Unit],
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
}
