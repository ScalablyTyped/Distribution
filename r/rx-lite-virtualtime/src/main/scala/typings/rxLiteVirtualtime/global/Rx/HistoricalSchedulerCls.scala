package typings.rxLiteVirtualtime.global.Rx

import typings.rxLiteVirtualtime.Rx.VirtualTimeScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Rx.HistoricalScheduler")
@js.native
class HistoricalSchedulerCls protected () extends VirtualTimeScheduler[Double, Double] {
  def this(initialClock: Double, comparer: js.Function2[/* first */ Double, /* second */ Double, Double]) = this()
}
