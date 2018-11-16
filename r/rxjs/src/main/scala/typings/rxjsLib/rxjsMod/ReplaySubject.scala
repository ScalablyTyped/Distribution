package typings
package rxjsLib.rxjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "ReplaySubject")
@js.native
class ReplaySubject[T] ()
  extends rxjsLib.internalReplaySubjectMod.ReplaySubject[T] {
  def this(bufferSize: scala.Double) = this()
  def this(bufferSize: scala.Double, windowTime: scala.Double) = this()
  def this(bufferSize: scala.Double, windowTime: scala.Double, scheduler: rxjsLib.internalTypesMod.SchedulerLike) = this()
}

