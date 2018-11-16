package typings
package rxjsLib.internalReplaySubjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/ReplaySubject", "ReplaySubject")
@js.native
class ReplaySubject[T] ()
  extends rxjsLib.internalSubjectMod.Subject[T] {
  def this(bufferSize: scala.Double) = this()
  def this(bufferSize: scala.Double, windowTime: scala.Double) = this()
  def this(bufferSize: scala.Double, windowTime: scala.Double, scheduler: rxjsLib.internalTypesMod.SchedulerLike) = this()
  var _bufferSize: js.Any = js.native
  var _events: js.Any = js.native
  var _infiniteTimeWindow: js.Any = js.native
  var _trimBufferThenGetEvents: js.Any = js.native
  var _windowTime: js.Any = js.native
  var nextInfiniteTimeWindow: js.Any = js.native
  var nextTimeWindow: js.Any = js.native
  var scheduler: js.UndefOr[js.Any] = js.native
  def _getNow(): scala.Double = js.native
}

