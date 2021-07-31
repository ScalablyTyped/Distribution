package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ofMod {
  
  @JSImport("rxjs/internal/observable/of", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def of[T](a: T): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  @scala.inline
  def of[T](a: T, scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  @scala.inline
  def of[T](args: (SchedulerLike | T)*): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(args.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  @scala.inline
  def of[T, T2](a: T, b: T2): Observable[T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2]]
  @scala.inline
  def of[T, T2](a: T, b: T2, scheduler: SchedulerLike): Observable[T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2]]
  @scala.inline
  def of[T, T2, T3](a: T, b: T2, c: T3): Observable[T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3]]
  @scala.inline
  def of[T, T2, T3](a: T, b: T2, c: T3, scheduler: SchedulerLike): Observable[T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3]]
  @scala.inline
  def of[T, T2, T3, T4](a: T, b: T2, c: T3, d: T4): Observable[T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4]]
  @scala.inline
  def of[T, T2, T3, T4](a: T, b: T2, c: T3, d: T4, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4]]
  @scala.inline
  def of[T, T2, T3, T4, T5](a: T, b: T2, c: T3, d: T4, e: T5): Observable[T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5]]
  @scala.inline
  def of[T, T2, T3, T4, T5](a: T, b: T2, c: T3, d: T4, e: T5, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5]]
  @scala.inline
  def of[T, T2, T3, T4, T5, T6](a: T, b: T2, c: T3, d: T4, e: T5, f: T6): Observable[T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6]]
  @scala.inline
  def of[T, T2, T3, T4, T5, T6](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6]]
  @scala.inline
  def of[T, T2, T3, T4, T5, T6, T7](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7): Observable[T | T2 | T3 | T4 | T5 | T6 | T7] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6 | T7]]
  @scala.inline
  def of[T, T2, T3, T4, T5, T6, T7](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4 | T5 | T6 | T7] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6 | T7]]
  @scala.inline
  def of[T, T2, T3, T4, T5, T6, T7, T8](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8): Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8]]
  @scala.inline
  def of[T, T2, T3, T4, T5, T6, T7, T8](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], h.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8]]
  @scala.inline
  def of[T, T2, T3, T4, T5, T6, T7, T8, T9](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8, i: T9): Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], h.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]
  @scala.inline
  def of[T, T2, T3, T4, T5, T6, T7, T8, T9](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8, i: T9, scheduler: SchedulerLike): Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], h.asInstanceOf[js.Any], i.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]]
}
