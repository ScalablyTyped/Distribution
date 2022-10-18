package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalObservableBindCallbackInternalsMod {
  
  @JSImport("rxjs/dist/types/internal/observable/bindCallbackInternals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindCallbackInternals(isNodeStyle: Boolean, callbackFunc: Any): js.Function1[/* repeated */ Any, Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallbackInternals")(isNodeStyle.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable[Any]]]
  inline def bindCallbackInternals(isNodeStyle: Boolean, callbackFunc: Any, resultSelector: Any): js.Function1[/* repeated */ Any, Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallbackInternals")(isNodeStyle.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable[Any]]]
  inline def bindCallbackInternals(isNodeStyle: Boolean, callbackFunc: Any, resultSelector: Any, scheduler: SchedulerLike): js.Function1[/* repeated */ Any, Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallbackInternals")(isNodeStyle.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable[Any]]]
  inline def bindCallbackInternals(isNodeStyle: Boolean, callbackFunc: Any, resultSelector: Unit, scheduler: SchedulerLike): js.Function1[/* repeated */ Any, Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallbackInternals")(isNodeStyle.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable[Any]]]
}
