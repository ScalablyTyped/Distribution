package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auditTimeMod {
  
  @JSImport("rxjs/internal/operators/auditTime", "auditTime")
  @js.native
  def auditTime[T](duration: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/auditTime", "auditTime")
  @js.native
  def auditTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}
