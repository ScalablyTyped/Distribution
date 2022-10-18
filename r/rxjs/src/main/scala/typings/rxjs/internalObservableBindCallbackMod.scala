package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalObservableBindCallbackMod {
  
  @JSImport("rxjs/internal/observable/bindCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindCallback(
    callbackFunc: js.Function1[/* repeated */ Any, Unit],
    resultSelector: js.Function1[/* repeated */ Any, Any]
  ): js.Function1[/* repeated */ Any, Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable[Any]]]
  inline def bindCallback(
    callbackFunc: js.Function1[/* repeated */ Any, Unit],
    resultSelector: js.Function1[/* repeated */ Any, Any],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ Any, Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable[Any]]]
  inline def bindCallback[A /* <: js.Array[Any] */, R /* <: js.Array[Any] */](
    callbackFunc: js.Function1[
      /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
      Unit
    ]
  ): js.Function1[
    /* arg */ A, 
    Observable[
      /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* arg */ A, 
    Observable[
      /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
    ]
  ]]
  inline def bindCallback[A /* <: js.Array[Any] */, R /* <: js.Array[Any] */](
    callbackFunc: js.Function1[
      /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
      Unit
    ],
    schedulerLike: SchedulerLike
  ): js.Function1[
    /* arg */ A, 
    Observable[
      /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], schedulerLike.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* arg */ A, 
    Observable[
      /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
    ]
  ]]
}
