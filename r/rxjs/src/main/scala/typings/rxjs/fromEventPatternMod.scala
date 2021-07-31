package typings.rxjs

import typings.rxjs.fromEventMod.NodeEventHandler
import typings.rxjs.internalObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromEventPatternMod {
  
  @JSImport("rxjs/internal/observable/fromEventPattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromEventPattern[T](addHandler: js.Function1[/* handler */ NodeEventHandler, js.Any]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  @scala.inline
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, js.Any],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, js.UndefOr[js.Any], Unit]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  @scala.inline
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, js.Any],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, /* signal */ js.UndefOr[js.Any], Unit],
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  @scala.inline
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, js.Any],
    removeHandler: Unit,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
