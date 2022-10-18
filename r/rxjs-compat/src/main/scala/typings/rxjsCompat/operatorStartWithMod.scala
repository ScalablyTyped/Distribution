package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorStartWithMod {
  
  @JSImport("rxjs-compat/operator/startWith", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def startWith[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")().asInstanceOf[Observable_[T]]
  inline def startWith[T](scheduler: SchedulerLike): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def startWith[T, D](array: (D | SchedulerLike)*): Observable_[T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(array.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Observable_[T | D]]
  inline def startWith[T, D](v1: D): Observable_[T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any]).asInstanceOf[Observable_[T | D]]
  inline def startWith[T, D](v1: D, scheduler: SchedulerLike): Observable_[T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D]]
  inline def startWith[T, D, E](v1: D, v2: E): Observable_[T | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D | E]]
  inline def startWith[T, D, E](v1: D, v2: E, scheduler: SchedulerLike): Observable_[T | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D | E]]
  inline def startWith[T, D, E, F](v1: D, v2: E, v3: F): Observable_[T | D | E | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D | E | F]]
  inline def startWith[T, D, E, F](v1: D, v2: E, v3: F, scheduler: SchedulerLike): Observable_[T | D | E | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D | E | F]]
  inline def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G): Observable_[T | D | E | F | G] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D | E | F | G]]
  inline def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G, scheduler: SchedulerLike): Observable_[T | D | E | F | G] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D | E | F | G]]
  inline def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H): Observable_[T | D | E | F | G | H] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D | E | F | G | H]]
  inline def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H, scheduler: SchedulerLike): Observable_[T | D | E | F | G | H] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D | E | F | G | H]]
  inline def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I): Observable_[T | D | E | F | G | H | I] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D | E | F | G | H | I]]
  inline def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I, scheduler: SchedulerLike): Observable_[T | D | E | F | G | H | I] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D | E | F | G | H | I]]
}
