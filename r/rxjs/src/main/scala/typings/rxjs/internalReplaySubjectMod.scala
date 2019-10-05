package typings.rxjs

import typings.rxjs.internalSubjectMod.Subject
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/ReplaySubject", JSImport.Namespace)
@js.native
object internalReplaySubjectMod extends js.Object {
  @js.native
  class ReplaySubject[T] () extends Subject[T] {
    def this(bufferSize: Double) = this()
    def this(bufferSize: Double, windowTime: Double) = this()
    def this(bufferSize: Double, windowTime: Double, scheduler: SchedulerLike) = this()
    var _bufferSize: js.Any = js.native
    var _events: js.Any = js.native
    var _infiniteTimeWindow: js.Any = js.native
    var _trimBufferThenGetEvents: js.Any = js.native
    var _windowTime: js.Any = js.native
    var nextInfiniteTimeWindow: js.Any = js.native
    var nextTimeWindow: js.Any = js.native
    var scheduler: js.UndefOr[js.Any] = js.native
    def _getNow(): Double = js.native
  }
  
}

