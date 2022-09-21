package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindNodeCallbackMod {
  
  @JSImport("rxjs/dist/types/internal/observable/bindNodeCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindNodeCallback(
    callbackFunc: js.Function1[/* repeated */ Any, Unit],
    resultSelector: js.Function1[/* repeated */ Any, Any]
  ): js.Function1[/* repeated */ Any, Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable[Any]]]
  inline def bindNodeCallback(
    callbackFunc: js.Function1[/* repeated */ Any, Unit],
    resultSelector: js.Function1[/* repeated */ Any, Any],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ Any, Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable[Any]]]
  inline def bindNodeCallback[A /* <: js.Array[Any] */, R /* <: js.Array[Any] */](
    callbackFunc: js.Function1[
      /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
      Unit
    ]
  ): js.Function1[
    /* arg */ A, 
    Observable[
      R | (/* import warning: importer.ImportType#apply Failed type conversion: R[0] */ js.Any) | Unit
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* arg */ A, 
    Observable[
      R | (/* import warning: importer.ImportType#apply Failed type conversion: R[0] */ js.Any) | Unit
    ]
  ]]
  inline def bindNodeCallback[A /* <: js.Array[Any] */, R /* <: js.Array[Any] */](
    callbackFunc: js.Function1[
      /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
      Unit
    ],
    schedulerLike: SchedulerLike
  ): js.Function1[
    /* arg */ A, 
    Observable[
      R | (/* import warning: importer.ImportType#apply Failed type conversion: R[0] */ js.Any) | Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], schedulerLike.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* arg */ A, 
    Observable[
      R | (/* import warning: importer.ImportType#apply Failed type conversion: R[0] */ js.Any) | Unit
    ]
  ]]
}
