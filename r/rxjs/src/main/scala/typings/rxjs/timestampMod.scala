package typings.rxjs

import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import typings.rxjs.typesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timestampMod {
  
  @JSImport("rxjs/internal/operators/timestamp", "Timestamp")
  @js.native
  class Timestamp_[T] protected () extends Timestamp[T] {
    def this(value: T, timestamp: Double) = this()
  }
  
  @JSImport("rxjs/internal/operators/timestamp", "timestamp")
  @js.native
  def timestamp[T](): OperatorFunction[T, Timestamp_[T]] = js.native
  @JSImport("rxjs/internal/operators/timestamp", "timestamp")
  @js.native
  def timestamp[T](scheduler: SchedulerLike): OperatorFunction[T, Timestamp_[T]] = js.native
}
