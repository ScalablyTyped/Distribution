package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalObservablePairsMod {
  
  @JSImport("rxjs/internal/observable/pairs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pairs(n: js.BigInt): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: js.BigInt, scheduler: SchedulerLike): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: js.Function1[/* repeated */ Any, Any]): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: js.Function1[/* repeated */ Any, Any], scheduler: SchedulerLike): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: js.Symbol): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: js.Symbol, scheduler: SchedulerLike): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: Boolean): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: Boolean, scheduler: SchedulerLike): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: Double): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs(n: Double, scheduler: SchedulerLike): Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
  inline def pairs[T](arr: js.Array[T]): Observable[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(arr.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[String, T]]]
  inline def pairs[T](arr: js.Array[T], scheduler: SchedulerLike): Observable[js.Tuple2[String, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(arr.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[String, T]]]
  inline def pairs[T](iterable: js.Iterable[T]): Observable[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(iterable.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[String, T]]]
  inline def pairs[T](iterable: js.Iterable[T], scheduler: SchedulerLike): Observable[js.Tuple2[String, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(iterable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[String, T]]]
  inline def pairs[O /* <: Record[String, Any] */](obj: O): Observable[
    js.Tuple2[
      /* keyof O */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any]).asInstanceOf[Observable[
    js.Tuple2[
      /* keyof O */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
    ]
  ]]
  inline def pairs[O /* <: Record[String, Any] */](obj: O, scheduler: SchedulerLike): Observable[
    js.Tuple2[
      /* keyof O */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple2[
      /* keyof O */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
    ]
  ]]
}
