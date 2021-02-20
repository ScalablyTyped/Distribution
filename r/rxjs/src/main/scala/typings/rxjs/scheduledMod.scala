package typings.rxjs

import typings.rxjs.mod.Observable_
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scheduledMod {
  
  @JSImport("rxjs/internal/scheduled/scheduled", "scheduled")
  @js.native
  def scheduled[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable_[T] = js.native
}
