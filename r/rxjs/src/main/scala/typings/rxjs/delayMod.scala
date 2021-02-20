package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delayMod {
  
  @JSImport("rxjs/internal/operators/delay", "delay")
  @js.native
  def delay[T](delay: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/delay", "delay")
  @js.native
  def delay[T](delay: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/delay", "delay")
  @js.native
  def delay[T](delay: Date): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/delay", "delay")
  @js.native
  def delay[T](delay: Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}
