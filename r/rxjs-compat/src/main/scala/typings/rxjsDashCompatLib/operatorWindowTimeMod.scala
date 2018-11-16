package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/windowTime", JSImport.Namespace)
@js.native
object operatorWindowTimeMod extends js.Object {
  def windowTime[T](`this`: rxjsLib.rxjsMod.Observable[T], windowTimeSpan: scala.Double): rxjsLib.rxjsMod.Observable[rxjsLib.rxjsMod.Observable[T]] = js.native
  def windowTime[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    windowTimeSpan: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[rxjsLib.rxjsMod.Observable[T]] = js.native
  def windowTime[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    windowTimeSpan: scala.Double,
    windowCreationInterval: scala.Double
  ): rxjsLib.rxjsMod.Observable[rxjsLib.rxjsMod.Observable[T]] = js.native
  def windowTime[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    windowTimeSpan: scala.Double,
    windowCreationInterval: scala.Double,
    maxWindowSize: scala.Double
  ): rxjsLib.rxjsMod.Observable[rxjsLib.rxjsMod.Observable[T]] = js.native
  def windowTime[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    windowTimeSpan: scala.Double,
    windowCreationInterval: scala.Double,
    maxWindowSize: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[rxjsLib.rxjsMod.Observable[T]] = js.native
  def windowTime[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    windowTimeSpan: scala.Double,
    windowCreationInterval: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[rxjsLib.rxjsMod.Observable[T]] = js.native
}

