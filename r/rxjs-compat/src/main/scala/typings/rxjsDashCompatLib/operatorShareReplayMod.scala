package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/shareReplay", JSImport.Namespace)
@js.native
object operatorShareReplayMod extends js.Object {
  def shareReplay[T](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[T] = js.native
  def shareReplay[T](`this`: rxjsLib.rxjsMod.Observable[T], bufferSize: scala.Double): rxjsLib.rxjsMod.Observable[T] = js.native
  def shareReplay[T](`this`: rxjsLib.rxjsMod.Observable[T], bufferSize: scala.Double, windowTime: scala.Double): rxjsLib.rxjsMod.Observable[T] = js.native
  def shareReplay[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    bufferSize: scala.Double,
    windowTime: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

