package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debounceTimeMod {
  
  @JSImport("rxjs/internal/operators/debounceTime", "debounceTime")
  @js.native
  def debounceTime[T](dueTime: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/debounceTime", "debounceTime")
  @js.native
  def debounceTime[T](dueTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}
