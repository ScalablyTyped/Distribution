package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object startWithMod {
  
  @JSImport("rxjs/internal/operators/startWith", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def startWith[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def startWith[T, D](array: (D | SchedulerLike)*): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(array.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def startWith[T, D](v1: D): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def startWith[T, D](v1: D, scheduler: SchedulerLike): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def startWith[T, D, E](v1: D, v2: E): OperatorFunction[T, T | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E]]
  @scala.inline
  def startWith[T, D, E](v1: D, v2: E, scheduler: SchedulerLike): OperatorFunction[T, T | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E]]
  @scala.inline
  def startWith[T, D, E, F](v1: D, v2: E, v3: F): OperatorFunction[T, T | D | E | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F]]
  @scala.inline
  def startWith[T, D, E, F](v1: D, v2: E, v3: F, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F]]
  @scala.inline
  def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G): OperatorFunction[T, T | D | E | F | G] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G]]
  @scala.inline
  def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G]]
  @scala.inline
  def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H): OperatorFunction[T, T | D | E | F | G | H] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G | H]]
  @scala.inline
  def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G | H] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G | H]]
  @scala.inline
  def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I): OperatorFunction[T, T | D | E | F | G | H | I] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G | H | I]]
  @scala.inline
  def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G | H | I] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G | H | I]]
}
