package typings.rxjs.internalRxMod

import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Rx", "ReplaySubject")
@js.native
class ReplaySubject[T] ()
  extends typings.rxjs.internalReplaySubjectMod.ReplaySubject[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: Double, windowTime: Double) = this()
  def this(bufferSize: Double, windowTime: Double, scheduler: SchedulerLike) = this()
}

