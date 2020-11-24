package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/endWith", JSImport.Namespace)
@js.native
object endWithMod extends js.Object {
  
  def endWith[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def endWith[T, Z](array: (SchedulerLike | Z)*): OperatorFunction[T, T | Z] = js.native
  def endWith[T, A](v1: A): OperatorFunction[T, T | A] = js.native
  def endWith[T, A](v1: A, scheduler: SchedulerLike): OperatorFunction[T, T | A] = js.native
  def endWith[T, A, B](v1: A, v2: B): OperatorFunction[T, T | A | B] = js.native
  def endWith[T, A, B](v1: A, v2: B, scheduler: SchedulerLike): OperatorFunction[T, T | A | B] = js.native
  def endWith[T, A, B, C](v1: A, v2: B, v3: C): OperatorFunction[T, T | A | B | C] = js.native
  def endWith[T, A, B, C](v1: A, v2: B, v3: C, scheduler: SchedulerLike): OperatorFunction[T, T | A | B | C] = js.native
  def endWith[T, A, B, C, D](v1: A, v2: B, v3: C, v4: D): OperatorFunction[T, T | A | B | C | D] = js.native
  def endWith[T, A, B, C, D](v1: A, v2: B, v3: C, v4: D, scheduler: SchedulerLike): OperatorFunction[T, T | A | B | C | D] = js.native
  def endWith[T, A, B, C, D, E](v1: A, v2: B, v3: C, v4: D, v5: E): OperatorFunction[T, T | A | B | C | D | E] = js.native
  def endWith[T, A, B, C, D, E](v1: A, v2: B, v3: C, v4: D, v5: E, scheduler: SchedulerLike): OperatorFunction[T, T | A | B | C | D | E] = js.native
  def endWith[T, A, B, C, D, E, F](v1: A, v2: B, v3: C, v4: D, v5: E, v6: F): OperatorFunction[T, T | A | B | C | D | E | F] = js.native
  def endWith[T, A, B, C, D, E, F](v1: A, v2: B, v3: C, v4: D, v5: E, v6: F, scheduler: SchedulerLike): OperatorFunction[T, T | A | B | C | D | E | F] = js.native
}
