package typings
package rxjsDashCompatLib.rxjsDashCompatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat", "ReplaySubject")
@js.native
class ReplaySubject[T] ()
  extends rxjsLib.rxjsMod.ReplaySubject[T] {
  def this(bufferSize: scala.Double) = this()
  def this(bufferSize: scala.Double, windowTime: scala.Double) = this()
  def this(bufferSize: scala.Double, windowTime: scala.Double, scheduler: rxjsLib.internalTypesMod.SchedulerLike) = this()
}

