package typings.rxjs

import typings.rxjs.fromEventMod.NodeEventHandler
import typings.rxjs.internalObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromEventPatternMod {
  
  @JSImport("rxjs/dist/types/internal/observable/fromEventPattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromEventPattern[T](addHandler: js.Function1[/* handler */ NodeEventHandler, Any]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, Any],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, js.UndefOr[Any], Unit]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, Any],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, /* signal */ js.UndefOr[Any], Unit],
    resultSelector: js.Function1[/* repeated */ Any, T]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, Any],
    removeHandler: Unit,
    resultSelector: js.Function1[/* repeated */ Any, T]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
