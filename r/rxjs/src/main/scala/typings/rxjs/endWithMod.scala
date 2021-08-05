package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endWithMod {
  
  @JSImport("rxjs/internal/operators/endWith", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def endWith[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def endWith[T, Z](array: (SchedulerLike | Z)*): OperatorFunction[T, T | Z] = ^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(array.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | Z]]
  inline def endWith[T, A](v1: A): OperatorFunction[T, T | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(v1.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | A]]
  inline def endWith[T, A](v1: A, scheduler: SchedulerLike): OperatorFunction[T, T | A] = (^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(v1.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | A]]
  inline def endWith[T, A, B](v1: A, v2: B): OperatorFunction[T, T | A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | A | B]]
  inline def endWith[T, A, B](v1: A, v2: B, scheduler: SchedulerLike): OperatorFunction[T, T | A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | A | B]]
  inline def endWith[T, A, B, C](v1: A, v2: B, v3: C): OperatorFunction[T, T | A | B | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | A | B | C]]
  inline def endWith[T, A, B, C](v1: A, v2: B, v3: C, scheduler: SchedulerLike): OperatorFunction[T, T | A | B | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | A | B | C]]
  inline def endWith[T, A, B, C, D](v1: A, v2: B, v3: C, v4: D): OperatorFunction[T, T | A | B | C | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | A | B | C | D]]
  inline def endWith[T, A, B, C, D](v1: A, v2: B, v3: C, v4: D, scheduler: SchedulerLike): OperatorFunction[T, T | A | B | C | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | A | B | C | D]]
  inline def endWith[T, A, B, C, D, E](v1: A, v2: B, v3: C, v4: D, v5: E): OperatorFunction[T, T | A | B | C | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | A | B | C | D | E]]
  inline def endWith[T, A, B, C, D, E](v1: A, v2: B, v3: C, v4: D, v5: E, scheduler: SchedulerLike): OperatorFunction[T, T | A | B | C | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | A | B | C | D | E]]
  inline def endWith[T, A, B, C, D, E, F](v1: A, v2: B, v3: C, v4: D, v5: E, v6: F): OperatorFunction[T, T | A | B | C | D | E | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | A | B | C | D | E | F]]
  inline def endWith[T, A, B, C, D, E, F](v1: A, v2: B, v3: C, v4: D, v5: E, v6: F, scheduler: SchedulerLike): OperatorFunction[T, T | A | B | C | D | E | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | A | B | C | D | E | F]]
}
