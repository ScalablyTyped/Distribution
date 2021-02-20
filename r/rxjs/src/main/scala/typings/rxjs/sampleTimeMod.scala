package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sampleTimeMod {
  
  @JSImport("rxjs/internal/operators/sampleTime", "sampleTime")
  @js.native
  def sampleTime[T](period: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/sampleTime", "sampleTime")
  @js.native
  def sampleTime[T](period: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}
