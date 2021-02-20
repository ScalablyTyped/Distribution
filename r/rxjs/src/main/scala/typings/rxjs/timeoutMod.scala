package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeoutMod {
  
  @JSImport("rxjs/internal/operators/timeout", "timeout")
  @js.native
  def timeout[T](due: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/timeout", "timeout")
  @js.native
  def timeout[T](due: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/timeout", "timeout")
  @js.native
  def timeout[T](due: Date): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/timeout", "timeout")
  @js.native
  def timeout[T](due: Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}
