package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/range", JSImport.Namespace)
@js.native
object internalObservableRangeMod extends js.Object {
  def dispatch(`this`: rxjsLib.internalTypesMod.SchedulerAction[_], state: js.Any): scala.Unit = js.native
  def range(): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def range(start: scala.Double): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def range(start: scala.Double, count: scala.Double): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def range(start: scala.Double, count: scala.Double, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
}

